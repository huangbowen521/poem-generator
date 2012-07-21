package com.thoughtworks;

import com.thoughtworks.dao.PoemDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/15/12
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("poem")
public class PoemController {
    public void setPoemDao(PoemDao poemDao) {
        this.poemDao = poemDao;
    }

    private PoemDao poemDao;

    @RequestMapping("poemlist")
    public ModelAndView allSentence(){
        Poem[] poems = poemDao.all();
        return new ModelAndView("poem/poemlist", "poems", poems);
    }
}
