package org.hopeconsultants.user.favorite.site.internal.listener;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ModelListener;

import java.util.Locale;

import org.hopeconsultants.user.favorite.site.service.FavoriteSiteLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    service = ModelListener.class
)
public class GroupListener extends BaseModelListener<Group> {

    @Override
    public void onBeforeRemove(Group group) throws ModelListenerException {
        _deleteFavoriteSites(group);
    }

    private void _deleteFavoriteSites(Group group)
        throws ModelListenerException {

        if (_log.isDebugEnabled()) {
            _log.debug(
                "Deleting favorites for site " + group.getName(Locale.ENGLISH));
        }


        _favoriteSiteLocalService.deleteByGroupId(group.getGroupId());
    }

    @Reference(unbind = "-")
    private FavoriteSiteLocalService _favoriteSiteLocalService;

    private final Log _log = LogFactoryUtil.getLog(getClass());

}
