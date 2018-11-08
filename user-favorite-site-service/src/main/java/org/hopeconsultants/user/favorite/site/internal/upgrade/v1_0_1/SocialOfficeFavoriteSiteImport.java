package org.hopeconsultants.user.favorite.site.internal.upgrade.v1_0_1;

import com.liferay.portal.kernel.dao.jdbc.DataAccess;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SocialOfficeFavoriteSiteImport extends UpgradeProcess {

    @Override
    protected void doUpgrade()
        throws Exception {

        Connection connection = null;
        try {
            connection = DataAccess.getConnection();
        }
        catch (SQLException se) {
            _log.error("Could not get database connection.");
            return;
        }

        try (
            PreparedStatement addStatement =
                connection.prepareStatement(ADD_SQL);

            PreparedStatement selectStatement =
                connection.prepareStatement(SELECT_SQL);

            ResultSet resultSet = selectStatement.executeQuery()
        ) {

            while (resultSet.next()) {
                addStatement.setLong(1, resultSet.getLong("groupId"));
                addStatement.setLong(2, resultSet.getLong("userId"));
                addStatement.executeUpdate();
            }
            addStatement.close();
        }
        catch (SQLException se) {
            _log.error("Could not get favorite sites from SO.");
        }
    }

    private final static String SELECT_SQL =
        "SELECT groupId, userId FROM SO_FavoriteSite";

    private final static String ADD_SQL =
        "INSERT INTO UserFavoriteSite_FavoriteSite SET groupId = ?, userId = ?";

    private final Log _log = LogFactoryUtil.getLog(getClass());

}
