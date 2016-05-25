package com.tgb.web.DaoModel;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 * Created by Administrator on 2016/5/25 0025.
 */
public class UserDao implements UserDaoImp{
    private JdbcTemplate jdbcTemplate;
    public List find(){
        String sql = "select * from user";
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

    public void delete(int id) {
        String sql="delete from user where id = ?";
        jdbcTemplate.update(sql,id);
    }
    public void insert(User user) {
        String sql=" insert into user (name, password) values(?,?)";
        jdbcTemplate.update(sql,new Object[]{
                user.getName(),user.getPassword()
        });
    }
    public User select(int id) {
        String sql="select * from user where id=?";
        return jdbcTemplate.queryForObject(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class),id);
     }

    public User selectByName(String name, String password){
        String sql="select * from user where name = ? and password = ?";
        return jdbcTemplate.queryForObject(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class),name, password);
    }

    public void update(User user) {
        String sql="update user set name = ?, password = ? where id = ?";
        jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getId());
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }
    public JdbcTemplate getJdbcTemplate() {
            return jdbcTemplate;
        }
}
