package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes3.dex */
public final class zzbxt extends zzbwy {
    private final String zza;
    private final int zzb;

    public zzbxt(@Nullable RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwz
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwz
    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzbxt(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }
}
