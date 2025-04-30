package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgra {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final zzgze zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i9] = (byte) charAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
        }
        return zzgze.zzb(bArr);
    }

    public static final zzgze zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i9] = (byte) charAt;
            } else {
                throw new zzgqz("Not a printable ASCII character: " + charAt);
            }
        }
        return zzgze.zzb(bArr);
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i9 = 0; i9 < bArr.length; i9++) {
            if (bArr2[i9] != bArr[i9]) {
                return false;
            }
        }
        return true;
    }
}
