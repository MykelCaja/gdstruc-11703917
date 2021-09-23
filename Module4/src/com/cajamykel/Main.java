package com.cajamykel;

public class Main {

    public static void main(String[] args) {
        Player ploo = new Player(121, "Plootiful", 132);
        Player warden = new Player(456, "Warden", 222);
        Player jimmyGibbs = new Player(12, "JimmyGibbs2", 32);
        Player biHan = new Player(177, "SubZero", 1312);
        Player anne = new Player(112, "C9 Annie", 152);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(),ploo);
        hashtable.put(warden.getUserName(), warden);
        hashtable.put(jimmyGibbs.getUserName(),jimmyGibbs);
        hashtable.put(biHan.getUserName(),biHan);
        hashtable.put(anne.getUserName(),anne);

        hashtable.printHashtable();
        System.out.println();
        System.out.println("Current Hashtable:");
        hashtable.remove(anne.getUserName());
        hashtable.printHashtable();
    }
}
