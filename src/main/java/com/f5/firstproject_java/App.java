package com.f5.firstproject_java;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Haga su pedido (peperoni):");
        String order = scanner.nextLine();
        if (order.equalsIgnoreCase("peperoni")) {
            System.out.println("Elaboración en curso...");
            Thread.sleep(2000);
            System.out.println("Extendiendo la masa");
            Thread.sleep(2000);
            System.out.println("Añadiendo el tomate");
            Thread.sleep(2000);
            System.out.println("Añadiendo la mozzarella");
            Thread.sleep(2000);
            System.out.println("Añadiendo el peperoni");
            Thread.sleep(2000);
            System.out.println("Pizza lista");
            System.out.println("Por favor pase por caja.");
        } else {
            System.out.println("Lo siento, solo tenemos pizza de peperoni en este momento.");
        }
        scanner.close();
    }
}
