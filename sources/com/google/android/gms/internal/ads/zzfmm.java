package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfmm implements zzgee {
    final /* synthetic */ zzfmo zza;

    public zzfmm(zzfmo zzfmoVar) {
        this.zza = zzfmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzj;
        atomicBoolean.set(false);
        if ((th2 instanceof zzflt) && ((zzflt) th2).zza() == 0) {
            throw null;
        }
        this.zza.zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        zzflx zzflxVar;
        atomicBoolean = this.zza.zzj;
        atomicBoolean.set(false);
        if (obj != null) {
            zzflxVar = this.zza.zzi;
            zzflxVar.zzc();
            this.zza.zzm(obj);
            this.zza.zzo(false);
            return;
        }
        this.zza.zzo(true);
    }
}
