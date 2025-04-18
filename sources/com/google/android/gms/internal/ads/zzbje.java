package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbje implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfwa.zzc("true", str) && !zzfwa.zzc("false", str)) {
                return;
            }
            zzfti.zza(zzcfkVar.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
