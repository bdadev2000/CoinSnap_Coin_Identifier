package com.applovin.impl;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class as {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f6783a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(yg ygVar) {
        String l = ygVar.l();
        return l != null && l.startsWith("WEBVTT");
    }

    public static long b(String str) {
        String[] b = yp.b(str, "\\.");
        long j7 = 0;
        for (String str2 : yp.a(b[0], ":")) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j9 = j7 * 1000;
        if (b.length == 2) {
            j9 += Long.parseLong(b[1]);
        }
        return j9 * 1000;
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void b(yg ygVar) {
        int d2 = ygVar.d();
        if (a(ygVar)) {
            return;
        }
        ygVar.f(d2);
        throw ah.a("Expected WEBVTT. Got " + ygVar.l(), null);
    }
}
