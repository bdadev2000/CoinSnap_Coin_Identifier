package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzamz implements zzalq {
    private final zzams zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzamz(zzams zzamsVar, Map map, Map map2, Map map3) {
        this.zza = zzamsVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzamsVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final long zzb(int i9) {
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final List zzc(long j7) {
        return this.zza.zze(j7, this.zzc, this.zzd, this.zze);
    }
}
