package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class zzfmn extends zzflu {
    final /* synthetic */ zzfmo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmn(zzfmo zzfmoVar, zzgfa zzgfaVar) {
        super(zzgfaVar);
        this.zza = zzfmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzj;
        atomicBoolean.set(false);
        int i10 = zzeVar.zza;
        if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
            this.zza.zzo(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzft zzftVar = this.zza.zze;
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Preloading " + zzftVar.zzb + ", for adUnitId:" + zzftVar.zza + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.zza.zzf.set(false);
    }
}
