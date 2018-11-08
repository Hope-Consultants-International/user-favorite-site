package org.hopeconsultants.user.favorite.site.tools;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

public interface UserFavoriteSiteTools {

    /**
     * Add a site to the list of favorites
     *
     * @param userId    user id
     * @param groupId   group id (should be a site/layout)
     * @throws PortalException
     */
    public void addFavoriteSite(long userId, long groupId)
        throws PortalException;

    /**
     * Return a list of favorite sites
     *
     * @param  userId   user id of the user to get sites for
     * @return          list of site ids
     * @throws PortalException
     */
    public List<Long> getFavoriteSites(long userId) throws PortalException;

    /**
     * Check if a site is a user's favorite
     * @param userId    user id
     * @param groupId   group id (should be a site/layout)
     * @return          whether the site is a favorite of the user
     * @throws PortalException
     */
    public boolean isFavoriteSite(long userId, long groupId)
        throws PortalException;

    /**
     * Remove a site from the list of favorites
     *
     * @param userId    user id
     * @param groupId   group id (should be a site/layout)
     * @throws PortalException
     */
    public void removeFavoriteSite(long userId, long groupId)
        throws PortalException;
}
