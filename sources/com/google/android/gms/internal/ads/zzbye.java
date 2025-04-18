package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* loaded from: classes2.dex */
final class zzbye implements zzgfk {
    final /* synthetic */ ListenableFuture zza;

    public zzbye(zzbyf zzbyfVar, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        List list;
        list = zzbyf.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzbyf.zzc;
        list.remove(this.zza);
    }
}
