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

/* loaded from: classes2.dex */
public final class zzbqy {
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final String zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final List zzl;
    public final List zzm;
    public final List zzn;
    public final String zzo;
    public final String zzp;

    @Nullable
    public final String zzq;

    @Nullable
    public final String zzr;
    public final String zzs;

    @Nullable
    public final List zzt;
    public final String zzu;

    @Nullable
    public final String zzv;

    public zzbqy(JSONObject jSONObject) throws JSONException {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        this.zzb = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            arrayList.add(jSONArray.getString(i9));
        }
        this.zzc = Collections.unmodifiableList(arrayList);
        this.zzd = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzf = zzbra.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzg = zzbra.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzh = zzbra.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzj = zzbra.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzl = zzbra.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzn = zzbra.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzm = zzbra.zza(jSONObject, "video_reward_urls");
        this.zzo = jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        this.zzp = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzu.zzg();
            list = zzbra.zza(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.zzi = list;
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        } else {
            str = null;
        }
        this.zza = str;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
        if (optJSONObject2 != null) {
            str2 = optJSONObject2.toString();
        } else {
            str2 = null;
        }
        this.zzk = str2;
        if (optJSONObject2 != null) {
            str3 = optJSONObject2.optString("class_name");
        } else {
            str3 = null;
        }
        this.zze = str3;
        this.zzq = jSONObject.optString("html_template", null);
        this.zzr = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            str4 = optJSONObject3.toString();
        } else {
            str4 = null;
        }
        this.zzs = str4;
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzt = zzbra.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            str5 = optJSONObject4.toString();
        } else {
            str5 = null;
        }
        this.zzu = str5;
        this.zzv = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
