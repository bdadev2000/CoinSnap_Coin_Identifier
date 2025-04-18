package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzafi extends zzadd {
    private final long zza;

    public zzafi(zzacs zzacsVar, long j3) {
        super(zzacsVar);
        boolean z10;
        if (zzacsVar.zzf() >= j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        this.zza = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzadd, com.google.android.gms.internal.ads.zzacs
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadd, com.google.android.gms.internal.ads.zzacs
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadd, com.google.android.gms.internal.ads.zzacs
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
