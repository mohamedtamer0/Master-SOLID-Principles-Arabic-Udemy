package org.example;

public class Invoice {
    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;
    private InvoiceFormatter formatter;

    public Invoice(Book book, int quantity, double discountRate, double taxRate, InvoiceFormatter formatter) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
        this.formatter = formatter;
    }

    public double calculateTotal() {
        double price = ((book.price - book.price * discountRate) * this.quantity);
        double priceWithTaxes = price * (1 + taxRate);
        return priceWithTaxes;
    }

    public double getTotal() {
        return total;
    }

    public void printInvoice() {
        formatter.format(this);
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public InvoiceFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(InvoiceFormatter formatter) {
        this.formatter = formatter;
    }
}