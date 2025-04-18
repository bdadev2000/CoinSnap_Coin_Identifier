package com.applovin.impl;

import com.facebook.internal.security.CertificateUtil;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class zr {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f28390a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(bh bhVar) {
        String l2 = bhVar.l();
        return l2 != null && l2.startsWith("WEBVTT");
    }

    public static long b(String str) {
        String[] b2 = xp.b(str, "\\.");
        long j2 = 0;
        for (String str2 : xp.a(b2[0], CertificateUtil.DELIMITER)) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (b2.length == 2) {
            j3 += Long.parseLong(b2[1]);
        }
        return j3 * 1000;
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void b(bh bhVar) {
        int d = bhVar.d();
        if (a(bhVar)) {
            return;
        }
        bhVar.f(d);
        throw dh.a("Expected WEBVTT. Got " + bhVar.l(), null);
    }
}
