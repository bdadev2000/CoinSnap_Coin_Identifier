package com.applovin.impl;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public abstract class oa {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f9391a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j7, long j9) {
        if (j7 == 0 && j9 == -1) {
            return null;
        }
        StringBuilder a6 = AbstractC2933a.a("bytes=", j7, "-");
        if (j9 != -1) {
            a6.append((j7 + j9) - 1);
        }
        return a6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long a(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "HttpUtil"
            java.lang.String r3 = "]"
            if (r1 != 0) goto L25
            long r4 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L11
            goto L27
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r10)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.applovin.impl.kc.b(r2, r1)
        L25:
            r4 = -1
        L27:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L9a
            java.util.regex.Pattern r1 = com.applovin.impl.oa.f9391a
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r6 = r1.matches()
            if (r6 == 0) goto L9a
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.Object r6 = com.applovin.impl.AbstractC0669a1.a(r6)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L86
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L86
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.Object r1 = com.applovin.impl.AbstractC0669a1.a(r1)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L86
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L86
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L63
            r4 = r6
            goto L9a
        L63:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L86
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L86
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r10 = "] ["
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L86
            r1.append(r11)     // Catch: java.lang.NumberFormatException -> L86
            r1.append(r3)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r10 = r1.toString()     // Catch: java.lang.NumberFormatException -> L86
            com.applovin.impl.kc.d(r2, r10)     // Catch: java.lang.NumberFormatException -> L86
            long r4 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L86
            goto L9a
        L86:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected Content-Range ["
            r10.<init>(r0)
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.applovin.impl.kc.b(r2, r10)
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.oa.a(java.lang.String, java.lang.String):long");
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) AbstractC0669a1.a((Object) matcher.group(1)));
        }
        return -1L;
    }
}
