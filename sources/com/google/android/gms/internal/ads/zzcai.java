package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcai {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzcau zzc;

    public zzcai(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcau zzcauVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzcauVar;
    }

    public final void zza(int i9, long j7) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaq)).booleanValue()) {
            return;
        }
        if (j7 - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzar)).booleanValue()) {
            this.zzb.zzM(-1);
            this.zzb.zzN(j7);
        } else {
            this.zzb.zzM(i9);
            this.zzb.zzN(j7);
        }
    }
}
