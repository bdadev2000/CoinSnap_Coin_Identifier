package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdrm implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzdrm(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzchq) this.zzb).zza();
        zzges zzc = zzfin.zzc();
        Map zzb = ((zzhgb) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeV)).booleanValue()) {
            zzbbl zzbblVar = new zzbbl(new zzbbr(zza));
            zzbblVar.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdrn
                @Override // com.google.android.gms.internal.ads.zzbbk
                public final void zza(zzbbs.zzt.zza zzaVar) {
                    zzaVar.zzO(str);
                }
            });
            emptySet = Collections.singleton(new zzded(new zzdrp(zzbblVar, zzb), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhgf.zzb(emptySet);
        return emptySet;
    }
}
