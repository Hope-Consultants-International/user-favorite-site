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

package org.hopeconsultants.user.favorite.site.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.hopeconsultants.user.favorite.site.model.FavoriteSite;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the favorite site service. This utility wraps {@link org.hopeconsultants.user.favorite.site.service.persistence.impl.FavoriteSitePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FavoriteSitePersistence
 * @see org.hopeconsultants.user.favorite.site.service.persistence.impl.FavoriteSitePersistenceImpl
 * @generated
 */
@ProviderType
public class FavoriteSiteUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(FavoriteSite favoriteSite) {
		getPersistence().clearCache(favoriteSite);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FavoriteSite> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FavoriteSite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FavoriteSite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FavoriteSite update(FavoriteSite favoriteSite) {
		return getPersistence().update(favoriteSite);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FavoriteSite update(FavoriteSite favoriteSite,
		ServiceContext serviceContext) {
		return getPersistence().update(favoriteSite, serviceContext);
	}

	/**
	* Returns all the favorite sites where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching favorite sites
	*/
	public static List<FavoriteSite> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the favorite sites where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @return the range of matching favorite sites
	*/
	public static List<FavoriteSite> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the favorite sites where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favorite sites
	*/
	public static List<FavoriteSite> findByGroupId(long groupId, int start,
		int end, OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favorite sites where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favorite sites
	*/
	public static List<FavoriteSite> findByGroupId(long groupId, int start,
		int end, OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first favorite site in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public static FavoriteSite findByGroupId_First(long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first favorite site in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public static FavoriteSite fetchByGroupId_First(long groupId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last favorite site in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public static FavoriteSite findByGroupId_Last(long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last favorite site in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public static FavoriteSite fetchByGroupId_Last(long groupId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the favorite sites before and after the current favorite site in the ordered set where groupId = &#63;.
	*
	* @param favoriteSitePK the primary key of the current favorite site
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favorite site
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public static FavoriteSite[] findByGroupId_PrevAndNext(
		FavoriteSitePK favoriteSitePK, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(favoriteSitePK, groupId,
			orderByComparator);
	}

	/**
	* Removes all the favorite sites where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of favorite sites where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching favorite sites
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the favorite sites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching favorite sites
	*/
	public static List<FavoriteSite> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the favorite sites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @return the range of matching favorite sites
	*/
	public static List<FavoriteSite> findByUserId(long userId, int start,
		int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the favorite sites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favorite sites
	*/
	public static List<FavoriteSite> findByUserId(long userId, int start,
		int end, OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favorite sites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favorite sites
	*/
	public static List<FavoriteSite> findByUserId(long userId, int start,
		int end, OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first favorite site in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public static FavoriteSite findByUserId_First(long userId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first favorite site in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public static FavoriteSite fetchByUserId_First(long userId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last favorite site in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public static FavoriteSite findByUserId_Last(long userId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last favorite site in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public static FavoriteSite fetchByUserId_Last(long userId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the favorite sites before and after the current favorite site in the ordered set where userId = &#63;.
	*
	* @param favoriteSitePK the primary key of the current favorite site
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favorite site
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public static FavoriteSite[] findByUserId_PrevAndNext(
		FavoriteSitePK favoriteSitePK, long userId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence()
				   .findByUserId_PrevAndNext(favoriteSitePK, userId,
			orderByComparator);
	}

	/**
	* Removes all the favorite sites where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of favorite sites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching favorite sites
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the favorite sites where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching favorite sites
	*/
	public static List<FavoriteSite> findByU_G(long userId, long groupId) {
		return getPersistence().findByU_G(userId, groupId);
	}

	/**
	* Returns a range of all the favorite sites where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @return the range of matching favorite sites
	*/
	public static List<FavoriteSite> findByU_G(long userId, long groupId,
		int start, int end) {
		return getPersistence().findByU_G(userId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the favorite sites where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favorite sites
	*/
	public static List<FavoriteSite> findByU_G(long userId, long groupId,
		int start, int end, OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence()
				   .findByU_G(userId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favorite sites where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favorite sites
	*/
	public static List<FavoriteSite> findByU_G(long userId, long groupId,
		int start, int end, OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_G(userId, groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public static FavoriteSite findByU_G_First(long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence()
				   .findByU_G_First(userId, groupId, orderByComparator);
	}

	/**
	* Returns the first favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public static FavoriteSite fetchByU_G_First(long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence()
				   .fetchByU_G_First(userId, groupId, orderByComparator);
	}

	/**
	* Returns the last favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public static FavoriteSite findByU_G_Last(long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence()
				   .findByU_G_Last(userId, groupId, orderByComparator);
	}

	/**
	* Returns the last favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public static FavoriteSite fetchByU_G_Last(long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence()
				   .fetchByU_G_Last(userId, groupId, orderByComparator);
	}

	/**
	* Returns the favorite sites before and after the current favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param favoriteSitePK the primary key of the current favorite site
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favorite site
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public static FavoriteSite[] findByU_G_PrevAndNext(
		FavoriteSitePK favoriteSitePK, long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence()
				   .findByU_G_PrevAndNext(favoriteSitePK, userId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the favorite sites where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user ID
	* @param groupId the group ID
	*/
	public static void removeByU_G(long userId, long groupId) {
		getPersistence().removeByU_G(userId, groupId);
	}

	/**
	* Returns the number of favorite sites where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching favorite sites
	*/
	public static int countByU_G(long userId, long groupId) {
		return getPersistence().countByU_G(userId, groupId);
	}

	/**
	* Caches the favorite site in the entity cache if it is enabled.
	*
	* @param favoriteSite the favorite site
	*/
	public static void cacheResult(FavoriteSite favoriteSite) {
		getPersistence().cacheResult(favoriteSite);
	}

	/**
	* Caches the favorite sites in the entity cache if it is enabled.
	*
	* @param favoriteSites the favorite sites
	*/
	public static void cacheResult(List<FavoriteSite> favoriteSites) {
		getPersistence().cacheResult(favoriteSites);
	}

	/**
	* Creates a new favorite site with the primary key. Does not add the favorite site to the database.
	*
	* @param favoriteSitePK the primary key for the new favorite site
	* @return the new favorite site
	*/
	public static FavoriteSite create(FavoriteSitePK favoriteSitePK) {
		return getPersistence().create(favoriteSitePK);
	}

	/**
	* Removes the favorite site with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site that was removed
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public static FavoriteSite remove(FavoriteSitePK favoriteSitePK)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence().remove(favoriteSitePK);
	}

	public static FavoriteSite updateImpl(FavoriteSite favoriteSite) {
		return getPersistence().updateImpl(favoriteSite);
	}

	/**
	* Returns the favorite site with the primary key or throws a {@link NoSuchFavoriteSiteException} if it could not be found.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public static FavoriteSite findByPrimaryKey(FavoriteSitePK favoriteSitePK)
		throws org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException {
		return getPersistence().findByPrimaryKey(favoriteSitePK);
	}

	/**
	* Returns the favorite site with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site, or <code>null</code> if a favorite site with the primary key could not be found
	*/
	public static FavoriteSite fetchByPrimaryKey(FavoriteSitePK favoriteSitePK) {
		return getPersistence().fetchByPrimaryKey(favoriteSitePK);
	}

	public static java.util.Map<java.io.Serializable, FavoriteSite> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the favorite sites.
	*
	* @return the favorite sites
	*/
	public static List<FavoriteSite> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the favorite sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @return the range of favorite sites
	*/
	public static List<FavoriteSite> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the favorite sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of favorite sites
	*/
	public static List<FavoriteSite> findAll(int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favorite sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoriteSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favorite sites
	* @param end the upper bound of the range of favorite sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of favorite sites
	*/
	public static List<FavoriteSite> findAll(int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the favorite sites from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of favorite sites.
	*
	* @return the number of favorite sites
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static FavoriteSitePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FavoriteSitePersistence, FavoriteSitePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FavoriteSitePersistence.class);

		ServiceTracker<FavoriteSitePersistence, FavoriteSitePersistence> serviceTracker =
			new ServiceTracker<FavoriteSitePersistence, FavoriteSitePersistence>(bundle.getBundleContext(),
				FavoriteSitePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}