package com.applovin.impl;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class as {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(yg ygVar) {
        String l10 = ygVar.l();
        return l10 != null && l10.startsWith("WEBVTT");
    }

    public static long b(String str) {
        String[] b3 = yp.b(str, "\\.");
        long j3 = 0;
        for (String str2 : yp.a(b3[0], ":")) {
            j3 = (j3 * 60) + Long.parseLong(str2);
        }
        long j10 = j3 * 1000;
        if (b3.length == 2) {
            j10 += Long.parseLong(b3[1]);
        }
        return j10 * 1000;
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void b(yg ygVar) {
        int d10 = ygVar.d();
        if (a(ygVar)) {
            return;
        }
        ygVar.f(d10);
        throw ah.a("Expected WEBVTT. Got " + ygVar.l(), null);
    }
}
