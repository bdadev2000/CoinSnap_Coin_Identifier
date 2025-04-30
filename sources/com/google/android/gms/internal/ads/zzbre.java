package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbre extends zzbae implements zzbrf {
    public zzbre() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbrf zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzbrf) {
            return (zzbrf) queryLocalInterface;
        }
        return new zzbrd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        return false;
                    }
                    String readString = parcel.readString();
                    zzbaf.zzc(parcel);
                    boolean zzd = zzd(readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzd ? 1 : 0);
                } else {
                    String readString2 = parcel.readString();
                    zzbaf.zzc(parcel);
                    zzbte zzc = zzc(readString2);
                    parcel2.writeNoException();
                    zzbaf.zzf(parcel2, zzc);
                }
            } else {
                String readString3 = parcel.readString();
                zzbaf.zzc(parcel);
                boolean zze = zze(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zze ? 1 : 0);
            }
        } else {
            String readString4 = parcel.readString();
            zzbaf.zzc(parcel);
            zzbri zzb = zzb(readString4);
            parcel2.writeNoException();
            zzbaf.zzf(parcel2, zzb);
        }
        return true;
    }
}
