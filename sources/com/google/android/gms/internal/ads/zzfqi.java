package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes4.dex */
final class zzfqi implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfql.zzc;
        if (handler != null) {
            handler2 = zzfql.zzc;
            runnable = zzfql.zzd;
            handler2.post(runnable);
            handler3 = zzfql.zzc;
            runnable2 = zzfql.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
