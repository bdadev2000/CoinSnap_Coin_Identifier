package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbyn {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzbyn(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyz zzbyzVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i2, long j2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzax)).booleanValue()) {
            return;
        }
        if (j2 - this.zza.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzay)).booleanValue()) {
            this.zza.zzM(i2);
            this.zza.zzN(j2);
        } else {
            this.zza.zzM(-1);
            this.zza.zzN(j2);
        }
    }
}
