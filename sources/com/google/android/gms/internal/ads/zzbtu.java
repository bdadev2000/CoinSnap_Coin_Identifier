package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class zzbtu extends zzayd implements zzbtv {
    public zzbtu() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbtv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof zzbtv) {
            return (zzbtv) queryLocalInterface;
        }
        return new zzbtt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzaye.zzc(parcel);
            zze(readString);
        } else {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzaye.zzc(parcel);
            zzf(createTypedArrayList);
        }
        parcel2.writeNoException();
        return true;
    }
}
