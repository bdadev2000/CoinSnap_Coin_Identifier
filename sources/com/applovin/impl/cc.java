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

    /* renamed from: a */
    private final j3 f7069a;
    private final ha b;

    /* renamed from: c */
    private final b f7070c;

    /* renamed from: d */
    private final CopyOnWriteArraySet f7071d;

    /* renamed from: e */
    private final ArrayDeque f7072e;

    /* renamed from: f */
    private final ArrayDeque f7073f;

    /* renamed from: g */
    private boolean f7074g;

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

    private cc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, j3 j3Var, b bVar) {
        this.f7069a = j3Var;
        this.f7071d = copyOnWriteArraySet;
        this.f7070c = bVar;
        this.f7072e = new ArrayDeque();
        this.f7073f = new ArrayDeque();
        this.b = j3Var.a(looper, new Handler.Callback() { // from class: com.applovin.impl.B0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean a6;
                a6 = cc.this.a(message);
                return a6;
            }
        });
    }

    public void a(Object obj) {
        if (this.f7074g) {
            return;
        }
        AbstractC0669a1.a(obj);
        this.f7071d.add(new c(obj));
    }

    public void b() {
        Iterator it = this.f7071d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f7070c);
        }
        this.f7071d.clear();
        this.f7074g = true;
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final Object f7075a;
        private z8.b b = new z8.b();

        /* renamed from: c */
        private boolean f7076c;

        /* renamed from: d */
        private boolean f7077d;

        public c(Object obj) {
            this.f7075a = obj;
        }

        public void a(int i9, a aVar) {
            if (this.f7077d) {
                return;
            }
            if (i9 != -1) {
                this.b.a(i9);
            }
            this.f7076c = true;
            aVar.a(this.f7075a);
        }

        public void b(b bVar) {
            this.f7077d = true;
            if (this.f7076c) {
                bVar.a(this.f7075a, this.b.a());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                return this.f7075a.equals(((c) obj).f7075a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7075a.hashCode();
        }

        public void a(b bVar) {
            if (this.f7077d || !this.f7076c) {
                return;
            }
            z8 a6 = this.b.a();
            this.b = new z8.b();
            this.f7076c = false;
            bVar.a(this.f7075a, a6);
        }
    }

    public void a() {
        if (this.f7073f.isEmpty()) {
            return;
        }
        if (!this.b.a(0)) {
            ha haVar = this.b;
            haVar.a(haVar.d(0));
        }
        boolean z8 = !this.f7072e.isEmpty();
        this.f7072e.addAll(this.f7073f);
        this.f7073f.clear();
        if (z8) {
            return;
        }
        while (!this.f7072e.isEmpty()) {
            ((Runnable) this.f7072e.peekFirst()).run();
            this.f7072e.removeFirst();
        }
    }

    public void b(Object obj) {
        Iterator it = this.f7071d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f7075a.equals(obj)) {
                cVar.b(this.f7070c);
                this.f7071d.remove(cVar);
            }
        }
    }

    public void b(int i9, a aVar) {
        a(i9, aVar);
        a();
    }

    public boolean a(Message message) {
        Iterator it = this.f7071d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(this.f7070c);
            if (this.b.a(0)) {
                return true;
            }
        }
        return true;
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i9, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i9, aVar);
        }
    }

    public void a(int i9, a aVar) {
        this.f7073f.add(new I2(new CopyOnWriteArraySet(this.f7071d), i9, aVar));
    }

    public cc a(Looper looper, b bVar) {
        return new cc(this.f7071d, looper, this.f7069a, bVar);
    }
}
