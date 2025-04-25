package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCustomSeriesItem.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001e\u001a\u00020\u0000J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/glority/android/database/entities/UserCustomSeriesItem;", "", Args.customSeriesId, "", Args.title, "", "createdAt", "Ljava/util/Date;", "updatedAt", "collectionCount", "latestCollectionUrlList", "", "totalPrice", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "<init>", "(ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;)V", "getCustomSeriesId", "()I", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getCollectionCount", "getLatestCollectionUrlList", "()Ljava/util/List;", "getTotalPrice", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "clone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final /* data */ class UserCustomSeriesItem {
    private final int collectionCount;
    private final Date createdAt;
    private final int customSeriesId;
    private final List<String> latestCollectionUrlList;
    private String title;
    private final PriceValue totalPrice;
    private final Date updatedAt;

    /* renamed from: component1, reason: from getter */
    public final int getCustomSeriesId() {
        return this.customSeriesId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCollectionCount() {
        return this.collectionCount;
    }

    public final List<String> component6() {
        return this.latestCollectionUrlList;
    }

    /* renamed from: component7, reason: from getter */
    public final PriceValue getTotalPrice() {
        return this.totalPrice;
    }

    public final UserCustomSeriesItem copy(int customSeriesId, String title, Date createdAt, Date updatedAt, int collectionCount, List<String> latestCollectionUrlList, PriceValue totalPrice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(latestCollectionUrlList, "latestCollectionUrlList");
        return new UserCustomSeriesItem(customSeriesId, title, createdAt, updatedAt, collectionCount, latestCollectionUrlList, totalPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCustomSeriesItem)) {
            return false;
        }
        UserCustomSeriesItem userCustomSeriesItem = (UserCustomSeriesItem) other;
        return this.customSeriesId == userCustomSeriesItem.customSeriesId && Intrinsics.areEqual(this.title, userCustomSeriesItem.title) && Intrinsics.areEqual(this.createdAt, userCustomSeriesItem.createdAt) && Intrinsics.areEqual(this.updatedAt, userCustomSeriesItem.updatedAt) && this.collectionCount == userCustomSeriesItem.collectionCount && Intrinsics.areEqual(this.latestCollectionUrlList, userCustomSeriesItem.latestCollectionUrlList) && Intrinsics.areEqual(this.totalPrice, userCustomSeriesItem.totalPrice);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.customSeriesId) * 31) + this.title.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + Integer.hashCode(this.collectionCount)) * 31) + this.latestCollectionUrlList.hashCode()) * 31;
        PriceValue priceValue = this.totalPrice;
        return hashCode + (priceValue == null ? 0 : priceValue.hashCode());
    }

    public String toString() {
        return "UserCustomSeriesItem(customSeriesId=" + this.customSeriesId + ", title=" + this.title + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", collectionCount=" + this.collectionCount + ", latestCollectionUrlList=" + this.latestCollectionUrlList + ", totalPrice=" + this.totalPrice + ')';
    }

    public UserCustomSeriesItem(int i, String title, Date createdAt, Date updatedAt, int i2, List<String> latestCollectionUrlList, PriceValue priceValue) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(latestCollectionUrlList, "latestCollectionUrlList");
        this.customSeriesId = i;
        this.title = title;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.collectionCount = i2;
        this.latestCollectionUrlList = latestCollectionUrlList;
        this.totalPrice = priceValue;
    }

    public static /* synthetic */ UserCustomSeriesItem copy$default(UserCustomSeriesItem userCustomSeriesItem, int i, String str, Date date, Date date2, int i2, List list, PriceValue priceValue, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = userCustomSeriesItem.customSeriesId;
        }
        if ((i3 & 2) != 0) {
            str = userCustomSeriesItem.title;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            date = userCustomSeriesItem.createdAt;
        }
        Date date3 = date;
        if ((i3 & 8) != 0) {
            date2 = userCustomSeriesItem.updatedAt;
        }
        Date date4 = date2;
        if ((i3 & 16) != 0) {
            i2 = userCustomSeriesItem.collectionCount;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            list = userCustomSeriesItem.latestCollectionUrlList;
        }
        List list2 = list;
        if ((i3 & 64) != 0) {
            priceValue = userCustomSeriesItem.totalPrice;
        }
        return userCustomSeriesItem.copy(i, str2, date3, date4, i4, list2, priceValue);
    }

    public final int getCustomSeriesId() {
        return this.customSeriesId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getCollectionCount() {
        return this.collectionCount;
    }

    public final List<String> getLatestCollectionUrlList() {
        return this.latestCollectionUrlList;
    }

    public final PriceValue getTotalPrice() {
        return this.totalPrice;
    }

    public final UserCustomSeriesItem clone() {
        return new UserCustomSeriesItem(this.customSeriesId, this.title, this.createdAt, this.updatedAt, this.collectionCount, this.latestCollectionUrlList, this.totalPrice);
    }
}
