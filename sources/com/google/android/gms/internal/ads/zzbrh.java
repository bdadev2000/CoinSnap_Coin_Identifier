package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbrh extends zzayd implements zzbri {
    public zzbrh() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzaye.zzc(parcel);
                zzg(zzeVar);
            } else {
                String readString = parcel.readString();
                zzaye.zzc(parcel);
                zzf(readString);
            }
        } else {
            String readString2 = parcel.readString();
            zzaye.zzc(parcel);
            zze(readString2);
        }
        parcel2.writeNoException();
        return true;
    }
}
