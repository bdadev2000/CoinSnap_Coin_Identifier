package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbiw implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcfk zzcfkVar = (zzcfk) obj;
        zzbfm zzK = zzcfkVar.zzK();
        if (zzK != null && (zza = zzK.zza()) != null) {
            zzcfkVar.zze("nativeAdViewSignalsReady", zza);
        } else {
            zzcfkVar.zze("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
