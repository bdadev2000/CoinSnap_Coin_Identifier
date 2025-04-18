package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzcak implements Executor {
    private final Handler zza = new com.google.android.gms.ads.internal.util.zzf(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzM(com.google.android.gms.ads.internal.zzu.zzo().zzd(), th);
            throw th;
        }
    }
}
