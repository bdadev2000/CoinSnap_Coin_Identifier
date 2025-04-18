package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import com.adjust.sdk.Constants;

/* loaded from: classes3.dex */
public final class zzdk {
    public static void zza(boolean z10, String str) throws zzdj {
        if (!z10) {
            throw new zzdj(str);
        }
    }

    public static boolean zzb(Context context) {
        int i10 = zzen.zza;
        if (i10 >= 24) {
            if (i10 >= 26 || (!Constants.REFERRER_API_SAMSUNG.equals(zzen.zzc) && !"XT1650".equals(zzen.zzd))) {
                if (i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                    return false;
                }
                return zzd("EGL_EXT_protected_content");
            }
            return false;
        }
        return false;
    }

    public static boolean zzc() {
        return zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains(str)) {
            return false;
        }
        return true;
    }
}
