package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzalz implements zzakq {
    private final zzals zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzalz(zzals zzalsVar, Map map, Map map2, Map map3) {
        this.zza = zzalsVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzalsVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final long zzb(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final List zzc(long j2) {
        return this.zza.zze(j2, this.zzc, this.zzd, this.zze);
    }
}
