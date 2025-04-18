package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzctv implements zzdbz, zzcya {
    private final Clock zza;
    private final zzctx zzb;
    private final zzffo zzc;
    private final String zzd;

    public zzctv(Clock clock, zzctx zzctxVar, zzffo zzffoVar, String str) {
        this.zza = clock;
        this.zzb = zzctxVar;
        this.zzc = zzffoVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        Clock clock = this.zza;
        this.zzb.zzd(this.zzc.zzf, this.zzd, clock.elapsedRealtime());
    }
}
