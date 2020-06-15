package com.KPI.IS81.lab01;

import java.util.*;

import static java.lang.Math.*;

public class CollectionProcessing {

    private LinkedList<Integer> numbers = new LinkedList<>();

    public void generate() {
        int j = 0;
        while (j < 16) {
            addElement();
            j++;
        }
    }

    public void addElement() {
        int newNum = (int) (random() * 30);

        if (numbers.size() == 0) {
            numbers.add(newNum);
        } else if (numbers.size() == 1) {
            if (newNum > numbers.get(0)) {
                numbers.add(newNum);
            } else {
                numbers.add(0, newNum);
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (i == numbers.size() - 1) {
                    numbers.add(newNum);
                    break;
                } else if (newNum < numbers.get(0)) {
                    numbers.add(0, newNum);
                    break;
                } else {
                    if (newNum >= numbers.get(i) && newNum <= numbers.get(i + 1)) {
                        numbers.add(i + 1, newNum);
                        break;
                    }
                }
            }
        }
    }

    public void deleteList(){
        for (Integer number : numbers) {
            numbers.clear();
        }
    }

    public void displayList () {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
            System.out.println("\n");
    }
}

