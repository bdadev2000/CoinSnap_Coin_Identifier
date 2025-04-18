package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzftd;

/* loaded from: classes3.dex */
public final class zzf extends zzftd {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftd
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzv.zzq();
            zzs.zzM(com.google.android.gms.ads.internal.zzv.zzp().zzd(), th2);
            throw th2;
        }
    }
}
