package ru.mirea.lab13.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] shirtsData = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirts = new Shirt[shirtsData.length];

        for (int i = 0; i < shirtsData.length; i++) {
            String[] data = shirtsData[i].split(",");
            if (data.length == 4) {
                shirts[i] = new Shirt(data[0], data[1], data[2], data[3]);
                System.out.println(shirts[i]);
                System.out.println();
            }
        }
    }
}
