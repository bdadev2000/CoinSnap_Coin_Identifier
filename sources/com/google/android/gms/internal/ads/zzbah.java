package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbah extends zzayd implements zzbai {
    public zzbah() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbai zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzbai) {
            return (zzbai) queryLocalInterface;
        }
        return new zzbag(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbaf zzbadVar;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzaye.zzc(parcel);
                zzc(zzeVar);
            } else {
                parcel.readInt();
                zzaye.zzc(parcel);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbadVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzbaf) {
                    zzbadVar = (zzbaf) queryLocalInterface;
                } else {
                    zzbadVar = new zzbad(readStrongBinder);
                }
            }
            zzaye.zzc(parcel);
            zzd(zzbadVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
