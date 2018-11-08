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

package org.hopeconsultants.user.favorite.site.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FavoriteSiteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FavoriteSiteLocalService
 * @generated
 */
@ProviderType
public class FavoriteSiteLocalServiceWrapper implements FavoriteSiteLocalService,
	ServiceWrapper<FavoriteSiteLocalService> {
	public FavoriteSiteLocalServiceWrapper(
		FavoriteSiteLocalService favoriteSiteLocalService) {
		_favoriteSiteLocalService = favoriteSiteLocalService;
	}

	/**
	* Adds the favorite site to the database. Also notifies the appropriate model listeners.
	*
	* @param favoriteSite the favorite site
	* @return the favorite site that was added
	*/
	@Override
	public org.hopeconsultants.user.favorite.site.model.FavoriteSite addFavoriteSite(
		org.hopeconsultants.user.favorite.site.model.FavoriteSite favoriteSite) {
		return _favoriteSiteLocalService.addFavoriteSite(favoriteSite);
	}

	@Override
	public org.hopeconsultants.user.favorite.site.model.FavoriteSite addFavoriteSite(
		long groupId, long userId) {
		return _favoriteSiteLocalService.addFavoriteSite(groupId, userId);
	}

	/**
	* Creates a new favorite site with the primary key. Does not add the favorite site to the database.
	*
	* @param favoriteSitePK the primary key for the new favorite site
	* @return the new favorite site
	*/
	@Override
	public org.hopeconsultants.user.favorite.site.model.FavoriteSite createFavoriteSite(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK favoriteSitePK) {
		return _favoriteSiteLocalService.createFavoriteSite(favoriteSitePK);
	}

	@Override
	public void deleteByGroupId(long groupId) {
		_favoriteSiteLocalService.deleteByGroupId(groupId);
	}

	@Override
	public void deleteByUserId(long userId) {
		_favoriteSiteLocalService.deleteByUserId(userId);
	}

	/**
	* Deletes the favorite site from the database. Also notifies the appropriate model listeners.
	*
	* @param favoriteSite the favorite site
	* @return the favorite site that was removed
	*/
	@Override
	public org.hopeconsultants.user.favorite.site.model.FavoriteSite deleteFavoriteSite(
		org.hopeconsultants.user.favorite.site.model.FavoriteSite favoriteSite) {
		return _favoriteSiteLocalService.deleteFavoriteSite(favoriteSite);
	}

	/**
	* Deletes the favorite site with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site that was removed
	* @throws PortalException if a favorite site with the primary key could not be found
	*/
	@Override
	public org.hopeconsultants.user.favorite.site.model.FavoriteSite deleteFavoriteSite(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK favoriteSitePK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _favoriteSiteLocalService.deleteFavoriteSite(favoriteSitePK);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _favoriteSiteLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _favoriteSiteLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _favoriteSiteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.hopeconsultants.user.favorite.site.model.impl.FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _favoriteSiteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.hopeconsultants.user.favorite.site.model.impl.FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _favoriteSiteLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _favoriteSiteLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _favoriteSiteLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.hopeconsultants.user.favorite.site.model.FavoriteSite fetchFavoriteSite(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK favoriteSitePK) {
		return _favoriteSiteLocalService.fetchFavoriteSite(favoriteSitePK);
	}

	@Override
	public java.util.List<org.hopeconsultants.user.favorite.site.model.FavoriteSite> findByUserId(
		long userId) {
		return _favoriteSiteLocalService.findByUserId(userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _favoriteSiteLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the favorite site with the primary key.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site
	* @throws PortalException if a favorite site with the primary key could not be found
	*/
	@Override
	public org.hopeconsultants.user.favorite.site.model.FavoriteSite getFavoriteSite(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK favoriteSitePK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _favoriteSiteLocalService.getFavoriteSite(favoriteSitePK);
	}

	/**
	* Returns a range of all the favorite sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.hopeconsultants.user.favorite.site.model.impl.FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @return the range of favorite sites
	*/
	@Override
	public java.util.List<org.hopeconsultants.user.favorite.site.model.FavoriteSite> getFavoriteSites(
		int start, int end) {
		return _favoriteSiteLocalService.getFavoriteSites(start, end);
	}

	/**
	* Returns the number of favorite sites.
	*
	* @return the number of favorite sites
	*/
	@Override
	public int getFavoriteSitesCount() {
		return _favoriteSiteLocalService.getFavoriteSitesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _favoriteSiteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _favoriteSiteLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _favoriteSiteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the favorite site in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param favoriteSite the favorite site
	* @return the favorite site that was updated
	*/
	@Override
	public org.hopeconsultants.user.favorite.site.model.FavoriteSite updateFavoriteSite(
		org.hopeconsultants.user.favorite.site.model.FavoriteSite favoriteSite) {
		return _favoriteSiteLocalService.updateFavoriteSite(favoriteSite);
	}

	@Override
	public FavoriteSiteLocalService getWrappedService() {
		return _favoriteSiteLocalService;
	}

	@Override
	public void setWrappedService(
		FavoriteSiteLocalService favoriteSiteLocalService) {
		_favoriteSiteLocalService = favoriteSiteLocalService;
	}

	private FavoriteSiteLocalService _favoriteSiteLocalService;
}