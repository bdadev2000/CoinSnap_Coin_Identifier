package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class zzbtr extends zzayd implements zzbts {
    public static zzbts zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (queryLocalInterface instanceof zzbts) {
            return (zzbts) queryLocalInterface;
        }
        return new zzbtq(iBinder);
    }
}
