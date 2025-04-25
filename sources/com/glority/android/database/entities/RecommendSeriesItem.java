package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendSeriesItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006%"}, d2 = {"Lcom/glority/android/database/entities/RecommendSeriesItem;", "", Args.indexListUid, "", Args.title, "composition", "seriesDescription", "pageHearUrl", "details", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesDetail;", "childType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getIndexListUid", "()Ljava/lang/String;", "getTitle", "getComposition", "getSeriesDescription", "getPageHearUrl", "getDetails", "()Ljava/util/List;", "getChildType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final /* data */ class RecommendSeriesItem {
    private final String childType;
    private final String composition;
    private final List<RecommendSeriesDetail> details;
    private final String indexListUid;
    private final String pageHearUrl;
    private final String seriesDescription;
    private final String title;

    /* renamed from: component1, reason: from getter */
    public final String getIndexListUid() {
        return this.indexListUid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getComposition() {
        return this.composition;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSeriesDescription() {
        return this.seriesDescription;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPageHearUrl() {
        return this.pageHearUrl;
    }

    public final List<RecommendSeriesDetail> component6() {
        return this.details;
    }

    /* renamed from: component7, reason: from getter */
    public final String getChildType() {
        return this.childType;
    }

    public final RecommendSeriesItem copy(String indexListUid, String title, String composition, String seriesDescription, String pageHearUrl, List<RecommendSeriesDetail> details, String childType) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(seriesDescription, "seriesDescription");
        Intrinsics.checkNotNullParameter(pageHearUrl, "pageHearUrl");
        Intrinsics.checkNotNullParameter(details, "details");
        return new RecommendSeriesItem(indexListUid, title, composition, seriesDescription, pageHearUrl, details, childType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendSeriesItem)) {
            return false;
        }
        RecommendSeriesItem recommendSeriesItem = (RecommendSeriesItem) other;
        return Intrinsics.areEqual(this.indexListUid, recommendSeriesItem.indexListUid) && Intrinsics.areEqual(this.title, recommendSeriesItem.title) && Intrinsics.areEqual(this.composition, recommendSeriesItem.composition) && Intrinsics.areEqual(this.seriesDescription, recommendSeriesItem.seriesDescription) && Intrinsics.areEqual(this.pageHearUrl, recommendSeriesItem.pageHearUrl) && Intrinsics.areEqual(this.details, recommendSeriesItem.details) && Intrinsics.areEqual(this.childType, recommendSeriesItem.childType);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.indexListUid.hashCode() * 31) + this.title.hashCode()) * 31) + this.composition.hashCode()) * 31) + this.seriesDescription.hashCode()) * 31) + this.pageHearUrl.hashCode()) * 31) + this.details.hashCode()) * 31;
        String str = this.childType;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecommendSeriesItem(indexListUid=" + this.indexListUid + ", title=" + this.title + ", composition=" + this.composition + ", seriesDescription=" + this.seriesDescription + ", pageHearUrl=" + this.pageHearUrl + ", details=" + this.details + ", childType=" + this.childType + ')';
    }

    public RecommendSeriesItem(String indexListUid, String title, String composition, String seriesDescription, String pageHearUrl, List<RecommendSeriesDetail> details, String str) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(seriesDescription, "seriesDescription");
        Intrinsics.checkNotNullParameter(pageHearUrl, "pageHearUrl");
        Intrinsics.checkNotNullParameter(details, "details");
        this.indexListUid = indexListUid;
        this.title = title;
        this.composition = composition;
        this.seriesDescription = seriesDescription;
        this.pageHearUrl = pageHearUrl;
        this.details = details;
        this.childType = str;
    }

    public static /* synthetic */ RecommendSeriesItem copy$default(RecommendSeriesItem recommendSeriesItem, String str, String str2, String str3, String str4, String str5, List list, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendSeriesItem.indexListUid;
        }
        if ((i & 2) != 0) {
            str2 = recommendSeriesItem.title;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = recommendSeriesItem.composition;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = recommendSeriesItem.seriesDescription;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = recommendSeriesItem.pageHearUrl;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            list = recommendSeriesItem.details;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            str6 = recommendSeriesItem.childType;
        }
        return recommendSeriesItem.copy(str, str7, str8, str9, str10, list2, str6);
    }

    public final String getIndexListUid() {
        return this.indexListUid;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getComposition() {
        return this.composition;
    }

    public final String getSeriesDescription() {
        return this.seriesDescription;
    }

    public final String getPageHearUrl() {
        return this.pageHearUrl;
    }

    public final List<RecommendSeriesDetail> getDetails() {
        return this.details;
    }

    public final String getChildType() {
        return this.childType;
    }
}
