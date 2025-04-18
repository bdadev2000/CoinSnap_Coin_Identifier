package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbti extends zzayd implements zzbtj {
    public static zzbtj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbtj) {
            return (zzbtj) queryLocalInterface;
        }
        return new zzbth(iBinder);
    }
}
