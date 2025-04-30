package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzblc implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfxm.zzc("true", str) && !zzfxm.zzc("false", str)) {
                return;
            }
            zzfvh.zzi(zzchdVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
