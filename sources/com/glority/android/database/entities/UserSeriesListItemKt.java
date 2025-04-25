package com.glority.android.database.entities;

import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSeriesListItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toUserSeriesList", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesList;", "Lcom/glority/android/database/entities/UserSeriesListItem;", "toUserSeriesListItem", "database_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class UserSeriesListItemKt {
    public static final UserSeriesList toUserSeriesList(UserSeriesListItem userSeriesListItem) {
        Intrinsics.checkNotNullParameter(userSeriesListItem, "<this>");
        UserSeriesList userSeriesList = new UserSeriesList(0, 1, null);
        userSeriesList.setSeriesId(userSeriesListItem.getSeriesId());
        userSeriesList.setIndexListUid(userSeriesListItem.getIndexListUid());
        userSeriesList.setTitle(userSeriesListItem.getTitle());
        userSeriesList.setCollectedNum(userSeriesListItem.getCurrentCount());
        userSeriesList.setTotalNum(userSeriesListItem.getTotalNum());
        String imageUrl = userSeriesListItem.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        userSeriesList.setImageUrl(imageUrl);
        CountryInfo country = userSeriesListItem.getCountry();
        if (country == null) {
            country = new CountryInfo(0, 1, null);
            country.setCountryCode("");
            country.setCountryCode3("");
            country.setName("");
            country.setCurrencyCode("");
            country.setSymbol("");
            country.setCapitalLocation(null);
        }
        userSeriesList.setCountry(country);
        userSeriesList.setTopSubjectSideUrls(userSeriesListItem.getTopSubjectSideUrls());
        return userSeriesList;
    }

    public static final UserSeriesListItem toUserSeriesListItem(UserSeriesList userSeriesList) {
        Intrinsics.checkNotNullParameter(userSeriesList, "<this>");
        return new UserSeriesListItem(userSeriesList.getSeriesId(), userSeriesList.getIndexListUid(), userSeriesList.getTitle(), userSeriesList.getImageUrl(), userSeriesList.getCollectedNum(), userSeriesList.getTotalNum(), userSeriesList.getCountry(), userSeriesList.getTopSubjectSideUrls());
    }
}
