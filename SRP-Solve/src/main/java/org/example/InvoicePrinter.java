package org.example;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().name + " " + invoice.getBook().price + "$");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal());
    }
}
