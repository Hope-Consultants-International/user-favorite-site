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

package org.hopeconsultants.user.favorite.site.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link FavoriteSite}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FavoriteSite
 * @generated
 */
@ProviderType
public class FavoriteSiteWrapper implements FavoriteSite,
	ModelWrapper<FavoriteSite> {
	public FavoriteSiteWrapper(FavoriteSite favoriteSite) {
		_favoriteSite = favoriteSite;
	}

	@Override
	public Class<?> getModelClass() {
		return FavoriteSite.class;
	}

	@Override
	public String getModelClassName() {
		return FavoriteSite.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public Object clone() {
		return new FavoriteSiteWrapper((FavoriteSite)_favoriteSite.clone());
	}

	@Override
	public int compareTo(FavoriteSite favoriteSite) {
		return _favoriteSite.compareTo(favoriteSite);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _favoriteSite.getExpandoBridge();
	}

	/**
	* Returns the group ID of this favorite site.
	*
	* @return the group ID of this favorite site
	*/
	@Override
	public long getGroupId() {
		return _favoriteSite.getGroupId();
	}

	/**
	* Returns the primary key of this favorite site.
	*
	* @return the primary key of this favorite site
	*/
	@Override
	public org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK getPrimaryKey() {
		return _favoriteSite.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _favoriteSite.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this favorite site.
	*
	* @return the user ID of this favorite site
	*/
	@Override
	public long getUserId() {
		return _favoriteSite.getUserId();
	}

	/**
	* Returns the user uuid of this favorite site.
	*
	* @return the user uuid of this favorite site
	*/
	@Override
	public String getUserUuid() {
		return _favoriteSite.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _favoriteSite.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _favoriteSite.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _favoriteSite.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _favoriteSite.isNew();
	}

	@Override
	public void persist() {
		_favoriteSite.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_favoriteSite.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_favoriteSite.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_favoriteSite.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_favoriteSite.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this favorite site.
	*
	* @param groupId the group ID of this favorite site
	*/
	@Override
	public void setGroupId(long groupId) {
		_favoriteSite.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_favoriteSite.setNew(n);
	}

	/**
	* Sets the primary key of this favorite site.
	*
	* @param primaryKey the primary key of this favorite site
	*/
	@Override
	public void setPrimaryKey(
		org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK primaryKey) {
		_favoriteSite.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_favoriteSite.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this favorite site.
	*
	* @param userId the user ID of this favorite site
	*/
	@Override
	public void setUserId(long userId) {
		_favoriteSite.setUserId(userId);
	}

	/**
	* Sets the user uuid of this favorite site.
	*
	* @param userUuid the user uuid of this favorite site
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_favoriteSite.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<FavoriteSite> toCacheModel() {
		return _favoriteSite.toCacheModel();
	}

	@Override
	public FavoriteSite toEscapedModel() {
		return new FavoriteSiteWrapper(_favoriteSite.toEscapedModel());
	}

	@Override
	public String toString() {
		return _favoriteSite.toString();
	}

	@Override
	public FavoriteSite toUnescapedModel() {
		return new FavoriteSiteWrapper(_favoriteSite.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _favoriteSite.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavoriteSiteWrapper)) {
			return false;
		}

		FavoriteSiteWrapper favoriteSiteWrapper = (FavoriteSiteWrapper)obj;

		if (Objects.equals(_favoriteSite, favoriteSiteWrapper._favoriteSite)) {
			return true;
		}

		return false;
	}

	@Override
	public FavoriteSite getWrappedModel() {
		return _favoriteSite;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _favoriteSite.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _favoriteSite.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_favoriteSite.resetOriginalValues();
	}

	private final FavoriteSite _favoriteSite;
}