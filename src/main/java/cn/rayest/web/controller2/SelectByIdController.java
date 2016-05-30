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
public class SelectByIdController {
    private JdbcUserDao jdbcUserDao;

    @RequestMapping(value = "indexselectbyid")
    public String selectById(HttpServletRequest request, HttpServletResponse response){
        return "indexSelectById";
    }


    @RequestMapping(value = "selectbyid")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int id = Integer.parseInt(request.getParameter("id"));
        Map model = new HashMap();
        User user = jdbcUserDao.select(id);
        model.put("user", user);
        return new ModelAndView("selectById",model);
        }


    public void setJdbcUserDao(JdbcUserDao JdbcUserDao) {
        jdbcUserDao = JdbcUserDao;
    }

    public JdbcUserDao getJdbcUserDao() {
        return jdbcUserDao;
    }
}
