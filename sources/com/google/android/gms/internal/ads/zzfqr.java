package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfqr {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfqq zzd = null;

    public zzfqr() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfqq zzfqqVar = (zzfqq) this.zzc.poll();
        this.zzd = zzfqqVar;
        if (zzfqqVar != null) {
            zzfqqVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfqq zzfqqVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfqq zzfqqVar) {
        zzfqqVar.zzb(this);
        this.zzc.add(zzfqqVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
