package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbtb extends zzayd implements zzbtc {
    public static zzbtc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        if (queryLocalInterface instanceof zzbtc) {
            return (zzbtc) queryLocalInterface;
        }
        return new zzbta(iBinder);
    }
}
