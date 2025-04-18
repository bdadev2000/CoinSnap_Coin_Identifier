package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;

/* loaded from: classes.dex */
public abstract class zzcs extends zzaym implements zzct {
    public zzcs() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze zzeVar = (zze) zzayn.zza(parcel, zze.CREATOR);
            zzayn.zzc(parcel);
            zzd(zzeVar);
        } else if (i2 == 2) {
            zzf();
        } else if (i2 == 3) {
            zzc();
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
