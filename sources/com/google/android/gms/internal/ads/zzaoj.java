package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzaoj {
    public final int zza;
    public final long zzb;

    private zzaoj(int i10, long j3) {
        this.zza = i10;
        this.zzb = j3;
    }

    public static zzaoj zza(zzacs zzacsVar, zzed zzedVar) throws IOException {
        zzacsVar.zzh(zzedVar.zzN(), 0, 8);
        zzedVar.zzL(0);
        return new zzaoj(zzedVar.zzg(), zzedVar.zzs());
    }
}
