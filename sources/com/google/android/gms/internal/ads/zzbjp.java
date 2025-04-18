package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbjp implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        if (map.keySet().contains("start")) {
            zzcfkVar.zzax(true);
        }
        if (map.keySet().contains("stop")) {
            zzcfkVar.zzax(false);
        }
    }
}
