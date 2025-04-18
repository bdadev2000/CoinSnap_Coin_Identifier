package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.time.Instant;

/* loaded from: classes3.dex */
public final class zzfth {
    private final String zza;
    private final Instant zzb;

    public zzfth(String str, Instant instant) {
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
        Instant instant;
        boolean isAfter;
        if (this.zza == null) {
            return false;
        }
        Instant instant2 = this.zzb;
        instant = Instant.EPOCH;
        isAfter = instant2.isAfter(instant);
        return isAfter;
    }

    public zzfth() {
        Instant ofEpochMilli;
        this.zza = null;
        ofEpochMilli = Instant.ofEpochMilli(-1L);
        this.zzb = ofEpochMilli;
    }
}
