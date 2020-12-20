package sample.orders;

public class Order {

    private PaymentInfo paymentInfo = new PaymentInfo();
    private ShippingInfo shippingInfo = new ShippingInfo();

    private int orderId;
    private String dateCreated;
    private String dateShipping;
    private String customerName;
    private String customerId;
    private String status;

}
