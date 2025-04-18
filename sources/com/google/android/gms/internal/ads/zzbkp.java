package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbkp extends zzayd implements zzbkq {
    public zzbkp() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static zzbkq zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        if (queryLocalInterface instanceof zzbkq) {
            return (zzbkq) queryLocalInterface;
        }
        return new zzbko(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String readString = parcel.readString();
            zzaye.zzc(parcel);
            zzb(readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
