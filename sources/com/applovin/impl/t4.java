package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class t4 {
    private final com.applovin.impl.sdk.t a;

    /* renamed from: b */
    private final Handler f8133b;

    /* renamed from: c */
    private final Set f8134c = new HashSet();

    /* renamed from: d */
    private final AtomicInteger f8135d = new AtomicInteger();

    /* loaded from: classes.dex */
    public interface b {
        void a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class c {
        private final String a;

        /* renamed from: b */
        private final b f8136b;

        /* renamed from: c */
        private final long f8137c;

        private c(String str, long j3, b bVar) {
            this.a = str;
            this.f8137c = j3;
            this.f8136b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.a;
            String str2 = ((c) obj).a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.a + "', countdownStepMillis=" + this.f8137c + AbstractJsonLexerKt.END_OBJ;
        }

        public b a() {
            return this.f8136b;
        }

        public long b() {
            return this.f8137c;
        }

        public String c() {
            return this.a;
        }

        public /* synthetic */ c(String str, long j3, b bVar, a aVar) {
            this(str, j3, bVar);
        }
    }

    public t4(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler != null) {
            if (kVar != null) {
                this.f8133b = handler;
                this.a = kVar.L();
                return;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No handler specified.");
    }

    public static /* synthetic */ void a(t4 t4Var, c cVar, int i10) {
        t4Var.b(cVar, i10);
    }

    public /* synthetic */ void b(c cVar, int i10) {
        b a10 = cVar.a();
        if (a10.b()) {
            if (this.f8135d.get() == i10) {
                try {
                    a10.a();
                    a(cVar, i10);
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th2);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f8135d.incrementAndGet();
        this.f8133b.removeCallbacksAndMessages(null);
    }

    public void a(String str, long j3, b bVar) {
        if (j3 > 0) {
            if (this.f8133b != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    a4.j.v("Adding countdown: ", str, this.a, "CountdownManager");
                }
                this.f8134c.add(new c(str, j3, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    public void b() {
        HashSet hashSet = new HashSet(this.f8134c);
        if (com.applovin.impl.sdk.t.a()) {
            this.a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f8135d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + incrementAndGet + "...");
            }
            a(cVar, incrementAndGet);
        }
    }

    private void a(c cVar, int i10) {
        this.f8133b.postDelayed(new sv(this, cVar, i10, 0), cVar.b());
    }

    public void a() {
        if (com.applovin.impl.sdk.t.a()) {
            this.a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f8134c.clear();
    }
}
