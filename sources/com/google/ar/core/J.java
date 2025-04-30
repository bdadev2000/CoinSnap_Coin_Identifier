package com.google.ar.core;

import android.os.Bundle;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ar.core.ArCoreApk;

/* loaded from: classes2.dex */
public final class J extends com.google.ar.core.dependencies.i {
    public final /* synthetic */ RunnableC1856b b;

    public J(RunnableC1856b runnableC1856b) {
        this.b = runnableC1856b;
    }

    @Override // com.google.ar.core.dependencies.j
    public final void b(Bundle bundle) {
    }

    @Override // com.google.ar.core.dependencies.j
    public final void c(Bundle bundle) {
        int i9 = bundle.getInt("error.code", -100);
        RunnableC1856b runnableC1856b = this.b;
        if (i9 != -5) {
            if (i9 != -3) {
                if (i9 != 0) {
                    Log.e("ARCore-InstallService", A.a("requestInfo returned: ", Ascii.SYN, i9));
                    runnableC1856b.f14285c.a(ArCoreApk.Availability.UNKNOWN_ERROR);
                    return;
                } else {
                    runnableC1856b.f14285c.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    return;
                }
            }
            Log.e("ARCore-InstallService", "The Google Play application must be updated.");
            runnableC1856b.f14285c.a(ArCoreApk.Availability.UNKNOWN_ERROR);
            return;
        }
        Log.e("ARCore-InstallService", "The device is not supported.");
        runnableC1856b.f14285c.a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
    }
}
