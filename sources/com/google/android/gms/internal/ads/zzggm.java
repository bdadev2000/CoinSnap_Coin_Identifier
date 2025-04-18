package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggm extends zzgfx {
    final /* synthetic */ zzggo zza;
    private final zzgeu zzb;

    public zzggm(zzggo zzggoVar, zzgeu zzgeuVar) {
        this.zza = zzggoVar;
        this.zzb = zzgeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgeu zzgeuVar = this.zzb;
        ListenableFuture zza = zzgeuVar.zza();
        zzfxz.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgeuVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
