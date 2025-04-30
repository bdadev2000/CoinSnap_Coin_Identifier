package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzbjl extends zzbae implements zzbjm {
    public static zzbjm zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (queryLocalInterface instanceof zzbjm) {
            return (zzbjm) queryLocalInterface;
        }
        return new zzbjk(iBinder);
    }
}
