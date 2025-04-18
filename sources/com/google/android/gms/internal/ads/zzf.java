package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* loaded from: classes4.dex */
public final class zzf {
    public final AudioAttributes zza;

    public /* synthetic */ zzf(zzh zzhVar, zze zzeVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i2 = zzeu.zza;
        if (i2 >= 29) {
            zzc.zza(usage, 1);
        }
        if (i2 >= 32) {
            zzd.zza(usage, 0);
        }
        this.zza = usage.build();
    }
}
