package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import com.adjust.sdk.Constants;

/* loaded from: classes2.dex */
public final class zzez {
    public static void zza(boolean z8, String str) throws zzey {
        if (z8) {
        } else {
            throw new zzey(str);
        }
    }

    public static boolean zzb(Context context) {
        int i9 = zzgd.zza;
        if (i9 >= 24) {
            if (i9 >= 26 || (!Constants.REFERRER_API_SAMSUNG.equals(zzgd.zzc) && !"XT1650".equals(zzgd.zzd))) {
                if (i9 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
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
