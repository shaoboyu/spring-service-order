package com.feinno.order.handler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {
    @RequestMapping(value = "/item/itemlist.action")
    public ModelAndView itemList(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/WEB-INF/index.jsp");
        return mav;
    }
}
