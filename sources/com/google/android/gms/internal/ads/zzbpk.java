package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class zzbpk extends zzaym implements zzbpl {
    public zzbpk() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbpl zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbpl ? (zzbpl) queryLocalInterface : new zzbpj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String readString = parcel.readString();
            zzayn.zzc(parcel);
            zzbpo zzb = zzb(readString);
            parcel2.writeNoException();
            zzayn.zzf(parcel2, zzb);
        } else if (i2 == 2) {
            String readString2 = parcel.readString();
            zzayn.zzc(parcel);
            boolean zze = zze(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i2 == 3) {
            String readString3 = parcel.readString();
            zzayn.zzc(parcel);
            zzbrk zzc = zzc(readString3);
            parcel2.writeNoException();
            zzayn.zzf(parcel2, zzc);
        } else {
            if (i2 != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            zzayn.zzc(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}
