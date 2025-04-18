package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcan;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public ListenableFuture zzb() {
        return zzcan.zza.zza(this.zza);
    }
}
