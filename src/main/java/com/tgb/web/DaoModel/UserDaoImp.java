package com.tgb.web.DaoModel;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25 0025.
 */
public interface UserDaoImp {
    void insert(User user);
    void delete(int id);
    void update(User user);
    User select(int id);
    List find();
    User selectByName(String name, String password);
}
