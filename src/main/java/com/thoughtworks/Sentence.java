package com.thoughtworks;

import org.apache.xpath.operations.String;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sentence")
public class Sentence implements Serializable {
    String content;
    Integer id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}