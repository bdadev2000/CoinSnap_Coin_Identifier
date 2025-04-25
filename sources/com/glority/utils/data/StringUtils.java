package com.glority.utils.data;

import com.glority.utils.UtilsApp;
import com.google.common.base.Ascii;

/* loaded from: classes9.dex */
public final class StringUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] BASE_64_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '+', '/'};

    public static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isTrimEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String upperFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return !Character.isLowerCase(str.charAt(0)) ? str : String.valueOf((char) (str.charAt(0) - ' ')) + str.substring(1);
    }

    public static String lowerFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return !Character.isUpperCase(str.charAt(0)) ? str : String.valueOf((char) (str.charAt(0) + ' ')) + str.substring(1);
    }

    public static String reverse(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        int i = length >> 1;
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < i; i2++) {
            char c = charArray[i2];
            int i3 = (length - i2) - 1;
            charArray[i2] = charArray[i3];
            charArray[i3] = c;
        }
        return new String(charArray);
    }

    public static String bytes2HexString(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return "";
        }
        char[] cArr = new char[length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public static byte[] hexString2Bytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static String long2Base64String(long j) {
        int i = 64;
        char[] cArr = new char[64];
        long j2 = 64 - 1;
        do {
            i--;
            cArr[i] = BASE_64_DIGITS[(int) (j & j2)];
            j >>>= 6;
        } while (j != 0);
        return new String(cArr, i, 64 - i);
    }

    public static long base64String2Long(String str) {
        long j = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            int i = 0;
            while (true) {
                char[] cArr = BASE_64_DIGITS;
                if (i < cArr.length) {
                    if (str.charAt(length) == cArr[i]) {
                        j += i << (((str.length() - 1) - length) * 6);
                    }
                    i++;
                }
            }
        }
        return j;
    }

    public static String getString(int i) {
        return UtilsApp.getApp().getResources().getString(i);
    }

    public static String getString(int i, Object... objArr) {
        return UtilsApp.getApp().getResources().getString(i, objArr);
    }

    public static CharSequence getText(int i) {
        return UtilsApp.getApp().getResources().getText(i);
    }

    public static CharSequence getQuantityText(int i, int i2) {
        return UtilsApp.getApp().getResources().getQuantityText(i, i2);
    }

    public static String getQuantityString(int i, int i2) {
        return UtilsApp.getApp().getResources().getQuantityString(i, i2);
    }

    public static String getQuantityString(int i, int i2, Object... objArr) {
        return UtilsApp.getApp().getResources().getQuantityString(i, i2, objArr);
    }

    public static CharSequence[] getTextArray(int i) {
        return UtilsApp.getApp().getResources().getTextArray(i);
    }

    public static String[] getStringArray(int i) {
        return UtilsApp.getApp().getResources().getStringArray(i);
    }

    private StringUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
