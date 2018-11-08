create table UserFavoriteSite_FavoriteSite (
	groupId LONG not null,
	userId LONG not null,
	primary key (groupId, userId)
);