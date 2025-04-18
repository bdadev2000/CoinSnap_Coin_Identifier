package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbyk {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzbyk(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyv zzbyvVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i10, long j3) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaA)).booleanValue()) {
            return;
        }
        if (j3 - this.zza.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaB)).booleanValue()) {
            this.zza.zzH(-1);
            this.zza.zzI(j3);
        } else {
            this.zza.zzH(i10);
            this.zza.zzI(j3);
        }
    }
}
