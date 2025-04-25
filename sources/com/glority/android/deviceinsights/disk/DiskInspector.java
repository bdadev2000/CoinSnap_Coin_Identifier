package com.glority.android.deviceinsights.disk;

import android.os.Environment;
import android.os.StatFs;
import com.glority.android.deviceinsights.definitions.StorageDetail;
import com.glority.android.deviceinsights.definitions.StorageDetailKt;
import com.glority.android.deviceinsights.definitions.StorageUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiskInspector.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/glority/android/deviceinsights/disk/DiskInspector;", "", "<init>", "()V", "queryTotalSize", "Lcom/glority/android/deviceinsights/definitions/StorageDetail;", "unit", "Lcom/glority/android/deviceinsights/definitions/StorageUnit;", "queryAvailableSize", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class DiskInspector {
    public static final DiskInspector INSTANCE = new DiskInspector();

    private DiskInspector() {
    }

    public static /* synthetic */ StorageDetail queryTotalSize$default(DiskInspector diskInspector, StorageUnit storageUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            storageUnit = StorageUnit.GB;
        }
        return diskInspector.queryTotalSize(storageUnit);
    }

    public final StorageDetail queryTotalSize(StorageUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StorageDetailKt.toUnit(new StorageDetail((float) (statFs.getBlockSizeLong() * statFs.getBlockCountLong()), StorageUnit.BYTE), unit);
    }

    public static /* synthetic */ StorageDetail queryAvailableSize$default(DiskInspector diskInspector, StorageUnit storageUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            storageUnit = StorageUnit.GB;
        }
        return diskInspector.queryAvailableSize(storageUnit);
    }

    public final StorageDetail queryAvailableSize(StorageUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StorageDetailKt.toUnit(new StorageDetail((float) (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()), StorageUnit.BYTE), unit);
    }
}
