package sample.user;

import sample.cart.ShoppingCart;
import sample.orders.Order;
import sample.product.Coupon;

public class Account {

    private Coupon coupon = new Coupon();
    private ShoppingCart shoppingCart = new ShoppingCart();
    private Order order = new Order();

    private String address;
    private int phoneNo;
    private String creditCardInfo;
    private float totalOrdersCost;
}
