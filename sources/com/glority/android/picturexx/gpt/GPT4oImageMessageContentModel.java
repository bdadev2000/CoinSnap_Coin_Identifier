package com.glority.android.picturexx.gpt;

import com.glority.android.xx.constants.Args;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GPT4oImageMessageContentModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/glority/android/picturexx/gpt/GPT4oImageMessageContentModel;", "", "url", "", "itemId", "", Args.itemType, "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getItemId", "()J", "getItemType", "convertToJsonMap", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class GPT4oImageMessageContentModel {
    public static final int $stable = 0;
    private final long itemId;
    private final String itemType;
    private final String url;

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    public final GPT4oImageMessageContentModel copy(String url, long itemId, String itemType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        return new GPT4oImageMessageContentModel(url, itemId, itemType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GPT4oImageMessageContentModel)) {
            return false;
        }
        GPT4oImageMessageContentModel gPT4oImageMessageContentModel = (GPT4oImageMessageContentModel) other;
        return Intrinsics.areEqual(this.url, gPT4oImageMessageContentModel.url) && this.itemId == gPT4oImageMessageContentModel.itemId && Intrinsics.areEqual(this.itemType, gPT4oImageMessageContentModel.itemType);
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + Long.hashCode(this.itemId)) * 31) + this.itemType.hashCode();
    }

    public String toString() {
        return "GPT4oImageMessageContentModel(url=" + this.url + ", itemId=" + this.itemId + ", itemType=" + this.itemType + ")";
    }

    public GPT4oImageMessageContentModel(String url, long j, String itemType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        this.url = url;
        this.itemId = j;
        this.itemType = itemType;
    }

    public static /* synthetic */ GPT4oImageMessageContentModel copy$default(GPT4oImageMessageContentModel gPT4oImageMessageContentModel, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gPT4oImageMessageContentModel.url;
        }
        if ((i & 2) != 0) {
            j = gPT4oImageMessageContentModel.itemId;
        }
        if ((i & 4) != 0) {
            str2 = gPT4oImageMessageContentModel.itemType;
        }
        return gPT4oImageMessageContentModel.copy(str, j, str2);
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final Map<String, Object> convertToJsonMap() {
        return MapsKt.mapOf(TuplesKt.to("url", this.url), TuplesKt.to(FirebaseAnalytics.Param.ITEM_ID, Long.valueOf(this.itemId)), TuplesKt.to("item_type", this.itemType));
    }
}
