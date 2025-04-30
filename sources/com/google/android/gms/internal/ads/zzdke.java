package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdke implements zzhkp {
    private final zzhlg zza;

    public zzdke(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        if (((zzdkb) this.zza).zza().zze() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        zzhkx.zzb(emptySet);
        return emptySet;
    }
}
