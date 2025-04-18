package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbmd extends zzayd implements zzbme {
    public zzbmd() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbmh zzbmfVar;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            return false;
                        }
                        zzbfv zzc = zzc();
                        parcel2.writeNoException();
                        zzaye.zzf(parcel2, zzc);
                        return true;
                    }
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    zze(asInterface);
                    parcel2.writeNoException();
                    return true;
                }
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbmfVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (queryLocalInterface instanceof zzbmh) {
                        zzbmfVar = (zzbmh) queryLocalInterface;
                    } else {
                        zzbmfVar = new zzbmf(readStrongBinder);
                    }
                }
                zzaye.zzc(parcel);
                zzf(asInterface2, zzbmfVar);
                parcel2.writeNoException();
                return true;
            }
            zzd();
            parcel2.writeNoException();
            return true;
        }
        com.google.android.gms.ads.internal.client.zzeb zzb = zzb();
        parcel2.writeNoException();
        zzaye.zzf(parcel2, zzb);
        return true;
    }
}
