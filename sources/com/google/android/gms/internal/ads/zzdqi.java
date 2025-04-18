package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdqi {
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;
    private final Map zza = new ConcurrentHashMap();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzdqi(Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (!this.zzf.getAndSet(true)) {
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqh
                @Override // java.lang.Runnable
                public final void run() {
                    zzdqi.this.zzf();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze() {
        JSONObject zzf;
        JSONObject jSONObject;
        Map map;
        this.zzd = true;
        zzbzt zzg = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
        if (zzg != null && (zzf = zzg.zzf()) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzee)).booleanValue()) {
                jSONObject = zzf.optJSONObject("common_settings");
            } else {
                jSONObject = null;
            }
            this.zzb = jSONObject;
            this.zze = zzf.optJSONObject("ad_unit_patterns");
            JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
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
    }

    public final JSONObject zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzee)).booleanValue()) {
            return null;
        }
        return this.zzb;
    }

    public final JSONObject zzb(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzec)).booleanValue() && str != null && str2 != null) {
            if (!this.zzd) {
                zze();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzed)).booleanValue()) {
                    zzg();
                }
            }
            Map map = (Map) this.zza.get(str2);
            if (map != null) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject != null) {
                    return jSONObject;
                }
                String zza = zzdqk.zza(this.zze, str, str2);
                if (zza != null) {
                    return (JSONObject) map.get(zza);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void zzd() {
        zzg();
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqf
            @Override // java.lang.Runnable
            public final void run() {
                zzdqi.this.zze();
            }
        });
    }

    public final /* synthetic */ void zzf() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // java.lang.Runnable
            public final void run() {
                zzdqi.this.zze();
            }
        });
    }
}
