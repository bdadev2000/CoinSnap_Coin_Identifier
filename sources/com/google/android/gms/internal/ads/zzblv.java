package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class zzblv extends zzayd implements zzblw {
    public zzblv() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzblw zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        if (queryLocalInterface instanceof zzblw) {
            return (zzblw) queryLocalInterface;
        }
        return new zzblu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzblp.CREATOR);
            zzaye.zzc(parcel);
            zzb(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
