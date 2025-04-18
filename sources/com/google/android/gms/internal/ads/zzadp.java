package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzadp implements zzadq {
    private final long zza;
    private final zzado zzb;

    public zzadp(long j3, long j10) {
        zzadr zzadrVar;
        this.zza = j3;
        if (j10 == 0) {
            zzadrVar = zzadr.zza;
        } else {
            zzadrVar = new zzadr(0L, j10);
        }
        this.zzb = new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return false;
    }
}
