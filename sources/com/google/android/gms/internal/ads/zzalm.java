package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzalm implements zzakd {
    private final zzalf zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzalm(zzalf zzalfVar, Map map, Map map2, Map map3) {
        this.zza = zzalfVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzalfVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final long zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final List zzc(long j3) {
        return this.zza.zze(j3, this.zzc, this.zzd, this.zze);
    }
}
