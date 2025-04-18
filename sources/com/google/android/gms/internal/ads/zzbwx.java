package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbwx extends zzayc implements zzbwz {
    public zzbwx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbwz
    public final int zze() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        int readInt = zzdb.readInt();
        zzdb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbwz
    public final String zzf() throws RemoteException {
        Parcel zzdb = zzdb(1, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }
}
