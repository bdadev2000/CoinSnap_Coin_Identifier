package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbgh extends zzayd implements zzbgi {
    public zzbgh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbgi zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if (queryLocalInterface instanceof zzbgi) {
            return (zzbgi) queryLocalInterface;
        }
        return new zzbgg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzb(asInterface);
            } else {
                zzd();
            }
        } else {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            zzc(asInterface2);
        }
        parcel2.writeNoException();
        return true;
    }
}
