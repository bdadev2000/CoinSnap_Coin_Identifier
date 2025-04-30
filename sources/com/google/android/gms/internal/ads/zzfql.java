package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
final class zzfql implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfqo.zzc;
        if (handler != null) {
            handler2 = zzfqo.zzc;
            runnable = zzfqo.zzd;
            handler2.post(runnable);
            handler3 = zzfqo.zzc;
            runnable2 = zzfqo.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
