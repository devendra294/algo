package com.dsa.algo.datastructure.array;

import java.util.Scanner;

public class ArrayOperations {
    private int[] array;
    private int size;

    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Insert at index
    public void insert(int index, int value) {
        if (size >= array.length) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index for insertion.");
            return;
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i]; // shift elements to the right
        }
        array[index] = value;
        size++;
        System.out.println("Inserted " + value + " at index " + index);
    }

    // Update at index
    public void update(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index for update.");
            return;
        }
        array[index] = value;
        System.out.println("Updated index " + index + " to " + value);
    }

    // Delete at index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index for deletion.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1]; // shift elements to the left
        }
        size--;
        System.out.println("Deleted element at index " + index);
    }

    // Print all elements
    public void print() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations ao = new ArrayOperations(10); // initial capacity 10

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Print");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            int index, value;

            switch (choice) {
                case 1:
                    System.out.print("Enter index to insert: ");
                    index = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    ao.insert(index, value);
                    break;
                case 2:
                    System.out.print("Enter index to update: ");
                    index = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    value = scanner.nextInt();
                    ao.update(index, value);
                    break;
                case 3:
                    System.out.print("Enter index to delete: ");
                    index = scanner.nextInt();
                    ao.delete(index);
                    break;
                case 4:
                    ao.print();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}