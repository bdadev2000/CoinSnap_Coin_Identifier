package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggr extends zzggc {
    final /* synthetic */ zzggt zza;
    private final zzgez zzb;

    public zzggr(zzggt zzggtVar, zzgez zzgezVar) {
        this.zza = zzggtVar;
        this.zzb = zzgezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgez zzgezVar = this.zzb;
        f4.c zza = zzgezVar.zza();
        zzfyg.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgezVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((f4.c) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
