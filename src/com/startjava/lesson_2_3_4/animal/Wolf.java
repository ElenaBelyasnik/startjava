package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private boolean male;
    private String name;
    private float weight;
    private int age;
    private String color;

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String walk() {
        return "Идёт";
    }

    public String sit() {
        return "Сидит";
    }

    public String run() {
        return "Бежит";
    }

    public String howl() {
        return "Воет";
    }

    public String hunt() {
        return "Охотится";
    }
}
