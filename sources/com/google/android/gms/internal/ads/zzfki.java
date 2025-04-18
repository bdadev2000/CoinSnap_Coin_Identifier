package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfki implements zzgee {
    final /* synthetic */ zzfkl zza;
    final /* synthetic */ zzfka zzb;
    final /* synthetic */ boolean zzc;

    public zzfki(zzfkl zzfklVar, zzfka zzfkaVar, boolean z10) {
        this.zza = zzfklVar;
        this.zzb = zzfkaVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzfka zzfkaVar = this.zzb;
        if (zzfkaVar.zzk()) {
            zzfkl zzfklVar = this.zza;
            zzfkaVar.zzh(th2);
            zzfkaVar.zzg(false);
            zzfklVar.zza(zzfkaVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        zzfka zzfkaVar = this.zzb;
        zzfkaVar.zzg(true);
        this.zza.zza(zzfkaVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
