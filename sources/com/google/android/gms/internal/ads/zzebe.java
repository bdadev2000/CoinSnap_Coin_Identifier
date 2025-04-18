package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.ui.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzebe implements zzbob {
    @Override // com.google.android.gms.internal.ads.zzbob
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzebf zzebfVar = (zzebf) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziS)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzebfVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzebfVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzebfVar.zzd.zzd());
        jSONObject2.put("signals", zzebfVar.zzc);
        jSONObject3.put(TtmlNode.TAG_BODY, zzebfVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(zzebfVar.zzb.zzb));
        jSONObject3.put("response_code", zzebfVar.zzb.zza);
        jSONObject3.put("latency", zzebfVar.zzb.zzd);
        jSONObject.put(i.REQUEST_KEY_EXTRA, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzebfVar.zzd.zzi());
        return jSONObject;
    }
}
