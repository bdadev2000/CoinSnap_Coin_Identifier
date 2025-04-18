package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzfly implements zzgfk {
    final /* synthetic */ zzfma zza;
    final /* synthetic */ zzflp zzb;

    public zzfly(zzfma zzfmaVar, zzflp zzflpVar) {
        this.zza = zzfmaVar;
        this.zzb = zzflpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzflp zzflpVar = this.zzb;
        zzflpVar.zzh(th);
        zzflpVar.zzg(false);
        this.zza.zza(zzflpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(Object obj) {
    }
}
