package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class zzerm implements zzexh {
    private final zzfhc zza;

    public zzerm(zzgfz zzgfzVar, zzfhc zzfhcVar) {
        this.zza = zzfhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 58;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return zzgfo.zzh(new zzern(this.zza.zzp));
    }
}
