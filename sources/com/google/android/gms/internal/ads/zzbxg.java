package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbxg extends zzbae implements zzbxh {
    public zzbxg() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbxk zzbxkVar = null;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return false;
                }
                zzbwz zzbwzVar = (zzbwz) zzbaf.zza(parcel, zzbwz.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface instanceof zzbxk) {
                        zzbxkVar = (zzbxk) queryLocalInterface;
                    } else {
                        zzbxkVar = new zzbxi(readStrongBinder);
                    }
                }
                zzbaf.zzc(parcel);
                zze(zzbwzVar, zzbxkVar);
            } else {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface2 instanceof zzbxk) {
                    }
                }
                zzbaf.zzc(parcel);
            }
        } else {
            zzbwv zzbwvVar = (zzbwv) zzbaf.zza(parcel, zzbwv.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface3 instanceof zzbxk) {
                    zzbxkVar = (zzbxk) queryLocalInterface3;
                } else {
                    zzbxkVar = new zzbxi(readStrongBinder3);
                }
            }
            zzbaf.zzc(parcel);
            zzf(zzbwvVar, zzbxkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
