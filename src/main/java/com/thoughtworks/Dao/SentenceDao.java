package com.thoughtworks.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.thoughtworks.Sentence;

public class SentenceDao extends HibernateDaoSupport {

    public Sentence[] all(){
        return (Sentence[])getHibernateTemplate().find("from com.thoughtworks.Sentence").toArray(new Sentence[0]);
    }

    public Sentence create(){
        return new Sentence();
    }

    public void save(Sentence sentence) {
        getHibernateTemplate().save(sentence);
    }
}