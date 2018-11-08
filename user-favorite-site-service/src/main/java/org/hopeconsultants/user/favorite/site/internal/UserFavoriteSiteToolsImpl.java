package org.hopeconsultants.user.favorite.site.internal;

import com.liferay.portal.kernel.cache.MultiVMPool;
import com.liferay.portal.kernel.cache.PortalCache;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hopeconsultants.user.favorite.site.constants.CacheKeys;
import org.hopeconsultants.user.favorite.site.model.FavoriteSite;
import org.hopeconsultants.user.favorite.site.service.FavoriteSiteLocalService;
import org.hopeconsultants.user.favorite.site.service.persistence.FavoriteSitePK;
import org.hopeconsultants.user.favorite.site.tools.UserFavoriteSiteTools;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    properties = {},
    service = UserFavoriteSiteTools.class
)
public class UserFavoriteSiteToolsImpl implements UserFavoriteSiteTools {

    @Override
    public void addFavoriteSite(long userId, long groupId)
        throws PortalException {

        _favoriteSiteLocalService.addFavoriteSite(groupId, userId);

        _favoriteSitePortalCache.remove(userId);
    }

    @Override
    public List<Long> getFavoriteSites(long userId)
        throws PortalException {

        ArrayList<Long> favoriteSites = _favoriteSitePortalCache.get(userId);
        if (favoriteSites == null) {

            List<FavoriteSite> list =
                _favoriteSiteLocalService.findByUserId(userId);

            favoriteSites = new ArrayList<Long>();
            for (FavoriteSite favoriteSite : list) {
                favoriteSites.add(favoriteSite.getGroupId());
            }

            _favoriteSitePortalCache.put(userId, favoriteSites);
        }

        return favoriteSites;
    }

    @Override
    public boolean isFavoriteSite(long userId, long groupId)
        throws PortalException {

        List<Long> favoriteSites = getFavoriteSites(userId);

        return (favoriteSites.contains(groupId));
    }

    @Override
    public void removeFavoriteSite(long userId, long groupId)
        throws PortalException {

        _favoriteSiteLocalService.deleteFavoriteSite(
            new FavoriteSitePK(groupId, userId));

        _favoriteSitePortalCache.remove(userId);

    }

    @Activate
    @SuppressWarnings("unchecked")
    protected void activate(
        BundleContext bundleContext, Map<String, Object> properties) {

        _favoriteSitePortalCache =
            (PortalCache<Long, ArrayList<Long>>)
                _multiVMPool.getPortalCache(CacheKeys.FAVORITE_SITES);
    }

    private PortalCache<Long, ArrayList<Long>> _favoriteSitePortalCache;

    @Reference(unbind = "-")
    private FavoriteSiteLocalService _favoriteSiteLocalService;

    @Reference
    private MultiVMPool _multiVMPool;
}
