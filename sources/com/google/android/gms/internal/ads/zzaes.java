package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzaes implements zzaet {
    private final long zza;
    private final zzaer zzb;

    public zzaes(long j7, long j9) {
        zzaeu zzaeuVar;
        this.zza = j7;
        if (j9 == 0) {
            zzaeuVar = zzaeu.zza;
        } else {
            zzaeuVar = new zzaeu(0L, j9);
        }
        this.zzb = new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return false;
    }
}
