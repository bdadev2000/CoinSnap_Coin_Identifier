package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.common.net.HttpHeaders;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class zzaqz {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str) || "-1".equals(str)) {
                zzaqo.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaqo.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @Nullable
    public static zzapl zzb(zzapy zzapyVar) {
        boolean z2;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzapyVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get(HttpHeaders.DATE);
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get(HttpHeaders.CACHE_CONTROL);
        int i2 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z2 = false;
            j2 = 0;
            j3 = 0;
            while (i2 < split.length) {
                String trim = split[i2].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z2 = true;
                }
                i2++;
            }
            i2 = 1;
        } else {
            z2 = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get(HttpHeaders.EXPIRES);
        long zza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get(HttpHeaders.LAST_MODIFIED);
        long zza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get(HttpHeaders.ETAG);
        if (i2 != 0) {
            j5 = currentTimeMillis + (j3 * 1000);
            j4 = z2 ? j5 : (j2 * 1000) + j5;
        } else {
            j4 = 0;
            if (zza <= 0 || zza2 < zza) {
                j5 = 0;
            } else {
                j5 = currentTimeMillis + (zza2 - zza);
                j4 = j5;
            }
        }
        zzapl zzaplVar = new zzapl();
        zzaplVar.zza = zzapyVar.zzb;
        zzaplVar.zzb = str5;
        zzaplVar.zzf = j5;
        zzaplVar.zze = j4;
        zzaplVar.zzc = zza;
        zzaplVar.zzd = zza3;
        zzaplVar.zzg = map;
        zzaplVar.zzh = zzapyVar.zzd;
        return zzaplVar;
    }

    public static String zzc(long j2) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j2));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
