package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f5725a;
    private static Printer b;

    /* renamed from: d, reason: collision with root package name */
    private static e f5727d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f5728e;

    /* renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f5726c = new CopyOnWriteArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f5729f = false;

    /* renamed from: g, reason: collision with root package name */
    private static long f5730g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static int f5731h = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j7);
    }

    public static void a() {
        if (f5725a) {
            return;
        }
        f5725a = true;
        b = new Printer() { // from class: com.apm.insight.b.i.1
            @Override // android.util.Printer
            public void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean z8 = false;
                if (str.charAt(0) == '>') {
                    z8 = true;
                } else if (str.charAt(0) != '<') {
                    return;
                }
                i.a(z8, str);
            }
        };
        j.a();
        j.a(b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f5726c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z8, String str) {
        e eVar;
        e eVar2;
        long nanoTime = System.nanoTime();
        e.f5669a = nanoTime / 1000000;
        e.b = SystemClock.currentThreadTimeMillis();
        if (z8 && (eVar2 = f5727d) != null && eVar2.a()) {
            f5727d.a(str);
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f5726c;
        for (int i9 = 0; i9 < copyOnWriteArrayList.size(); i9++) {
            e eVar3 = copyOnWriteArrayList.get(i9);
            if (eVar3 != null && eVar3.a()) {
                boolean z9 = eVar3.f5670c;
                if (z8) {
                    if (!z9) {
                        eVar3.a(str);
                    }
                } else if (z9) {
                    eVar3.b(str);
                }
            } else if (!z8 && eVar3.f5670c) {
                eVar3.b("");
            }
        }
        if (!z8 && (eVar = f5727d) != null && eVar.a()) {
            f5727d.b("");
        }
        if (f5729f) {
            f5730g = (System.nanoTime() - nanoTime) + f5730g;
            int i10 = f5731h;
            f5731h = i10 + 1;
            if (i10 >= 1000) {
                if (f5728e != null) {
                    f5728e.a(f5730g);
                }
                f5731h = 0;
                f5730g = 0L;
                f5729f = false;
            }
        }
    }
}
