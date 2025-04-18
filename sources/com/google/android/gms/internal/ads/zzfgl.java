package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfgl {
    public static void zza(Context context, boolean z10) {
        if (z10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + com.google.android.gms.ads.internal.util.client.zzf.zzz(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i10, Throwable th2, String str) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Ad failed to load : " + i10);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th2);
        if (i10 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, str);
    }
}
