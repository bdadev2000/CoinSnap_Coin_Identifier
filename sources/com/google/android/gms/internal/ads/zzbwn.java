package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzbwn extends zzayl implements IInterface {
    public zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwm zzbwmVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayn.zzf(zza, zzbwmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(2, zza);
    }
}
