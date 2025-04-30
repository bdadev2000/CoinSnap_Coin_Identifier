package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public abstract class zzca extends zzbae implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcb zzd(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (queryLocalInterface instanceof zzcb) {
            return (zzcb) queryLocalInterface;
        }
        return new zzbz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzbaf.zzc(parcel);
            zzc(readString, readString2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
