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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException;
import org.hopeconsultants.user.favorite.site.model.FavoriteSite;

/**
 * The persistence interface for the favorite site service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see org.hopeconsultants.user.favorite.site.service.persistence.impl.FavoriteSitePersistenceImpl
 * @see FavoriteSiteUtil
 * @generated
 */
@ProviderType
public interface FavoriteSitePersistence extends BasePersistence<FavoriteSite> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FavoriteSiteUtil} to access the favorite site persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the favorite sites where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching favorite sites
	*/
	public java.util.List<FavoriteSite> findByGroupId(long groupId);

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
	public java.util.List<FavoriteSite> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<FavoriteSite> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

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
	public java.util.List<FavoriteSite> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favorite site in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public FavoriteSite findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Returns the first favorite site in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public FavoriteSite fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

	/**
	* Returns the last favorite site in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public FavoriteSite findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Returns the last favorite site in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public FavoriteSite fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

	/**
	* Returns the favorite sites before and after the current favorite site in the ordered set where groupId = &#63;.
	*
	* @param favoriteSitePK the primary key of the current favorite site
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favorite site
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public FavoriteSite[] findByGroupId_PrevAndNext(
		FavoriteSitePK favoriteSitePK, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Removes all the favorite sites where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of favorite sites where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching favorite sites
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the favorite sites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching favorite sites
	*/
	public java.util.List<FavoriteSite> findByUserId(long userId);

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
	public java.util.List<FavoriteSite> findByUserId(long userId, int start,
		int end);

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
	public java.util.List<FavoriteSite> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

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
	public java.util.List<FavoriteSite> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favorite site in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public FavoriteSite findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Returns the first favorite site in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public FavoriteSite fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

	/**
	* Returns the last favorite site in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public FavoriteSite findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Returns the last favorite site in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public FavoriteSite fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

	/**
	* Returns the favorite sites before and after the current favorite site in the ordered set where userId = &#63;.
	*
	* @param favoriteSitePK the primary key of the current favorite site
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favorite site
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public FavoriteSite[] findByUserId_PrevAndNext(
		FavoriteSitePK favoriteSitePK, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Removes all the favorite sites where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of favorite sites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching favorite sites
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the favorite sites where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching favorite sites
	*/
	public java.util.List<FavoriteSite> findByU_G(long userId, long groupId);

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
	public java.util.List<FavoriteSite> findByU_G(long userId, long groupId,
		int start, int end);

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
	public java.util.List<FavoriteSite> findByU_G(long userId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

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
	public java.util.List<FavoriteSite> findByU_G(long userId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public FavoriteSite findByU_G_First(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Returns the first favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public FavoriteSite fetchByU_G_First(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

	/**
	* Returns the last favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site
	* @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	*/
	public FavoriteSite findByU_G_Last(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Returns the last favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	*/
	public FavoriteSite fetchByU_G_Last(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

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
	public FavoriteSite[] findByU_G_PrevAndNext(FavoriteSitePK favoriteSitePK,
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException;

	/**
	* Removes all the favorite sites where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user ID
	* @param groupId the group ID
	*/
	public void removeByU_G(long userId, long groupId);

	/**
	* Returns the number of favorite sites where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching favorite sites
	*/
	public int countByU_G(long userId, long groupId);

	/**
	* Caches the favorite site in the entity cache if it is enabled.
	*
	* @param favoriteSite the favorite site
	*/
	public void cacheResult(FavoriteSite favoriteSite);

	/**
	* Caches the favorite sites in the entity cache if it is enabled.
	*
	* @param favoriteSites the favorite sites
	*/
	public void cacheResult(java.util.List<FavoriteSite> favoriteSites);

	/**
	* Creates a new favorite site with the primary key. Does not add the favorite site to the database.
	*
	* @param favoriteSitePK the primary key for the new favorite site
	* @return the new favorite site
	*/
	public FavoriteSite create(FavoriteSitePK favoriteSitePK);

	/**
	* Removes the favorite site with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site that was removed
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public FavoriteSite remove(FavoriteSitePK favoriteSitePK)
		throws NoSuchFavoriteSiteException;

	public FavoriteSite updateImpl(FavoriteSite favoriteSite);

	/**
	* Returns the favorite site with the primary key or throws a {@link NoSuchFavoriteSiteException} if it could not be found.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site
	* @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	*/
	public FavoriteSite findByPrimaryKey(FavoriteSitePK favoriteSitePK)
		throws NoSuchFavoriteSiteException;

	/**
	* Returns the favorite site with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param favoriteSitePK the primary key of the favorite site
	* @return the favorite site, or <code>null</code> if a favorite site with the primary key could not be found
	*/
	public FavoriteSite fetchByPrimaryKey(FavoriteSitePK favoriteSitePK);

	@Override
	public java.util.Map<java.io.Serializable, FavoriteSite> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the favorite sites.
	*
	* @return the favorite sites
	*/
	public java.util.List<FavoriteSite> findAll();

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
	public java.util.List<FavoriteSite> findAll(int start, int end);

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
	public java.util.List<FavoriteSite> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator);

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
	public java.util.List<FavoriteSite> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the favorite sites from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of favorite sites.
	*
	* @return the number of favorite sites
	*/
	public int countAll();

	public java.util.Set<String> getCompoundPKColumnNames();
}