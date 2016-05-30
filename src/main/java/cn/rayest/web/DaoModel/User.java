package cn.rayest.web.DaoModel;

/**
 * Created by Rayest on 2016/5/25 0025.
 */

//1.创建用户类：用户属性、用户行为、构造方法、访问器方法和修改器方法
public class User {
    private int id;
    private String name;
    private String password;

    public User(){

    }

    public User(String name, String password){
        super();
        this.name = name;
        this.password = password;
    }

    public User(int id, String name, String password){
        super();
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
