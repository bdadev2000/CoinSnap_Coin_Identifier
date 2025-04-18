package com.google.common.base;

import com.applovin.impl.adview.t;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Strings {
    private Strings() {
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i2 = 0;
        while (i2 < min && charSequence.charAt(i2) == charSequence2.charAt(i2)) {
            i2++;
        }
        int i3 = i2 - 1;
        if (validSurrogatePairAt(charSequence, i3) || validSurrogatePairAt(charSequence2, i3)) {
            i2--;
        }
        return charSequence.subSequence(0, i2).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i2 = 0;
        while (i2 < min && charSequence.charAt((charSequence.length() - i2) - 1) == charSequence2.charAt((charSequence2.length() - i2) - 1)) {
            i2++;
        }
        if (validSurrogatePairAt(charSequence, (charSequence.length() - i2) - 1) || validSurrogatePairAt(charSequence2, (charSequence2.length() - i2) - 1)) {
            i2--;
        }
        return charSequence.subSequence(charSequence.length() - i2, charSequence.length()).toString();
    }

    public static String emptyToNull(String str) {
        return Platform.emptyToNull(str);
    }

    public static boolean isNullOrEmpty(String str) {
        return Platform.stringIsNullOrEmpty(str);
    }

    public static String lenientFormat(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i2 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i3 = 0; i3 < objArr.length; i3++) {
                objArr[i3] = lenientToString(objArr[i3]);
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i4 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) valueOf, i4, indexOf);
            sb.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        sb.append((CharSequence) valueOf, i4, valueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String lenientToString(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(t.b(hexString, name.length() + 1));
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb2);
            logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder n2 = t.n(name2.length() + t.b(sb2, 9), "<", sb2, " threw ", name2);
            n2.append(">");
            return n2.toString();
        }
    }

    public static String nullToEmpty(String str) {
        return Platform.nullToEmpty(str);
    }

    public static String padEnd(String str, int i2, char c2) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i2) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        for (int length = str.length(); length < i2; length++) {
            sb.append(c2);
        }
        return sb.toString();
    }

    public static String padStart(String str, int i2, char c2) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i2) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i2);
        for (int length = str.length(); length < i2; length++) {
            sb.append(c2);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String repeat(String str, int i2) {
        Preconditions.checkNotNull(str);
        if (i2 <= 1) {
            Preconditions.checkArgument(i2 >= 0, "invalid count: %s", i2);
            return i2 == 0 ? "" : str;
        }
        int length = str.length();
        long j2 = length * i2;
        int i3 = (int) j2;
        if (i3 != j2) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Required array size too large: ");
            sb.append(j2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        char[] cArr = new char[i3];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i4 = i3 - length;
            if (length >= i4) {
                System.arraycopy(cArr, 0, cArr, length, i4);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @VisibleForTesting
    public static boolean validSurrogatePairAt(CharSequence charSequence, int i2) {
        return i2 >= 0 && i2 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i2)) && Character.isLowSurrogate(charSequence.charAt(i2 + 1));
    }
}
