package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes3.dex */
final class zzcce implements Runnable {
    public zzcce(zzccg zzccgVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
