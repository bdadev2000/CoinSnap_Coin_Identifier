package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbix implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcfk zzcfkVar = (zzcfk) obj;
        zzbfm zzK = zzcfkVar.zzK();
        if (zzK != null && (zzb = zzK.zzb()) != null) {
            zzcfkVar.zze("nativeClickMetaReady", zzb);
        } else {
            zzcfkVar.zze("nativeClickMetaReady", new JSONObject());
        }
    }
}
