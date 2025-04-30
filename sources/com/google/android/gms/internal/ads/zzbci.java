package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbci extends zzbae implements zzbcj {
    public zzbci() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbcj zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzbcj) {
            return (zzbcj) queryLocalInterface;
        }
        return new zzbch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbcg zzbceVar;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return false;
                }
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbaf.zzc(parcel);
                zzc(zzeVar);
            } else {
                parcel.readInt();
                zzbaf.zzc(parcel);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbceVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzbcg) {
                    zzbceVar = (zzbcg) queryLocalInterface;
                } else {
                    zzbceVar = new zzbce(readStrongBinder);
                }
            }
            zzbaf.zzc(parcel);
            zzd(zzbceVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
