package ru.geekbrains;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
//        Employee employee = new Employee("qwe", 21, 3_000.0);
//        Employee employee2 = new Employee("asd", 22, 5_000.0);
//        HashTable<Integer, Employee> table = new HashTable<>();
//        table.put(2, employee);
//        table.put(1, employee2);
//        table.remove(2);
//        System.out.println("table.get(2) = " + table.get(2));
//        System.out.println("table.get(1) = " + table.get(1));
//        HashTable<Integer, String> hashTable = new HashTable<>();
//        hashTable.put(1,"lll");
//        hashTable.put(5, "yuih");
//        System.out.println("hashTable.get(1) = " + hashTable.get(1));
//        System.out.println("hashTable.get(5) = " + hashTable.get(5));
        redBlackTree redBlackTree = new redBlackTree();
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        while (true) {
            int value = Integer.parseInt((reader.readLine()));
            redBlackTree.add(value);
            System.out.println("---");
        }
    }
}