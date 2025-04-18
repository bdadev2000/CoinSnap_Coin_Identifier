package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfny implements zzgfk {
    final /* synthetic */ zzfoa zza;

    public zzfny(zzfoa zzfoaVar) {
        this.zza = zzfoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzj;
        atomicBoolean.set(false);
        if ((th instanceof zzfni) && ((zzfni) th).zza() == 0) {
            throw null;
        }
        this.zza.zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        zzfnm zzfnmVar;
        atomicBoolean = this.zza.zzj;
        atomicBoolean.set(false);
        if (obj == null) {
            this.zza.zzo(true);
            return;
        }
        zzfnmVar = this.zza.zzi;
        zzfnmVar.zzc();
        this.zza.zzm(obj);
        this.zza.zzo(false);
    }
}
