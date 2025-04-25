package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.wish.Wishes;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WishItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/glority/android/database/entities/WishItem;", "", Args.wishId, "", "userId", "", Args.uid, "", "price", "name", "originalImageUrl", "createdAt", "Ljava/util/Date;", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getWishId", "()I", "setWishId", "(I)V", "getUserId", "()J", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "getPrice", "setPrice", "getName", "setName", "getOriginalImageUrl", "setOriginalImageUrl", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final /* data */ class WishItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Date createdAt;
    private String name;
    private String originalImageUrl;
    private String price;
    private String uid;
    private final long userId;
    private int wishId;

    /* renamed from: component1, reason: from getter */
    public final int getWishId() {
        return this.wishId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOriginalImageUrl() {
        return this.originalImageUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final WishItem copy(int wishId, long userId, String uid, String price, String name, String originalImageUrl, Date createdAt) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(originalImageUrl, "originalImageUrl");
        return new WishItem(wishId, userId, uid, price, name, originalImageUrl, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WishItem)) {
            return false;
        }
        WishItem wishItem = (WishItem) other;
        return this.wishId == wishItem.wishId && this.userId == wishItem.userId && Intrinsics.areEqual(this.uid, wishItem.uid) && Intrinsics.areEqual(this.price, wishItem.price) && Intrinsics.areEqual(this.name, wishItem.name) && Intrinsics.areEqual(this.originalImageUrl, wishItem.originalImageUrl) && Intrinsics.areEqual(this.createdAt, wishItem.createdAt);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.wishId) * 31) + Long.hashCode(this.userId)) * 31) + this.uid.hashCode()) * 31;
        String str = this.price;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.originalImageUrl.hashCode()) * 31;
        Date date = this.createdAt;
        return hashCode3 + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "WishItem(wishId=" + this.wishId + ", userId=" + this.userId + ", uid=" + this.uid + ", price=" + this.price + ", name=" + this.name + ", originalImageUrl=" + this.originalImageUrl + ", createdAt=" + this.createdAt + ')';
    }

    public WishItem(int i, long j, String uid, String str, String str2, String originalImageUrl, Date date) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(originalImageUrl, "originalImageUrl");
        this.wishId = i;
        this.userId = j;
        this.uid = uid;
        this.price = str;
        this.name = str2;
        this.originalImageUrl = originalImageUrl;
        this.createdAt = date;
    }

    public final int getWishId() {
        return this.wishId;
    }

    public final void setWishId(int i) {
        this.wishId = i;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final String getPrice() {
        return this.price;
    }

    public final void setPrice(String str) {
        this.price = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getOriginalImageUrl() {
        return this.originalImageUrl;
    }

    public final void setOriginalImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalImageUrl = str;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    /* compiled from: WishItem.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/glority/android/database/entities/WishItem$Companion;", "", "<init>", "()V", "fromWishes", "Lcom/glority/android/database/entities/WishItem;", "wishes", "Lcom/picturecoin/generatedAPI/kotlinAPI/wish/Wishes;", "userId", "", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WishItem fromWishes(Wishes wishes, long userId) {
            Intrinsics.checkNotNullParameter(wishes, "wishes");
            Integer wishId = wishes.getWishId();
            return new WishItem(wishId != null ? wishId.intValue() : 0, userId, wishes.getUid(), wishes.getPrice(), wishes.getName(), wishes.getOriginalImageUrl(), wishes.getCreatedAt());
        }
    }
}
