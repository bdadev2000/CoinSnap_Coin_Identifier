package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbfi extends zzbad implements zzbfk {
    public zzbfi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zze(zzbfh zzbfhVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbfhVar);
        zzdc(1, zza);
    }
}
