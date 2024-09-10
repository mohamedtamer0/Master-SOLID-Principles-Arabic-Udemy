package org.example;

public class Invoice {
    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;
    private String formatType;

    public Invoice(Book book, int quantity, double discountRate, double taxRate, String formatType) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.formatType = formatType;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double price = ((book.price - book.price * discountRate) * this.quantity);
        double priceWithTaxes = price * (1 + taxRate);
        return priceWithTaxes;
    }

    public void printInvoice() {
        if ("TEXT".equals(formatType)) {
            System.out.println(quantity + "x " + book.name + " " + book.price + "$");
            System.out.println("Discount Rate: " + discountRate);
            System.out.println("Tax Rate: " + taxRate);
            System.out.println("Total: " + total);
        } else if ("HTML".equals(formatType)) {
            System.out.println("<html><body>");
            System.out.println("<p>" + quantity + "x " + book.name + " " + book.price + "$</p>");
            System.out.println("<p>Discount Rate: " + discountRate + "</p>");
            System.out.println("<p>Tax Rate: " + taxRate + "</p>");
            System.out.println("<p>Total: " + total + "</p>");
            System.out.println("</body></html>");
        }
        else if ("Java".equals(formatType)) {
            System.out.println("<html><body>");
            System.out.println("<p>" + quantity + "x " + book.name + " " + book.price + "$</p>");
            System.out.println("<p>Discount Rate: " + discountRate + "</p>");
            System.out.println("<p>Tax Rate: " + taxRate + "</p>");
            System.out.println("<p>Total: " + total + "</p>");
            System.out.println("</body></html>");
        }
    }
}