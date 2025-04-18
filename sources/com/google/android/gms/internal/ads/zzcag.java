package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzcag implements Executor {
    private final Handler zza = new com.google.android.gms.ads.internal.util.zzf(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzM(com.google.android.gms.ads.internal.zzv.zzp().zzd(), th2);
                throw th2;
            }
        }
        this.zza.post(runnable);
    }
}
