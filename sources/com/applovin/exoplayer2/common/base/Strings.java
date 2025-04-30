package com.applovin.exoplayer2.common.base;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Strings {
    private Strings() {
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i9 = 0;
        while (i9 < min && charSequence.charAt(i9) == charSequence2.charAt(i9)) {
            i9++;
        }
        int i10 = i9 - 1;
        if (validSurrogatePairAt(charSequence, i10) || validSurrogatePairAt(charSequence2, i10)) {
            i9--;
        }
        return charSequence.subSequence(0, i9).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i9 = 0;
        while (i9 < min && charSequence.charAt((charSequence.length() - i9) - 1) == charSequence2.charAt((charSequence2.length() - i9) - 1)) {
            i9++;
        }
        if (validSurrogatePairAt(charSequence, (charSequence.length() - i9) - 1) || validSurrogatePairAt(charSequence2, (charSequence2.length() - i9) - 1)) {
            i9--;
        }
        return charSequence.subSequence(charSequence.length() - i9, charSequence.length()).toString();
    }

    public static String lenientFormat(@NullableDecl String str, @NullableDecl Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i9 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i10 = 0; i10 < objArr.length; i10++) {
                objArr[i10] = lenientToString(objArr[i10]);
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i11 = 0;
        while (i9 < objArr.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb.append((CharSequence) valueOf, i11, indexOf);
            sb.append(objArr[i9]);
            i11 = indexOf + 2;
            i9++;
        }
        sb.append((CharSequence) valueOf, i11, valueOf.length());
        if (i9 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb.append(", ");
                sb.append(objArr[i12]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String lenientToString(@NullableDecl Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e4) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.applovin.exoplayer2.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e4);
            StringBuilder n2 = o.n("<", str, " threw ");
            n2.append(e4.getClass().getName());
            n2.append(">");
            return n2.toString();
        }
    }

    public static String padEnd(String str, int i9, char c9) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i9) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i9);
        sb.append(str);
        for (int length = str.length(); length < i9; length++) {
            sb.append(c9);
        }
        return sb.toString();
    }

    public static String padStart(String str, int i9, char c9) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i9) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i9);
        for (int length = str.length(); length < i9; length++) {
            sb.append(c9);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String repeat(String str, int i9) {
        Preconditions.checkNotNull(str);
        boolean z8 = false;
        if (i9 <= 1) {
            if (i9 >= 0) {
                z8 = true;
            }
            Preconditions.checkArgument(z8, "invalid count: %s", i9);
            if (i9 == 0) {
                return "";
            }
            return str;
        }
        int length = str.length();
        long j7 = length * i9;
        int i10 = (int) j7;
        if (i10 == j7) {
            char[] cArr = new char[i10];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i11 = i10 - length;
                if (length < i11) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i11);
                    return new String(cArr);
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(n0.g(j7, "Required array size too large: "));
        }
    }

    public static boolean validSurrogatePairAt(CharSequence charSequence, int i9) {
        if (i9 >= 0 && i9 <= charSequence.length() - 2 && Character.isHighSurrogate(charSequence.charAt(i9)) && Character.isLowSurrogate(charSequence.charAt(i9 + 1))) {
            return true;
        }
        return false;
    }
}
