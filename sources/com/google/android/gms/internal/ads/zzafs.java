package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzafs extends zzadn {
    private final long zza;

    public zzafs(zzadc zzadcVar, long j2) {
        super(zzadcVar);
        zzdi.zzd(zzadcVar.zzf() >= j2);
        this.zza = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzadn, com.google.android.gms.internal.ads.zzadc
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadn, com.google.android.gms.internal.ads.zzadc
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadn, com.google.android.gms.internal.ads.zzadc
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
