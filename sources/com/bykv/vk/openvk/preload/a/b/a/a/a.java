package com.bykv.vk.openvk.preload.a.b.a.a;

import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f12878a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date a(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.a.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean a(String str, int i9, char c9) {
        return i9 < str.length() && str.charAt(i9) == c9;
    }

    private static int a(String str, int i9, int i10) throws NumberFormatException {
        int i11;
        int i12;
        if (i9 < 0 || i10 > str.length() || i9 > i10) {
            throw new NumberFormatException(str);
        }
        if (i9 < i10) {
            i12 = i9 + 1;
            int digit = Character.digit(str.charAt(i9), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i9, i10));
            }
            i11 = -digit;
        } else {
            i11 = 0;
            i12 = i9;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i9, i10));
            }
            i11 = (i11 * 10) - digit2;
            i12 = i13;
        }
        return -i11;
    }

    private static int a(String str, int i9) {
        while (i9 < str.length()) {
            char charAt = str.charAt(i9);
            if (charAt < '0' || charAt > '9') {
                return i9;
            }
            i9++;
        }
        return str.length();
    }
}
