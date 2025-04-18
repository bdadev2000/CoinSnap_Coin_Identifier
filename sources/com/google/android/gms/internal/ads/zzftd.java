package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* loaded from: classes3.dex */
public class zzftd extends Handler {
    public zzftd() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    @CallSuper
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzftd(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
