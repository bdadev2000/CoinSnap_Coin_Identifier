package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbae extends zzayd implements zzbaf {
    public zzbae() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbaf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        if (queryLocalInterface instanceof zzbaf) {
            return (zzbaf) queryLocalInterface;
        }
        return new zzbad(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbam zzbakVar;
        switch (i10) {
            case 2:
                com.google.android.gms.ads.internal.client.zzby zze = zze();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzbaj) {
                    }
                }
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbakVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof zzbam) {
                        zzbakVar = (zzbam) queryLocalInterface2;
                    } else {
                        zzbakVar = new zzbak(readStrongBinder2);
                    }
                }
                zzaye.zzc(parcel);
                zzi(asInterface, zzbakVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdy zzf = zzf();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzf);
                return true;
            case 6:
                boolean zzg = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdr zzb = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
