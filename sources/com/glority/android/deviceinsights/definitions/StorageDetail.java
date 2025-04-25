package com.glority.android.deviceinsights.definitions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StorageDetail.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/glority/android/deviceinsights/definitions/StorageDetail;", "", "totalSize", "", "storageUnit", "Lcom/glority/android/deviceinsights/definitions/StorageUnit;", "<init>", "(FLcom/glority/android/deviceinsights/definitions/StorageUnit;)V", "getTotalSize", "()F", "getStorageUnit", "()Lcom/glority/android/deviceinsights/definitions/StorageUnit;", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final /* data */ class StorageDetail {
    private final StorageUnit storageUnit;
    private final float totalSize;

    /* renamed from: component1, reason: from getter */
    public final float getTotalSize() {
        return this.totalSize;
    }

    /* renamed from: component2, reason: from getter */
    public final StorageUnit getStorageUnit() {
        return this.storageUnit;
    }

    public final StorageDetail copy(float totalSize, StorageUnit storageUnit) {
        Intrinsics.checkNotNullParameter(storageUnit, "storageUnit");
        return new StorageDetail(totalSize, storageUnit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageDetail)) {
            return false;
        }
        StorageDetail storageDetail = (StorageDetail) other;
        return Float.compare(this.totalSize, storageDetail.totalSize) == 0 && this.storageUnit == storageDetail.storageUnit;
    }

    public int hashCode() {
        return (Float.hashCode(this.totalSize) * 31) + this.storageUnit.hashCode();
    }

    public StorageDetail(float f, StorageUnit storageUnit) {
        Intrinsics.checkNotNullParameter(storageUnit, "storageUnit");
        this.totalSize = f;
        this.storageUnit = storageUnit;
    }

    public static /* synthetic */ StorageDetail copy$default(StorageDetail storageDetail, float f, StorageUnit storageUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            f = storageDetail.totalSize;
        }
        if ((i & 2) != 0) {
            storageUnit = storageDetail.storageUnit;
        }
        return storageDetail.copy(f, storageUnit);
    }

    public final float getTotalSize() {
        return this.totalSize;
    }

    public final StorageUnit getStorageUnit() {
        return this.storageUnit;
    }

    public String toString() {
        return "StorageDetail(totalSize=" + this.totalSize + ", storageUnit=" + this.storageUnit + ')';
    }
}
