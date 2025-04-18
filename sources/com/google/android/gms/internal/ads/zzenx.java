package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzenx implements zzevz {
    private final Clock zza;
    private final zzffo zzb;

    public zzenx(Clock clock, zzffo zzffoVar) {
        this.zza = clock;
        this.zzb = zzffoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return zzgei.zzh(new zzeny(this.zzb, this.zza.currentTimeMillis()));
    }
}
