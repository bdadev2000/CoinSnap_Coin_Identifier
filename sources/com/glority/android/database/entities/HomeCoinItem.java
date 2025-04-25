package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeCoinItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/glority/android/database/entities/HomeCoinItem;", "", Args.uid, "", "commonName", "mainImageUrl", Args.indexListUid, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "getCommonName", "getMainImageUrl", "setMainImageUrl", "(Ljava/lang/String;)V", "getIndexListUid", "setIndexListUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final /* data */ class HomeCoinItem {
    private final String commonName;
    private String indexListUid;
    private String mainImageUrl;
    private final String uid;

    /* renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCommonName() {
        return this.commonName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMainImageUrl() {
        return this.mainImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIndexListUid() {
        return this.indexListUid;
    }

    public final HomeCoinItem copy(String uid, String commonName, String mainImageUrl, String indexListUid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(commonName, "commonName");
        Intrinsics.checkNotNullParameter(mainImageUrl, "mainImageUrl");
        return new HomeCoinItem(uid, commonName, mainImageUrl, indexListUid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeCoinItem)) {
            return false;
        }
        HomeCoinItem homeCoinItem = (HomeCoinItem) other;
        return Intrinsics.areEqual(this.uid, homeCoinItem.uid) && Intrinsics.areEqual(this.commonName, homeCoinItem.commonName) && Intrinsics.areEqual(this.mainImageUrl, homeCoinItem.mainImageUrl) && Intrinsics.areEqual(this.indexListUid, homeCoinItem.indexListUid);
    }

    public int hashCode() {
        int hashCode = ((((this.uid.hashCode() * 31) + this.commonName.hashCode()) * 31) + this.mainImageUrl.hashCode()) * 31;
        String str = this.indexListUid;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HomeCoinItem(uid=" + this.uid + ", commonName=" + this.commonName + ", mainImageUrl=" + this.mainImageUrl + ", indexListUid=" + this.indexListUid + ')';
    }

    public HomeCoinItem(String uid, String commonName, String mainImageUrl, String str) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(commonName, "commonName");
        Intrinsics.checkNotNullParameter(mainImageUrl, "mainImageUrl");
        this.uid = uid;
        this.commonName = commonName;
        this.mainImageUrl = mainImageUrl;
        this.indexListUid = str;
    }

    public static /* synthetic */ HomeCoinItem copy$default(HomeCoinItem homeCoinItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeCoinItem.uid;
        }
        if ((i & 2) != 0) {
            str2 = homeCoinItem.commonName;
        }
        if ((i & 4) != 0) {
            str3 = homeCoinItem.mainImageUrl;
        }
        if ((i & 8) != 0) {
            str4 = homeCoinItem.indexListUid;
        }
        return homeCoinItem.copy(str, str2, str3, str4);
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getCommonName() {
        return this.commonName;
    }

    public final String getMainImageUrl() {
        return this.mainImageUrl;
    }

    public final void setMainImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainImageUrl = str;
    }

    public final String getIndexListUid() {
        return this.indexListUid;
    }

    public final void setIndexListUid(String str) {
        this.indexListUid = str;
    }
}
