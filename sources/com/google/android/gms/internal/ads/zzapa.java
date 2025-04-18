package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzapa implements Runnable {
    final /* synthetic */ zzapp zza;
    final /* synthetic */ zzapb zzb;

    public zzapa(zzapb zzapbVar, zzapp zzappVar) {
        this.zza = zzappVar;
        this.zzb = zzapbVar;
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
