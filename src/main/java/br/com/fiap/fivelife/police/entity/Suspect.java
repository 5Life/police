package br.com.fiap.fivelife.police.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Suspect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String crime;
    private int jailTime;
    private String appearanceDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public int getJailTime() {
        return jailTime;
    }

    public void setJailTime(int jailTime) {
        this.jailTime = jailTime;
    }

    public String getAppearanceDate() {
        return appearanceDate;
    }

    public void setAppearanceDate(String appearanceDate) {
        this.appearanceDate = appearanceDate;
    }
}
