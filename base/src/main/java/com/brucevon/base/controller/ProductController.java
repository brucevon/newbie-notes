package com.brucevon.base.controller;

import com.brucevon.base.annotation.UserLoginToken;
import com.brucevon.base.model.vo.ResultVo;
import com.brucevon.base.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @UserLoginToken
    @GetMapping("/list")
    public ResultVo<?> getProduct() {
        return new ResultVo<>()
                .setCode(200)
                .setData(productService.list());

    }
}
