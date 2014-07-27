/**
* Author: Bob Chen
*/

package com.jcommerce.core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jcommerce.core.dao.SessionDAO;
import com.jcommerce.core.model.Session;

@Repository
@SuppressWarnings("unchecked")
public class SessionDAOImpl extends DAOImpl implements SessionDAO {
    public SessionDAOImpl() {
        modelClass = Session.class;
    }

    public List<Session> getSessionList() {
        return getList();
    }

    public Session getSession(Long id) {
        return (Session)getById(id);
    }

    public void saveSession(Session obj) {
        save(obj);
    }

    public void removeSession(Long id) {
        deleteById(id);
    }
}
