package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzdm extends zzbae implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        if (queryLocalInterface instanceof zzdn) {
            return (zzdn) queryLocalInterface;
        }
        return new zzdl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i9) {
            case 1:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 2:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 3:
                List zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzj);
                return true;
            case 4:
                zzu zzf = zzf();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzf);
                return true;
            case 5:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zze);
                return true;
            case 6:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            default:
                return false;
        }
    }
}
