package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class zzbvi extends zzaym implements zzbvj {
    public zzbvi() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbvt zzbvtVar = null;
        if (i2 == 1) {
            zzayn.zzc(parcel);
            parcel2.writeNoException();
            zzayn.zze(parcel2, null);
        } else if (i2 == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbvk) {
                }
            }
            zzayn.zzc(parcel);
            parcel2.writeNoException();
        } else if (i2 == 4) {
            zzbwa zzbwaVar = (zzbwa) zzayn.zza(parcel, zzbwa.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvtVar = queryLocalInterface2 instanceof zzbvt ? (zzbvt) queryLocalInterface2 : new zzbvr(readStrongBinder2);
            }
            zzayn.zzc(parcel);
            zzg(zzbwaVar, zzbvtVar);
            parcel2.writeNoException();
        } else if (i2 == 5) {
            zzbwa zzbwaVar2 = (zzbwa) zzayn.zza(parcel, zzbwa.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvtVar = queryLocalInterface3 instanceof zzbvt ? (zzbvt) queryLocalInterface3 : new zzbvr(readStrongBinder3);
            }
            zzayn.zzc(parcel);
            zzf(zzbwaVar2, zzbvtVar);
            parcel2.writeNoException();
        } else if (i2 == 6) {
            zzbwa zzbwaVar3 = (zzbwa) zzayn.zza(parcel, zzbwa.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvtVar = queryLocalInterface4 instanceof zzbvt ? (zzbvt) queryLocalInterface4 : new zzbvr(readStrongBinder4);
            }
            zzayn.zzc(parcel);
            zze(zzbwaVar3, zzbvtVar);
            parcel2.writeNoException();
        } else {
            if (i2 != 7) {
                return false;
            }
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvtVar = queryLocalInterface5 instanceof zzbvt ? (zzbvt) queryLocalInterface5 : new zzbvr(readStrongBinder5);
            }
            zzayn.zzc(parcel);
            zzh(readString, zzbvtVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
