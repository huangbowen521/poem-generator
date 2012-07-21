package com.thoughtworks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.thoughtworks.dao.SentenceDao;
import com.thoughtworks.Sentence;

@Controller
@RequestMapping("poem")
public class SentenceController {

    private SentenceDao sentenceDao;

    public void setSentenceDao(SentenceDao sentenceDao) {
        this.sentenceDao = sentenceDao;
    }

    @RequestMapping("index")
    public ModelAndView allSentence(){

        //Sentence[] sentences = sentenceDao.all();
        int a=0;
        return new ModelAndView("poem/index", "sentences", a);
    }
}