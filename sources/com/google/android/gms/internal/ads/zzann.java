package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzann {
    private static final Pattern zza = Pattern.compile("^NOTE([ \t].*)?$");

    public static float zza(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long zzb(String str) throws NumberFormatException {
        int i9 = zzgd.zza;
        String[] split = str.split("\\.", 2);
        long j7 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j9 = j7 * 1000;
        if (split.length == 2) {
            j9 += Long.parseLong(split[1]);
        }
        return j9 * 1000;
    }
}
