package com.dao;

import com.entity.Product;

import java.util.List;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-21  21:26
 * @Description: TODO
 * @Version: 1.0
 */
public interface ProductDao {
    public List<Product> getList();
    public int addProduct(Product p);
}
