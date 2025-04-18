package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
final class zzsf extends Handler {
    final /* synthetic */ zzsh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsf(zzsh zzshVar, Looper looper) {
        super(looper);
        this.zza = zzshVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzsh.zza(this.zza, message);
    }
}
