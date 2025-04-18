package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;

/* loaded from: classes3.dex */
public final class zzdr {
    public static void zza(boolean z2, String str) throws zzdq {
        if (!z2) {
            throw new zzdq(str);
        }
    }

    public static boolean zzb(Context context) {
        int i2 = zzeu.zza;
        if (i2 < 24) {
            return false;
        }
        if (i2 < 26 && ("samsung".equals(zzeu.zzc) || "XT1650".equals(zzeu.zzd))) {
            return false;
        }
        if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzd("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzc() {
        return zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }
}
