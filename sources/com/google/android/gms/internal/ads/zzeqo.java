package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
final class zzeqo {
    public final ua.b zza;
    private final long zzb;
    private final Clock zzc;

    public zzeqo(ua.b bVar, long j3, Clock clock) {
        this.zza = bVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j3;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
