package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes2.dex */
public final class zzbzk implements RewardItem {
    private final zzbyx zza;

    public zzbzk(zzbyx zzbyxVar) {
        this.zza = zzbyxVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbyx zzbyxVar = this.zza;
        if (zzbyxVar != null) {
            try {
                return zzbyxVar.zze();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not forward getAmount to RewardItem", e4);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @Nullable
    public final String getType() {
        zzbyx zzbyxVar = this.zza;
        if (zzbyxVar != null) {
            try {
                return zzbyxVar.zzf();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not forward getType to RewardItem", e4);
            }
        }
        return null;
    }
}
