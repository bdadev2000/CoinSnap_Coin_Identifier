package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.safedk.android.analytics.AppLovinBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzemx {

    @GuardedBy
    private final Map zza = new HashMap();

    @GuardedBy
    private final Map zzb = new HashMap();

    @GuardedBy
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzemx(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzgba zzh(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc())) {
                boolean matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdg), str);
                boolean matches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdh), str);
                if (matches) {
                    hashMap = new HashMap(this.zze);
                } else if (matches2) {
                    hashMap = new HashMap(this.zzd);
                }
                return zzgba.zzc(hashMap);
            }
            return zzgba.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle zzo = zzo(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString = optJSONArray.optString(i2, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str2 = (String) arrayList2.get(i3);
                        zzg(str2);
                        if (((zzemz) this.zza.get(str2)) != null) {
                            arrayList.add(new zzemz(str2, str, zzo));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    private final synchronized void zzk() {
        JSONObject zzf;
        try {
            if (!((Boolean) zzbex.zzb.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbP)).booleanValue() && (zzf = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzf()) != null) {
                    try {
                        JSONArray jSONArray = zzf.getJSONArray("adapter_settings");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String optString = jSONObject.optString("adapter_class_name");
                            JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(optString)) {
                                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                                    boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    String optString2 = jSONObject2.optString(AppLovinBridge.e);
                                    zzenb zzenbVar = new zzenb(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                    if (optString2.equals("ADMOB")) {
                                        this.zzd.put(optString, zzenbVar);
                                    } else if (optString2.equals("AD_MANAGER")) {
                                        this.zze.put(optString, zzenbVar);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.zzc.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.zzc.put(str, map);
            List list2 = (List) map.get(str2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.addAll(list);
            map.put(str2, list2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzm() {
        JSONArray optJSONArray;
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzf();
            if (zzf != null) {
                try {
                    JSONArray optJSONArray2 = zzf.optJSONArray("ad_unit_id_settings");
                    this.zzg = zzf.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                            String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkz)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String optString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                    arrayList.addAll(zzi(optJSONArray.getJSONObject(i3), optString));
                                }
                            }
                            zzl(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzn() {
        JSONObject zzf;
        if (!((Boolean) zzbex.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbO)).booleanValue() && (zzf = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("signal_adapters");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        Bundle zzo = zzo(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzenb(optString, optBoolean2, optBoolean, true, zzo));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private static final Bundle zzo(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap hashMap;
        try {
            Map zzb = zzb(str, str2);
            zzgba zzh = zzh(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : ((zzgba) zzb).entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzh.containsKey(str3)) {
                    zzenb zzenbVar = (zzenb) zzh.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new zzenb(str3, zzenbVar.zzb, zzenbVar.zzc, zzenbVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzgdd it = zzh.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((zzenb) entry2.getValue()).zzd) {
                    hashMap.put(str4, (zzenb) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzemz> list = (List) map.get(str2);
                if (list == null) {
                    String zza = zzdsb.zza(this.zzg, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkz)).booleanValue()) {
                        zza = zza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(zza);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (zzemz zzemzVar : list) {
                        String str3 = zzemzVar.zza;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(zzemzVar.zzb);
                    }
                    return zzgba.zzc(hashMap);
                }
            }
            return zzgba.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc())) {
            return zzgba.zzd();
        }
        return zzgba.zzc(this.zzb);
    }

    public final void zze() {
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // java.lang.Runnable
            public final void run() {
                zzemx.this.zzf();
            }
        });
        this.zzf.execute(new zzemv(this));
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzemv(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new zzemz(str, "", new Bundle()));
        }
    }
}
