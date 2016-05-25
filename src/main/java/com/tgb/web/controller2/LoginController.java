package com.tgb.web.controller2;

import com.tgb.web.DaoModel.User;
import com.tgb.web.DaoModel.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/25 0025.
 */
@Controller
public class LoginController{
    private UserDao userDao;
    @RequestMapping(value = "/login.do")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");

        Map model = new HashMap();
        User user = userDao.selectByName(userName, userPassword);

        if(user != null){
            model.put("user", user);
            return new ModelAndView("main",model);
        }
        else{
            model.put("error", "用户名或密码不匹配");
            return new ModelAndView("Login",model);
        }
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public UserDao getUserDao() {
        return userDao;
    }

}
