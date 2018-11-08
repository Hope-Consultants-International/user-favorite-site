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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for FavoriteSite. This utility wraps
 * {@link org.hopeconsultants.user.favorite.site.service.impl.FavoriteSiteLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FavoriteSiteLocalService
 * @see org.hopeconsultants.user.favorite.site.service.base.FavoriteSiteLocalServiceBaseImpl
 * @see org.hopeconsultants.user.favorite.site.service.impl.FavoriteSiteLocalServiceImpl
 * @generated
 */
@ProviderType
public class FavoriteSiteLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.hopeconsultants.user.favorite.site.service.impl.FavoriteSiteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the favorite site to the database. Also notifies the appropriate model listeners.
	*
	* @param favoriteSite the favorite site
	* @return the favorite site that was added
	*/
	public static org.hopeconsultants.user.favorite.site.model.FavoriteSite addFavoriteSite(
		org.hopeconsultants.user.favorite.site.model.FavoriteSite favoriteSite) {
		return getService().addFavoriteSite(favoriteSite);
	}

	public static org.hopeconsultants.user.favorite.site.model.FavoriteSite addFavoriteSite(
		long groupId, long userId) {
		return getService().addFavoriteSite(groupId, userId);
	}

	/**
	* Creates a new favorite site with the primary key. Does not add the favorite site to the database.
	*
	* @param favoriteSitePK the primary key for the new favorite site
	* @return the new favorite site
	*/
	public static org.hopeconsultants.user.favorite.site.model.FavoriteSite createFavoriteSite(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK favoriteSitePK) {
		return getService().createFavoriteSite(favoriteSitePK);
	}

	public static void deleteByGroupId(long groupId) {
		getService().deleteByGroupId(groupId);
	}

	public static void deleteByUserId(long userId) {
		getService().deleteByUserId(userId);
	}

	/**
	* Deletes the favorite site from the database. Also notifies the appropriate model listeners.
	*
	* @param favoriteSite the favorite site
	* @return the favorite site that was removed
	*/
	public static org.hopeconsultants.user.favorite.site.model.FavoriteSite deleteFavoriteSite(
		org.hopeconsultants.user.favorite.site.model.FavoriteSite favoriteSite) {
		return getService().deleteFavoriteSite(favoriteSite);
	}

	/**
	* Deletes the favorite site with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site that was removed
	* @throws PortalException if a favorite site with the primary key could not be found
	*/
	public static org.hopeconsultants.user.favorite.site.model.FavoriteSite deleteFavoriteSite(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK favoriteSitePK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFavoriteSite(favoriteSitePK);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.hopeconsultants.user.favorite.site.model.FavoriteSite fetchFavoriteSite(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK favoriteSitePK) {
		return getService().fetchFavoriteSite(favoriteSitePK);
	}

	public static java.util.List<org.hopeconsultants.user.favorite.site.model.FavoriteSite> findByUserId(
		long userId) {
		return getService().findByUserId(userId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the favorite site with the primary key.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site
	* @throws PortalException if a favorite site with the primary key could not be found
	*/
	public static org.hopeconsultants.user.favorite.site.model.FavoriteSite getFavoriteSite(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK favoriteSitePK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFavoriteSite(favoriteSitePK);
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
	public static java.util.List<org.hopeconsultants.user.favorite.site.model.FavoriteSite> getFavoriteSites(
		int start, int end) {
		return getService().getFavoriteSites(start, end);
	}

	/**
	* Returns the number of favorite sites.
	*
	* @return the number of favorite sites
	*/
	public static int getFavoriteSitesCount() {
		return getService().getFavoriteSitesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the favorite site in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param favoriteSite the favorite site
	* @return the favorite site that was updated
	*/
	public static org.hopeconsultants.user.favorite.site.model.FavoriteSite updateFavoriteSite(
		org.hopeconsultants.user.favorite.site.model.FavoriteSite favoriteSite) {
		return getService().updateFavoriteSite(favoriteSite);
	}

	public static FavoriteSiteLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FavoriteSiteLocalService, FavoriteSiteLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FavoriteSiteLocalService.class);

		ServiceTracker<FavoriteSiteLocalService, FavoriteSiteLocalService> serviceTracker =
			new ServiceTracker<FavoriteSiteLocalService, FavoriteSiteLocalService>(bundle.getBundleContext(),
				FavoriteSiteLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}