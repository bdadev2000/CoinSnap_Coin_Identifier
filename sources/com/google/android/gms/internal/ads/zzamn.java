package com.google.android.gms.internal.ads;

import com.facebook.internal.security.CertificateUtil;

/* loaded from: classes2.dex */
public final class zzamn {
    public static float zza(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long zzb(String str) throws NumberFormatException {
        int i2 = zzeu.zza;
        String[] split = str.split("\\.", 2);
        long j2 = 0;
        for (String str2 : split[0].split(CertificateUtil.DELIMITER, -1)) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (split.length == 2) {
            j3 += Long.parseLong(split[1]);
        }
        return j3 * 1000;
    }
}
