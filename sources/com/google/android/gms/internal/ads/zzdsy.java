package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdsy {
    private final Map zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdsy(Executor executor) {
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzf() {
        JSONObject zzf;
        JSONObject jSONObject;
        Map map;
        try {
            this.zzd = true;
            zzcbs zzh = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh();
            if (zzh != null && (zzf = zzh.zzf()) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdZ)).booleanValue()) {
                    jSONObject = zzf.optJSONObject("common_settings");
                } else {
                    jSONObject = null;
                }
                this.zzb = jSONObject;
                this.zze = zzf.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                if (this.zza.containsKey(optString2)) {
                                    map = (Map) this.zza.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.zza.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final JSONObject zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdZ)).booleanValue()) {
            return null;
        }
        return this.zzb;
    }

    public final JSONObject zzb(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdY)).booleanValue() && str != null && str2 != null) {
            if (!this.zzd) {
                zzf();
            }
            Map map = (Map) this.zza.get(str2);
            if (map != null) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject != null) {
                    return jSONObject;
                }
                String zza = zzdta.zza(this.zze, str, str2);
                if (zza != null) {
                    return (JSONObject) map.get(zza);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsv
            @Override // java.lang.Runnable
            public final void run() {
                zzdsy.this.zze();
            }
        });
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsw
            @Override // java.lang.Runnable
            public final void run() {
                zzdsy.this.zzf();
            }
        });
    }

    public final /* synthetic */ void zze() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsx
            @Override // java.lang.Runnable
            public final void run() {
                zzdsy.this.zzd();
            }
        });
    }
}
