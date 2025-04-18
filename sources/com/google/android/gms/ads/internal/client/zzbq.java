package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;

/* loaded from: classes.dex */
public abstract class zzbq extends zzaym implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzm zzmVar = (zzm) zzayn.zza(parcel, zzm.CREATOR);
            zzayn.zzc(parcel);
            zzg(zzmVar);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i2 == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            int i4 = zzayn.zza;
            parcel2.writeInt(zzi ? 1 : 0);
        } else if (i2 == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else {
            if (i2 != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzayn.zza(parcel, zzm.CREATOR);
            int readInt = parcel.readInt();
            zzayn.zzc(parcel);
            zzh(zzmVar2, readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
