package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbzj extends zzayd implements zzbzk {
    public static zzbzk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        if (queryLocalInterface instanceof zzbzk) {
            return (zzbzk) queryLocalInterface;
        }
        return new zzbzi(iBinder);
    }
}
