package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbjc implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcfo zzcfoVar = (zzcfo) obj;
        zzbfq zzK = zzcfoVar.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcfoVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcfoVar.zze("nativeClickMetaReady", zzb);
        }
    }
}
