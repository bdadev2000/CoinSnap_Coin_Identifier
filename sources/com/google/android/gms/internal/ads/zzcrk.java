package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcrk implements zzhii {
    private final zzhja zza;

    public zzcrk(zzcqy zzcqyVar, zzhja zzhjaVar) {
        this.zza = zzhjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdfs((zzcst) this.zza.zzb(), zzcan.zzf));
        zzhiq.zzb(singleton);
        return singleton;
    }
}
