package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzama {
    public static float zza(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long zzb(String str) throws NumberFormatException {
        int i10 = zzen.zza;
        String[] split = str.split("\\.", 2);
        long j3 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j3 = (j3 * 60) + Long.parseLong(str2);
        }
        long j10 = j3 * 1000;
        if (split.length == 2) {
            j10 += Long.parseLong(split[1]);
        }
        return j10 * 1000;
    }
}
