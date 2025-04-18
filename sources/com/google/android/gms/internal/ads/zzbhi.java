package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbhi extends zzayd implements zzbhj {
    public zzbhi() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbhj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof zzbhj) {
            return (zzbhj) queryLocalInterface;
        }
        return new zzbhh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.ads.internal.client.zzby zzad = com.google.android.gms.ads.internal.client.zzbx.zzad(parcel.readStrongBinder());
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            zze(zzad, asInterface);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
