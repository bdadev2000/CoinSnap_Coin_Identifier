package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcrg implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcrg(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzcra zzcraVar = (zzcra) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        if (((JSONObject) this.zzc.zzb()) == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzdha(zzcraVar, zzggeVar));
        }
        zzhkx.zzb(singleton);
        return singleton;
    }
}
