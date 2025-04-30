package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* loaded from: classes2.dex */
public class zzfuv extends Handler {
    private final Looper zza;

    public zzfuv() {
        this.zza = Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    @CallSuper
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfuv(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
