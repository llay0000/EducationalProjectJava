package org.example;

public class Phone {
    private String number;
    private String name;
    private int model;
    private int weight;

    public Phone(String number, String name, int model, int weight) {
        this.number = number;
        this.name = name;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, int model, String name) {
        this(number, name, model, 0);
    }

    public Phone() {
        this("ban", "afd",0,0);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiveCall(String number, String name){
        return "Звонит: " + name + "Номер телефона: " + number;
    }
}