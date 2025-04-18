package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbkh implements zzbjr {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjr
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
            zzbkg zzbkgVar = (zzbkg) this.zzb.remove(str);
            if (zzbkgVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbkgVar.zza(str3 + concat);
                return;
            }
            if (str5 == null) {
                zzbkgVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbkgVar.zzb(jSONObject);
            } catch (JSONException e2) {
                zzbkgVar.zza(e2.getMessage());
            }
        }
    }

    public final ua.b zzb(zzbmy zzbmyVar, String str, JSONObject jSONObject) {
        zzcao zzcaoVar = new zzcao();
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbkf(this, zzcaoVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbmyVar.zzl(str, jSONObject2);
        } catch (Exception e2) {
            zzcaoVar.zzd(e2);
        }
        return zzcaoVar;
    }

    public final void zzc(String str, zzbkg zzbkgVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbkgVar);
        }
    }
}
