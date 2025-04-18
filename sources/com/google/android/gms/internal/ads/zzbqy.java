package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbqy extends zzayd implements zzbqz {
    public zzbqy() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
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
                zzf(zzeVar);
            } else {
                String readString = parcel.readString();
                zzaye.zzc(parcel);
                zze(readString);
            }
        } else {
            zzbpv zzb = zzbpu.zzb(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            zzg(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
