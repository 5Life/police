package br.com.fiap.fivelife.police.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Glasses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String glassesCode;
    private String name;

    public Glasses() {}

    public Glasses(String glassesCode, String name) {
        this.glassesCode = glassesCode;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getGlassesCode() {
        return glassesCode;
    }

    public void setGlassesCode(String glassesCode) {
        this.glassesCode = glassesCode;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String nome) {
        this.name = nome;
    }
}
