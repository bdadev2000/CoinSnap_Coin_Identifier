package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfml implements zzgfp {
    final /* synthetic */ zzfmn zza;
    final /* synthetic */ zzfmc zzb;

    public zzfml(zzfmn zzfmnVar, zzfmc zzfmcVar) {
        this.zza = zzfmnVar;
        this.zzb = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmc zzfmcVar = this.zzb;
        zzfmcVar.zzi(th);
        zzfmcVar.zzh(false);
        this.zza.zza(zzfmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(Object obj) {
    }
}
