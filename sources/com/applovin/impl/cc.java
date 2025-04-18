package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.z8;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class cc {
    private final j3 a;

    /* renamed from: b */
    private final ha f4086b;

    /* renamed from: c */
    private final b f4087c;

    /* renamed from: d */
    private final CopyOnWriteArraySet f4088d;

    /* renamed from: e */
    private final ArrayDeque f4089e;

    /* renamed from: f */
    private final ArrayDeque f4090f;

    /* renamed from: g */
    private boolean f4091g;

    /* loaded from: classes.dex */
    public interface a {
        void a(Object obj);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Object obj, z8 z8Var);
    }

    public cc(Looper looper, j3 j3Var, b bVar) {
        this(new CopyOnWriteArraySet(), looper, j3Var, bVar);
    }

    public void a(Object obj) {
        if (this.f4091g) {
            return;
        }
        a1.a(obj);
        this.f4088d.add(new c(obj));
    }

    private cc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, j3 j3Var, b bVar) {
        this.a = j3Var;
        this.f4088d = copyOnWriteArraySet;
        this.f4087c = bVar;
        this.f4089e = new ArrayDeque();
        this.f4090f = new ArrayDeque();
        this.f4086b = j3Var.a(looper, new Handler.Callback() { // from class: com.applovin.impl.jt
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean a10;
                a10 = cc.this.a(message);
                return a10;
            }
        });
    }

    public void b() {
        Iterator it = this.f4088d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f4087c);
        }
        this.f4088d.clear();
        this.f4091g = true;
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final Object a;

        /* renamed from: b */
        private z8.b f4092b = new z8.b();

        /* renamed from: c */
        private boolean f4093c;

        /* renamed from: d */
        private boolean f4094d;

        public c(Object obj) {
            this.a = obj;
        }

        public void a(int i10, a aVar) {
            if (this.f4094d) {
                return;
            }
            if (i10 != -1) {
                this.f4092b.a(i10);
            }
            this.f4093c = true;
            aVar.a(this.a);
        }

        public void b(b bVar) {
            this.f4094d = true;
            if (this.f4093c) {
                bVar.a(this.a, this.f4092b.a());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public void a(b bVar) {
            if (this.f4094d || !this.f4093c) {
                return;
            }
            z8 a = this.f4092b.a();
            this.f4092b = new z8.b();
            this.f4093c = false;
            bVar.a(this.a, a);
        }
    }

    public void a() {
        if (this.f4090f.isEmpty()) {
            return;
        }
        if (!this.f4086b.a(0)) {
            ha haVar = this.f4086b;
            haVar.a(haVar.d(0));
        }
        boolean z10 = !this.f4089e.isEmpty();
        this.f4089e.addAll(this.f4090f);
        this.f4090f.clear();
        if (z10) {
            return;
        }
        while (!this.f4089e.isEmpty()) {
            ((Runnable) this.f4089e.peekFirst()).run();
            this.f4089e.removeFirst();
        }
    }

    public void b(Object obj) {
        Iterator it = this.f4088d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a.equals(obj)) {
                cVar.b(this.f4087c);
                this.f4088d.remove(cVar);
            }
        }
    }

    public void b(int i10, a aVar) {
        a(i10, aVar);
        a();
    }

    public boolean a(Message message) {
        Iterator it = this.f4088d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(this.f4087c);
            if (this.f4086b.a(0)) {
                return true;
            }
        }
        return true;
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void a(int i10, a aVar) {
        this.f4090f.add(new sv(new CopyOnWriteArraySet(this.f4088d), i10, aVar));
    }

    public cc a(Looper looper, b bVar) {
        return new cc(this.f4088d, looper, this.a, bVar);
    }
}
