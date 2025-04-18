package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;

/* loaded from: classes3.dex */
public abstract class zzce extends zzayd implements zzcf {
    public zzce() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zzft zzftVar = (zzft) zzaye.zza(parcel, zzft.CREATOR);
            zzaye.zzc(parcel);
            zzf(zzftVar);
        } else {
            zzft zzftVar2 = (zzft) zzaye.zza(parcel, zzft.CREATOR);
            zzaye.zzc(parcel);
            zze(zzftVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
