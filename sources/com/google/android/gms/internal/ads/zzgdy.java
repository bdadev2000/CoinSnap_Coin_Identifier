package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgdy extends zzgea {
    public zzgdy(ListenableFuture listenableFuture, Class cls, zzgev zzgevVar) {
        super(listenableFuture, cls, zzgevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgev zzgevVar = (zzgev) obj;
        ListenableFuture zza = zzgevVar.zza(th);
        zzfxz.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgevVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
