package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzakx implements zzald {
    private final zzaeg zza;
    private final zzaef zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzakx(zzaeg zzaegVar, zzaef zzaefVar) {
        this.zza = zzaegVar;
        this.zzb = zzaefVar;
    }

    public final void zza(long j7) {
        this.zzc = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final long zzd(zzadv zzadvVar) {
        long j7 = this.zzd;
        if (j7 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j7 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final zzaet zze() {
        boolean z8;
        if (this.zzc != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        return new zzaee(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final void zzg(long j7) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzgd.zzc(jArr, j7, true, true)];
    }
}
