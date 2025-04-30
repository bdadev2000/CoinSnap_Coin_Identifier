package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdta {
    public static String zza(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (zzb(optJSONArray2, str) && !zzb(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    private static boolean zzb(JSONArray jSONArray, String str) {
        Pattern compile;
        if (jSONArray != null && str != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                String optString = jSONArray.optString(i9);
                try {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkS)).booleanValue()) {
                        compile = Pattern.compile(optString, 2);
                    } else {
                        compile = Pattern.compile(optString);
                    }
                } catch (PatternSyntaxException e4) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if (compile.matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
