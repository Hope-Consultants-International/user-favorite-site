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

package org.hopeconsultants.user.favorite.site.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import org.hopeconsultants.user.favorite.site.model.FavoriteSite;
import org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FavoriteSite in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FavoriteSite
 * @generated
 */
@ProviderType
public class FavoriteSiteCacheModel implements CacheModel<FavoriteSite>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavoriteSiteCacheModel)) {
			return false;
		}

		FavoriteSiteCacheModel favoriteSiteCacheModel = (FavoriteSiteCacheModel)obj;

		if (favoriteSitePK.equals(favoriteSiteCacheModel.favoriteSitePK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, favoriteSitePK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FavoriteSite toEntityModel() {
		FavoriteSiteImpl favoriteSiteImpl = new FavoriteSiteImpl();

		favoriteSiteImpl.setGroupId(groupId);
		favoriteSiteImpl.setUserId(userId);

		favoriteSiteImpl.resetOriginalValues();

		return favoriteSiteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		groupId = objectInput.readLong();

		userId = objectInput.readLong();

		favoriteSitePK = new FavoriteSitePK(groupId, userId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);
	}

	public long groupId;
	public long userId;
	public transient FavoriteSitePK favoriteSitePK;
}