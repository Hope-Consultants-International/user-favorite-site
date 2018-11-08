package org.hopeconsultants.user.favorite.site.internal.upgrade;

import com.liferay.portal.kernel.upgrade.DummyUpgradeStep;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;

import org.hopeconsultants.user.favorite.site.internal.upgrade.v1_0_1.SocialOfficeFavoriteSiteImport;
import org.osgi.service.component.annotations.Component;

@Component(
    immediate = true,
    property = {},
    service = UpgradeStepRegistrator.class
)
public class UserFavoriteSiteUpgrade implements UpgradeStepRegistrator {

    @Override
    public void register(Registry registry) {
        registry.register(
            "0.0.0", "1.0.0",
            new DummyUpgradeStep());

        registry.register(
            "1.0.0", "1.0.1",
            new SocialOfficeFavoriteSiteImport());
    }
}