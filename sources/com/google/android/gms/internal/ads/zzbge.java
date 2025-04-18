package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbge extends zzayd implements zzbgf {
    public static zzbgf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbgf) {
            return (zzbgf) queryLocalInterface;
        }
        return new zzbgd(iBinder);
    }
}
