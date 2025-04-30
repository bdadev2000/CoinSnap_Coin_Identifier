package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzbvu extends zzbae implements zzbvv {
    public zzbvu() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbvv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof zzbvv) {
            return (zzbvv) queryLocalInterface;
        }
        return new zzbvt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzbaf.zzc(parcel);
            zze(readString);
        } else {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzbaf.zzc(parcel);
            zzf(createTypedArrayList);
        }
        parcel2.writeNoException();
        return true;
    }
}
