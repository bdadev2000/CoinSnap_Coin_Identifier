package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfxm {
    public static String zza(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (zze(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (zze(c9)) {
                        charArray[i9] = (char) (c9 ^ ' ');
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (zzd(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (zzd(c9)) {
                        charArray[i9] = (char) (c9 ^ ' ');
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static boolean zzc(CharSequence charSequence, CharSequence charSequence2) {
        int zzf;
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
            if (charAt != charAt2 && ((zzf = zzf(charAt)) >= 26 || zzf != zzf(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzd(char c9) {
        return c9 >= 'a' && c9 <= 'z';
    }

    public static boolean zze(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    private static int zzf(char c9) {
        return (char) ((c9 | ' ') - 97);
    }
}
