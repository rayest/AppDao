package cn.rayest.web.DaoModel;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 * Created by Rayest on 2016/5/25 0025.
 */

//3.实现接口：实现接口定义的增删改查四个主要方法。
public class JdbcUserDao implements UserDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    //(1).实现接口中定义的find查询方法，该方法用于查询数据库中user表的所有信息
    public List find(){
        //步骤@1.相应的SELECT查询语句
        String sql = "SELECT * FROM user";
        //步骤@2.返回查询结果
        //
        return jdbcTemplate.query(sql, new UserMapper());
    }

    private class UserMapper implements RowMapper {
        public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setPassword(resultSet.getString("password"));
            return user;
        }
    }

    //(2).实现接口定义的delete方法，该方法用于删除拥有特定id值的用户
    public void delete(int id) {
        //步骤@1.相应的DELETE更新语句
        String sql="DELETE FROM user WHERE id = ?";
        //步骤@2.采用jdbcTemplate模板更新结果，有两个参数：sql语句和选择条件id
        jdbcTemplate.update(sql,id);
    }

    //(3).实现接口定义的insert方法，该方法用于向数据库列表插入一条用户信息
    public void insert(User user) {
        //步骤@1.相应的INSERT更新语句
        String sql=" INSERT INTO user (id, name, password) VALUES (?, ?, ?)";
        //步骤@2.采用jdbcTemplate模板更新结果，更新的参数有两个，sql语句和具体的插入的列表对象Object
                //对象Object自己也有两个参数，待插入用户的姓名name和密码password
        jdbcTemplate.update(sql,new Object[]{
                user.getId(), user.getName(), user.getPassword()
        });
    }

    //(4).实现接口定义的select查询方法，该方法用于查询查询拥有特定id值的用户信息
    public User select(int id) {
        //步骤@1.相应的sql查询语句
        String sql="SELECT * FROM user WHERE id = ?";
        //步骤@2.采用jdbcTemplate模板查询结果，三个参数：sql和id和实例？
        return jdbcTemplate.queryForObject(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class),id);
     }

    //(5)实现接口定义的selectByName方法，和方法(4)类似：按姓名查询用户信息
    public User selectByName(String name){
        String sql="SELECT * FROM user WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class),name);
    }

    //(6).实现接口定义的update修改方法，该方法用于修改特定id值的用户信息
    public void update(User user) {
        //步骤@1.相应的sql更新语句
        String sql="UPDATE user SET name = ?, password = ? WHERE id = ?";
        //步骤@2.采用jdbcTemplate模板更新结果，四个参数：sql更新语句、用户姓名、用户密码、用户id；
        jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getId());
    }
}
