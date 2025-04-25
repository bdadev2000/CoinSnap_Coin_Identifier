package com.glority.android.deviceinsights.definitions;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StorageDetail.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"toBit", "Lcom/glority/android/deviceinsights/definitions/StorageDetail;", "toByte", "toKB", "toMB", "toGB", "toTB", "toUnit", "unit", "Lcom/glority/android/deviceinsights/definitions/StorageUnit;", "deviceinsights_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class StorageDetailKt {

    /* compiled from: StorageDetail.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StorageUnit.values().length];
            try {
                iArr[StorageUnit.BIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StorageUnit.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StorageUnit.KB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StorageUnit.MB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StorageUnit.GB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StorageUnit.TB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StorageDetail toBit(StorageDetail storageDetail) {
        StorageDetail storageDetail2;
        Intrinsics.checkNotNullParameter(storageDetail, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[storageDetail.getStorageUnit().ordinal()]) {
            case 1:
                return storageDetail;
            case 2:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 8, StorageUnit.BIT);
                break;
            case 3:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 8 * 1024, StorageUnit.BIT);
                break;
            case 4:
                float f = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 8 * f * f, StorageUnit.BIT);
                break;
            case 5:
                float f2 = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 8 * f2 * f2 * f2, StorageUnit.BIT);
                break;
            case 6:
                float f3 = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 8 * f3 * f3 * f3 * f3, StorageUnit.BIT);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return storageDetail2;
    }

    public static final StorageDetail toByte(StorageDetail storageDetail) {
        StorageDetail storageDetail2;
        Intrinsics.checkNotNullParameter(storageDetail, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[storageDetail.getStorageUnit().ordinal()]) {
            case 1:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() / 8, StorageUnit.BYTE);
                break;
            case 2:
                return storageDetail;
            case 3:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 1024, StorageUnit.BYTE);
                break;
            case 4:
                float f = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * f * f, StorageUnit.BYTE);
                break;
            case 5:
                float f2 = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * f2 * f2 * f2, StorageUnit.BYTE);
                break;
            case 6:
                float f3 = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * f3 * f3 * f3 * f3, StorageUnit.BYTE);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return storageDetail2;
    }

    public static final StorageDetail toKB(StorageDetail storageDetail) {
        StorageDetail storageDetail2;
        Intrinsics.checkNotNullParameter(storageDetail, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[storageDetail.getStorageUnit().ordinal()]) {
            case 1:
                storageDetail2 = new StorageDetail((storageDetail.getTotalSize() / 8) / 1024, StorageUnit.KB);
                break;
            case 2:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() / 1024, StorageUnit.KB);
                break;
            case 3:
                return storageDetail;
            case 4:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 1024, StorageUnit.KB);
                break;
            case 5:
                float f = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * f * f, StorageUnit.KB);
                break;
            case 6:
                float f2 = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * f2 * f2 * f2, StorageUnit.KB);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return storageDetail2;
    }

    public static final StorageDetail toMB(StorageDetail storageDetail) {
        StorageDetail storageDetail2;
        Intrinsics.checkNotNullParameter(storageDetail, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[storageDetail.getStorageUnit().ordinal()]) {
            case 1:
                float f = 1024;
                storageDetail2 = new StorageDetail(((storageDetail.getTotalSize() / 8) / f) / f, StorageUnit.MB);
                break;
            case 2:
                float f2 = 1024;
                storageDetail2 = new StorageDetail((storageDetail.getTotalSize() / f2) / f2, StorageUnit.MB);
                break;
            case 3:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() / 1024, StorageUnit.MB);
                break;
            case 4:
                return storageDetail;
            case 5:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 1024, StorageUnit.MB);
                break;
            case 6:
                float f3 = 1024;
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * f3 * f3, StorageUnit.MB);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return storageDetail2;
    }

    public static final StorageDetail toGB(StorageDetail storageDetail) {
        StorageDetail storageDetail2;
        Intrinsics.checkNotNullParameter(storageDetail, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[storageDetail.getStorageUnit().ordinal()]) {
            case 1:
                float f = 1024;
                storageDetail2 = new StorageDetail((((storageDetail.getTotalSize() / 8) / f) / f) / f, StorageUnit.GB);
                break;
            case 2:
                float f2 = 1024;
                storageDetail2 = new StorageDetail(((storageDetail.getTotalSize() / f2) / f2) / f2, StorageUnit.GB);
                break;
            case 3:
                float f3 = 1024;
                storageDetail2 = new StorageDetail((storageDetail.getTotalSize() / f3) / f3, StorageUnit.GB);
                break;
            case 4:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() / 1024, StorageUnit.GB);
                break;
            case 5:
                return storageDetail;
            case 6:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() * 1024, StorageUnit.GB);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return storageDetail2;
    }

    public static final StorageDetail toTB(StorageDetail storageDetail) {
        StorageDetail storageDetail2;
        Intrinsics.checkNotNullParameter(storageDetail, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[storageDetail.getStorageUnit().ordinal()]) {
            case 1:
                float f = 1024;
                storageDetail2 = new StorageDetail(((((storageDetail.getTotalSize() / 8) / f) / f) / f) / f, StorageUnit.TB);
                break;
            case 2:
                float f2 = 1024;
                storageDetail2 = new StorageDetail((((storageDetail.getTotalSize() / f2) / f2) / f2) / f2, StorageUnit.TB);
                break;
            case 3:
                float f3 = 1024;
                storageDetail2 = new StorageDetail(((storageDetail.getTotalSize() / f3) / f3) / f3, StorageUnit.TB);
                break;
            case 4:
                float f4 = 1024;
                storageDetail2 = new StorageDetail((storageDetail.getTotalSize() / f4) / f4, StorageUnit.TB);
                break;
            case 5:
                storageDetail2 = new StorageDetail(storageDetail.getTotalSize() / 1024, StorageUnit.TB);
                break;
            case 6:
                return storageDetail;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return storageDetail2;
    }

    public static final StorageDetail toUnit(StorageDetail storageDetail, StorageUnit unit) {
        Intrinsics.checkNotNullParameter(storageDetail, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        switch (WhenMappings.$EnumSwitchMapping$0[unit.ordinal()]) {
            case 1:
                return toBit(storageDetail);
            case 2:
                return toByte(storageDetail);
            case 3:
                return toKB(storageDetail);
            case 4:
                return toMB(storageDetail);
            case 5:
                return toGB(storageDetail);
            case 6:
                return toTB(storageDetail);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
