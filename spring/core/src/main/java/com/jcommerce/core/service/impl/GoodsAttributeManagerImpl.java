/**
* Author: Bob Chen
*         Kylin Soong
*/

package com.jcommerce.core.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcommerce.core.dao.GoodsAttributeDAO;
import com.jcommerce.core.model.GoodsAttribute;
import com.jcommerce.core.service.Criteria;
import com.jcommerce.core.service.GoodsAttributeManager;

@Service("GoodsAttributeManager")
public class GoodsAttributeManagerImpl extends ManagerImpl implements GoodsAttributeManager {
    private static Log log = LogFactory.getLog(GoodsAttributeManagerImpl.class);
    
    @Autowired
    private GoodsAttributeDAO dao;

    public void setGoodsAttributeDAO(GoodsAttributeDAO dao) {
        this.dao = dao;
        super.setDao(dao);
    }

    public GoodsAttribute initialize(GoodsAttribute obj) {
        if (obj != null && !Hibernate.isInitialized(obj)) {
            obj = dao.getGoodsAttribute(obj.getId());
        }
        return obj;
    }

    public List<GoodsAttribute> getGoodsAttributeList(int firstRow, int maxRow) {
        List list = getList(firstRow, maxRow);
        return (List<GoodsAttribute>)list;
    }

    public int getGoodsAttributeCount(Criteria criteria) {
        return getCount(criteria);
    }

    public List<GoodsAttribute> getGoodsAttributeList(Criteria criteria) {
        List list = getList(criteria);
        return (List<GoodsAttribute>)list;
    }

    public List<GoodsAttribute> getGoodsAttributeList(int firstRow, int maxRow, Criteria criteria) {
        List list = getList(firstRow, maxRow, criteria);
        return (List<GoodsAttribute>)list;
    }

    public List<GoodsAttribute> getGoodsAttributeList() {
        return dao.getGoodsAttributeList();
    }

    public GoodsAttribute getGoodsAttribute(Long id) {
        GoodsAttribute obj = dao.getGoodsAttribute(id);
        return obj;
    }

    public void saveGoodsAttribute(GoodsAttribute obj) {
        dao.saveGoodsAttribute(obj);
    }

    public void removeGoodsAttribute(Long id) {
        dao.removeGoodsAttribute(id);
    }
}
