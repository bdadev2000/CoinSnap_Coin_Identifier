package com.google.android.gms.internal.ads;

import android.content.Context;
import d0.h;

/* loaded from: classes3.dex */
public final class zzenq implements zzevz {
    private final Context zza;

    public zzenq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        boolean z10;
        if (h.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return zzgei.zzh(new zzenr(z10));
    }
}
