package cn.itcast.springmvc.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloHandler implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        //设置模型数据
        mv.addObject("msg", "我的第一个Springmvc应用");
        //设置视图名称
        mv.setViewName("hello");
        return mv;
    }
}
