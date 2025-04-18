package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzdir implements zzcth {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhja zzd;
    private final zzdla zze;

    public zzdir(Map map, Map map2, Map map3, zzhja zzhjaVar, zzdla zzdlaVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhjaVar;
        this.zze = zzdlaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcth
    @Nullable
    public final zzegk zza(int i2, String str) {
        zzegk zza;
        zzegk zzegkVar = (zzegk) this.zza.get(str);
        if (zzegkVar != null) {
            return zzegkVar;
        }
        if (i2 != 1) {
            if (i2 != 4) {
                return null;
            }
            zzeiy zzeiyVar = (zzeiy) this.zzc.get(str);
            if (zzeiyVar != null) {
                return new zzegl(zzeiyVar, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzctj
                    @Override // com.google.android.gms.internal.ads.zzfxq
                    public final Object apply(Object obj) {
                        return new zzctm((List) obj);
                    }
                });
            }
            zza = (zzegk) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zza = ((zzcth) this.zzd.zzb()).zza(i2, str)) == null) {
            return null;
        }
        return new zzegl(zza, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzctk
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return new zzctm((zzcte) obj);
            }
        });
    }
}
