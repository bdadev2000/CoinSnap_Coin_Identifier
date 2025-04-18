package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbxk extends zzayc {
    public zzbxk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwz zzbwzVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, zzbwzVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(2, zza);
    }
}
