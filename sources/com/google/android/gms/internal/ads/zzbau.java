package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class zzbau extends zzaym implements zzbav {
    public zzbau() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzf();
        } else if (i2 == 2) {
            zzc();
        } else if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayn.zzc(parcel);
            zzd(zzeVar);
        } else if (i2 == 4) {
            zze();
        } else {
            if (i2 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
