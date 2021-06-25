package com.tw.academy.basic.$7_long_method;

public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        printHeader(output);

        printCustomerNameAndAddress(output);

        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            printLineItems(output, lineItem);

            double salesTax = lineItem.totalAmount() * .10;
            totSalesTx += salesTax;

            tot += lineItem.totalAmount() + salesTax;
        }

        printTotal(output, totSalesTx, "Sales Tax");

        printTotal(output, tot, "Total Amount");

        return output.toString();
    }

    private StringBuilder printTotal(StringBuilder output, double total, String title) {
        return output.append(title).append('\t').append(total);
    }

    private void printCustomerNameAndAddress(StringBuilder output) {
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
    }

    private void printHeader(StringBuilder output) {
        output.append("======Printing Orders======\n");
    }

    private void printLineItems(StringBuilder output, LineItem lineItem) {
        output.append(lineItem.getDescription());
        output.append('\t');
        output.append(lineItem.getPrice());
        output.append('\t');
        output.append(lineItem.getQuantity());
        output.append('\t');
        output.append(lineItem.totalAmount());
        output.append('\n');
    }
}