package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcgv {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    @Nullable
    public static String zza(zzfet zzfetVar) {
        zzees zzeesVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && zzfetVar.zzT && zzfetVar.zzV.zzb() && zzfetVar.zzb != 4) {
            if (zzfetVar.zzV.zzc() == 1) {
                zzeesVar = zzees.VIDEO;
            } else {
                zzeesVar = zzees.HTML_DISPLAY;
            }
            String str = zzfetVar.zzal;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("creativeType", zzeesVar.toString());
                jSONObject.put("contentUrl", str);
                return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to build OMID ENV JSON", e2);
            }
        }
        return null;
    }

    public static String zzb(@NonNull String str, @Nullable String... strArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb2.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb2.append(str3);
            }
            sb2.append(str.substring(end));
        } else {
            if (!zzb.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb2.append(str2);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
