package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzapn implements Runnable {
    final /* synthetic */ zzaqc zza;
    final /* synthetic */ zzapo zzb;

    public zzapn(zzapo zzapoVar, zzaqc zzaqcVar) {
        this.zza = zzaqcVar;
        this.zzb = zzapoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
