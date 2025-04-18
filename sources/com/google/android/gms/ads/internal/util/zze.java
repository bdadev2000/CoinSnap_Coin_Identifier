package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbep;

/* loaded from: classes3.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzm {
    public static void zza(String str) {
        if (zzc()) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : com.google.android.gms.ads.internal.util.client.zzm.zza.zzc(str)) {
                    if (z10) {
                        Log.v("Ads", str2);
                    } else {
                        Log.v("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.v("Ads", str);
        }
    }

    public static void zzb(String str, Throwable th2) {
        if (zzc()) {
            Log.v("Ads", str, th2);
        }
    }

    public static boolean zzc() {
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(2) && ((Boolean) zzbep.zza.zze()).booleanValue()) {
            return true;
        }
        return false;
    }
}
