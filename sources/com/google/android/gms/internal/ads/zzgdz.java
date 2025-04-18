package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgdz extends zzgea {
    public zzgdz(ListenableFuture listenableFuture, Class cls, zzfxq zzfxqVar) {
        super(listenableFuture, cls, zzfxqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        return ((zzfxq) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zzf(Object obj) {
        zzc(obj);
    }
}
