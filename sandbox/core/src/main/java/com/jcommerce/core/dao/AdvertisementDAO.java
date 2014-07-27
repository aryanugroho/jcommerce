/**
* Author: Bob Chen
*/

package com.jcommerce.core.dao;

import java.util.List;

import com.jcommerce.core.model.Advertisement;

public interface AdvertisementDAO extends DAO {
    public List<Advertisement> getAdvertisementList();

    public Advertisement getAdvertisement(Long id);

    public void saveAdvertisement(Advertisement obj);

    public void removeAdvertisement(Long id);
}
