package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes3.dex */
final class zzfoy implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfpb.zzc;
        if (handler != null) {
            handler2 = zzfpb.zzc;
            runnable = zzfpb.zzd;
            handler2.post(runnable);
            handler3 = zzfpb.zzc;
            runnable2 = zzfpb.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
