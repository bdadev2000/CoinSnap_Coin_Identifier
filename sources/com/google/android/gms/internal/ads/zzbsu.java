package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbsu extends zzbae implements zzbsv {
    public zzbsu() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 4) {
                    return false;
                }
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbaf.zzc(parcel);
                zzf(zzeVar);
            } else {
                String readString = parcel.readString();
                zzbaf.zzc(parcel);
                zze(readString);
            }
        } else {
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
