package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static Printer f6042a;
    private static l b;

    /* renamed from: f, reason: collision with root package name */
    private static final Printer f6043f = new Printer() { // from class: com.apm.insight.runtime.l.1
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
            if (l.f6042a == null || l.f6042a == l.f6043f) {
                return;
            }
            l.f6042a.println(str);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private long f6044c = -1;

    /* renamed from: d, reason: collision with root package name */
    private final List<Printer> f6045d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<Printer> f6046e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f6047g = false;

    private l() {
    }

    public static l a() {
        if (b == null) {
            synchronized (l.class) {
                try {
                    if (b == null) {
                        b = new l();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public void b(String str) {
        this.f6044c = SystemClock.uptimeMillis();
        try {
            a(this.f6046e, str);
        } catch (Exception e4) {
            com.apm.insight.l.q.b((Throwable) e4);
        }
    }

    public void a(String str) {
        com.apm.insight.b.f.a(false);
        this.f6044c = -1L;
        try {
            a(this.f6045d, str);
        } catch (Exception e4) {
            com.apm.insight.l.q.a((Throwable) e4);
        }
    }

    public boolean b() {
        return this.f6044c != -1 && SystemClock.uptimeMillis() - this.f6044c > DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                Printer printer = list.get(i9);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.l.q.a(th);
        }
    }
}
