package com.glority.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbtestLog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/glority/bean/AbtestLog;", "", "group", "", "mode", "", "abtestingId", "hadSendMode", "(Ljava/lang/String;ILjava/lang/String;I)V", "getAbtestingId", "()Ljava/lang/String;", "setAbtestingId", "(Ljava/lang/String;)V", "getGroup", "setGroup", "getHadSendMode", "()I", "setHadSendMode", "(I)V", "getMode", "setMode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class AbtestLog {
    private String abtestingId;
    private String group;
    private int hadSendMode;
    private int mode;

    public static /* synthetic */ AbtestLog copy$default(AbtestLog abtestLog, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = abtestLog.group;
        }
        if ((i3 & 2) != 0) {
            i = abtestLog.mode;
        }
        if ((i3 & 4) != 0) {
            str2 = abtestLog.abtestingId;
        }
        if ((i3 & 8) != 0) {
            i2 = abtestLog.hadSendMode;
        }
        return abtestLog.copy(str, i, str2, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAbtestingId() {
        return this.abtestingId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHadSendMode() {
        return this.hadSendMode;
    }

    public final AbtestLog copy(String group, int mode, String abtestingId, int hadSendMode) {
        Intrinsics.checkNotNullParameter(abtestingId, "abtestingId");
        return new AbtestLog(group, mode, abtestingId, hadSendMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbtestLog)) {
            return false;
        }
        AbtestLog abtestLog = (AbtestLog) other;
        return Intrinsics.areEqual(this.group, abtestLog.group) && this.mode == abtestLog.mode && Intrinsics.areEqual(this.abtestingId, abtestLog.abtestingId) && this.hadSendMode == abtestLog.hadSendMode;
    }

    public int hashCode() {
        String str = this.group;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.mode) * 31;
        String str2 = this.abtestingId;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.hadSendMode;
    }

    public String toString() {
        return "AbtestLog(group=" + this.group + ", mode=" + this.mode + ", abtestingId=" + this.abtestingId + ", hadSendMode=" + this.hadSendMode + ")";
    }

    public AbtestLog(String str, int i, String abtestingId, int i2) {
        Intrinsics.checkNotNullParameter(abtestingId, "abtestingId");
        this.group = str;
        this.mode = i;
        this.abtestingId = abtestingId;
        this.hadSendMode = i2;
    }

    public final String getGroup() {
        return this.group;
    }

    public final void setGroup(String str) {
        this.group = str;
    }

    public final int getMode() {
        return this.mode;
    }

    public final void setMode(int i) {
        this.mode = i;
    }

    public /* synthetic */ AbtestLog(String str, int i, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i2);
    }

    public final String getAbtestingId() {
        return this.abtestingId;
    }

    public final void setAbtestingId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.abtestingId = str;
    }

    public final int getHadSendMode() {
        return this.hadSendMode;
    }

    public final void setHadSendMode(int i) {
        this.hadSendMode = i;
    }
}
