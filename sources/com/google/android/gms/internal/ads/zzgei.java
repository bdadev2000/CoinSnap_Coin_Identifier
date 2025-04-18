package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgei extends zzgek {
    public zzgei(ListenableFuture listenableFuture, zzgev zzgevVar) {
        super(listenableFuture, zzgevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgev zzgevVar = (zzgev) obj;
        ListenableFuture zza = zzgevVar.zza(obj2);
        zzfxz.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgevVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
