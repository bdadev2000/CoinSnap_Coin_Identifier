package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbzr extends zzbyw {
    private final String zza;
    private final int zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbzr(@androidx.annotation.Nullable com.google.android.gms.ads.rewarded.RewardItem r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.String r0 = r2.getType()
            goto L9
        L7:
            java.lang.String r0 = ""
        L9:
            if (r2 == 0) goto L10
            int r2 = r2.getAmount()
            goto L11
        L10:
            r2 = 1
        L11:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzr.<init>(com.google.android.gms.ads.rewarded.RewardItem):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzbzr(String str, int i9) {
        this.zza = str;
        this.zzb = i9;
    }
}
