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

package org.hopeconsultants.user.favorite.site.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import org.hopeconsultants.user.favorite.site.exception.NoSuchFavoriteSiteException;
import org.hopeconsultants.user.favorite.site.model.FavoriteSite;
import org.hopeconsultants.user.favorite.site.model.impl.FavoriteSiteImpl;
import org.hopeconsultants.user.favorite.site.model.impl.FavoriteSiteModelImpl;
import org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK;
import org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the favorite site service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FavoriteSitePersistence
 * @see org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSiteUtil
 * @generated
 */
@ProviderType
public class FavoriteSitePersistenceImpl extends BasePersistenceImpl<FavoriteSite>
	implements FavoriteSitePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FavoriteSiteUtil} to access the favorite site persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FavoriteSiteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, FavoriteSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, FavoriteSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, FavoriteSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, FavoriteSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			FavoriteSiteModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the favorite sites where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching favorite sites
	 */
	@Override
	public List<FavoriteSite> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FavoriteSite> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<FavoriteSite> findByGroupId(long groupId, int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
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
	@Override
	public List<FavoriteSite> findByGroupId(long groupId, int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<FavoriteSite> list = null;

		if (retrieveFromCache) {
			list = (List<FavoriteSite>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FavoriteSite favoriteSite : list) {
					if ((groupId != favoriteSite.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FAVORITESITE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FavoriteSiteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<FavoriteSite>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FavoriteSite>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first favorite site in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching favorite site
	 * @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite findByGroupId_First(long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = fetchByGroupId_First(groupId,
				orderByComparator);

		if (favoriteSite != null) {
			return favoriteSite;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchFavoriteSiteException(msg.toString());
	}

	/**
	 * Returns the first favorite site in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite fetchByGroupId_First(long groupId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		List<FavoriteSite> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last favorite site in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching favorite site
	 * @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite findByGroupId_Last(long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (favoriteSite != null) {
			return favoriteSite;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchFavoriteSiteException(msg.toString());
	}

	/**
	 * Returns the last favorite site in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite fetchByGroupId_Last(long groupId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<FavoriteSite> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FavoriteSite[] findByGroupId_PrevAndNext(
		FavoriteSitePK favoriteSitePK, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = findByPrimaryKey(favoriteSitePK);

		Session session = null;

		try {
			session = openSession();

			FavoriteSite[] array = new FavoriteSiteImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, favoriteSite, groupId,
					orderByComparator, true);

			array[1] = favoriteSite;

			array[2] = getByGroupId_PrevAndNext(session, favoriteSite, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FavoriteSite getByGroupId_PrevAndNext(Session session,
		FavoriteSite favoriteSite, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAVORITESITE_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FavoriteSiteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(favoriteSite);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FavoriteSite> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the favorite sites where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (FavoriteSite favoriteSite : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(favoriteSite);
		}
	}

	/**
	 * Returns the number of favorite sites where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching favorite sites
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAVORITESITE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "favoriteSite.id.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, FavoriteSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, FavoriteSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			FavoriteSiteModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the favorite sites where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching favorite sites
	 */
	@Override
	public List<FavoriteSite> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FavoriteSite> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
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
	@Override
	public List<FavoriteSite> findByUserId(long userId, int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
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
	@Override
	public List<FavoriteSite> findByUserId(long userId, int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<FavoriteSite> list = null;

		if (retrieveFromCache) {
			list = (List<FavoriteSite>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FavoriteSite favoriteSite : list) {
					if ((userId != favoriteSite.getUserId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FAVORITESITE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FavoriteSiteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<FavoriteSite>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FavoriteSite>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first favorite site in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching favorite site
	 * @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite findByUserId_First(long userId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = fetchByUserId_First(userId,
				orderByComparator);

		if (favoriteSite != null) {
			return favoriteSite;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchFavoriteSiteException(msg.toString());
	}

	/**
	 * Returns the first favorite site in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite fetchByUserId_First(long userId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		List<FavoriteSite> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last favorite site in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching favorite site
	 * @throws NoSuchFavoriteSiteException if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite findByUserId_Last(long userId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = fetchByUserId_Last(userId, orderByComparator);

		if (favoriteSite != null) {
			return favoriteSite;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchFavoriteSiteException(msg.toString());
	}

	/**
	 * Returns the last favorite site in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite fetchByUserId_Last(long userId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<FavoriteSite> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FavoriteSite[] findByUserId_PrevAndNext(
		FavoriteSitePK favoriteSitePK, long userId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = findByPrimaryKey(favoriteSitePK);

		Session session = null;

		try {
			session = openSession();

			FavoriteSite[] array = new FavoriteSiteImpl[3];

			array[0] = getByUserId_PrevAndNext(session, favoriteSite, userId,
					orderByComparator, true);

			array[1] = favoriteSite;

			array[2] = getByUserId_PrevAndNext(session, favoriteSite, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FavoriteSite getByUserId_PrevAndNext(Session session,
		FavoriteSite favoriteSite, long userId,
		OrderByComparator<FavoriteSite> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAVORITESITE_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FavoriteSiteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(favoriteSite);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FavoriteSite> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the favorite sites where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (FavoriteSite favoriteSite : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(favoriteSite);
		}
	}

	/**
	 * Returns the number of favorite sites where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching favorite sites
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAVORITESITE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "favoriteSite.id.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_G = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, FavoriteSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_G = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, FavoriteSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			FavoriteSiteModelImpl.USERID_COLUMN_BITMASK |
			FavoriteSiteModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_G = new FinderPath(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the favorite sites where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the matching favorite sites
	 */
	@Override
	public List<FavoriteSite> findByU_G(long userId, long groupId) {
		return findByU_G(userId, groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<FavoriteSite> findByU_G(long userId, long groupId, int start,
		int end) {
		return findByU_G(userId, groupId, start, end, null);
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
	@Override
	public List<FavoriteSite> findByU_G(long userId, long groupId, int start,
		int end, OrderByComparator<FavoriteSite> orderByComparator) {
		return findByU_G(userId, groupId, start, end, orderByComparator, true);
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
	@Override
	public List<FavoriteSite> findByU_G(long userId, long groupId, int start,
		int end, OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_G;
			finderArgs = new Object[] { userId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_G;
			finderArgs = new Object[] {
					userId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<FavoriteSite> list = null;

		if (retrieveFromCache) {
			list = (List<FavoriteSite>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FavoriteSite favoriteSite : list) {
					if ((userId != favoriteSite.getUserId()) ||
							(groupId != favoriteSite.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_FAVORITESITE_WHERE);

			query.append(_FINDER_COLUMN_U_G_USERID_2);

			query.append(_FINDER_COLUMN_U_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FavoriteSiteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<FavoriteSite>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FavoriteSite>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public FavoriteSite findByU_G_First(long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = fetchByU_G_First(userId, groupId,
				orderByComparator);

		if (favoriteSite != null) {
			return favoriteSite;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchFavoriteSiteException(msg.toString());
	}

	/**
	 * Returns the first favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching favorite site, or <code>null</code> if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite fetchByU_G_First(long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		List<FavoriteSite> list = findByU_G(userId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FavoriteSite findByU_G_Last(long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = fetchByU_G_Last(userId, groupId,
				orderByComparator);

		if (favoriteSite != null) {
			return favoriteSite;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchFavoriteSiteException(msg.toString());
	}

	/**
	 * Returns the last favorite site in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching favorite site, or <code>null</code> if a matching favorite site could not be found
	 */
	@Override
	public FavoriteSite fetchByU_G_Last(long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator) {
		int count = countByU_G(userId, groupId);

		if (count == 0) {
			return null;
		}

		List<FavoriteSite> list = findByU_G(userId, groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FavoriteSite[] findByU_G_PrevAndNext(FavoriteSitePK favoriteSitePK,
		long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = findByPrimaryKey(favoriteSitePK);

		Session session = null;

		try {
			session = openSession();

			FavoriteSite[] array = new FavoriteSiteImpl[3];

			array[0] = getByU_G_PrevAndNext(session, favoriteSite, userId,
					groupId, orderByComparator, true);

			array[1] = favoriteSite;

			array[2] = getByU_G_PrevAndNext(session, favoriteSite, userId,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FavoriteSite getByU_G_PrevAndNext(Session session,
		FavoriteSite favoriteSite, long userId, long groupId,
		OrderByComparator<FavoriteSite> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_FAVORITESITE_WHERE);

		query.append(_FINDER_COLUMN_U_G_USERID_2);

		query.append(_FINDER_COLUMN_U_G_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FavoriteSiteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(favoriteSite);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FavoriteSite> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the favorite sites where userId = &#63; and groupId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 */
	@Override
	public void removeByU_G(long userId, long groupId) {
		for (FavoriteSite favoriteSite : findByU_G(userId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(favoriteSite);
		}
	}

	/**
	 * Returns the number of favorite sites where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the number of matching favorite sites
	 */
	@Override
	public int countByU_G(long userId, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_G;

		Object[] finderArgs = new Object[] { userId, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FAVORITESITE_WHERE);

			query.append(_FINDER_COLUMN_U_G_USERID_2);

			query.append(_FINDER_COLUMN_U_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_U_G_USERID_2 = "favoriteSite.id.userId = ? AND ";
	private static final String _FINDER_COLUMN_U_G_GROUPID_2 = "favoriteSite.id.groupId = ?";

	public FavoriteSitePersistenceImpl() {
		setModelClass(FavoriteSite.class);
	}

	/**
	 * Caches the favorite site in the entity cache if it is enabled.
	 *
	 * @param favoriteSite the favorite site
	 */
	@Override
	public void cacheResult(FavoriteSite favoriteSite) {
		entityCache.putResult(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteImpl.class, favoriteSite.getPrimaryKey(), favoriteSite);

		favoriteSite.resetOriginalValues();
	}

	/**
	 * Caches the favorite sites in the entity cache if it is enabled.
	 *
	 * @param favoriteSites the favorite sites
	 */
	@Override
	public void cacheResult(List<FavoriteSite> favoriteSites) {
		for (FavoriteSite favoriteSite : favoriteSites) {
			if (entityCache.getResult(
						FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
						FavoriteSiteImpl.class, favoriteSite.getPrimaryKey()) == null) {
				cacheResult(favoriteSite);
			}
			else {
				favoriteSite.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all favorite sites.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FavoriteSiteImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the favorite site.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FavoriteSite favoriteSite) {
		entityCache.removeResult(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteImpl.class, favoriteSite.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FavoriteSite> favoriteSites) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FavoriteSite favoriteSite : favoriteSites) {
			entityCache.removeResult(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
				FavoriteSiteImpl.class, favoriteSite.getPrimaryKey());
		}
	}

	/**
	 * Creates a new favorite site with the primary key. Does not add the favorite site to the database.
	 *
	 * @param favoriteSitePK the primary key for the new favorite site
	 * @return the new favorite site
	 */
	@Override
	public FavoriteSite create(FavoriteSitePK favoriteSitePK) {
		FavoriteSite favoriteSite = new FavoriteSiteImpl();

		favoriteSite.setNew(true);
		favoriteSite.setPrimaryKey(favoriteSitePK);

		return favoriteSite;
	}

	/**
	 * Removes the favorite site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param favoriteSitePK the primary key of the favorite site
	 * @return the favorite site that was removed
	 * @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	 */
	@Override
	public FavoriteSite remove(FavoriteSitePK favoriteSitePK)
		throws NoSuchFavoriteSiteException {
		return remove((Serializable)favoriteSitePK);
	}

	/**
	 * Removes the favorite site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the favorite site
	 * @return the favorite site that was removed
	 * @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	 */
	@Override
	public FavoriteSite remove(Serializable primaryKey)
		throws NoSuchFavoriteSiteException {
		Session session = null;

		try {
			session = openSession();

			FavoriteSite favoriteSite = (FavoriteSite)session.get(FavoriteSiteImpl.class,
					primaryKey);

			if (favoriteSite == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFavoriteSiteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(favoriteSite);
		}
		catch (NoSuchFavoriteSiteException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FavoriteSite removeImpl(FavoriteSite favoriteSite) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(favoriteSite)) {
				favoriteSite = (FavoriteSite)session.get(FavoriteSiteImpl.class,
						favoriteSite.getPrimaryKeyObj());
			}

			if (favoriteSite != null) {
				session.delete(favoriteSite);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (favoriteSite != null) {
			clearCache(favoriteSite);
		}

		return favoriteSite;
	}

	@Override
	public FavoriteSite updateImpl(FavoriteSite favoriteSite) {
		boolean isNew = favoriteSite.isNew();

		if (!(favoriteSite instanceof FavoriteSiteModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(favoriteSite.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(favoriteSite);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in favoriteSite proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FavoriteSite implementation " +
				favoriteSite.getClass());
		}

		FavoriteSiteModelImpl favoriteSiteModelImpl = (FavoriteSiteModelImpl)favoriteSite;

		Session session = null;

		try {
			session = openSession();

			if (favoriteSite.isNew()) {
				session.save(favoriteSite);

				favoriteSite.setNew(false);
			}
			else {
				favoriteSite = (FavoriteSite)session.merge(favoriteSite);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!FavoriteSiteModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { favoriteSiteModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			args = new Object[] { favoriteSiteModelImpl.getUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			args = new Object[] {
					favoriteSiteModelImpl.getUserId(),
					favoriteSiteModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_U_G, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_G,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((favoriteSiteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						favoriteSiteModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { favoriteSiteModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((favoriteSiteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						favoriteSiteModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { favoriteSiteModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((favoriteSiteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						favoriteSiteModelImpl.getOriginalUserId(),
						favoriteSiteModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_G,
					args);

				args = new Object[] {
						favoriteSiteModelImpl.getUserId(),
						favoriteSiteModelImpl.getGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_G,
					args);
			}
		}

		entityCache.putResult(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
			FavoriteSiteImpl.class, favoriteSite.getPrimaryKey(), favoriteSite,
			false);

		favoriteSite.resetOriginalValues();

		return favoriteSite;
	}

	/**
	 * Returns the favorite site with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the favorite site
	 * @return the favorite site
	 * @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	 */
	@Override
	public FavoriteSite findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFavoriteSiteException {
		FavoriteSite favoriteSite = fetchByPrimaryKey(primaryKey);

		if (favoriteSite == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFavoriteSiteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return favoriteSite;
	}

	/**
	 * Returns the favorite site with the primary key or throws a {@link NoSuchFavoriteSiteException} if it could not be found.
	 *
	 * @param favoriteSitePK the primary key of the favorite site
	 * @return the favorite site
	 * @throws NoSuchFavoriteSiteException if a favorite site with the primary key could not be found
	 */
	@Override
	public FavoriteSite findByPrimaryKey(FavoriteSitePK favoriteSitePK)
		throws NoSuchFavoriteSiteException {
		return findByPrimaryKey((Serializable)favoriteSitePK);
	}

	/**
	 * Returns the favorite site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the favorite site
	 * @return the favorite site, or <code>null</code> if a favorite site with the primary key could not be found
	 */
	@Override
	public FavoriteSite fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
				FavoriteSiteImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		FavoriteSite favoriteSite = (FavoriteSite)serializable;

		if (favoriteSite == null) {
			Session session = null;

			try {
				session = openSession();

				favoriteSite = (FavoriteSite)session.get(FavoriteSiteImpl.class,
						primaryKey);

				if (favoriteSite != null) {
					cacheResult(favoriteSite);
				}
				else {
					entityCache.putResult(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
						FavoriteSiteImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FavoriteSiteModelImpl.ENTITY_CACHE_ENABLED,
					FavoriteSiteImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return favoriteSite;
	}

	/**
	 * Returns the favorite site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param favoriteSitePK the primary key of the favorite site
	 * @return the favorite site, or <code>null</code> if a favorite site with the primary key could not be found
	 */
	@Override
	public FavoriteSite fetchByPrimaryKey(FavoriteSitePK favoriteSitePK) {
		return fetchByPrimaryKey((Serializable)favoriteSitePK);
	}

	@Override
	public Map<Serializable, FavoriteSite> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, FavoriteSite> map = new HashMap<Serializable, FavoriteSite>();

		for (Serializable primaryKey : primaryKeys) {
			FavoriteSite favoriteSite = fetchByPrimaryKey(primaryKey);

			if (favoriteSite != null) {
				map.put(primaryKey, favoriteSite);
			}
		}

		return map;
	}

	/**
	 * Returns all the favorite sites.
	 *
	 * @return the favorite sites
	 */
	@Override
	public List<FavoriteSite> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FavoriteSite> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<FavoriteSite> findAll(int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<FavoriteSite> findAll(int start, int end,
		OrderByComparator<FavoriteSite> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<FavoriteSite> list = null;

		if (retrieveFromCache) {
			list = (List<FavoriteSite>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FAVORITESITE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAVORITESITE;

				if (pagination) {
					sql = sql.concat(FavoriteSiteModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FavoriteSite>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FavoriteSite>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the favorite sites from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FavoriteSite favoriteSite : findAll()) {
			remove(favoriteSite);
		}
	}

	/**
	 * Returns the number of favorite sites.
	 *
	 * @return the number of favorite sites
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FAVORITESITE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FavoriteSiteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the favorite site persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FavoriteSiteImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FAVORITESITE = "SELECT favoriteSite FROM FavoriteSite favoriteSite";
	private static final String _SQL_SELECT_FAVORITESITE_WHERE = "SELECT favoriteSite FROM FavoriteSite favoriteSite WHERE ";
	private static final String _SQL_COUNT_FAVORITESITE = "SELECT COUNT(favoriteSite) FROM FavoriteSite favoriteSite";
	private static final String _SQL_COUNT_FAVORITESITE_WHERE = "SELECT COUNT(favoriteSite) FROM FavoriteSite favoriteSite WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "favoriteSite.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FavoriteSite exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FavoriteSite exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(FavoriteSitePersistenceImpl.class);
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(new String[] {
				"groupId", "userId"
			});
}