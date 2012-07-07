package com.thoughtworks;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/7/12
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class PoemDao {
    public Poem create(){
        return  new Poem(1,"11");
    }

    public  void save(Poem poem)
    {

    }
}
