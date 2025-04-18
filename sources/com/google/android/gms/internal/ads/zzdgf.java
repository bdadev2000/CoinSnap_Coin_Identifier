package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdgf implements zzhfx {
    private final zzhgp zza;

    public zzdgf(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzded((zzdgy) this.zza.zzb(), zzcaj.zzf));
        zzhgf.zzb(singleton);
        return singleton;
    }
}
