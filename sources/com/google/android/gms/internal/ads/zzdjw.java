package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzdjw implements zzcus {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhlg zzd;
    private final zzdme zze;

    public zzdjw(Map map, Map map2, Map map3, zzhlg zzhlgVar, zzdme zzdmeVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhlgVar;
        this.zze = zzdmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    @Nullable
    public final zzehl zza(int i9, String str) {
        zzehl zza;
        zzehl zzehlVar = (zzehl) this.zza.get(str);
        if (zzehlVar != null) {
            return zzehlVar;
        }
        if (i9 != 1) {
            if (i9 != 4) {
                return null;
            }
            zzejz zzejzVar = (zzejz) this.zzc.get(str);
            if (zzejzVar != null) {
                return new zzehm(zzejzVar, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzcuu
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        return new zzcux((List) obj);
                    }
                });
            }
            zza = (zzehl) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zza = ((zzcus) this.zzd.zzb()).zza(i9, str)) == null) {
            return null;
        }
        return new zzehm(zza, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzcuv
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return new zzcux((zzcup) obj);
            }
        });
    }
}
