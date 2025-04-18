package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbvi extends zzayd implements zzbvj {
    public zzbvi() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbvm zzbvmVar = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                zzbvb zzbvbVar = (zzbvb) zzaye.zza(parcel, zzbvb.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder);
                    }
                }
                zzaye.zzc(parcel);
                zze(zzbvbVar, zzbvmVar);
            } else {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface2 instanceof zzbvm) {
                    }
                }
                zzaye.zzc(parcel);
            }
        } else {
            zzbuv zzbuvVar = (zzbuv) zzaye.zza(parcel, zzbuv.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface3 instanceof zzbvm) {
                    zzbvmVar = (zzbvm) queryLocalInterface3;
                } else {
                    zzbvmVar = new zzbvk(readStrongBinder3);
                }
            }
            zzaye.zzc(parcel);
            zzf(zzbuvVar, zzbvmVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
