package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgej extends zzgek {
    public zzgej(ListenableFuture listenableFuture, zzfxq zzfxqVar) {
        super(listenableFuture, zzfxqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        return ((zzfxq) obj).apply(obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final void zzf(Object obj) {
        zzc(obj);
    }
}
