package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbgm;

/* loaded from: classes2.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzm {
    public static void zza(String str) {
        if (zzc()) {
            if (str != null && str.length() > 4000) {
                boolean z8 = true;
                for (String str2 : com.google.android.gms.ads.internal.util.client.zzm.zza.zzd(str)) {
                    if (z8) {
                        Log.v("Ads", str2);
                    } else {
                        Log.v("Ads-cont", str2);
                    }
                    z8 = false;
                }
                return;
            }
            Log.v("Ads", str);
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(2) && ((Boolean) zzbgm.zza.zze()).booleanValue()) {
            return true;
        }
        return false;
    }
}
