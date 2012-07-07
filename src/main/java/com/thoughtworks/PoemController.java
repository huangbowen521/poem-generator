package com.thoughtworks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.xml.ws.RequestWrapper;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/7/12
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("poem")
public class PoemController {

    @RequestMapping("index")
    public ModelAndView allPoems() {
        Poem poem1 = new Poem(1, "huanghelu");
        Poem poem2 = new Poem(2, "wahaha");
        Poem[] poems = new Poem[]{poem1, poem2};
        return new ModelAndView("poem/index", "poem", poems);

    }

}
