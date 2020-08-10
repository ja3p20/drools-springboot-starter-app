package com.training.drools.controller;

import com.training.drools.model.Product;
import com.training.drools.service.JewelleryShopService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JewelleryShopController {


    private final JewelleryShopService jewelleryShopService;

    public JewelleryShopController(JewelleryShopService jewelleryShopService) {
        this.jewelleryShopService = jewelleryShopService;
    }

    @RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
    public Product getDiscount(@RequestParam String type){

        Product product = new Product();
        product.setType(type);
        jewelleryShopService.getProductDiscount(product);
        return product;
    }
}
