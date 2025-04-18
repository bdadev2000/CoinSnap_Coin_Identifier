package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcog implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzcog(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzcny zzcnyVar = (zzcny) this.zza.zzb();
        zzges zzc = zzfin.zzc();
        if (((JSONObject) this.zzb.zzb()) == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzded(zzcnyVar, zzc));
        }
        zzhgf.zzb(singleton);
        return singleton;
    }
}
