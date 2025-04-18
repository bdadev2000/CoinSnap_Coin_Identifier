package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzvw implements zzwn {
    final /* synthetic */ zzvz zza;
    private final int zzb;

    public zzvw(zzvz zzvzVar, int i2) {
        this.zza = zzvzVar;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zza(zzkm zzkmVar, zzhq zzhqVar, int i2) {
        return this.zza.zzf(this.zzb, zzkmVar, zzhqVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zzb(long j2) {
        return this.zza.zzh(this.zzb, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
