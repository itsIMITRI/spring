package hu.flowacademy.kappa.responses;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Shop {
    private String id;
    private String name;
    private String category;
    private String settlement;
    private String zip;
    private String address;

}
