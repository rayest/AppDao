package cn.rayest.web.controller2;

import cn.rayest.web.DaoModel.JdbcUserDao;
import cn.rayest.web.DaoModel.User;
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
    private JdbcUserDao jdbcUserDao;

    @RequestMapping(value = "/login.do")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String userName = request.getParameter("userName");
        Map model = new HashMap();
        User user = jdbcUserDao.selectByName(userName);

        if(user != null){
            model.put("user", user);
            return new ModelAndView("main",model);
        }
        else{
            model.put("error", "用户名或密码不匹配");
            return new ModelAndView("Login",model);
        }
    }

    public void setJdbcUserDao(JdbcUserDao jdbcUserDao) {
        this.jdbcUserDao = jdbcUserDao;
    }

    public JdbcUserDao getJdbcUserDao() {
        return jdbcUserDao;
    }
}
