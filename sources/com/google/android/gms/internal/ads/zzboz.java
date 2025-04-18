package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventParameters;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzboz {
    public final List zza;
    public final String zzb;

    @Nullable
    public final String zzc;

    public zzboz(JSONObject jSONObject) throws JSONException {
        String str;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzv.zzh();
        zzbpb.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzbpb.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzbpb.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzbpb.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzbpb.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzbpb.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzbpb.zza(jSONObject, "video_reward_urls");
        jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzv.zzh();
            zzbpb.zza(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        } else {
            str = null;
        }
        this.zzb = str;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzv.zzh();
        zzbpb.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
