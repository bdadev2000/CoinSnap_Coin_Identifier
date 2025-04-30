package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcak {
    private final Clock zza;
    private final zzcai zzb;

    public zzcak(Clock clock, zzcai zzcaiVar) {
        this.zza = clock;
        this.zzb = zzcaiVar;
    }

    public static zzcak zza(Context context) {
        return zzcav.zzd(context).zzb();
    }

    public final void zzb(int i9, long j7) {
        this.zzb.zza(i9, j7);
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }
}
