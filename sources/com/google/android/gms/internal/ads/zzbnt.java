package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzbnt extends zzbae implements zzbnu {
    public zzbnt() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbnu zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        if (queryLocalInterface instanceof zzbnu) {
            return (zzbnu) queryLocalInterface;
        }
        return new zzbns(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbnn.CREATOR);
            zzbaf.zzc(parcel);
            zzb(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
