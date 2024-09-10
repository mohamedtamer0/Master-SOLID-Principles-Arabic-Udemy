package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Programming 101", "John Doe", 2023, 50, "1234567890");
        Invoice invoice = new Invoice(book, 2, 0.1, 0.2);
        invoice.printInvoice();
        invoice.saveToFile("invoice.txt");

    }
}