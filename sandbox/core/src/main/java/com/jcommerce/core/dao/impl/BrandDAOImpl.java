/**
* Author: Bob Chen
*/

package com.jcommerce.core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jcommerce.core.dao.BrandDAO;
import com.jcommerce.core.model.Brand;

@Repository
@SuppressWarnings("unchecked")
public class BrandDAOImpl extends DAOImpl implements BrandDAO {
    public BrandDAOImpl() {
        modelClass = Brand.class;
    }

    public List<Brand> getBrandList() {
        return getList();
    }

    public Brand getBrand(Long id) {
        return (Brand)getById(id);
    }

    public void saveBrand(Brand obj) {
        save(obj);
    }

    public void removeBrand(Long id) {
        deleteById(id);
    }
}
