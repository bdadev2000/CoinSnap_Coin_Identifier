package com.glority.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbtestLogLocalRecord.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/glority/bean/AbtestLogLocalRecord;", "", "abtestLogArray", "", "Lcom/glority/bean/AbtestLog;", "(Ljava/util/List;)V", "getAbtestLogArray", "()Ljava/util/List;", "setAbtestLogArray", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class AbtestLogLocalRecord {
    private List<AbtestLog> abtestLogArray;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbtestLogLocalRecord copy$default(AbtestLogLocalRecord abtestLogLocalRecord, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = abtestLogLocalRecord.abtestLogArray;
        }
        return abtestLogLocalRecord.copy(list);
    }

    public final List<AbtestLog> component1() {
        return this.abtestLogArray;
    }

    public final AbtestLogLocalRecord copy(List<AbtestLog> abtestLogArray) {
        return new AbtestLogLocalRecord(abtestLogArray);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof AbtestLogLocalRecord) && Intrinsics.areEqual(this.abtestLogArray, ((AbtestLogLocalRecord) other).abtestLogArray);
        }
        return true;
    }

    public int hashCode() {
        List<AbtestLog> list = this.abtestLogArray;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AbtestLogLocalRecord(abtestLogArray=" + this.abtestLogArray + ")";
    }

    public AbtestLogLocalRecord(List<AbtestLog> list) {
        this.abtestLogArray = list;
    }

    public final List<AbtestLog> getAbtestLogArray() {
        return this.abtestLogArray;
    }

    public final void setAbtestLogArray(List<AbtestLog> list) {
        this.abtestLogArray = list;
    }
}
