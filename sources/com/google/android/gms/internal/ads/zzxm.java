package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzxm implements zzxf {
    private final zzxf zza;
    private final long zzb;

    public zzxm(zzxf zzxfVar, long j7) {
        this.zza = zzxfVar;
        this.zzb = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zza(zzlj zzljVar, zzin zzinVar, int i9) {
        int zza = this.zza.zza(zzljVar, zzinVar, i9);
        if (zza == -4) {
            zzinVar.zze += this.zzb;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zzb(long j7) {
        return this.zza.zzb(j7 - this.zzb);
    }

    public final zzxf zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final boolean zze() {
        return this.zza.zze();
    }
}
