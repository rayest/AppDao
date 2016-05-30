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
 * Created by Rayest on 2016/5/30 0030.
 */
@Controller
public class InsertController {
    private JdbcUserDao jdbcUserDao;

    @RequestMapping(value = "indexinsert")
    public String indexInsert(HttpServletRequest request, HttpServletResponse response){
        return "indexInsert";
    }

    @RequestMapping(value = "insert")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        Map model = new HashMap();

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        jdbcUserDao.insert(user);
        return new ModelAndView("insert", model);

    }
    public void setJdbcUserDao(JdbcUserDao JdbcUserDao) {
        jdbcUserDao = JdbcUserDao;
    }

    public JdbcUserDao getJdbcUserDao() {
        return jdbcUserDao;
    }
}
