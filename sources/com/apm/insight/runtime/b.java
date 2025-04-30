package com.apm.insight.runtime;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static long f6021a = -30000;
    private static File b;

    public static String a(long j7, String str) {
        try {
            return com.apm.insight.l.i.c(new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/" + ((j7 - (j7 % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    private static File b() {
        if (b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            b = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) + "/" + com.apm.insight.i.f());
        }
        return b;
    }

    public static void a() {
        File file = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i9 = 0; i9 < list.length - 5; i9++) {
                com.apm.insight.l.i.a(new File(file, list[i9]));
            }
        }
    }

    public static void a(long j7) {
        if (j7 - f6021a < 30000) {
            return;
        }
        f6021a = j7;
        try {
            com.apm.insight.l.i.a(b(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }
}
