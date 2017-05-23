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

package com.liferay.ide.utils.library.listener.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.ide.utils.library.listener.model.Library;
import com.liferay.ide.utils.library.listener.model.LibraryModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Library service. Represents a row in the &quot;liblistener_Library&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link LibraryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LibraryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LibraryImpl
 * @see Library
 * @see LibraryModel
 * @generated
 */
@ProviderType
public class LibraryModelImpl extends BaseModelImpl<Library>
	implements LibraryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a library model instance should use the {@link Library} interface instead.
	 */
	public static final String TABLE_NAME = "liblistener_Library";
	public static final Object[][] TABLE_COLUMNS = {
			{ "libraryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "libraryGroupId", Types.VARCHAR },
			{ "libraryArtifactId", Types.VARCHAR },
			{ "latestVersion", Types.VARCHAR },
			{ "lastUpdated", Types.VARCHAR },
			{ "currentVersion", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("libraryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("libraryGroupId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("libraryArtifactId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("latestVersion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastUpdated", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("currentVersion", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table liblistener_Library (libraryId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,libraryGroupId VARCHAR(75) null,libraryArtifactId VARCHAR(75) null,latestVersion VARCHAR(75) null,lastUpdated VARCHAR(75) null,currentVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table liblistener_Library";
	public static final String ORDER_BY_JPQL = " ORDER BY library.libraryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY liblistener_Library.libraryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(library.listener.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.ide.utils.library.listener.model.Library"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(library.listener.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.ide.utils.library.listener.model.Library"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(library.listener.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.ide.utils.library.listener.model.Library"));

	public LibraryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _libraryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLibraryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _libraryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Library.class;
	}

	@Override
	public String getModelClassName() {
		return Library.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("libraryId", getLibraryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("libraryGroupId", getLibraryGroupId());
		attributes.put("libraryArtifactId", getLibraryArtifactId());
		attributes.put("latestVersion", getLatestVersion());
		attributes.put("lastUpdated", getLastUpdated());
		attributes.put("currentVersion", getCurrentVersion());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long libraryId = (Long)attributes.get("libraryId");

		if (libraryId != null) {
			setLibraryId(libraryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String libraryGroupId = (String)attributes.get("libraryGroupId");

		if (libraryGroupId != null) {
			setLibraryGroupId(libraryGroupId);
		}

		String libraryArtifactId = (String)attributes.get("libraryArtifactId");

		if (libraryArtifactId != null) {
			setLibraryArtifactId(libraryArtifactId);
		}

		String latestVersion = (String)attributes.get("latestVersion");

		if (latestVersion != null) {
			setLatestVersion(latestVersion);
		}

		String lastUpdated = (String)attributes.get("lastUpdated");

		if (lastUpdated != null) {
			setLastUpdated(lastUpdated);
		}

		String currentVersion = (String)attributes.get("currentVersion");

		if (currentVersion != null) {
			setCurrentVersion(currentVersion);
		}
	}

	@Override
	public long getLibraryId() {
		return _libraryId;
	}

	@Override
	public void setLibraryId(long libraryId) {
		_libraryId = libraryId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getLibraryGroupId() {
		if (_libraryGroupId == null) {
			return StringPool.BLANK;
		}
		else {
			return _libraryGroupId;
		}
	}

	@Override
	public void setLibraryGroupId(String libraryGroupId) {
		_libraryGroupId = libraryGroupId;
	}

	@Override
	public String getLibraryArtifactId() {
		if (_libraryArtifactId == null) {
			return StringPool.BLANK;
		}
		else {
			return _libraryArtifactId;
		}
	}

	@Override
	public void setLibraryArtifactId(String libraryArtifactId) {
		_libraryArtifactId = libraryArtifactId;
	}

	@Override
	public String getLatestVersion() {
		if (_latestVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _latestVersion;
		}
	}

	@Override
	public void setLatestVersion(String latestVersion) {
		_latestVersion = latestVersion;
	}

	@Override
	public String getLastUpdated() {
		if (_lastUpdated == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastUpdated;
		}
	}

	@Override
	public void setLastUpdated(String lastUpdated) {
		_lastUpdated = lastUpdated;
	}

	@Override
	public String getCurrentVersion() {
		if (_currentVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _currentVersion;
		}
	}

	@Override
	public void setCurrentVersion(String currentVersion) {
		_currentVersion = currentVersion;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Library.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Library toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Library)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LibraryImpl libraryImpl = new LibraryImpl();

		libraryImpl.setLibraryId(getLibraryId());
		libraryImpl.setGroupId(getGroupId());
		libraryImpl.setCompanyId(getCompanyId());
		libraryImpl.setUserId(getUserId());
		libraryImpl.setUserName(getUserName());
		libraryImpl.setCreateDate(getCreateDate());
		libraryImpl.setModifiedDate(getModifiedDate());
		libraryImpl.setLibraryGroupId(getLibraryGroupId());
		libraryImpl.setLibraryArtifactId(getLibraryArtifactId());
		libraryImpl.setLatestVersion(getLatestVersion());
		libraryImpl.setLastUpdated(getLastUpdated());
		libraryImpl.setCurrentVersion(getCurrentVersion());

		libraryImpl.resetOriginalValues();

		return libraryImpl;
	}

	@Override
	public int compareTo(Library library) {
		long primaryKey = library.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Library)) {
			return false;
		}

		Library library = (Library)obj;

		long primaryKey = library.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		LibraryModelImpl libraryModelImpl = this;

		libraryModelImpl._setModifiedDate = false;
	}

	@Override
	public CacheModel<Library> toCacheModel() {
		LibraryCacheModel libraryCacheModel = new LibraryCacheModel();

		libraryCacheModel.libraryId = getLibraryId();

		libraryCacheModel.groupId = getGroupId();

		libraryCacheModel.companyId = getCompanyId();

		libraryCacheModel.userId = getUserId();

		libraryCacheModel.userName = getUserName();

		String userName = libraryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			libraryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			libraryCacheModel.createDate = createDate.getTime();
		}
		else {
			libraryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			libraryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			libraryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		libraryCacheModel.libraryGroupId = getLibraryGroupId();

		String libraryGroupId = libraryCacheModel.libraryGroupId;

		if ((libraryGroupId != null) && (libraryGroupId.length() == 0)) {
			libraryCacheModel.libraryGroupId = null;
		}

		libraryCacheModel.libraryArtifactId = getLibraryArtifactId();

		String libraryArtifactId = libraryCacheModel.libraryArtifactId;

		if ((libraryArtifactId != null) && (libraryArtifactId.length() == 0)) {
			libraryCacheModel.libraryArtifactId = null;
		}

		libraryCacheModel.latestVersion = getLatestVersion();

		String latestVersion = libraryCacheModel.latestVersion;

		if ((latestVersion != null) && (latestVersion.length() == 0)) {
			libraryCacheModel.latestVersion = null;
		}

		libraryCacheModel.lastUpdated = getLastUpdated();

		String lastUpdated = libraryCacheModel.lastUpdated;

		if ((lastUpdated != null) && (lastUpdated.length() == 0)) {
			libraryCacheModel.lastUpdated = null;
		}

		libraryCacheModel.currentVersion = getCurrentVersion();

		String currentVersion = libraryCacheModel.currentVersion;

		if ((currentVersion != null) && (currentVersion.length() == 0)) {
			libraryCacheModel.currentVersion = null;
		}

		return libraryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{libraryId=");
		sb.append(getLibraryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", libraryGroupId=");
		sb.append(getLibraryGroupId());
		sb.append(", libraryArtifactId=");
		sb.append(getLibraryArtifactId());
		sb.append(", latestVersion=");
		sb.append(getLatestVersion());
		sb.append(", lastUpdated=");
		sb.append(getLastUpdated());
		sb.append(", currentVersion=");
		sb.append(getCurrentVersion());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.liferay.ide.utils.library.listener.model.Library");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>libraryId</column-name><column-value><![CDATA[");
		sb.append(getLibraryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>libraryGroupId</column-name><column-value><![CDATA[");
		sb.append(getLibraryGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>libraryArtifactId</column-name><column-value><![CDATA[");
		sb.append(getLibraryArtifactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestVersion</column-name><column-value><![CDATA[");
		sb.append(getLatestVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastUpdated</column-name><column-value><![CDATA[");
		sb.append(getLastUpdated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentVersion</column-name><column-value><![CDATA[");
		sb.append(getCurrentVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Library.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Library.class
		};
	private long _libraryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _libraryGroupId;
	private String _libraryArtifactId;
	private String _latestVersion;
	private String _lastUpdated;
	private String _currentVersion;
	private Library _escapedModel;
}