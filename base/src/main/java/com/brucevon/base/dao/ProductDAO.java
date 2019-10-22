package com.brucevon.base.dao;

import com.brucevon.base.model.ProductDO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO {

    List<ProductDO> listProduct();
}
