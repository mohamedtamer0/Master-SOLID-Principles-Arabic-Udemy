package org.example;

public class HtmlInvoiceFormatter implements InvoiceFormatter {

    @Override
    public void format(Invoice invoice) {
        System.out.println("<html><body>");
        System.out.println("<p>" + invoice.getQuantity() + "x " + invoice.getBook().name + " " + invoice.getBook().price + "$</p>");
        System.out.println("<p>Discount Rate: " + invoice.getDiscountRate() + "</p>");
        System.out.println("<p>Tax Rate: " + invoice.getTaxRate() + "</p>");
        System.out.println("<p>Total: " + invoice.getTotal() + "</p>");
        System.out.println("</body></html>");
    }
}