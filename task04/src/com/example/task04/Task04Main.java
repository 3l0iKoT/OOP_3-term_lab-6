package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new MyException("monthNumber " + monthNumber +
                    " is invalid, month number should be between 1..12");
        }

        if (monthNumber >= 3 && monthNumber <= 5) {
            return "весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "лето";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            return "осень";
        } else {
            return "зима";
        }
    }

}