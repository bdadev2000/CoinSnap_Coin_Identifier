package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSeriesListItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/glority/android/database/entities/UserSeriesListItem;", "", Args.seriesId, "", Args.indexListUid, "", Args.title, "imageUrl", "currentCount", "", "totalNum", "country", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "topSubjectSideUrls", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;Ljava/util/List;)V", "getSeriesId", "()J", "getIndexListUid", "()Ljava/lang/String;", "getTitle", "getImageUrl", "setImageUrl", "(Ljava/lang/String;)V", "getCurrentCount", "()I", "setCurrentCount", "(I)V", "getTotalNum", "setTotalNum", "getCountry", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "setCountry", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;)V", "getTopSubjectSideUrls", "()Ljava/util/List;", "setTopSubjectSideUrls", "(Ljava/util/List;)V", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class UserSeriesListItem {
    private CountryInfo country;
    private int currentCount;
    private String imageUrl;
    private final String indexListUid;
    private final long seriesId;
    private final String title;
    private List<String> topSubjectSideUrls;
    private int totalNum;

    public UserSeriesListItem(long j, String indexListUid, String title, String str, int i, int i2, CountryInfo countryInfo, List<String> list) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        Intrinsics.checkNotNullParameter(title, "title");
        this.seriesId = j;
        this.indexListUid = indexListUid;
        this.title = title;
        this.imageUrl = str;
        this.currentCount = i;
        this.totalNum = i2;
        this.country = countryInfo;
        this.topSubjectSideUrls = list;
    }

    public /* synthetic */ UserSeriesListItem(long j, String str, String str2, String str3, int i, int i2, CountryInfo countryInfo, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, i, i2, (i3 & 64) != 0 ? null : countryInfo, (i3 & 128) != 0 ? null : list);
    }

    public final long getSeriesId() {
        return this.seriesId;
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

    public final int getCurrentCount() {
        return this.currentCount;
    }

    public final void setCurrentCount(int i) {
        this.currentCount = i;
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

    public final List<String> getTopSubjectSideUrls() {
        return this.topSubjectSideUrls;
    }

    public final void setTopSubjectSideUrls(List<String> list) {
        this.topSubjectSideUrls = list;
    }
}
