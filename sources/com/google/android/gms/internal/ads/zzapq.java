package com.google.android.gms.internal.ads;

import com.android.volley.DefaultRetryPolicy;

/* loaded from: classes2.dex */
public final class zzapq {
    private int zza = DefaultRetryPolicy.DEFAULT_TIMEOUT_MS;
    private int zzb;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final void zzc(zzaql zzaqlVar) throws zzaql {
        int i2 = this.zzb + 1;
        this.zzb = i2;
        int i3 = this.zza;
        this.zza = i3 + i3;
        if (i2 > 1) {
            throw zzaqlVar;
        }
    }
}
