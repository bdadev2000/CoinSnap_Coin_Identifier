package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfuv;

/* loaded from: classes2.dex */
public final class zzf extends zzfuv {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuv
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzp();
            zzt.zzM(com.google.android.gms.ads.internal.zzu.zzo().zzd(), th);
            throw th;
        }
    }
}
