package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfhu implements zzgee {
    final /* synthetic */ zzfhx zza;
    final /* synthetic */ zzfhy zzb;

    public zzfhu(zzfhy zzfhyVar, zzfhx zzfhxVar) {
        this.zza = zzfhxVar;
        this.zzb = zzfhyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i10;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfhy zzfhyVar = this.zzb;
            i10 = zzfhyVar.zzf;
            if (i10 == 1) {
                zzfhyVar.zzh();
            }
        }
    }
}
