package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzdx extends zzayd implements zzdy {
    public zzdx() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        if (queryLocalInterface instanceof zzdy) {
            return (zzdy) queryLocalInterface;
        }
        return new zzdw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
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
                zzw zzf = zzf();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zzf);
                return true;
            case 5:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzaye.zze(parcel2, zze);
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
