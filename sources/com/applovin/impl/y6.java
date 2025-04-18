package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface y6 {

    /* loaded from: classes.dex */
    public static class a {
        public final int a;

        /* renamed from: b */
        public final wd.a f9138b;

        /* renamed from: c */
        private final CopyOnWriteArrayList f9139c;

        /* renamed from: com.applovin.impl.y6$a$a */
        /* loaded from: classes.dex */
        public static final class C0046a {
            public Handler a;

            /* renamed from: b */
            public y6 f9140b;

            public C0046a(Handler handler, y6 y6Var) {
                this.a = handler;
                this.f9140b = y6Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, wd.a aVar) {
            this.f9139c = copyOnWriteArrayList;
            this.a = i10;
            this.f9138b = aVar;
        }

        public void a(Handler handler, y6 y6Var) {
            a1.a(handler);
            a1.a(y6Var);
            this.f9139c.add(new C0046a(handler, y6Var));
        }

        public void b() {
            Iterator it = this.f9139c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.a, (Runnable) new jw(this, c0046a.f9140b, 1));
            }
        }

        public void c() {
            Iterator it = this.f9139c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.a, (Runnable) new jw(this, c0046a.f9140b, 0));
            }
        }

        public void d() {
            Iterator it = this.f9139c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.a, (Runnable) new jw(this, c0046a.f9140b, 3));
            }
        }

        public void e(y6 y6Var) {
            Iterator it = this.f9139c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                if (c0046a.f9140b == y6Var) {
                    this.f9139c.remove(c0046a);
                }
            }
        }

        public /* synthetic */ void b(y6 y6Var) {
            y6Var.a(this.a, this.f9138b);
        }

        public /* synthetic */ void c(y6 y6Var) {
            y6Var.c(this.a, this.f9138b);
        }

        public /* synthetic */ void d(y6 y6Var) {
            y6Var.b(this.a, this.f9138b);
        }

        public void a() {
            Iterator it = this.f9139c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.a, (Runnable) new jw(this, c0046a.f9140b, 2));
            }
        }

        public void a(int i10) {
            Iterator it = this.f9139c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.a, (Runnable) new sv(this, c0046a.f9140b, i10, 4));
            }
        }

        public void a(Exception exc) {
            Iterator it = this.f9139c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.a, (Runnable) new yv(14, this, c0046a.f9140b, exc));
            }
        }

        public /* synthetic */ void a(y6 y6Var) {
            y6Var.d(this.a, this.f9138b);
        }

        public /* synthetic */ void a(y6 y6Var, int i10) {
            y6Var.e(this.a, this.f9138b);
            y6Var.a(this.a, this.f9138b, i10);
        }

        public /* synthetic */ void a(y6 y6Var, Exception exc) {
            y6Var.a(this.a, this.f9138b, exc);
        }

        public a a(int i10, wd.a aVar) {
            return new a(this.f9139c, i10, aVar);
        }
    }

    void a(int i10, wd.a aVar);

    void a(int i10, wd.a aVar, int i11);

    void a(int i10, wd.a aVar, Exception exc);

    void b(int i10, wd.a aVar);

    void c(int i10, wd.a aVar);

    void d(int i10, wd.a aVar);

    default void e(int i10, wd.a aVar) {
    }
}
