package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class zzbto extends zzayd implements zzbtp {
    public static zzbtp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof zzbtp) {
            return (zzbtp) queryLocalInterface;
        }
        return new zzbtn(iBinder);
    }
}
