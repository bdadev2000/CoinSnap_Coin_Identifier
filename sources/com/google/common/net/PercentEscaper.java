package com.google.common.net;

import com.applovin.impl.adview.t;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;
import org.objectweb.asm.signature.SignatureVisitor;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class PercentEscaper extends UnicodeEscaper {
    private static final char[] PLUS_SIGN = {SignatureVisitor.EXTENDS};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    public PercentEscaper(String str, boolean z2) {
        Preconditions.checkNotNull(str);
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z2 && concat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.plusForSpace = z2;
        this.safeOctets = createSafeOctets(concat);
    }

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int i2 = -1;
        for (char c2 : charArray) {
            i2 = Math.max((int) c2, i2);
        }
        boolean[] zArr = new boolean[i2 + 1];
        for (char c3 : charArray) {
            zArr[c3] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            boolean[] zArr = this.safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return escapeSlow(str, i2);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public int nextEscapeIndex(CharSequence charSequence, int i2, int i3) {
        Preconditions.checkNotNull(charSequence);
        while (i2 < i3) {
            char charAt = charSequence.charAt(i2);
            boolean[] zArr = this.safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i2++;
        }
        return i2;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public char[] escape(int i2) {
        boolean[] zArr = this.safeOctets;
        if (i2 < zArr.length && zArr[i2]) {
            return null;
        }
        if (i2 == 32 && this.plusForSpace) {
            return PLUS_SIGN;
        }
        if (i2 <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[i2 >>> 4], cArr[i2 & 15]};
        }
        if (i2 <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr2[(i2 >>> 10) | 12], cArr2[(i2 >>> 6) & 15], '%', cArr2[((i2 >>> 4) & 3) | 8], cArr2[i2 & 15]};
        }
        if (i2 <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'E', cArr3[i2 >>> 12], '%', cArr3[((i2 >>> 10) & 3) | 8], cArr3[(i2 >>> 6) & 15], '%', cArr3[((i2 >>> 4) & 3) | 8], cArr3[i2 & 15]};
        }
        if (i2 > 1114111) {
            throw new IllegalArgumentException(t.h(43, "Invalid unicode character value ", i2));
        }
        char[] cArr4 = UPPER_HEX_DIGITS;
        return new char[]{'%', 'F', cArr4[(i2 >>> 18) & 7], '%', cArr4[((i2 >>> 16) & 3) | 8], cArr4[(i2 >>> 12) & 15], '%', cArr4[((i2 >>> 10) & 3) | 8], cArr4[(i2 >>> 6) & 15], '%', cArr4[((i2 >>> 4) & 3) | 8], cArr4[i2 & 15]};
    }
}
