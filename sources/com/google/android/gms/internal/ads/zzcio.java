package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcio {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    @Nullable
    public static String zza(zzfgt zzfgtVar) {
        zzehc zzehcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && zzfgtVar.zzU && zzfgtVar.zzW.zzb() && zzfgtVar.zzb != 4) {
            if (zzfgtVar.zzW.zzc() == 1) {
                zzehcVar = zzehc.VIDEO;
            } else {
                zzehcVar = zzehc.HTML_DISPLAY;
            }
            String str = zzfgtVar.zzam;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("creativeType", zzehcVar.toString());
                jSONObject.put("contentUrl", str);
                return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to build OMID ENV JSON", e4);
            }
        }
        return null;
    }

    public static String zzb(@NonNull String str, @Nullable String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!zzb.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
