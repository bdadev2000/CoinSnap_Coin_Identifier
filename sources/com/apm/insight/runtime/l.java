package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class l {
    private static Printer a;

    /* renamed from: b, reason: collision with root package name */
    private static l f3332b;

    /* renamed from: f, reason: collision with root package name */
    private static final Printer f3333f = new Printer() { // from class: com.apm.insight.runtime.l.1
        @Override // android.util.Printer
        public void println(String str) {
            if (str == null) {
                return;
            }
            if (str.charAt(0) == '>') {
                l.a().a(str);
            } else if (str.charAt(0) == '<') {
                l.a().b(str);
            }
            if (l.a == null || l.a == l.f3333f) {
                return;
            }
            l.a.println(str);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private long f3334c = -1;

    /* renamed from: d, reason: collision with root package name */
    private final List<Printer> f3335d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<Printer> f3336e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f3337g = false;

    private l() {
    }

    public static l a() {
        if (f3332b == null) {
            synchronized (l.class) {
                if (f3332b == null) {
                    f3332b = new l();
                }
            }
        }
        return f3332b;
    }

    public void b(String str) {
        this.f3334c = SystemClock.uptimeMillis();
        try {
            a(this.f3336e, str);
        } catch (Exception e2) {
            com.apm.insight.l.p.b((Throwable) e2);
        }
    }

    public void a(String str) {
        com.apm.insight.b.f.a(false);
        this.f3334c = -1L;
        try {
            a(this.f3335d, str);
        } catch (Exception e2) {
            com.apm.insight.l.p.a((Throwable) e2);
        }
    }

    public boolean b() {
        return this.f3334c != -1 && SystemClock.uptimeMillis() - this.f3334c > DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th2) {
            com.apm.insight.l.p.a(th2);
        }
    }
}
