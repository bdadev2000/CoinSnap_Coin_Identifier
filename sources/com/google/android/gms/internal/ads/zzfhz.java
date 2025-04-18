package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class zzfhz {
    public static void zza(Context context, boolean z2) {
        if (z2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + com.google.android.gms.ads.internal.util.client.zzf.zzz(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i2, Throwable th, String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Ad failed to load : " + i2);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i2 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzo().zzv(th, str);
    }
}
