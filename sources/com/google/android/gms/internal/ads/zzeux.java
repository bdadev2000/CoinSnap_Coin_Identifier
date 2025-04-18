package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public final class zzeux implements zzexh {
    private final zzfgg zza;

    public zzeux(zzfgg zzfggVar) {
        this.zza = zzfggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return zzgfo.zzh(new zzeuy(this.zza));
    }
}
