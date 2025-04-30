package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class zztd extends Handler {
    final /* synthetic */ zztf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztd(zztf zztfVar, Looper looper) {
        super(looper);
        this.zza = zztfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zztf.zza(this.zza, message);
    }
}
