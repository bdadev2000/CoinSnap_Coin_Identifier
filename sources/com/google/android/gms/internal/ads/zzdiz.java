package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzdiz implements zzhii {
    private final zzhja zza;

    public zzdiz(zzhja zzhjaVar) {
        this.zza = zzhjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdiw) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzhiq.zzb(singleton);
        return singleton;
    }
}
