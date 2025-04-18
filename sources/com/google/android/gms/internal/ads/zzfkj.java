package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfkj implements zzgee {
    final /* synthetic */ zzfkl zza;
    final /* synthetic */ zzfka zzb;

    public zzfkj(zzfkl zzfklVar, zzfka zzfkaVar) {
        this.zza = zzfklVar;
        this.zzb = zzfkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzfka zzfkaVar = this.zzb;
        zzfkaVar.zzh(th2);
        zzfkaVar.zzg(false);
        this.zza.zza(zzfkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
    }
}
