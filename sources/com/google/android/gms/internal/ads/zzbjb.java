package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbjb implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcfo zzcfoVar = (zzcfo) obj;
        zzbfq zzK = zzcfoVar.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcfoVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcfoVar.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
