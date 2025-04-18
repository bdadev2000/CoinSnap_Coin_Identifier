package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzadz implements zzaea {
    private final long zza;
    private final zzady zzb;

    public zzadz(long j2, long j3) {
        this.zza = j2;
        zzaeb zzaebVar = j3 == 0 ? zzaeb.zza : new zzaeb(0L, j3);
        this.zzb = new zzady(zzaebVar, zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return false;
    }
}
