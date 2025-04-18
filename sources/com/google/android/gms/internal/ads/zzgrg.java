package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgrg {
    static {
        Charset.forName("UTF-8");
    }

    public static final zzgyx zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i2] = (byte) charAt;
        }
        return zzgyx.zzb(bArr);
    }

    public static final zzgyx zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt < '!' || charAt > '~') {
                throw new zzgrf("Not a printable ASCII character: " + charAt);
            }
            bArr[i2] = (byte) charAt;
        }
        return zzgyx.zzb(bArr);
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        return true;
    }
}
