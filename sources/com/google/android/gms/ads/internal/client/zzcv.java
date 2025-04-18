package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbpg;

/* loaded from: classes3.dex */
public abstract class zzcv extends zzayd implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcw asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        if (queryLocalInterface instanceof zzcw) {
            return (zzcw) queryLocalInterface;
        }
        return new zzcu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zzbpg adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzaye.zzf(parcel2, adapterCreator);
        } else {
            zzfb liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzaye.zze(parcel2, liteSdkVersion);
        }
        return true;
    }
}
