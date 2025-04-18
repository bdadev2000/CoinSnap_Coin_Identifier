package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbve extends zzayd implements zzbvf {
    public zzbve() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbvp zzbvpVar = null;
        zzbvq zzbvqVar = null;
        zzbvp zzbvpVar2 = null;
        zzbvp zzbvpVar3 = null;
        zzbvp zzbvpVar4 = null;
        switch (i10) {
            case 1:
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                zzaye.zze(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzbvg) {
                    }
                }
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbvx zzbvxVar = (zzbvx) zzaye.zza(parcel, zzbvx.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof zzbvp) {
                        zzbvpVar = (zzbvp) queryLocalInterface2;
                    } else {
                        zzbvpVar = new zzbvn(readStrongBinder2);
                    }
                }
                zzaye.zzc(parcel);
                zzg(zzbvxVar, zzbvpVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbvx zzbvxVar2 = (zzbvx) zzaye.zza(parcel, zzbvx.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof zzbvp) {
                        zzbvpVar4 = (zzbvp) queryLocalInterface3;
                    } else {
                        zzbvpVar4 = new zzbvn(readStrongBinder3);
                    }
                }
                zzaye.zzc(parcel);
                zzf(zzbvxVar2, zzbvpVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbvx zzbvxVar3 = (zzbvx) zzaye.zza(parcel, zzbvx.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface4 instanceof zzbvp) {
                        zzbvpVar3 = (zzbvp) queryLocalInterface4;
                    } else {
                        zzbvpVar3 = new zzbvn(readStrongBinder4);
                    }
                }
                zzaye.zzc(parcel);
                zze(zzbvxVar3, zzbvpVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface5 instanceof zzbvp) {
                        zzbvpVar2 = (zzbvp) queryLocalInterface5;
                    } else {
                        zzbvpVar2 = new zzbvn(readStrongBinder5);
                    }
                }
                zzaye.zzc(parcel);
                zzh(readString, zzbvpVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbuz zzbuzVar = (zzbuz) zzaye.zza(parcel, zzbuz.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    if (queryLocalInterface6 instanceof zzbvq) {
                        zzbvqVar = (zzbvq) queryLocalInterface6;
                    } else {
                        zzbvqVar = new zzbvq(readStrongBinder6);
                    }
                }
                zzaye.zzc(parcel);
                zzi(zzbuzVar, zzbvqVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
