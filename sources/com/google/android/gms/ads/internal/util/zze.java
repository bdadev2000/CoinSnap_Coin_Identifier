package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbet;

/* loaded from: classes3.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzm {
    public static void zza(String str) {
        if (zzc()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z2 = true;
            for (String str2 : com.google.android.gms.ads.internal.util.client.zzm.zza.zzc(str)) {
                if (z2) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z2 = false;
            }
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return com.google.android.gms.ads.internal.util.client.zzm.zzm(2) && ((Boolean) zzbet.zza.zze()).booleanValue();
    }
}
