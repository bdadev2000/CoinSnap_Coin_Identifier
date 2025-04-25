package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleCollectionItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/glority/android/database/entities/SimpleCollectionItem;", "", "collectionId", "", Args.uid, "", "itemId", "", "<init>", "(ILjava/lang/String;Ljava/lang/Long;)V", "getCollectionId", "()I", "getUid", "()Ljava/lang/String;", "getItemId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Long;)Lcom/glority/android/database/entities/SimpleCollectionItem;", "equals", "", "other", "hashCode", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final /* data */ class SimpleCollectionItem {
    private final int collectionId;
    private final Long itemId;
    private final String uid;

    /* renamed from: component1, reason: from getter */
    public final int getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getItemId() {
        return this.itemId;
    }

    public final SimpleCollectionItem copy(int collectionId, String uid, Long itemId) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new SimpleCollectionItem(collectionId, uid, itemId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleCollectionItem)) {
            return false;
        }
        SimpleCollectionItem simpleCollectionItem = (SimpleCollectionItem) other;
        return this.collectionId == simpleCollectionItem.collectionId && Intrinsics.areEqual(this.uid, simpleCollectionItem.uid) && Intrinsics.areEqual(this.itemId, simpleCollectionItem.itemId);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.collectionId) * 31) + this.uid.hashCode()) * 31;
        Long l = this.itemId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "SimpleCollectionItem(collectionId=" + this.collectionId + ", uid=" + this.uid + ", itemId=" + this.itemId + ')';
    }

    public SimpleCollectionItem(int i, String uid, Long l) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.collectionId = i;
        this.uid = uid;
        this.itemId = l;
    }

    public static /* synthetic */ SimpleCollectionItem copy$default(SimpleCollectionItem simpleCollectionItem, int i, String str, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simpleCollectionItem.collectionId;
        }
        if ((i2 & 2) != 0) {
            str = simpleCollectionItem.uid;
        }
        if ((i2 & 4) != 0) {
            l = simpleCollectionItem.itemId;
        }
        return simpleCollectionItem.copy(i, str, l);
    }

    public final int getCollectionId() {
        return this.collectionId;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Long getItemId() {
        return this.itemId;
    }
}
