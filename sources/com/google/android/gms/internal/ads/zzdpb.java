package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdpb {
    private final Executor zza;
    private final zzdow zzb;

    public zzdpb(Executor executor, zzdow zzdowVar) {
        this.zza = executor;
        this.zzb = zzdowVar;
    }

    public final f4.c zza(JSONObject jSONObject, String str) {
        f4.c zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgft.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
            if (optJSONObject == null) {
                zzh = zzgft.zzh(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzh = zzgft.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzh = zzgft.zzh(new zzdpa(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzh = zzgft.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdoy
                            @Override // com.google.android.gms.internal.ads.zzfxu
                            public final Object apply(Object obj) {
                                return new zzdpa(optString, (zzbhi) obj);
                            }
                        }, this.zza);
                    } else {
                        zzh = zzgft.zzh(null);
                    }
                }
            }
            arrayList.add(zzh);
        }
        return zzgft.zzm(zzgft.zzd(arrayList), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdoz
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdpa zzdpaVar : (List) obj) {
                    if (zzdpaVar != null) {
                        arrayList2.add(zzdpaVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
