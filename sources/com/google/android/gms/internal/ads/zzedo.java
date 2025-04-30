package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.ui.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzedo implements zzbqa {
    @Override // com.google.android.gms.internal.ads.zzbqa
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzedp zzedpVar = (zzedp) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjn)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzedpVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzedpVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzedpVar.zzd.zzd());
        jSONObject2.put("signals", zzedpVar.zzc);
        jSONObject3.put(TtmlNode.TAG_BODY, zzedpVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zzb().zzj(zzedpVar.zzb.zzb));
        jSONObject3.put("response_code", zzedpVar.zzb.zza);
        jSONObject3.put("latency", zzedpVar.zzb.zzd);
        jSONObject.put(i.REQUEST_KEY_EXTRA, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzedpVar.zzd.zzi());
        return jSONObject;
    }
}
