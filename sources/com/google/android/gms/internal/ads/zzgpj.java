package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgpj {
    static {
        Charset.forName("UTF-8");
    }

    public static final zzgwu zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i10] = (byte) charAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
        }
        return zzgwu.zzb(bArr);
    }

    public static final zzgwu zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i10] = (byte) charAt;
            } else {
                throw new zzgpi("Not a printable ASCII character: " + charAt);
            }
        }
        return zzgwu.zzb(bArr);
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}
