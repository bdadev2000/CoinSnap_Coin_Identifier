package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes3.dex */
final class zzcca implements Runnable {
    public zzcca(zzccc zzcccVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
