package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzchi extends zzayd implements zzchj {
    public static zzchj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof zzchj) {
            return (zzchj) queryLocalInterface;
        }
        return new zzchh(iBinder);
    }
}
