package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzapy {
    public final int zza;
    public final long zzb;

    private zzapy(int i9, long j7) {
        this.zza = i9;
        this.zzb = j7;
    }

    public static zzapy zza(zzadv zzadvVar, zzfu zzfuVar) throws IOException {
        ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, 8, false);
        zzfuVar.zzK(0);
        return new zzapy(zzfuVar.zzg(), zzfuVar.zzs());
    }
}
