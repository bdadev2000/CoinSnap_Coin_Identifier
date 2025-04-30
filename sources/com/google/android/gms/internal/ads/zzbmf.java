package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmf implements zzblp {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        String concat;
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            try {
                zzbme zzbmeVar = (zzbme) this.zzb.remove(str);
                if (zzbmeVar == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    zzbmeVar.zza(str3 + concat);
                    return;
                }
                if (str5 == null) {
                    zzbmeVar.zzb(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbmeVar.zzb(jSONObject);
                } catch (JSONException e4) {
                    zzbmeVar.zza(e4.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final f4.c zzb(zzbox zzboxVar, String str, JSONObject jSONObject) {
        zzccn zzccnVar = new zzccn();
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbmd(this, zzccnVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzboxVar.zzl(str, jSONObject2);
        } catch (Exception e4) {
            zzccnVar.zzd(e4);
        }
        return zzccnVar;
    }

    public final void zzc(String str, zzbme zzbmeVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbmeVar);
        }
    }
}
