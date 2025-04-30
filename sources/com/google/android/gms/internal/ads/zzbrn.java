package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbrn extends zzbae implements zzbro {
    public zzbrn() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbro zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        if (queryLocalInterface instanceof zzbro) {
            return (zzbro) queryLocalInterface;
        }
        return new zzbrm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i11 = zzbaf.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        } else {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzbaf.zzf(parcel2, zze);
        }
        return true;
    }
}
