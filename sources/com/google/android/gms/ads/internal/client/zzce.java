package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;

/* loaded from: classes.dex */
public abstract class zzce extends zzaym implements zzcf {
    public zzce() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzfu zzfuVar = (zzfu) zzayn.zza(parcel, zzfu.CREATOR);
            zzayn.zzc(parcel);
            zze(zzfuVar);
        } else {
            if (i2 != 2) {
                return false;
            }
            zzfu zzfuVar2 = (zzfu) zzayn.zza(parcel, zzfu.CREATOR);
            zzayn.zzc(parcel);
            zzf(zzfuVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
