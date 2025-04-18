package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfpe {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfpd zzd = null;

    public zzfpe() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfpd zzfpdVar = (zzfpd) this.zzc.poll();
        this.zzd = zzfpdVar;
        if (zzfpdVar != null) {
            zzfpdVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfpd zzfpdVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfpd zzfpdVar) {
        zzfpdVar.zzb(this);
        this.zzc.add(zzfpdVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
