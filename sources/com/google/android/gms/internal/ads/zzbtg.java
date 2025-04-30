package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbtg extends zzbae implements zzbth {
    public zzbtg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return false;
                }
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbaf.zzc(parcel);
                zzg(zzeVar);
            } else {
                String readString = parcel.readString();
                zzbaf.zzc(parcel);
                zzf(readString);
            }
        } else {
            String readString2 = parcel.readString();
            zzbaf.zzc(parcel);
            zze(readString2);
        }
        parcel2.writeNoException();
        return true;
    }
}
