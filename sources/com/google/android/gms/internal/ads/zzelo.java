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

/* loaded from: classes3.dex */
public final class zzelo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzelo(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzfzr zzh(String str) {
        HashMap hashMap;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc())) {
            boolean matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdm), str);
            boolean matches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdn), str);
            if (matches) {
                hashMap = new HashMap(this.zze);
            } else if (matches2) {
                hashMap = new HashMap(this.zzd);
            }
            return zzfzr.zzc(hashMap);
        }
        return zzfzr.zzd();
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (jSONObject != null) {
            Bundle zzo = zzo(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
            JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    String optString = optJSONArray.optString(i10, "");
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList2.add(optString);
                    }
                }
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str2 = (String) arrayList2.get(i11);
                    zzg(str2);
                    if (((zzelq) this.zza.get(str2)) != null) {
                        arrayList.add(new zzelq(str2, str, zzo));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
        if (!((Boolean) zzbet.zzb.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbS)).booleanValue() && (zzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("adapter_settings");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString)) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                zzels zzelsVar = new zzels(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.zzd.put(optString, zzelsVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.zze.put(optString, zzelsVar);
                                }
                            }
                        }
                    }
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e2);
                }
            }
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
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
    }

    private final synchronized void zzm() {
        String optString;
        JSONArray optJSONArray;
        JSONObject zzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf();
        if (zzf != null) {
            try {
                JSONArray optJSONArray2 = zzf.optJSONArray("ad_unit_id_settings");
                this.zzg = zzf.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i10);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkB)).booleanValue()) {
                            optString = jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                        } else {
                            optString = jSONObject.optString("ad_unit_id", "");
                        }
                        String optString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                arrayList.addAll(zzi(optJSONArray.getJSONObject(i11), optString2));
                            }
                        }
                        zzl(optString2, optString, arrayList);
                    }
                }
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e2);
            }
        }
    }

    private final synchronized void zzn() {
        JSONObject zzf;
        if (!((Boolean) zzbet.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbR)).booleanValue() && (zzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle zzo = zzo(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzels(optString, optBoolean2, optBoolean, true, zzo));
                        }
                    }
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e2);
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
        Map zzb = zzb(str, str2);
        zzfzr zzh = zzh(str2);
        hashMap = new HashMap();
        for (Map.Entry entry : ((zzfzr) zzb).entrySet()) {
            String str3 = (String) entry.getKey();
            if (zzh.containsKey(str3)) {
                zzels zzelsVar = (zzels) zzh.get(str3);
                List list = (List) entry.getValue();
                boolean z10 = zzelsVar.zzb;
                boolean z11 = zzelsVar.zzc;
                boolean z12 = zzelsVar.zzd;
                if (list != null && !list.isEmpty()) {
                    bundle = (Bundle) list.get(0);
                } else {
                    bundle = new Bundle();
                }
                hashMap.put(str3, new zzels(str3, z10, z11, z12, bundle));
            }
        }
        zzgbu it = zzh.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            String str4 = (String) entry2.getKey();
            if (!hashMap.containsKey(str4) && ((zzels) entry2.getValue()).zzd) {
                hashMap.put(str4, (zzels) entry2.getValue());
            }
        }
        return hashMap;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
            List<zzelq> list = (List) map.get(str2);
            if (list == null) {
                String zza = zzdqk.zza(this.zzg, str2, str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkB)).booleanValue()) {
                    zza = zza.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(zza);
            }
            if (list != null) {
                HashMap hashMap = new HashMap();
                for (zzelq zzelqVar : list) {
                    String str3 = zzelqVar.zza;
                    if (!hashMap.containsKey(str3)) {
                        hashMap.put(str3, new ArrayList());
                    }
                    ((List) hashMap.get(str3)).add(zzelqVar.zzb);
                }
                return zzfzr.zzc(hashMap);
            }
        }
        return zzfzr.zzd();
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc())) {
            return zzfzr.zzd();
        }
        return zzfzr.zzc(this.zzb);
    }

    public final void zze() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // java.lang.Runnable
            public final void run() {
                zzelo.this.zzf();
            }
        });
        this.zzf.execute(new zzelm(this));
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzelm(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new zzelq(str, "", new Bundle()));
        }
    }
}
