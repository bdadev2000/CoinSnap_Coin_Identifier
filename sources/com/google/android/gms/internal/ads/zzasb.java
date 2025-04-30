package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.download.Command;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class zzasb {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e4) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                zzarq.zzc(e4, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzarq.zzd("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @Nullable
    public static zzaqn zzb(zzara zzaraVar) {
        long j7;
        boolean z8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaraVar.zzc;
        if (map != null) {
            String str = (String) map.get("Date");
            if (str != null) {
                j7 = zza(str);
            } else {
                j7 = 0;
            }
            String str2 = (String) map.get("Cache-Control");
            int i9 = 0;
            if (str2 != null) {
                String[] split = str2.split(",", 0);
                z8 = false;
                j9 = 0;
                j10 = 0;
                while (i9 < split.length) {
                    String trim = split[i9].trim();
                    if (!trim.equals("no-cache") && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j10 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j9 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z8 = true;
                        }
                        i9++;
                    } else {
                        return null;
                    }
                }
                i9 = 1;
            } else {
                z8 = false;
                j9 = 0;
                j10 = 0;
            }
            String str3 = (String) map.get("Expires");
            if (str3 != null) {
                j11 = zza(str3);
            } else {
                j11 = 0;
            }
            String str4 = (String) map.get("Last-Modified");
            if (str4 != null) {
                j12 = zza(str4);
            } else {
                j12 = 0;
            }
            String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
            if (i9 != 0) {
                j14 = currentTimeMillis + (j10 * 1000);
                if (z8) {
                    j15 = j14;
                } else {
                    j15 = (j9 * 1000) + j14;
                }
                j13 = j15;
            } else {
                j13 = 0;
                if (j7 > 0 && j11 >= j7) {
                    j14 = currentTimeMillis + (j11 - j7);
                    j13 = j14;
                } else {
                    j14 = 0;
                }
            }
            zzaqn zzaqnVar = new zzaqn();
            zzaqnVar.zza = zzaraVar.zzb;
            zzaqnVar.zzb = str5;
            zzaqnVar.zzf = j14;
            zzaqnVar.zze = j13;
            zzaqnVar.zzc = j7;
            zzaqnVar.zzd = j12;
            zzaqnVar.zzg = map;
            zzaqnVar.zzh = zzaraVar.zzd;
            return zzaqnVar;
        }
        return null;
    }

    public static String zzc(long j7) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j7));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
