package com.apm.insight.runtime;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b {
    private static long a = -30000;

    /* renamed from: b, reason: collision with root package name */
    private static File f3314b;

    public static String a(long j3, String str) {
        try {
            return com.apm.insight.l.h.c(new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/TrackInfo/" + ((j3 - (j3 % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) + "/" + str));
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    private static File b() {
        if (f3314b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            f3314b = new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) + "/" + com.apm.insight.i.f());
        }
        return f3314b;
    }

    public static void a() {
        File file = new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i10 = 0; i10 < list.length - 5; i10++) {
                com.apm.insight.l.h.a(new File(file, list[i10]));
            }
        }
    }

    public static void a(long j3) {
        if (j3 - a < 30000) {
            return;
        }
        a = j3;
        try {
            com.apm.insight.l.h.a(b(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }
}
