package com.company;

public class Calc {

    public static double calc(double x, double y, char operation) {
        switch (operation) {
            case '+': return x + y;
            case '-': return x - y;
            case '*': return x * y;
            case '/': return x / y;
        }
        return 0;
    }

    public static void main(String[] args) {

        boolean problem = false;

        if(args.length != 3) {
            System.out.println("Количество аргументов неверное");
            problem = !problem;
        }

        if(!problem){
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            char operation = args[2].charAt(0);
            System.out.println("Ответ: " + calc(x, y, operation));
        }
    }
}
