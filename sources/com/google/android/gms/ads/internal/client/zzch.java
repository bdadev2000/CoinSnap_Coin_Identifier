package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public abstract class zzch extends zzbae implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return false;
                        }
                        zzb();
                    } else {
                        zze();
                    }
                } else {
                    zzc();
                }
            } else {
                zzf();
            }
        } else {
            zze zzeVar = (zze) zzbaf.zza(parcel, zze.CREATOR);
            zzbaf.zzc(parcel);
            zzd(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
