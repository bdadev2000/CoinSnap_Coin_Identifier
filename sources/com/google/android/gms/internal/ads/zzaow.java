package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaow {
    public final int zza;
    public final long zzb;

    private zzaow(int i2, long j2) {
        this.zza = i2;
        this.zzb = j2;
    }

    public static zzaow zza(zzadc zzadcVar, zzek zzekVar) throws IOException {
        zzadcVar.zzh(zzekVar.zzN(), 0, 8);
        zzekVar.zzL(0);
        return new zzaow(zzekVar.zzg(), zzekVar.zzs());
    }
}
