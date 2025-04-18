package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbjt implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfo zzcfoVar = (zzcfo) obj;
        if (map.keySet().contains("start")) {
            zzcfoVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzcfoVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzcfoVar.zzN().zzk();
        }
    }
}
