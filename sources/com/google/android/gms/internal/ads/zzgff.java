package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgff extends zzgeq {
    final /* synthetic */ zzgfh zza;
    private final zzgdo zzb;

    public zzgff(zzgfh zzgfhVar, zzgdo zzgdoVar) {
        this.zza = zzgfhVar;
        this.zzb = zzgdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgdo zzgdoVar = this.zzb;
        ua.b zza = zzgdoVar.zza();
        zzfwq.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdoVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final void zzd(Throwable th2) {
        this.zza.zzd(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ua.b) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
