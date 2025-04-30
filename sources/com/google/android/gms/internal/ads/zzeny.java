package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
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

/* loaded from: classes2.dex */
public final class zzeny {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzeny(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzgbf zzh(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc())) {
                boolean matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzde), str);
                boolean matches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdf), str);
                if (matches) {
                    hashMap = new HashMap(this.zze);
                } else if (matches2) {
                    hashMap = new HashMap(this.zzd);
                }
                return zzgbf.zzc(hashMap);
            }
            return zzgbf.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle zzo = zzo(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                        String optString = optJSONArray.optString(i9, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str2 = (String) arrayList2.get(i10);
                        zzg(str2);
                        if (((zzeoa) this.zza.get(str2)) != null) {
                            arrayList.add(new zzeoa(str2, str, zzo));
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
            if (!((Boolean) zzbgq.zzb.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbN)).booleanValue() && (zzf = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzf()) != null) {
                    try {
                        JSONArray jSONArray = zzf.getJSONArray("adapter_settings");
                        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i9);
                            String optString = jSONObject.optString("adapter_class_name");
                            JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(optString)) {
                                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                                    boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    String optString2 = jSONObject2.optString("platform");
                                    zzeoc zzeocVar = new zzeoc(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                    if (optString2.equals("ADMOB")) {
                                        this.zzd.put(optString, zzeocVar);
                                    } else if (optString2.equals("AD_MANAGER")) {
                                        this.zze.put(optString, zzeocVar);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e4) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e4);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
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
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzm() {
        String optString;
        JSONArray optJSONArray;
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzf();
            if (zzf != null) {
                try {
                    JSONArray optJSONArray2 = zzf.optJSONArray("ad_unit_id_settings");
                    this.zzg = zzf.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i9);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkR)).booleanValue()) {
                                optString = jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                            } else {
                                optString = jSONObject.optString("ad_unit_id", "");
                            }
                            String optString2 = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                    arrayList.addAll(zzi(optJSONArray.getJSONObject(i10), optString2));
                                }
                            }
                            zzl(optString2, optString, arrayList);
                        }
                    }
                } catch (JSONException e4) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzn() {
        JSONObject zzf;
        if (!((Boolean) zzbgq.zzg.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbM)).booleanValue() && (zzf = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("signal_adapters");
                    for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i9);
                        Bundle zzo = zzo(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzeoc(optString, optBoolean2, optBoolean, true, zzo));
                        }
                    }
                } catch (JSONException e4) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e4);
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
        Bundle bundle;
        try {
            Map zzb = zzb(str, str2);
            zzgbf zzh = zzh(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : ((zzgbf) zzb).entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzh.containsKey(str3)) {
                    zzeoc zzeocVar = (zzeoc) zzh.get(str3);
                    List list = (List) entry.getValue();
                    boolean z8 = zzeocVar.zzb;
                    boolean z9 = zzeocVar.zzc;
                    boolean z10 = zzeocVar.zzd;
                    if (list != null && !list.isEmpty()) {
                        bundle = (Bundle) list.get(0);
                    } else {
                        bundle = new Bundle();
                    }
                    hashMap.put(str3, new zzeoc(str3, z8, z9, z10, bundle));
                }
            }
            zzgdi it = zzh.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((zzeoc) entry2.getValue()).zzd) {
                    hashMap.put(str4, (zzeoc) entry2.getValue());
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
                List<zzeoa> list = (List) map.get(str2);
                if (list == null) {
                    String zza = zzdta.zza(this.zzg, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkR)).booleanValue()) {
                        zza = zza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(zza);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (zzeoa zzeoaVar : list) {
                        String str3 = zzeoaVar.zza;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(zzeoaVar.zzc);
                    }
                    return zzgbf.zzc(hashMap);
                }
            }
            return zzgbf.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc())) {
            return zzgbf.zzd();
        }
        return zzgbf.zzc(this.zzb);
    }

    public final void zze() {
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenx
            @Override // java.lang.Runnable
            public final void run() {
                zzeny.this.zzf();
            }
        });
        this.zzf.execute(new zzenw(this));
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzenw(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new zzeoa(str, "", new Bundle()));
        }
    }
}
