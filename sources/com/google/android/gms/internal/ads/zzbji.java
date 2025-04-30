package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbji extends zzbae implements zzbjj {
    public zzbji() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbjj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        if (queryLocalInterface instanceof zzbjj) {
            return (zzbjj) queryLocalInterface;
        }
        return new zzbjh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbjs zzbjqVar;
        if (i9 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbjqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                if (queryLocalInterface instanceof zzbjs) {
                    zzbjqVar = (zzbjs) queryLocalInterface;
                } else {
                    zzbjqVar = new zzbjq(readStrongBinder);
                }
            }
            zzbaf.zzc(parcel);
            zze(zzbjqVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
