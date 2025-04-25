package com.glority.android.deviceinsights.ram;

import android.app.ActivityManager;
import android.content.Context;
import com.glority.android.deviceinsights.definitions.StorageDetail;
import com.glority.android.deviceinsights.definitions.StorageDetailKt;
import com.glority.android.deviceinsights.definitions.StorageUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RamInspector.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/glority/android/deviceinsights/ram/RamInspector;", "", "<init>", "()V", "queryTotalSize", "Lcom/glority/android/deviceinsights/definitions/StorageDetail;", "context", "Landroid/content/Context;", "unit", "Lcom/glority/android/deviceinsights/definitions/StorageUnit;", "queryAvailableSize", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class RamInspector {
    public static final RamInspector INSTANCE = new RamInspector();

    private RamInspector() {
    }

    public static /* synthetic */ StorageDetail queryTotalSize$default(RamInspector ramInspector, Context context, StorageUnit storageUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            storageUnit = StorageUnit.GB;
        }
        return ramInspector.queryTotalSize(context, storageUnit);
    }

    public final StorageDetail queryTotalSize(Context context, StorageUnit unit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return StorageDetailKt.toUnit(new StorageDetail((float) memoryInfo.totalMem, StorageUnit.BYTE), unit);
    }

    public static /* synthetic */ StorageDetail queryAvailableSize$default(RamInspector ramInspector, Context context, StorageUnit storageUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            storageUnit = StorageUnit.GB;
        }
        return ramInspector.queryAvailableSize(context, storageUnit);
    }

    public final StorageDetail queryAvailableSize(Context context, StorageUnit unit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return StorageDetailKt.toUnit(new StorageDetail((float) memoryInfo.availMem, StorageUnit.BYTE), unit);
    }
}
