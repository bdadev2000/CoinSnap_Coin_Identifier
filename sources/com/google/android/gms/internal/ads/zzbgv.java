package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbgv extends zzayd implements zzbgw {
    public static zzbgw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (queryLocalInterface instanceof zzbgw) {
            return (zzbgw) queryLocalInterface;
        }
        return new zzbgu(iBinder);
    }
}
