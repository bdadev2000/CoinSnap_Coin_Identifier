package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfil {
    public static void zza(Context context, boolean z8) {
        if (z8) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + com.google.android.gms.ads.internal.util.client.zzf.zzz(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i9, Throwable th, String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Ad failed to load : " + i9);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i9 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzo().zzv(th, str);
    }
}
