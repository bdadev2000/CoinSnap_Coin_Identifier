package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzfmi {

    @Nullable
    private final Object zza;
    private final long zzb;
    private final Clock zzc;
    private final long zzd = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzx)).longValue() * 1000;

    public zzfmi(@Nullable Object obj, Clock clock) {
        this.zza = obj;
        this.zzc = clock;
        this.zzb = clock.currentTimeMillis();
    }

    public final long zza() {
        return (this.zzd + Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzt)).longValue(), -900000L), 10000L)) - (this.zzc.currentTimeMillis() - this.zzb);
    }

    @Nullable
    public final Object zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc.currentTimeMillis() >= this.zzb + this.zzd;
    }
}
