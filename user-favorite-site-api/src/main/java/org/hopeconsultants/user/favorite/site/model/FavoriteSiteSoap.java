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

import org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class FavoriteSiteSoap implements Serializable {
	public static FavoriteSiteSoap toSoapModel(FavoriteSite model) {
		FavoriteSiteSoap soapModel = new FavoriteSiteSoap();

		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static FavoriteSiteSoap[] toSoapModels(FavoriteSite[] models) {
		FavoriteSiteSoap[] soapModels = new FavoriteSiteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FavoriteSiteSoap[][] toSoapModels(FavoriteSite[][] models) {
		FavoriteSiteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FavoriteSiteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FavoriteSiteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FavoriteSiteSoap[] toSoapModels(List<FavoriteSite> models) {
		List<FavoriteSiteSoap> soapModels = new ArrayList<FavoriteSiteSoap>(models.size());

		for (FavoriteSite model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FavoriteSiteSoap[soapModels.size()]);
	}

	public FavoriteSiteSoap() {
	}

	public FavoriteSitePK getPrimaryKey() {
		return new FavoriteSitePK(_groupId, _userId);
	}

	public void setPrimaryKey(FavoriteSitePK pk) {
		setGroupId(pk.groupId);
		setUserId(pk.userId);
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _groupId;
	private long _userId;
}