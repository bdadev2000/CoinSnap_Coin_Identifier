package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdyt implements zzdyv {
    private final Map zza;
    private final zzges zzb;
    private final zzczh zzc;

    public zzdyt(Map map, zzges zzgesVar, zzczh zzczhVar) {
        this.zza = map;
        this.zzb = zzgesVar;
        this.zzc = zzczhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final ua.b zzb(final zzbvx zzbvxVar) {
        this.zzc.zzdn(zzbvxVar);
        ua.b zzg = zzgei.zzg(new zzdwn(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhR)).split(",")) {
            final zzhgp zzhgpVar = (zzhgp) this.zza.get(str.trim());
            if (zzhgpVar != null) {
                zzg = zzgei.zzf(zzg, zzdwn.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdyr
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final ua.b zza(Object obj) {
                        return ((zzdyv) zzhgp.this.zzb()).zzb(zzbvxVar);
                    }
                }, this.zzb);
            }
        }
        zzgei.zzr(zzg, new zzdys(this), zzcaj.zzf);
        return zzg;
    }
}
