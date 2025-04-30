package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbyi extends zzbad implements IInterface {
    public zzbyi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbyh zzbyhVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, zzbyhVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(2, zza);
    }
}
