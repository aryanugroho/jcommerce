/**
* Author: Bob Chen
*/

package com.jcommerce.core.dao;

import java.util.List;

import com.jcommerce.core.model.GoodsActivity;

public interface GoodsActivityDAO extends DAO {
    public List<GoodsActivity> getGoodsActivityList();

    public GoodsActivity getGoodsActivity(String id);

    public void saveGoodsActivity(GoodsActivity obj);

    public void removeGoodsActivity(String id);
}
