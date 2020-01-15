package string;

import java.util.HashSet;
import java.util.Scanner;

class Listt {
    public static void main(String args[]) {
        Listt ob = new Listt();
        ob.ex();
    }

    void ex() {
        Scanner sc = new Scanner(System.in);
        int i, c = 0;
        HashSet l = new HashSet();
        for (i = 1; i <= 10; i++) {
            l.add(i);
            c++;
        }
        l.add(2);
        l.add(45);
        System.out.println("Size:" + l.size());
        System.out.println("VAlues:" + l);


    }
}