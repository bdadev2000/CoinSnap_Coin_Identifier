package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzftt extends zzayd implements zzftu {
    public static zzftu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        if (queryLocalInterface instanceof zzftu) {
            return (zzftu) queryLocalInterface;
        }
        return new zzfts(iBinder);
    }
}
