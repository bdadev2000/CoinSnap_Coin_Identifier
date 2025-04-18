package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.b9;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class hc {

    /* renamed from: a */
    private final l3 f24296a;

    /* renamed from: b */
    private final ja f24297b;

    /* renamed from: c */
    private final b f24298c;
    private final CopyOnWriteArraySet d;
    private final ArrayDeque e;

    /* renamed from: f */
    private final ArrayDeque f24299f;

    /* renamed from: g */
    private boolean f24300g;

    /* loaded from: classes.dex */
    public interface a {
        void a(Object obj);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Object obj, b9 b9Var);
    }

    public hc(Looper looper, l3 l3Var, b bVar) {
        this(new CopyOnWriteArraySet(), looper, l3Var, bVar);
    }

    public void a(Object obj) {
        if (this.f24300g) {
            return;
        }
        b1.a(obj);
        this.d.add(new c(obj));
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final Object f24301a;

        /* renamed from: b */
        private b9.b f24302b = new b9.b();

        /* renamed from: c */
        private boolean f24303c;
        private boolean d;

        public c(Object obj) {
            this.f24301a = obj;
        }

        public void a(int i2, a aVar) {
            if (this.d) {
                return;
            }
            if (i2 != -1) {
                this.f24302b.a(i2);
            }
            this.f24303c = true;
            aVar.a(this.f24301a);
        }

        public void b(b bVar) {
            this.d = true;
            if (this.f24303c) {
                bVar.a(this.f24301a, this.f24302b.a());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f24301a.equals(((c) obj).f24301a);
        }

        public int hashCode() {
            return this.f24301a.hashCode();
        }

        public void a(b bVar) {
            if (this.d || !this.f24303c) {
                return;
            }
            b9 a2 = this.f24302b.a();
            this.f24302b = new b9.b();
            this.f24303c = false;
            bVar.a(this.f24301a, a2);
        }
    }

    private hc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, l3 l3Var, b bVar) {
        this.f24296a = l3Var;
        this.d = copyOnWriteArraySet;
        this.f24298c = bVar;
        this.e = new ArrayDeque();
        this.f24299f = new ArrayDeque();
        this.f24297b = l3Var.a(looper, new Handler.Callback() { // from class: com.applovin.impl.zt
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean a2;
                a2 = hc.this.a(message);
                return a2;
            }
        });
    }

    public void b() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f24298c);
        }
        this.d.clear();
        this.f24300g = true;
    }

    public void a() {
        if (this.f24299f.isEmpty()) {
            return;
        }
        if (!this.f24297b.a(0)) {
            ja jaVar = this.f24297b;
            jaVar.a(jaVar.d(0));
        }
        boolean z2 = !this.e.isEmpty();
        this.e.addAll(this.f24299f);
        this.f24299f.clear();
        if (z2) {
            return;
        }
        while (!this.e.isEmpty()) {
            ((Runnable) this.e.peekFirst()).run();
            this.e.removeFirst();
        }
    }

    public void b(Object obj) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f24301a.equals(obj)) {
                cVar.b(this.f24298c);
                this.d.remove(cVar);
            }
        }
    }

    public void b(int i2, a aVar) {
        a(i2, aVar);
        a();
    }

    public boolean a(Message message) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(this.f24298c);
            if (this.f24297b.a(0)) {
                return true;
            }
        }
        return true;
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i2, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i2, aVar);
        }
    }

    public void a(int i2, a aVar) {
        this.f24299f.add(new gw(new CopyOnWriteArraySet(this.d), i2, aVar));
    }

    public hc a(Looper looper, b bVar) {
        return new hc(this.d, looper, this.f24296a, bVar);
    }
}
