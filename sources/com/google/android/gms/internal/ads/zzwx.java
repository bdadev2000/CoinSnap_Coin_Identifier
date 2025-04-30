package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzwx implements zzzp {
    public long zza;
    public long zzb;

    @Nullable
    public zzzo zzc;

    @Nullable
    public zzwx zzd;

    public zzwx(long j7, int i9) {
        zze(j7, 65536);
    }

    public final int zza(long j7) {
        long j9 = j7 - this.zza;
        int i9 = this.zzc.zzb;
        return (int) j9;
    }

    public final zzwx zzb() {
        this.zzc = null;
        zzwx zzwxVar = this.zzd;
        this.zzd = null;
        return zzwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final zzzo zzc() {
        zzzo zzzoVar = this.zzc;
        zzzoVar.getClass();
        return zzzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    @Nullable
    public final zzzp zzd() {
        zzwx zzwxVar = this.zzd;
        if (zzwxVar == null || zzwxVar.zzc == null) {
            return null;
        }
        return zzwxVar;
    }

    public final void zze(long j7, int i9) {
        boolean z8;
        if (this.zzc == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        this.zza = j7;
        this.zzb = j7 + 65536;
    }
}
