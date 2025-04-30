package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzebe implements zzebg {
    private final Map zza;
    private final zzgge zzb;
    private final zzdce zzc;

    public zzebe(Map map, zzgge zzggeVar, zzdce zzdceVar) {
        this.zza = map;
        this.zzb = zzggeVar;
        this.zzc = zzdceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final f4.c zzb(final zzbxu zzbxuVar) {
        this.zzc.zzdn(zzbxuVar);
        f4.c zzg = zzgft.zzg(new zzdzd(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzin)).split(",")) {
            final zzhlg zzhlgVar = (zzhlg) this.zza.get(str.trim());
            if (zzhlgVar != null) {
                zzg = zzgft.zzf(zzg, zzdzd.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebc
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final f4.c zza(Object obj) {
                        return ((zzebg) zzhlg.this.zzb()).zzb(zzbxuVar);
                    }
                }, this.zzb);
            }
        }
        zzgft.zzr(zzg, new zzebd(this), zzcci.zzf);
        return zzg;
    }
}
