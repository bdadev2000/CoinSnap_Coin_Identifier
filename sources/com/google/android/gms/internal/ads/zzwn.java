package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzwn implements zzwg {
    private final zzwg zza;
    private final long zzb;

    public zzwn(zzwg zzwgVar, long j3) {
        this.zza = zzwgVar;
        this.zzb = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zza(zzkj zzkjVar, zzhm zzhmVar, int i10) {
        int zza = this.zza.zza(zzkjVar, zzhmVar, i10);
        if (zza != -4) {
            return zza;
        }
        zzhmVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zzb(long j3) {
        return this.zza.zzb(j3 - this.zzb);
    }

    public final zzwg zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final boolean zze() {
        return this.zza.zze();
    }
}
