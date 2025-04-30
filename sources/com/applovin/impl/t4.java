package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a */
    private final com.applovin.impl.sdk.t f11287a;
    private final Handler b;

    /* renamed from: c */
    private final Set f11288c = new HashSet();

    /* renamed from: d */
    private final AtomicInteger f11289d = new AtomicInteger();

    /* loaded from: classes.dex */
    public interface b {
        void a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final String f11290a;
        private final b b;

        /* renamed from: c */
        private final long f11291c;

        private c(String str, long j7, b bVar) {
            this.f11290a = str;
            this.f11291c = j7;
            this.b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f11290a;
            String str2 = ((c) obj).f11290a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f11290a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f11290a + "', countdownStepMillis=" + this.f11291c + '}';
        }

        public b a() {
            return this.b;
        }

        public long b() {
            return this.f11291c;
        }

        public String c() {
            return this.f11290a;
        }

        public /* synthetic */ c(String str, long j7, b bVar, a aVar) {
            this(str, j7, bVar);
        }
    }

    public t4(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler != null) {
            if (kVar != null) {
                this.b = handler;
                this.f11287a = kVar.L();
                return;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No handler specified.");
    }

    public /* synthetic */ void b(c cVar, int i9) {
        b a6 = cVar.a();
        if (a6.b()) {
            if (this.f11289d.get() == i9) {
                try {
                    a6.a();
                    a(cVar, i9);
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f11287a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f11287a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f11287a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f11287a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f11289d.incrementAndGet();
        this.b.removeCallbacksAndMessages(null);
    }

    public void a(String str, long j7, b bVar) {
        if (j7 > 0) {
            if (this.b != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    Q7.n0.s("Adding countdown: ", str, this.f11287a, "CountdownManager");
                }
                this.f11288c.add(new c(str, j7, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    public void b() {
        HashSet hashSet = new HashSet(this.f11288c);
        if (com.applovin.impl.sdk.t.a()) {
            this.f11287a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f11289d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (com.applovin.impl.sdk.t.a()) {
                this.f11287a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + incrementAndGet + "...");
            }
            a(cVar, incrementAndGet);
        }
    }

    private void a(c cVar, int i9) {
        this.b.postDelayed(new I2(i9, this, cVar, 0), cVar.b());
    }

    public void a() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f11287a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f11288c.clear();
    }
}
