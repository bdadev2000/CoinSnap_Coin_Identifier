package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbyp {
    private final Clock zza;
    private final zzbyn zzb;

    public zzbyp(Clock clock, zzbyn zzbynVar) {
        this.zza = clock;
        this.zzb = zzbynVar;
    }

    public static zzbyp zza(Context context) {
        return zzbza.zzd(context).zzb();
    }

    public final void zzb(int i2, long j2) {
        this.zzb.zza(i2, j2);
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }
}
