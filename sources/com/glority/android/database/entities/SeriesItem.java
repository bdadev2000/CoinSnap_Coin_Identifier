package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeriesItem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/glority/android/database/entities/SeriesItem;", "", Args.indexListUid, "", Args.title, "imageUrl", "totalNum", "", "country", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;)V", "getIndexListUid", "()Ljava/lang/String;", "getTitle", "getImageUrl", "setImageUrl", "(Ljava/lang/String;)V", "getTotalNum", "()I", "setTotalNum", "(I)V", "getCountry", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "setCountry", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;)V", LogEvents.customseries_sortbycreate, "", "getCreated", "()Z", "setCreated", "(Z)V", Args.seriesId, "", "getSeriesId", "()Ljava/lang/Long;", "setSeriesId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "currentCount", "getCurrentCount", "()Ljava/lang/Integer;", "setCurrentCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class SeriesItem {
    private CountryInfo country;
    private boolean created;
    private Integer currentCount;
    private String imageUrl;
    private final String indexListUid;
    private Long seriesId;
    private final String title;
    private int totalNum;

    public SeriesItem(String indexListUid, String title, String str, int i, CountryInfo countryInfo) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        Intrinsics.checkNotNullParameter(title, "title");
        this.indexListUid = indexListUid;
        this.title = title;
        this.imageUrl = str;
        this.totalNum = i;
        this.country = countryInfo;
    }

    public final String getIndexListUid() {
        return this.indexListUid;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public final void setTotalNum(int i) {
        this.totalNum = i;
    }

    public final CountryInfo getCountry() {
        return this.country;
    }

    public final void setCountry(CountryInfo countryInfo) {
        this.country = countryInfo;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final void setCreated(boolean z) {
        this.created = z;
    }

    public final Long getSeriesId() {
        return this.seriesId;
    }

    public final void setSeriesId(Long l) {
        this.seriesId = l;
    }

    public final Integer getCurrentCount() {
        return this.currentCount;
    }

    public final void setCurrentCount(Integer num) {
        this.currentCount = num;
    }
}
