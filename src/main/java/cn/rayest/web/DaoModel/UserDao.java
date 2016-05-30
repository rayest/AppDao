package cn.rayest.web.DaoModel;

import java.util.List;

/**
 * Created by Rayest on 2016/5/25 0025.
 */

//2.User接口：定义增删改查基本的方法
public interface UserDao {
    void insert(User user);
    void delete(int id);
    void update(User user);
    User select(int id);
    List find();
    User selectByName(String name);
}
