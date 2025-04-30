package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbiy extends zzbae implements zzbiz {
    public zzbiy() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbiz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (queryLocalInterface instanceof zzbiz) {
            return (zzbiz) queryLocalInterface;
        }
        return new zzbix(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbip zzbinVar;
        if (i9 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbinVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                if (queryLocalInterface instanceof zzbip) {
                    zzbinVar = (zzbip) queryLocalInterface;
                } else {
                    zzbinVar = new zzbin(readStrongBinder);
                }
            }
            String readString = parcel.readString();
            zzbaf.zzc(parcel);
            zze(zzbinVar, readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
