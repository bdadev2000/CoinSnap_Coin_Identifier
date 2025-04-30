package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbae;

/* loaded from: classes2.dex */
public abstract class zzcr extends zzbae implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static zzcs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        if (queryLocalInterface instanceof zzcs) {
            return (zzcs) queryLocalInterface;
        }
        return new zzcq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            zze();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
