package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryItem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/glority/android/database/entities/HistoryItem;", "", "itemId", "", Args.uid, "", "name", "userId", "imageUrl", "date", "Ljava/util/Date;", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Date;)V", "getItemId", "()J", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "getName", "setName", "getUserId", "getImageUrl", "getDate", "()Ljava/util/Date;", "newAdd", "", "getNewAdd", "()Z", "setNewAdd", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final /* data */ class HistoryItem {
    private final Date date;
    private final String imageUrl;
    private final long itemId;
    private String name;
    private boolean newAdd;
    private String uid;
    private final long userId;

    /* renamed from: component1, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    public final HistoryItem copy(long itemId, String uid, String name, long userId, String imageUrl, Date date) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(date, "date");
        return new HistoryItem(itemId, uid, name, userId, imageUrl, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryItem)) {
            return false;
        }
        HistoryItem historyItem = (HistoryItem) other;
        return this.itemId == historyItem.itemId && Intrinsics.areEqual(this.uid, historyItem.uid) && Intrinsics.areEqual(this.name, historyItem.name) && this.userId == historyItem.userId && Intrinsics.areEqual(this.imageUrl, historyItem.imageUrl) && Intrinsics.areEqual(this.date, historyItem.date);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.itemId) * 31) + this.uid.hashCode()) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.userId)) * 31) + this.imageUrl.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "HistoryItem(itemId=" + this.itemId + ", uid=" + this.uid + ", name=" + this.name + ", userId=" + this.userId + ", imageUrl=" + this.imageUrl + ", date=" + this.date + ')';
    }

    public HistoryItem(long j, String uid, String name, long j2, String imageUrl, Date date) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(date, "date");
        this.itemId = j;
        this.uid = uid;
        this.name = name;
        this.userId = j2;
        this.imageUrl = imageUrl;
        this.date = date;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Date getDate() {
        return this.date;
    }

    public final boolean getNewAdd() {
        return this.newAdd;
    }

    public final void setNewAdd(boolean z) {
        this.newAdd = z;
    }
}
