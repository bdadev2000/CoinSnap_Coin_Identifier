package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
final class zzrz extends Handler {
    final /* synthetic */ zzsb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrz(zzsb zzsbVar, Looper looper) {
        super(looper);
        this.zza = zzsbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzsb.zza(this.zza, message);
    }
}
