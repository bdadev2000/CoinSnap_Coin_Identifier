package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbls extends zzayd implements zzblt {
    public zzbls() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzblt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        if (queryLocalInterface instanceof zzblt) {
            return (zzblt) queryLocalInterface;
        }
        return new zzblr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            String readString = parcel.readString();
            zzaye.zzc(parcel);
            zze(readString);
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
