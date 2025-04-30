package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public abstract class zzbj extends zzbae implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            zze zzeVar = (zze) zzbaf.zza(parcel, zze.CREATOR);
            zzbaf.zzc(parcel);
            zzb(zzeVar);
        } else {
            zzc();
        }
        parcel2.writeNoException();
        return true;
    }
}
