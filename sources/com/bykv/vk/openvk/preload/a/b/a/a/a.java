package com.bykv.vk.openvk.preload.a.b.a.a;

import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3 A[Catch: IllegalArgumentException -> 0x01a4, NumberFormatException -> 0x01a6, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01a8, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01a8, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x001a, B:8:0x0026, B:9:0x0028, B:11:0x0037, B:13:0x003d, B:18:0x0052, B:20:0x0062, B:21:0x0064, B:23:0x0070, B:24:0x0072, B:26:0x0078, B:30:0x0082, B:35:0x0092, B:37:0x009a, B:43:0x00cd, B:45:0x00d3, B:47:0x00da, B:48:0x016b, B:54:0x00e6, B:55:0x00fe, B:56:0x00ff, B:59:0x010e, B:61:0x011b, B:64:0x0124, B:66:0x0138, B:69:0x0147, B:70:0x0166, B:72:0x0169, B:73:0x010a, B:74:0x019c, B:75:0x01a3, B:76:0x00b2, B:77:0x00b5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019c A[Catch: IllegalArgumentException -> 0x01a4, NumberFormatException -> 0x01a6, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01a8, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01a8, blocks: (B:3:0x0006, B:5:0x0018, B:6:0x001a, B:8:0x0026, B:9:0x0028, B:11:0x0037, B:13:0x003d, B:18:0x0052, B:20:0x0062, B:21:0x0064, B:23:0x0070, B:24:0x0072, B:26:0x0078, B:30:0x0082, B:35:0x0092, B:37:0x009a, B:43:0x00cd, B:45:0x00d3, B:47:0x00da, B:48:0x016b, B:54:0x00e6, B:55:0x00fe, B:56:0x00ff, B:59:0x010e, B:61:0x011b, B:64:0x0124, B:66:0x0138, B:69:0x0147, B:70:0x0166, B:72:0x0169, B:73:0x010a, B:74:0x019c, B:75:0x01a3, B:76:0x00b2, B:77:0x00b5), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date a(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.a.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    private static int a(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -digit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - digit2;
            i13 = i14;
        }
        return -i12;
    }

    private static int a(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
