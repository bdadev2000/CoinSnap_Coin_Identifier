package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbju implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfo zzcfoVar = (zzcfo) obj;
        if (map.keySet().contains("start")) {
            zzcfoVar.zzax(true);
        }
        if (map.keySet().contains("stop")) {
            zzcfoVar.zzax(false);
        }
    }
}
