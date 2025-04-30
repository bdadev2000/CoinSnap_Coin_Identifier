package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblr implements zzblp {
    private final zzbls zza;

    public zzblr(zzbls zzblsVar) {
        this.zza = zzblsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f9 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f9 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to parse float", e4);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f9);
        zzchdVar.zzay(equals);
    }
}
