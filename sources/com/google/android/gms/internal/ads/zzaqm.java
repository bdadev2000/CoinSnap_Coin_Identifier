package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.download.Command;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class zzaqm {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e2) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                zzaqb.zzc(e2, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaqb.zzd("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @Nullable
    public static zzaoy zzb(zzapl zzaplVar) {
        long j3;
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaplVar.zzc;
        if (map != null) {
            String str = (String) map.get("Date");
            if (str != null) {
                j3 = zza(str);
            } else {
                j3 = 0;
            }
            String str2 = (String) map.get("Cache-Control");
            int i10 = 0;
            if (str2 != null) {
                String[] split = str2.split(",", 0);
                z10 = false;
                j10 = 0;
                j11 = 0;
                while (i10 < split.length) {
                    String trim = split[i10].trim();
                    if (!trim.equals("no-cache") && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j11 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j10 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z10 = true;
                        }
                        i10++;
                    } else {
                        return null;
                    }
                }
                i10 = 1;
            } else {
                z10 = false;
                j10 = 0;
                j11 = 0;
            }
            String str3 = (String) map.get("Expires");
            if (str3 != null) {
                j12 = zza(str3);
            } else {
                j12 = 0;
            }
            String str4 = (String) map.get("Last-Modified");
            if (str4 != null) {
                j13 = zza(str4);
            } else {
                j13 = 0;
            }
            String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
            if (i10 != 0) {
                j15 = currentTimeMillis + (j11 * 1000);
                if (z10) {
                    j16 = j15;
                } else {
                    j16 = (j10 * 1000) + j15;
                }
                j14 = j16;
            } else {
                j14 = 0;
                if (j3 > 0 && j12 >= j3) {
                    j15 = currentTimeMillis + (j12 - j3);
                    j14 = j15;
                } else {
                    j15 = 0;
                }
            }
            zzaoy zzaoyVar = new zzaoy();
            zzaoyVar.zza = zzaplVar.zzb;
            zzaoyVar.zzb = str5;
            zzaoyVar.zzf = j15;
            zzaoyVar.zze = j14;
            zzaoyVar.zzc = j3;
            zzaoyVar.zzd = j13;
            zzaoyVar.zzg = map;
            zzaoyVar.zzh = zzaplVar.zzd;
            return zzaoyVar;
        }
        return null;
    }

    public static String zzc(long j3) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j3));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
