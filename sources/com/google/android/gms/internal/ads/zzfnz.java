package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
final class zzfnz extends zzfnj {
    final /* synthetic */ zzfoa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfnz(zzfoa zzfoaVar, zzggh zzgghVar) {
        super(zzgghVar);
        this.zza = zzfoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzj;
        atomicBoolean.set(false);
        int i2 = zzeVar.zza;
        if (i2 != 1 && i2 != 8 && i2 != 10 && i2 != 11) {
            this.zza.zzo(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzfu zzfuVar = this.zza.zze;
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Preloading " + zzfuVar.zzb + ", for adUnitId:" + zzfuVar.zza + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.zza.zzf.set(false);
    }
}
