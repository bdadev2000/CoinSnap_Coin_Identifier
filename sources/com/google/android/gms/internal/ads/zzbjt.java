package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbjt implements zzbjr {
    private final zzbju zza;

    public zzbjt(zzbju zzbjuVar) {
        this.zza = zzbjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to parse float", e2);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f10);
        zzcfkVar.zzay(equals);
    }
}
