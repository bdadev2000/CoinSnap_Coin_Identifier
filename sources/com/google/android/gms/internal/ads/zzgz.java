package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzgz {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(@Nullable String str, @Nullable String str2) {
        long j3 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j3 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                zzdt.zzc("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = zza.matcher(str2);
            if (matcher.matches()) {
                try {
                    String group = matcher.group(2);
                    group.getClass();
                    long parseLong = Long.parseLong(group);
                    String group2 = matcher.group(1);
                    group2.getClass();
                    long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                    if (j3 < 0) {
                        return parseLong2;
                    }
                    if (j3 != parseLong2) {
                        zzdt.zzf("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
                        return Math.max(j3, parseLong2);
                    }
                    return j3;
                } catch (NumberFormatException unused2) {
                    zzdt.zzc("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
                    return j3;
                }
            }
            return j3;
        }
        return j3;
    }

    public static long zzb(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = zzb.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                group.getClass();
                return Long.parseLong(group);
            }
            return -1L;
        }
        return -1L;
    }
}
