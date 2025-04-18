package com.google.android.gms.internal.ads;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbpa {
    public final List zza;

    public zzbpa(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                zzboz zzbozVar = new zzboz(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(zzbozVar.zzc);
                arrayList.add(zzbozVar);
                if (i10 < 0) {
                    Iterator it = zzbozVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i10 = i11;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzv.zzh();
            zzbpb.zza(optJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            zzbpb.zza(optJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            zzbpb.zza(optJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            zzbpb.zza(optJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            zzbpb.zza(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong(ToolBar.REFRESH, -1L);
            zzbwv.zza(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
