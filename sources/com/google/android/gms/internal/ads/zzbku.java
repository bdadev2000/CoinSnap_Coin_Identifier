package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbku implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzchd zzchdVar = (zzchd) obj;
        zzbhj zzK = zzchdVar.zzK();
        if (zzK != null && (zza = zzK.zza()) != null) {
            zzchdVar.zze("nativeAdViewSignalsReady", zza);
        } else {
            zzchdVar.zze("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
