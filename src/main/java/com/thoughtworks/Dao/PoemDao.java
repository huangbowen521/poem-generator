package com.thoughtworks.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.thoughtworks.Poem;

public class PoemDao extends HibernateDaoSupport {

    public Poem[] all(){
        return (Poem[])getHibernateTemplate().find("from com.thoughtworks.Poem").toArray(new Poem[0]);
    }

    public Poem create(){
        return new Poem();
    }

    public void save(Poem poem){
        getHibernateTemplate().save(poem);

    }
}