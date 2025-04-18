package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbpf extends zzayd implements zzbpg {
    public zzbpf() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbpg zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzbpg) {
            return (zzbpg) queryLocalInterface;
        }
        return new zzbpe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    String readString = parcel.readString();
                    zzaye.zzc(parcel);
                    boolean zzd = zzd(readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzd ? 1 : 0);
                } else {
                    String readString2 = parcel.readString();
                    zzaye.zzc(parcel);
                    zzbrf zzc = zzc(readString2);
                    parcel2.writeNoException();
                    zzaye.zzf(parcel2, zzc);
                }
            } else {
                String readString3 = parcel.readString();
                zzaye.zzc(parcel);
                boolean zze = zze(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zze ? 1 : 0);
            }
        } else {
            String readString4 = parcel.readString();
            zzaye.zzc(parcel);
            zzbpj zzb = zzb(readString4);
            parcel2.writeNoException();
            zzaye.zzf(parcel2, zzb);
        }
        return true;
    }
}
