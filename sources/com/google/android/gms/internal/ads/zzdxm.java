package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class zzdxm implements zzhfx {
    public static zzdxm zza() {
        zzdxm zzdxmVar;
        zzdxmVar = zzdxl.zza;
        return zzdxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzhgf.zzb(uuid);
        return uuid;
    }
}
