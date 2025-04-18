package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class zzdyx implements zzhii {
    public static zzdyx zza() {
        zzdyx zzdyxVar;
        zzdyxVar = zzdyw.zza;
        return zzdyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        zzhiq.zzb(uuid);
        return uuid;
    }
}
