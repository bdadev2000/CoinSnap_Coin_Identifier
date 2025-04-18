package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzwu implements zzwn {
    private final zzwn zza;
    private final long zzb;

    public zzwu(zzwn zzwnVar, long j2) {
        this.zza = zzwnVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zza(zzkm zzkmVar, zzhq zzhqVar, int i2) {
        int zza = this.zza.zza(zzkmVar, zzhqVar, i2);
        if (zza != -4) {
            return zza;
        }
        zzhqVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zzb(long j2) {
        return this.zza.zzb(j2 - this.zzb);
    }

    public final zzwn zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final boolean zze() {
        return this.zza.zze();
    }
}
