package com.applovin.exoplayer2.common.base;

import a4.j;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Strings {
    private Strings() {
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < min && charSequence.charAt(i10) == charSequence2.charAt(i10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (validSurrogatePairAt(charSequence, i11) || validSurrogatePairAt(charSequence2, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < min && charSequence.charAt((charSequence.length() - i10) - 1) == charSequence2.charAt((charSequence2.length() - i10) - 1)) {
            i10++;
        }
        if (validSurrogatePairAt(charSequence, (charSequence.length() - i10) - 1) || validSurrogatePairAt(charSequence2, (charSequence2.length() - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(charSequence.length() - i10, charSequence.length()).toString();
    }

    public static String lenientFormat(@NullableDecl String str, @NullableDecl Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i10 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i11 = 0; i11 < objArr.length; i11++) {
                objArr[i11] = lenientToString(objArr[i11]);
            }
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) valueOf, i12, indexOf);
            sb2.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) valueOf, i12, valueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2.toString();
    }

    private static String lenientToString(@NullableDecl Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e2) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.applovin.exoplayer2.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e2);
            StringBuilder o10 = j.o("<", str, " threw ");
            o10.append(e2.getClass().getName());
            o10.append(">");
            return o10.toString();
        }
    }

    public static String padEnd(String str, int i10, char c10) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        for (int length = str.length(); length < i10; length++) {
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public static String padStart(String str, int i10, char c10) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        for (int length = str.length(); length < i10; length++) {
            sb2.append(c10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String repeat(String str, int i10) {
        Preconditions.checkNotNull(str);
        boolean z10 = false;
        if (i10 <= 1) {
            if (i10 >= 0) {
                z10 = true;
            }
            Preconditions.checkArgument(z10, "invalid count: %s", i10);
            if (i10 == 0) {
                return "";
            }
            return str;
        }
        int length = str.length();
        long j3 = length * i10;
        int i11 = (int) j3;
        if (i11 == j3) {
            char[] cArr = new char[i11];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i12 = i11 - length;
                if (length < i12) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i12);
                    return new String(cArr);
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Required array size too large: ", j3));
        }
    }

    public static boolean validSurrogatePairAt(CharSequence charSequence, int i10) {
        if (i10 >= 0 && i10 <= charSequence.length() - 2 && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1))) {
            return true;
        }
        return false;
    }
}
