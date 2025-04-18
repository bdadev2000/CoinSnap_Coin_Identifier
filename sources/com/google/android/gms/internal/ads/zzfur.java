package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.time.Instant;

/* loaded from: classes3.dex */
public final class zzfur {
    private final String zza;
    private final Instant zzb;

    public zzfur(String str, Instant instant) {
        this.zza = str;
        this.zzb = instant;
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    public final Instant zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb.isAfter(Instant.EPOCH);
    }

    public zzfur() {
        this.zza = null;
        this.zzb = Instant.ofEpochMilli(-1L);
    }
}
