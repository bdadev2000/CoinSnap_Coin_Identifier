package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class zzeph implements zzexh {
    private final Clock zza;
    private final zzfhc zzb;

    public zzeph(Clock clock, zzfhc zzfhcVar) {
        this.zza = clock;
        this.zzb = zzfhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return zzgfo.zzh(new zzepi(this.zzb, this.zza.currentTimeMillis()));
    }
}
