package com.glority.android.deviceinsights;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceInsights.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/deviceinsights/DeviceInsights;", "", "<init>", "()V", "queryRAMTotalSize", "", "context", "Landroid/content/Context;", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class DeviceInsights {
    public static final DeviceInsights INSTANCE = new DeviceInsights();

    private DeviceInsights() {
    }

    public final long queryRAMTotalSize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        long j = 1024;
        return ((memoryInfo.totalMem / j) / j) / j;
    }
}
