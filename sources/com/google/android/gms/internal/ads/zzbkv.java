package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbkv implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzchd zzchdVar = (zzchd) obj;
        zzbhj zzK = zzchdVar.zzK();
        if (zzK != null && (zzb = zzK.zzb()) != null) {
            zzchdVar.zze("nativeClickMetaReady", zzb);
        } else {
            zzchdVar.zze("nativeClickMetaReady", new JSONObject());
        }
    }
}
