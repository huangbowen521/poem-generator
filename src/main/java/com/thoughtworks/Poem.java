package com.thoughtworks;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/7/12
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Poem {
    private int id;
    private String context;
    private String qi;
    private String cheng;
    private String zhuan;
    private String he;

    public  Poem (int id,String context)
    {
        this.id = id;
        this.context = context;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getQi() {
        return qi;
    }

    public void setQi(String qi) {
        this.qi = qi;
    }

    public String getCheng() {
        return cheng;
    }

    public void setCheng(String cheng) {
        this.cheng = cheng;
    }

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan;
    }

    public String getHe() {
        return he;
    }

    public void setHe(String he) {
        this.he = he;
    }
}
