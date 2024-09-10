package org.example;

public class TextInvoiceFormatter implements InvoiceFormatter {

    @Override
    public void format(Invoice invoice) {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().name + " " + invoice.getBook().price + "$");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal());
    }
}