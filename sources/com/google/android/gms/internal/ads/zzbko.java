package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbko extends zzayc implements zzbkq {
    public zzbko(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final void zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(1, zza);
    }
}
