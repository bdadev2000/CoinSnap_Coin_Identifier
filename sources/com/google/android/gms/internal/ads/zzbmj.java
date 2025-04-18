package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbmj extends zzayd implements zzbmk {
    public static zzbmk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        if (queryLocalInterface instanceof zzbmk) {
            return (zzbmk) queryLocalInterface;
        }
        return new zzbmi(iBinder);
    }
}
