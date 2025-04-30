package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcbs {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzcbs(String str, long j7) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j7;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zzg = new JSONObject(str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlI)).booleanValue() && zzj()) {
                    return;
                }
                if (this.zzg.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                    this.zzh = false;
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("App settings could not be fetched successfully.");
                    return;
                }
                this.zzh = true;
                this.zzd = this.zzg.optString(MBridgeConstans.APP_ID);
                JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i9);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            if ("interstitial".equalsIgnoreCase(optString)) {
                                this.zzb.add(optString2);
                            } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                                this.zzc.put(optString2, new zzbqz(optJSONObject3));
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i10 = 0; i10 < optJSONArray3.length(); i10++) {
                        this.zza.add(optJSONArray3.optString(i10));
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhd)).booleanValue() && (optJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        this.zzi.add(optJSONArray.get(i11).toString());
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgy)).booleanValue() && (optJSONObject = this.zzg.optJSONObject("common_settings")) != null) {
                    this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Exception occurred while processing app setting json", e4);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long j7) {
        this.zzf = j7;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        if (!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            zzbeg zzbegVar = zzbep.zzlL;
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).longValue();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlK)).booleanValue() && !TextUtils.isEmpty(this.zze)) {
                longValue = this.zzg.optLong("cache_ttl_sec", ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).longValue());
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (longValue >= 0) {
                long j7 = this.zzf;
                if (j7 > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j7) > longValue) {
                    this.zza.clear();
                    this.zzb.clear();
                    this.zzc.clear();
                    this.zzd = "";
                    this.zze = "";
                    this.zzg = null;
                    this.zzh = false;
                    this.zzi.clear();
                    this.zzj = false;
                    return true;
                }
            }
        }
        return false;
    }
}
