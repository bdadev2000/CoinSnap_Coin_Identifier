package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
final class zzest {
    public final f4.c zza;
    private final long zzb;
    private final Clock zzc;

    public zzest(f4.c cVar, long j7, Clock clock) {
        this.zza = cVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j7;
    }

    public final boolean zza() {
        if (this.zzb < this.zzc.elapsedRealtime()) {
            return true;
        }
        return false;
    }
}
