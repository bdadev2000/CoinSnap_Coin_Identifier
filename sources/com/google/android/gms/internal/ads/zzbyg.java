package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbyg extends zzbae implements zzbyh {
    public zzbyg() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        } else {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        }
        return true;
    }
}
