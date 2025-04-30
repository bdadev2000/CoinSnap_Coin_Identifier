package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbcf extends zzbae implements zzbcg {
    public zzbcf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbcn zzbclVar;
        switch (i9) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbu zze = zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzbck) {
                    }
                }
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbclVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof zzbcn) {
                        zzbclVar = (zzbcn) queryLocalInterface2;
                    } else {
                        zzbclVar = new zzbcl(readStrongBinder2);
                    }
                }
                zzbaf.zzc(parcel);
                zzi(asInterface, zzbclVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdn zzf = zzf();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzf);
                return true;
            case 6:
                boolean zzg = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdg zzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
