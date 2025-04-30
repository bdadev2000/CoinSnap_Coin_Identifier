package com.google.android.gms.internal.ads;

import I.h;
import android.content.Context;

/* loaded from: classes2.dex */
public final class zzeqa implements zzexw {
    private final Context zza;

    public zzeqa(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        boolean z8;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcR)).booleanValue()) {
            if (h.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return zzgft.zzh(new zzeqb(z8));
        }
        return zzgft.zzh(null);
    }
}
