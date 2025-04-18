package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i {
    private static volatile boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static Printer f3047b;

    /* renamed from: d, reason: collision with root package name */
    private static e f3049d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f3050e;

    /* renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f3048c = new CopyOnWriteArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f3051f = false;

    /* renamed from: g, reason: collision with root package name */
    private static long f3052g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static int f3053h = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j3);
    }

    public static void a() {
        if (a) {
            return;
        }
        a = true;
        f3047b = new Printer() { // from class: com.apm.insight.b.i.1
            @Override // android.util.Printer
            public void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean z10 = false;
                if (str.charAt(0) == '>') {
                    z10 = true;
                } else if (str.charAt(0) != '<') {
                    return;
                }
                i.a(z10, str);
            }
        };
        j.a();
        j.a(f3047b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f3048c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z10, String str) {
        e eVar;
        e eVar2;
        long nanoTime = System.nanoTime();
        e.a = nanoTime / 1000000;
        e.f2991b = SystemClock.currentThreadTimeMillis();
        if (z10 && (eVar2 = f3049d) != null && eVar2.a()) {
            f3049d.a(str);
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f3048c;
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            e eVar3 = copyOnWriteArrayList.get(i10);
            if (eVar3 != null && eVar3.a()) {
                boolean z11 = eVar3.f2992c;
                if (z10) {
                    if (!z11) {
                        eVar3.a(str);
                    }
                } else if (z11) {
                    eVar3.b(str);
                }
            } else if (!z10 && eVar3.f2992c) {
                eVar3.b("");
            }
        }
        if (!z10 && (eVar = f3049d) != null && eVar.a()) {
            f3049d.b("");
        }
        if (f3051f) {
            f3052g = (System.nanoTime() - nanoTime) + f3052g;
            int i11 = f3053h;
            f3053h = i11 + 1;
            if (i11 >= 1000) {
                if (f3050e != null) {
                    f3050e.a(f3052g);
                }
                f3053h = 0;
                f3052g = 0L;
                f3051f = false;
            }
        }
    }
}
