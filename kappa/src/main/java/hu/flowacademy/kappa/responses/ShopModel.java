package hu.flowacademy.kappa.responses;

import lombok.Data;

@Data
public class ShopModel {

    private String name;
    private String category;
    private String settlement;
    private String zip;
    private String address;
}
