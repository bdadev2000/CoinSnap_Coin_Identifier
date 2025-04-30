package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzwo implements zzxf {
    final /* synthetic */ zzwr zza;
    private final int zzb;

    public zzwo(zzwr zzwrVar, int i9) {
        this.zza = zzwrVar;
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zza(zzlj zzljVar, zzin zzinVar, int i9) {
        return this.zza.zzg(this.zzb, zzljVar, zzinVar, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zzb(long j7) {
        return this.zza.zzi(this.zzb, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
