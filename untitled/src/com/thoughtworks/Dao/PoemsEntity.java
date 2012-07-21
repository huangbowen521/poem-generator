package com.thoughtworks.dao;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/15/12
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "Poems", schema = "", catalog = "MyDatabase")
@Entity
public class PoemsEntity {
    private int idPoems;

    @javax.persistence.Column(name = "idPoems")
    @Id
    public int getIdPoems() {
        return idPoems;
    }

    public void setIdPoems(int idPoems) {
        this.idPoems = idPoems;
    }

    private String title;

    @javax.persistence.Column(name = "Title")
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String qi;

    @javax.persistence.Column(name = "Qi")
    @Basic
    public String getQi() {
        return qi;
    }

    public void setQi(String qi) {
        this.qi = qi;
    }

    private String cheng;

    @javax.persistence.Column(name = "Cheng")
    @Basic
    public String getCheng() {
        return cheng;
    }

    public void setCheng(String cheng) {
        this.cheng = cheng;
    }

    private String zhuang;

    @javax.persistence.Column(name = "Zhuang")
    @Basic
    public String getZhuang() {
        return zhuang;
    }

    public void setZhuang(String zhuang) {
        this.zhuang = zhuang;
    }

    private String he;

    @javax.persistence.Column(name = "He")
    @Basic
    public String getHe() {
        return he;
    }

    public void setHe(String he) {
        this.he = he;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PoemsEntity that = (PoemsEntity) o;

        if (idPoems != that.idPoems) return false;
        if (cheng != null ? !cheng.equals(that.cheng) : that.cheng != null) return false;
        if (he != null ? !he.equals(that.he) : that.he != null) return false;
        if (qi != null ? !qi.equals(that.qi) : that.qi != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (zhuang != null ? !zhuang.equals(that.zhuang) : that.zhuang != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPoems;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (qi != null ? qi.hashCode() : 0);
        result = 31 * result + (cheng != null ? cheng.hashCode() : 0);
        result = 31 * result + (zhuang != null ? zhuang.hashCode() : 0);
        result = 31 * result + (he != null ? he.hashCode() : 0);
        return result;
    }
}
