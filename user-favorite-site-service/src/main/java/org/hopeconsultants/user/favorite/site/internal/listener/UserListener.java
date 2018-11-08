package org.hopeconsultants.user.favorite.site.internal.listener;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;

import org.hopeconsultants.user.favorite.site.service.FavoriteSiteLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    service = ModelListener.class
)
public class UserListener extends BaseModelListener<User> {

    @Override
    public void onBeforeRemove(User user) throws ModelListenerException {
        _deleteFavoriteSites(user);
    }

    private void _deleteFavoriteSites(User user)
        throws ModelListenerException {

        if (_log.isDebugEnabled()) {
            _log.debug(
                "Deleting favorites for user " + user.getScreenName());
        }

        _favoriteSiteLocalService.deleteByUserId(user.getUserId());
    }

    @Reference(unbind = "-")
    private FavoriteSiteLocalService _favoriteSiteLocalService;

    private final Log _log = LogFactoryUtil.getLog(getClass());

}
