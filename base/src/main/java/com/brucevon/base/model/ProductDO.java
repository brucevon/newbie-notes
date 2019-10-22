package com.brucevon.base.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Accessors(chain = true)
@Data
public class ProductDO {

    private String id;

    private String name;

    private String category;

    private String description;

    private BigDecimal price;
}
