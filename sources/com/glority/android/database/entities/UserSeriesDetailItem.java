package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSeriesDetailItem.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/glority/android/database/entities/UserSeriesDetailItem;", "", Args.seriesId, "", Args.title, "", "composition", "seriesDescription", "pageHeaderUrl", "seriesDetailList", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;", "childType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getSeriesId", "()J", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getComposition", "setComposition", "getSeriesDescription", "setSeriesDescription", "getPageHeaderUrl", "setPageHeaderUrl", "getSeriesDetailList", "()Ljava/util/List;", "setSeriesDetailList", "(Ljava/util/List;)V", "getChildType", "setChildType", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class UserSeriesDetailItem {
    private String childType;
    private String composition;
    private String pageHeaderUrl;
    private String seriesDescription;
    private List<UserSeriesDetail> seriesDetailList;
    private final long seriesId;
    private String title;

    public UserSeriesDetailItem(long j, String title, String composition, String seriesDescription, String pageHeaderUrl, List<UserSeriesDetail> seriesDetailList, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(seriesDescription, "seriesDescription");
        Intrinsics.checkNotNullParameter(pageHeaderUrl, "pageHeaderUrl");
        Intrinsics.checkNotNullParameter(seriesDetailList, "seriesDetailList");
        this.seriesId = j;
        this.title = title;
        this.composition = composition;
        this.seriesDescription = seriesDescription;
        this.pageHeaderUrl = pageHeaderUrl;
        this.seriesDetailList = seriesDetailList;
        this.childType = str;
    }

    public final long getSeriesId() {
        return this.seriesId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getComposition() {
        return this.composition;
    }

    public final void setComposition(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.composition = str;
    }

    public final String getSeriesDescription() {
        return this.seriesDescription;
    }

    public final void setSeriesDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.seriesDescription = str;
    }

    public final String getPageHeaderUrl() {
        return this.pageHeaderUrl;
    }

    public final void setPageHeaderUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageHeaderUrl = str;
    }

    public final List<UserSeriesDetail> getSeriesDetailList() {
        return this.seriesDetailList;
    }

    public final void setSeriesDetailList(List<UserSeriesDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.seriesDetailList = list;
    }

    public final String getChildType() {
        return this.childType;
    }

    public final void setChildType(String str) {
        this.childType = str;
    }
}
