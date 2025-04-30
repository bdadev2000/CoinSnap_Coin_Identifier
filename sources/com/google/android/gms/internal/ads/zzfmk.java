package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfmk implements zzgfp {
    final /* synthetic */ zzfmn zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ boolean zzc;

    public zzfmk(zzfmn zzfmnVar, zzfmc zzfmcVar, boolean z8) {
        this.zza = zzfmnVar;
        this.zzb = zzfmcVar;
        this.zzc = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmc zzfmcVar = this.zzb;
        if (zzfmcVar.zzl()) {
            zzfmn zzfmnVar = this.zza;
            zzfmcVar.zzi(th);
            zzfmcVar.zzh(false);
            zzfmnVar.zza(zzfmcVar);
            if (this.zzc) {
                this.zza.zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(Object obj) {
        zzfmc zzfmcVar = this.zzb;
        zzfmcVar.zzh(true);
        this.zza.zza(zzfmcVar);
        if (this.zzc) {
            this.zza.zzi();
        }
    }
}
