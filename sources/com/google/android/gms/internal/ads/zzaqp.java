package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaqp implements Runnable {
    final /* synthetic */ zzare zza;
    final /* synthetic */ zzaqq zzb;

    public zzaqp(zzaqq zzaqqVar, zzare zzareVar) {
        this.zza = zzareVar;
        this.zzb = zzaqqVar;
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
