package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbgy extends zzayd implements zzbgz {
    public static zzbgz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (queryLocalInterface instanceof zzbgz) {
            return (zzbgz) queryLocalInterface;
        }
        return new zzbgx(iBinder);
    }
}
