package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbnq extends zzbae implements zzbnr {
    public zzbnq() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbnr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        if (queryLocalInterface instanceof zzbnr) {
            return (zzbnr) queryLocalInterface;
        }
        return new zzbnp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 2) {
            if (i9 != 3) {
                return false;
            }
            String readString = parcel.readString();
            zzbaf.zzc(parcel);
            zze(readString);
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
