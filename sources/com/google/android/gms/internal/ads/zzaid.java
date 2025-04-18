package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaid extends zzacp implements zzaii {
    private final int zza;
    private final long zzb;

    public zzaid(long j2, long j3, int i2, int i3, boolean z2) {
        super(j2, j3, i2, i3, false);
        this.zza = i2;
        this.zzb = j2 == -1 ? -1L : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zze(long j2) {
        return zzb(j2);
    }
}
