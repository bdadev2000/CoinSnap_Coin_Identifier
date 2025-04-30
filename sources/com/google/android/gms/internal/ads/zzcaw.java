package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzcaw {
    public static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i9 = indexOf + 1;
            StringBuilder sb = new StringBuilder(str.substring(0, i9));
            AbstractC2914a.j(sb, str2, "=", str3, "&");
            sb.append(str.substring(i9));
            return Uri.parse(sb.toString());
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzu.zzn().zzp(context)) {
            return uri.toString();
        }
        String zza = com.google.android.gms.ads.internal.zzu.zzn().zza(context);
        if (zza == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaf);
        String uri2 = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzae)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzu.zzn().zzj(context, zza, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zza);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzad)).booleanValue()) {
                String uri3 = zza(zzd(uri2, context), "fbs_aeid", zza).toString();
                com.google.android.gms.ads.internal.zzu.zzn().zzj(context, zza, (Map) map.get("_ac"));
                return uri3;
            }
            return uri2;
        }
        return uri2;
    }

    public static String zzc(String str, Context context, boolean z8, Map map) {
        String zza;
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzam)).booleanValue() || z8) && com.google.android.gms.ads.internal.zzu.zzn().zzp(context) && !TextUtils.isEmpty(str) && (zza = com.google.android.gms.ads.internal.zzu.zzn().zza(context)) != null) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzae)).booleanValue() && str.contains(str2)) {
                if (com.google.android.gms.ads.internal.zzu.zzp().zzi(str)) {
                    com.google.android.gms.ads.internal.zzu.zzn().zzj(context, zza, (Map) map.get("_ac"));
                    return zzd(str, context).replace(str2, zza);
                }
                if (com.google.android.gms.ads.internal.zzu.zzp().zzj(str)) {
                    com.google.android.gms.ads.internal.zzu.zzn().zzk(context, zza, (Map) map.get("_ai"));
                    return zzd(str, context).replace(str2, zza);
                }
                return str;
            }
            if (!str.contains("fbs_aeid")) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzad)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.zzu.zzp().zzi(str)) {
                        com.google.android.gms.ads.internal.zzu.zzn().zzj(context, zza, (Map) map.get("_ac"));
                        return zza(zzd(str, context), "fbs_aeid", zza).toString();
                    }
                    if (com.google.android.gms.ads.internal.zzu.zzp().zzj(str)) {
                        com.google.android.gms.ads.internal.zzu.zzn().zzk(context, zza, (Map) map.get("_ai"));
                        return zza(zzd(str, context), "fbs_aeid", zza).toString();
                    }
                    return str;
                }
                return str;
            }
            return str;
        }
        return str;
    }

    private static String zzd(String str, Context context) {
        String zzd = com.google.android.gms.ads.internal.zzu.zzn().zzd(context);
        String zzb = com.google.android.gms.ads.internal.zzu.zzn().zzb(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzd)) {
            str = zza(str, "gmp_app_id", zzd).toString();
        }
        if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(zzb)) {
            return zza(str, "fbs_aiid", zzb).toString();
        }
        return str;
    }
}
