package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbhe extends zzayd implements zzbhf {
    public zzbhe() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzbhf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        if (queryLocalInterface instanceof zzbhf) {
            return (zzbhf) queryLocalInterface;
        }
        return new zzbhd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbgs zzbgqVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbgqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                if (queryLocalInterface instanceof zzbgs) {
                    zzbgqVar = (zzbgs) queryLocalInterface;
                } else {
                    zzbgqVar = new zzbgq(readStrongBinder);
                }
            }
            zzaye.zzc(parcel);
            zze(zzbgqVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
