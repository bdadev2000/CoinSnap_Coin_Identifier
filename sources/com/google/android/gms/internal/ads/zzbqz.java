package com.google.android.gms.internal.ads;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbqz {
    public final List zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final List zzf;
    public final String zzg;
    public final String zzh;

    public zzbqz(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i9 = -1;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                zzbqy zzbqyVar = new zzbqy(jSONArray.getJSONObject(i10));
                "banner".equalsIgnoreCase(zzbqyVar.zzv);
                arrayList.add(zzbqyVar);
                if (i9 < 0) {
                    Iterator it = zzbqyVar.zzc.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i9 = i10;
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
        this.zzg = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzu.zzg();
            this.zzb = zzbra.zza(optJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzu.zzg();
            this.zzc = zzbra.zza(optJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzu.zzg();
            this.zzd = zzbra.zza(optJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzu.zzg();
            this.zze = zzbra.zza(optJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzu.zzg();
            this.zzf = zzbra.zza(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong(ToolBar.REFRESH, -1L);
            zzbyt zza = zzbyt.zza(optJSONObject.optJSONArray("rewards"));
            if (zza == null) {
                this.zzh = null;
            } else {
                this.zzh = zza.zza;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzh = null;
    }
}
