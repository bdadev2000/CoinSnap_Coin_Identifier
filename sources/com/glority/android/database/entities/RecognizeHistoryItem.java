package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecognizeHistoryItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/glority/android/database/entities/RecognizeHistoryItem;", "", "itemId", "", Args.uid, "", "date", "Ljava/util/Date;", Args.year, "<init>", "(JLjava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getItemId", "()J", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "getYear", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final /* data */ class RecognizeHistoryItem {
    private final Date date;
    private final long itemId;
    private String uid;
    private final String year;

    /* renamed from: component1, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    public final RecognizeHistoryItem copy(long itemId, String uid, Date date, String year) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(date, "date");
        return new RecognizeHistoryItem(itemId, uid, date, year);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecognizeHistoryItem)) {
            return false;
        }
        RecognizeHistoryItem recognizeHistoryItem = (RecognizeHistoryItem) other;
        return this.itemId == recognizeHistoryItem.itemId && Intrinsics.areEqual(this.uid, recognizeHistoryItem.uid) && Intrinsics.areEqual(this.date, recognizeHistoryItem.date) && Intrinsics.areEqual(this.year, recognizeHistoryItem.year);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.itemId) * 31) + this.uid.hashCode()) * 31) + this.date.hashCode()) * 31;
        String str = this.year;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecognizeHistoryItem(itemId=" + this.itemId + ", uid=" + this.uid + ", date=" + this.date + ", year=" + this.year + ')';
    }

    public RecognizeHistoryItem(long j, String uid, Date date, String str) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(date, "date");
        this.itemId = j;
        this.uid = uid;
        this.date = date;
        this.year = str;
    }

    public static /* synthetic */ RecognizeHistoryItem copy$default(RecognizeHistoryItem recognizeHistoryItem, long j, String str, Date date, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = recognizeHistoryItem.itemId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = recognizeHistoryItem.uid;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            date = recognizeHistoryItem.date;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            str2 = recognizeHistoryItem.year;
        }
        return recognizeHistoryItem.copy(j2, str3, date2, str2);
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

    public final Date getDate() {
        return this.date;
    }

    public final String getYear() {
        return this.year;
    }
}
