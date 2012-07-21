package com.thoughtworks;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "poem")
public class Poem implements Serializable{
    Integer id;
    String qi;
    String cheng;
    String zhuan;
    String he;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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