package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;

/* loaded from: classes3.dex */
public abstract class zzdn extends zzayd implements zzdo {
    public zzdn() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    public static zzdo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        if (queryLocalInterface instanceof zzdo) {
            return (zzdo) queryLocalInterface;
        }
        return new zzdm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zze();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
