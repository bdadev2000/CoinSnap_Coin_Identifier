package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdiz implements zzhkp {
    private final zzhlg zza;

    public zzdiz(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdha((zzdjs) this.zza.zzb(), zzcci.zzf));
        zzhkx.zzb(singleton);
        return singleton;
    }
}
