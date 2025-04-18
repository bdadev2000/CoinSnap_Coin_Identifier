package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdhc implements zzcrt {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhgp zzd;
    private final zzdjj zze;

    public zzdhc(Map map, Map map2, Map map3, zzhgp zzhgpVar, zzdjj zzdjjVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhgpVar;
        this.zze = zzdjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    @Nullable
    public final zzefb zza(int i10, String str) {
        zzefb zza;
        zzefb zzefbVar = (zzefb) this.zza.get(str);
        if (zzefbVar != null) {
            return zzefbVar;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzehp zzehpVar = (zzehp) this.zzc.get(str);
            if (zzehpVar != null) {
                return new zzefc(zzehpVar, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzcrv
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return new zzcry((List) obj);
                    }
                });
            }
            zza = (zzefb) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zza = ((zzcrt) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        }
        return new zzefc(zza, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzcrw
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzcry((zzcrq) obj);
            }
        });
    }
}
