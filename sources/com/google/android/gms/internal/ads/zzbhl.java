package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbhl extends zzayd implements zzbhm {
    public zzbhl() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbhm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        if (queryLocalInterface instanceof zzbhm) {
            return (zzbhm) queryLocalInterface;
        }
        return new zzbhk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbhv zzbhtVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbhtVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                if (queryLocalInterface instanceof zzbhv) {
                    zzbhtVar = (zzbhv) queryLocalInterface;
                } else {
                    zzbhtVar = new zzbht(readStrongBinder);
                }
            }
            zzaye.zzc(parcel);
            zze(zzbhtVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
