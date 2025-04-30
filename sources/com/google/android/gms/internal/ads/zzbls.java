package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzbls {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized float zza() {
        return this.zzc;
    }

    public final synchronized void zzb(boolean z8, float f9) {
        this.zzb = z8;
        this.zzc = f9;
    }

    public final synchronized void zzc(boolean z8) {
        this.zza = z8;
        this.zzd.set(true);
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze(boolean z8) {
        if (this.zzd.get()) {
            return this.zza;
        }
        return z8;
    }
}
