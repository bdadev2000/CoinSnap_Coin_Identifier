package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes2.dex */
public final class zzbxw extends zzbxb {
    private final String zza;
    private final int zzb;

    public zzbxw(@Nullable RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzbxw(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }
}
