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
 * Created by Administrator on 2016/5/26 0026.
 */
@Controller
public class FindController {

    private JdbcUserDao jdbcUserDao;

    @RequestMapping(value = "/indexfind")
    public String indexFind(HttpServletRequest request, HttpServletResponse response){
        return "indexFind";
    }

    @RequestMapping(value = "/find")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map model = new HashMap();
        List user = jdbcUserDao.find();
        model.put("user",user);
        return new ModelAndView("find", model);
    }

    public void setJdbcUserDao(JdbcUserDao jdbcUserDao) {
        this.jdbcUserDao = jdbcUserDao;
    }

    public JdbcUserDao getJdbcUserDao() {
        return jdbcUserDao;
    }
}
