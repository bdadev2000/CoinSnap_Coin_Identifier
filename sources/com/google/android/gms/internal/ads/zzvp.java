package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzvp implements zzwg {
    final /* synthetic */ zzvs zza;
    private final int zzb;

    public zzvp(zzvs zzvsVar, int i10) {
        this.zza = zzvsVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zza(zzkj zzkjVar, zzhm zzhmVar, int i10) {
        return this.zza.zzg(this.zzb, zzkjVar, zzhmVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zzb(long j3) {
        return this.zza.zzi(this.zzb, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
