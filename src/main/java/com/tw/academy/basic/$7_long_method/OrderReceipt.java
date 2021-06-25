package com.tw.academy.basic.$7_long_method;

public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    private double TOTAL_SALES_TAX_PERCENT = 0d;
    private double TOTAL_AMOUNT_PERCENT = 0d;

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        printHeader(output);

        printCustomerNameAndAddress(output);
        for (LineItem lineItem : order.getLineItems()) {
            printLineItems(output, lineItem);

            double salesTax = lineItem.totalAmount() * .10;
            TOTAL_SALES_TAX_PERCENT += salesTax;

            TOTAL_AMOUNT_PERCENT += lineItem.totalAmount() + salesTax;
        }

        printTotal(output, TOTAL_SALES_TAX_PERCENT, "Sales Tax");

        printTotal(output, TOTAL_AMOUNT_PERCENT, "Total Amount");

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