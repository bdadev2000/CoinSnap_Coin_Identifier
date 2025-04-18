package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes3.dex */
public final class zzbxm implements RewardItem {
    private final zzbwz zza;

    public zzbxm(zzbwz zzbwzVar) {
        this.zza = zzbwzVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbwz zzbwzVar = this.zza;
        if (zzbwzVar != null) {
            try {
                return zzbwzVar.zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not forward getAmount to RewardItem", e2);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @Nullable
    public final String getType() {
        zzbwz zzbwzVar = this.zza;
        if (zzbwzVar != null) {
            try {
                return zzbwzVar.zzf();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not forward getType to RewardItem", e2);
            }
        }
        return null;
    }
}
