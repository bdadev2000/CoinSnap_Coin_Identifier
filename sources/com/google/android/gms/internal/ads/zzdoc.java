package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdoc {
    private final Executor zza;
    private final zzdnx zzb;

    public zzdoc(Executor executor, zzdnx zzdnxVar) {
        this.zza = executor;
        this.zzb = zzdnxVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgfo.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject == null) {
                zzh = zzgfo.zzh(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzh = zzgfo.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zzh = "string".equals(optString2) ? zzgfo.zzh(new zzdob(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzgfo.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzdnz
                        @Override // com.google.android.gms.internal.ads.zzfxq
                        public final Object apply(Object obj) {
                            return new zzdob(optString, (zzbfp) obj);
                        }
                    }, this.zza) : zzgfo.zzh(null);
                }
            }
            arrayList.add(zzh);
        }
        return zzgfo.zzm(zzgfo.zzd(arrayList), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzdoa
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdob zzdobVar : (List) obj) {
                    if (zzdobVar != null) {
                        arrayList2.add(zzdobVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
