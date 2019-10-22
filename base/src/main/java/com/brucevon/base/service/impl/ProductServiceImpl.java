package com.brucevon.base.service.impl;

import com.brucevon.base.dao.ProductDAO;
import com.brucevon.base.model.ProductDO;
import com.brucevon.base.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<ProductDO> list() {
        return productDAO.listProduct();
    }
}
