package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes4.dex */
public abstract class zzbpt extends zzaym implements zzbpu {
    public zzbpt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbpu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbpu ? (zzbpu) queryLocalInterface : new zzbps(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzayn.zzf(parcel2, zze);
        } else {
            if (i2 != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i4 = zzayn.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
