package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzead implements zzeaf {
    private final Map zza;
    private final zzgfz zzb;
    private final zzdaw zzc;

    public zzead(Map map, zzgfz zzgfzVar, zzdaw zzdawVar) {
        this.zza = map;
        this.zzb = zzgfzVar;
        this.zzc = zzdawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final ListenableFuture zzb(final zzbwa zzbwaVar) {
        this.zzc.zzdn(zzbwaVar);
        ListenableFuture zzg = zzgfo.zzg(new zzdye(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhP)).split(",")) {
            final zzhja zzhjaVar = (zzhja) this.zza.get(str.trim());
            if (zzhjaVar != null) {
                zzg = zzgfo.zzf(zzg, zzdye.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzeab
                    @Override // com.google.android.gms.internal.ads.zzgev
                    public final ListenableFuture zza(Object obj) {
                        return ((zzeaf) zzhja.this.zzb()).zzb(zzbwaVar);
                    }
                }, this.zzb);
            }
        }
        zzgfo.zzr(zzg, new zzeac(this), zzcan.zzf);
        return zzg;
    }
}
