package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class v4 {

    /* renamed from: a */
    private final com.applovin.impl.sdk.n f27454a;

    /* renamed from: b */
    private final Handler f27455b;

    /* renamed from: c */
    private final Set f27456c = new HashSet();
    private final AtomicInteger d = new AtomicInteger();

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        boolean b();
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        private final String f27457a;

        /* renamed from: b */
        private final b f27458b;

        /* renamed from: c */
        private final long f27459c;

        private c(String str, long j2, b bVar) {
            this.f27457a = str;
            this.f27459c = j2;
            this.f27458b = bVar;
        }

        public b a() {
            return this.f27458b;
        }

        public long b() {
            return this.f27459c;
        }

        public String c() {
            return this.f27457a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f27457a;
            String str2 = ((c) obj).f27457a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f27457a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f27457a + "', countdownStepMillis=" + this.f27459c + '}';
        }

        public /* synthetic */ c(String str, long j2, b bVar, a aVar) {
            this(str, j2, bVar);
        }
    }

    public v4(Handler handler, com.applovin.impl.sdk.j jVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f27455b = handler;
        this.f27454a = jVar.J();
    }

    public /* synthetic */ void b(c cVar, int i2) {
        b a2 = cVar.a();
        if (a2.b()) {
            if (this.d.get() == i2) {
                try {
                    a2.a();
                    a(cVar, i2);
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f27454a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f27454a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f27454a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f27454a.a("CountdownManager", "Stopping countdowns...");
        }
        this.d.incrementAndGet();
        this.f27455b.removeCallbacksAndMessages(null);
    }

    public void a(String str, long j2, b bVar) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.f27455b != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Adding countdown: ", str, this.f27454a, "CountdownManager");
            }
            this.f27456c.add(new c(str, j2, bVar));
            return;
        }
        throw new IllegalArgumentException("No handler specified.");
    }

    public void b() {
        HashSet hashSet = new HashSet(this.f27456c);
        if (com.applovin.impl.sdk.n.a()) {
            this.f27454a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (com.applovin.impl.sdk.n.a()) {
                this.f27454a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + incrementAndGet + "...");
            }
            a(cVar, incrementAndGet);
        }
    }

    private void a(c cVar, int i2) {
        this.f27455b.postDelayed(new gw(i2, this, cVar, 0), cVar.b());
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f27454a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f27456c.clear();
    }
}
