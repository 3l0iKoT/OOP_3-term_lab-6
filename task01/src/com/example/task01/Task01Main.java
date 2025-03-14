package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        codeWithNPE();

    }

    static void codeWithNPE() {
        String stroke = null;
        System.out.println(stroke.length());
    }
}
