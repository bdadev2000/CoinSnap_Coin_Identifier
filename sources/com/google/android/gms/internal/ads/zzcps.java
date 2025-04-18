package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcps implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzcps(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet = ((JSONObject) this.zzb.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzdfs((zzcpm) this.zza.zzb(), zzfkb.zzc()));
        zzhiq.zzb(emptySet);
        return emptySet;
    }
}
