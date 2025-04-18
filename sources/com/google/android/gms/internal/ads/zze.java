package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* loaded from: classes3.dex */
public final class zze {
    public final AudioAttributes zza;

    public /* synthetic */ zze(zzg zzgVar, zzf zzfVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i10 = zzen.zza;
        if (i10 >= 29) {
            zzc.zza(usage, 1);
        }
        if (i10 >= 32) {
            zzd.zza(usage, 0);
        }
        this.zza = usage.build();
    }
}
