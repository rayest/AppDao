package cn.rayest.web.controller2;

import cn.rayest.web.DaoModel.JdbcUserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rayest on 2016/5/26 0026.
 */
@Controller
public class DeleteController {
    private JdbcUserDao jdbcUserDao;
    @RequestMapping(value = "/indexdelete")
    public String IndexDelete(HttpServletRequest request, HttpServletResponse response){
        return "indexDelete";
    }

    @RequestMapping(value = "/delete")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int id = Integer.parseInt(request.getParameter("id"));
        Map model = new HashMap();
        jdbcUserDao.delete(id);
        return new ModelAndView("delete", model);

    }

    public void setJdbcUserDao(JdbcUserDao jdbcUserDao) {
        this.jdbcUserDao = jdbcUserDao;
    }

    public JdbcUserDao getJdbcUserDao() {
        return jdbcUserDao;
    }
}
