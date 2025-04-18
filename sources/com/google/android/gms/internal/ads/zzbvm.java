package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class zzbvm extends zzaym implements zzbvn {
    public zzbvm() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbvq zzbvqVar = null;
        if (i2 == 1) {
            zzbvb zzbvbVar = (zzbvb) zzayn.zza(parcel, zzbvb.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbvqVar = queryLocalInterface instanceof zzbvq ? (zzbvq) queryLocalInterface : new zzbvo(readStrongBinder);
            }
            zzayn.zzc(parcel);
            zzf(zzbvbVar, zzbvqVar);
        } else if (i2 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof zzbvq) {
                }
            }
            zzayn.zzc(parcel);
        } else {
            if (i2 != 3) {
                return false;
            }
            zzbvf zzbvfVar = (zzbvf) zzayn.zza(parcel, zzbvf.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbvqVar = queryLocalInterface3 instanceof zzbvq ? (zzbvq) queryLocalInterface3 : new zzbvo(readStrongBinder3);
            }
            zzayn.zzc(parcel);
            zze(zzbvfVar, zzbvqVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
