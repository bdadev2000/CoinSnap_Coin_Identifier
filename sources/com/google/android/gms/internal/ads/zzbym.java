package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzbym {
    private final Clock zza;
    private final zzbyk zzb;

    public zzbym(Clock clock, zzbyk zzbykVar) {
        this.zza = clock;
        this.zzb = zzbykVar;
    }

    public static zzbym zza(Context context) {
        return zzbyw.zzd(context).zzb();
    }

    public final void zzb(int i10, long j3) {
        this.zzb.zza(i10, j3);
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }
}
