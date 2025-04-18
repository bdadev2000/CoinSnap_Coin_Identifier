package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbdh extends zzayd implements zzbdi {
    public static zzbdi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (queryLocalInterface instanceof zzbdi) {
            return (zzbdi) queryLocalInterface;
        }
        return new zzbdg(iBinder);
    }
}
