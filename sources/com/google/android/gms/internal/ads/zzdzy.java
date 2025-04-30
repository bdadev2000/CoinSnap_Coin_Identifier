package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzdzy implements zzhkp {
    public static zzdzy zza() {
        zzdzy zzdzyVar;
        zzdzyVar = zzdzx.zza;
        return zzdzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        zzhkx.zzb(uuid);
        return uuid;
    }
}
