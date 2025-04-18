package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcrh implements zzhii {
    private final zzcqy zza;
    private final zzhja zzb;

    public zzcrh(zzcqy zzcqyVar, zzhja zzhjaVar) {
        this.zza = zzcqyVar;
        this.zzb = zzhjaVar;
    }

    public static Set zza(zzcqy zzcqyVar, zzcst zzcstVar) {
        Set singleton = Collections.singleton(new zzdfs(zzcstVar, zzcan.zzf));
        zzhiq.zzb(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcst) this.zzb.zzb());
    }
}
