package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzflx implements zzgfk {
    final /* synthetic */ zzfma zza;
    final /* synthetic */ zzflp zzb;
    final /* synthetic */ boolean zzc;

    public zzflx(zzfma zzfmaVar, zzflp zzflpVar, boolean z2) {
        this.zza = zzfmaVar;
        this.zzb = zzflpVar;
        this.zzc = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzflp zzflpVar = this.zzb;
        if (zzflpVar.zzk()) {
            zzfma zzfmaVar = this.zza;
            zzflpVar.zzh(th);
            zzflpVar.zzg(false);
            zzfmaVar.zza(zzflpVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(Object obj) {
        zzflp zzflpVar = this.zzb;
        zzflpVar.zzg(true);
        this.zza.zza(zzflpVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
