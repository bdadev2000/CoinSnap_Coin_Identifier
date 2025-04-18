package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbkv extends zzayd implements zzbkw {
    public static zzbkw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        if (queryLocalInterface instanceof zzbkw) {
            return (zzbkw) queryLocalInterface;
        }
        return new zzbku(iBinder);
    }
}
