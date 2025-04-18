package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdml {
    private final Executor zza;
    private final zzdmg zzb;

    public zzdml(Executor executor, zzdmg zzdmgVar) {
        this.zza = executor;
        this.zzb = zzdmgVar;
    }

    public final ua.b zza(JSONObject jSONObject, String str) {
        ua.b zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgei.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                zzh = zzgei.zzh(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzh = zzgei.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzh = zzgei.zzh(new zzdmk(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzh = zzgei.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdmi
                            @Override // com.google.android.gms.internal.ads.zzfwh
                            public final Object apply(Object obj) {
                                return new zzdmk(optString, (zzbfl) obj);
                            }
                        }, this.zza);
                    } else {
                        zzh = zzgei.zzh(null);
                    }
                }
            }
            arrayList.add(zzh);
        }
        return zzgei.zzm(zzgei.zzd(arrayList), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdmk zzdmkVar : (List) obj) {
                    if (zzdmkVar != null) {
                        arrayList2.add(zzdmkVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
