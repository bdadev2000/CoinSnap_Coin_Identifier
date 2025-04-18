package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class zzbua extends zzaym implements zzbub {
    public zzbua() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbub zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof zzbub ? (zzbub) queryLocalInterface : new zzbtz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzayn.zzc(parcel);
            zzf(createTypedArrayList);
        } else {
            if (i2 != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzayn.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
