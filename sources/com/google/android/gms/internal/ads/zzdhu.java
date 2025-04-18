package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzdhu implements zzhii {
    private final zzhja zza;

    public zzdhu(zzhja zzhjaVar) {
        this.zza = zzhjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdfs((zzdin) this.zza.zzb(), zzcan.zzf));
        zzhiq.zzb(singleton);
        return singleton;
    }
}
