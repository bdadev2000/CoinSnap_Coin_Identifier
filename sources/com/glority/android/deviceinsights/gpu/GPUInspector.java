package com.glority.android.deviceinsights.gpu;

import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLES10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GPUInspector.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u0004\u0018\u00010\t¨\u0006\r"}, d2 = {"Lcom/glority/android/deviceinsights/gpu/GPUInspector;", "", "<init>", "()V", "queryHasGPU", "", "context", "Landroid/content/Context;", "queryGPUVendor", "", "queryGPURenderer", "queryGPUVersion", "queryGPUExtensions", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class GPUInspector {
    public static final GPUInspector INSTANCE = new GPUInspector();

    private GPUInspector() {
    }

    public final boolean queryHasGPU(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        String glEsVersion = ((ActivityManager) systemService).getDeviceConfigurationInfo().getGlEsVersion();
        System.out.println((Object) ("OpenGL ES Version: " + glEsVersion));
        Intrinsics.checkNotNull(glEsVersion);
        Double doubleOrNull = StringsKt.toDoubleOrNull(glEsVersion);
        return (doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) >= 2.0d;
    }

    public final String queryGPUVendor() {
        return GLES10.glGetString(7936);
    }

    public final String queryGPURenderer() {
        return GLES10.glGetString(7937);
    }

    public final String queryGPUVersion() {
        return GLES10.glGetString(7938);
    }

    public final String queryGPUExtensions() {
        return GLES10.glGetString(7939);
    }
}
