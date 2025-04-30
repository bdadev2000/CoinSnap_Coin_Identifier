package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public abstract class zzdf extends zzbae implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzdg) {
            return (zzdg) queryLocalInterface;
        }
        return new zzde(iBinder);
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
            zzs zzsVar = (zzs) zzbaf.zza(parcel, zzs.CREATOR);
            zzbaf.zzc(parcel);
            zze(zzsVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
