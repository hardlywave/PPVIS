package sample.user;

import sample.сontrollers.AdvertisementController;
import sample.сontrollers.ProductController;

public class Administrator extends User {

    private ProductController prController = new ProductController();
    private AdvertisementController adController = new AdvertisementController();

    private String adminName;
    private String email;
}
