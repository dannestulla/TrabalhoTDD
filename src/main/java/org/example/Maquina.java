package org.example;


import java.util.Objects;

public class Maquina {


    private String name;
    private Long id;


    public Maquina(String name, Long id){
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}