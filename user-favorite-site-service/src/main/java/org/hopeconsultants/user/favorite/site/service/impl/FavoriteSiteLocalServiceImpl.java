/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.hopeconsultants.user.favorite.site.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

import org.hopeconsultants.user.favorite.site.model.FavoriteSite;
import org.hopeconsultants.user.favorite.site.service.base.FavoriteSiteLocalServiceBaseImpl;
import org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK;

/**
 * The implementation of the favorite site local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.hopeconsultants.user.favorite.site.service.FavoriteSiteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author TobiasT
 * @see FavoriteSiteLocalServiceBaseImpl
 * @see org.hopeconsultants.user.favorite.site.service.FavoriteSiteLocalServiceUtil
 */
public class FavoriteSiteLocalServiceImpl
    extends FavoriteSiteLocalServiceBaseImpl {
    /*
     *  NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Always use {@link org.hopeconsultants.user.favorite.site.service.FavoriteSiteLocalServiceUtil} to access the favorite site local service.
     */

    @Override
    @Indexable(type = IndexableType.REINDEX)
    @Transactional
    public FavoriteSite addFavoriteSite(long groupId, long userId) {

        FavoriteSite favoriteSite =
            favoriteSitePersistence.create(new FavoriteSitePK(groupId, userId));

        favoriteSite.setGroupId(groupId);
        favoriteSite.setUserId(userId);

        favoriteSitePersistence.update(favoriteSite);

        return favoriteSite;
    }

    @Override
    public void deleteByGroupId(long groupId) {

        favoriteSitePersistence.removeByGroupId(groupId);
    }

    @Override
    public void deleteByUserId(long userId) {

        favoriteSitePersistence.removeByUserId(userId);
    }

    @Override
    public FavoriteSite deleteFavoriteSite(FavoriteSitePK favoriteSitePK)
        throws PortalException {

        return favoriteSitePersistence.remove(favoriteSitePK);
    }

    @Override
    public FavoriteSite fetchFavoriteSite(FavoriteSitePK favoriteSitePK) {

        return favoriteSitePersistence.fetchByPrimaryKey(favoriteSitePK);
    }

    @Override
    public List<FavoriteSite> findByUserId(long userId) {

        return favoriteSitePersistence.findByUserId(userId);
    }

    @Override
    public FavoriteSite getFavoriteSite(FavoriteSitePK favoriteSitePK)
        throws PortalException {

        return favoriteSitePersistence.findByPrimaryKey(favoriteSitePK);
    }
}