package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgyo {
    public static byte[] zza(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 + i2;
            int digit = Character.digit(str.charAt(i3), 16);
            int digit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i2] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }
}
