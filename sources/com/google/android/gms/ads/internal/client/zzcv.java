package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbae;

/* loaded from: classes2.dex */
public abstract class zzcv extends zzbae implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzcw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzcw) {
            return (zzcw) queryLocalInterface;
        }
        return new zzcu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        }
        return true;
    }
}
