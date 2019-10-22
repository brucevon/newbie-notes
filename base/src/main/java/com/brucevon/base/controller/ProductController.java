package com.brucevon.base.controller;

import com.brucevon.base.model.ProductDO;
import com.brucevon.base.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @CrossOrigin
    @GetMapping("/list")
    public List<ProductDO> getProduct() {
        return productService.list();
    }
}
