package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public class vl implements l3 {
    @Override // com.applovin.impl.l3
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.applovin.impl.l3
    public void b() {
    }

    @Override // com.applovin.impl.l3
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.l3
    public ja a(Looper looper, Handler.Callback callback) {
        return new wl(new Handler(looper, callback));
    }
}
