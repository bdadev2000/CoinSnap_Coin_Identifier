package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcpt implements zzhfx {
    private final zzcpk zza;
    private final zzhgp zzb;

    public zzcpt(zzcpk zzcpkVar, zzhgp zzhgpVar) {
        this.zza = zzcpkVar;
        this.zzb = zzhgpVar;
    }

    public static Set zza(zzcpk zzcpkVar, zzcrf zzcrfVar) {
        Set singleton = Collections.singleton(new zzded(zzcrfVar, zzcaj.zzf));
        zzhgf.zzb(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcrf) this.zzb.zzb());
    }
}
