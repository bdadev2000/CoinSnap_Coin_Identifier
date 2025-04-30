package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzblm implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        if (map.keySet().contains("start")) {
            zzchdVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzchdVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzchdVar.zzN().zzk();
        }
    }
}
