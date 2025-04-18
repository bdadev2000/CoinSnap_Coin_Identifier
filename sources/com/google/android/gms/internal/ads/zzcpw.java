package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcpw implements zzhfx {
    private final zzhgp zza;

    public zzcpw(zzcpk zzcpkVar, zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzded((zzcrf) this.zza.zzb(), zzcaj.zzf));
        zzhgf.zzb(singleton);
        return singleton;
    }
}
