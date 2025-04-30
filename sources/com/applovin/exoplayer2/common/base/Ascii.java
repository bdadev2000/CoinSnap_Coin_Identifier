package com.applovin.exoplayer2.common.base;

/* loaded from: classes.dex */
public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;
    public static final byte BS = 8;
    public static final byte CAN = 24;
    private static final char CASE_MASK = ' ';
    public static final byte CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = Byte.MAX_VALUE;
    public static final byte DLE = 16;
    public static final byte EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;
    public static final byte FF = 12;
    public static final byte FS = 28;
    public static final byte GS = 29;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;
    public static final byte NL = 10;
    public static final byte NUL = 0;
    public static final byte RS = 30;
    public static final byte SI = 15;
    public static final byte SO = 14;
    public static final byte SOH = 1;
    public static final byte SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;
    public static final byte US = 31;
    public static final byte VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private Ascii() {
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        int alphaIndex;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = charSequence.charAt(i9);
            char charAt2 = charSequence2.charAt(i9);
            if (charAt != charAt2 && ((alphaIndex = getAlphaIndex(charAt)) >= 26 || alphaIndex != getAlphaIndex(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int getAlphaIndex(char c9) {
        return (char) ((c9 | CASE_MASK) - 97);
    }

    public static boolean isLowerCase(char c9) {
        return c9 >= 'a' && c9 <= 'z';
    }

    public static boolean isUpperCase(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (isUpperCase(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (isUpperCase(c9)) {
                        charArray[i9] = (char) (c9 ^ CASE_MASK);
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (isLowerCase(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (isLowerCase(c9)) {
                        charArray[i9] = (char) (c9 ^ CASE_MASK);
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static String truncate(CharSequence charSequence, int i9, String str) {
        boolean z8;
        Preconditions.checkNotNull(charSequence);
        int length = i9 - str.length();
        if (length >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkArgument(z8, "maxLength (%s) must be >= length of the truncation indicator (%s)", i9, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i9) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i9) {
                return charSequence2;
            }
        }
        StringBuilder sb = new StringBuilder(i9);
        sb.append((CharSequence) str2, 0, length);
        sb.append(str);
        return sb.toString();
    }

    public static String toLowerCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toLowerCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i9 = 0; i9 < length; i9++) {
            cArr[i9] = toLowerCase(charSequence.charAt(i9));
        }
        return String.valueOf(cArr);
    }

    public static String toUpperCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toUpperCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i9 = 0; i9 < length; i9++) {
            cArr[i9] = toUpperCase(charSequence.charAt(i9));
        }
        return String.valueOf(cArr);
    }

    public static char toLowerCase(char c9) {
        return isUpperCase(c9) ? (char) (c9 ^ CASE_MASK) : c9;
    }

    public static char toUpperCase(char c9) {
        return isLowerCase(c9) ? (char) (c9 ^ CASE_MASK) : c9;
    }
}
