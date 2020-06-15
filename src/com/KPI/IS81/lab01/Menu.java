package com.KPI.IS81.lab01;

import java.util.Scanner;

public class Menu {
    public static void startProgramme() {
        CollectionProcessing processing = new CollectionProcessing();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println(("Menu"));
            System.out.println("1. Show a list of menu points");
            System.out.println("2. Show a list of numbers");
            System.out.println("3. Add element");
            System.out.println("4. Delete list");
            System.out.println("5. exit");
            switch (scanner.nextInt()){
                case 1:
                    System.out.println(("__________"));
                    break;
                case 2:
                    processing.deleteList();
                    processing.generate();
                    processing.displayList();
                    break;
                case 3:
                    processing.addElement();
                    processing.displayList();
                    break;
                case 4:
                    processing.deleteList();
                    System.out.println("list deleted");
                    break;
                case 5:
                    System.exit(1);
            }
        }while (true);

    }
}
