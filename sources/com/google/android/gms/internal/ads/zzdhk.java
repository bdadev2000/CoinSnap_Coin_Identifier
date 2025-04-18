package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdhk implements zzhfx {
    private final zzhgp zza;

    public zzdhk(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        if (((zzdhh) this.zza).zza().zze() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        zzhgf.zzb(emptySet);
        return emptySet;
    }
}
