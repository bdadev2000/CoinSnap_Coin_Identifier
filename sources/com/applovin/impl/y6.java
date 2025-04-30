package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface y6 {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f12342a;
        public final wd.a b;

        /* renamed from: c */
        private final CopyOnWriteArrayList f12343c;

        /* renamed from: com.applovin.impl.y6$a$a */
        /* loaded from: classes.dex */
        public static final class C0046a {

            /* renamed from: a */
            public Handler f12344a;
            public y6 b;

            public C0046a(Handler handler, y6 y6Var) {
                this.f12344a = handler;
                this.b = y6Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i9, wd.a aVar) {
            this.f12343c = copyOnWriteArrayList;
            this.f12342a = i9;
            this.b = aVar;
        }

        public void a(Handler handler, y6 y6Var) {
            AbstractC0669a1.a(handler);
            AbstractC0669a1.a(y6Var);
            this.f12343c.add(new C0046a(handler, y6Var));
        }

        public void b() {
            Iterator it = this.f12343c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.f12344a, (Runnable) new A3(this, c0046a.b, 3));
            }
        }

        public void c() {
            Iterator it = this.f12343c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.f12344a, (Runnable) new A3(this, c0046a.b, 2));
            }
        }

        public void d() {
            Iterator it = this.f12343c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.f12344a, (Runnable) new A3(this, c0046a.b, 1));
            }
        }

        public void e(y6 y6Var) {
            Iterator it = this.f12343c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                if (c0046a.b == y6Var) {
                    this.f12343c.remove(c0046a);
                }
            }
        }

        public /* synthetic */ void b(y6 y6Var) {
            y6Var.a(this.f12342a, this.b);
        }

        public /* synthetic */ void c(y6 y6Var) {
            y6Var.c(this.f12342a, this.b);
        }

        public /* synthetic */ void d(y6 y6Var) {
            y6Var.b(this.f12342a, this.b);
        }

        public void a() {
            Iterator it = this.f12343c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.f12344a, (Runnable) new A3(this, c0046a.b, 0));
            }
        }

        public void a(int i9) {
            Iterator it = this.f12343c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.f12344a, (Runnable) new I2(i9, this, c0046a.b, 4));
            }
        }

        public void a(Exception exc) {
            Iterator it = this.f12343c.iterator();
            while (it.hasNext()) {
                C0046a c0046a = (C0046a) it.next();
                yp.a(c0046a.f12344a, (Runnable) new O2(this, c0046a.b, exc, 14));
            }
        }

        public /* synthetic */ void a(y6 y6Var) {
            y6Var.d(this.f12342a, this.b);
        }

        public /* synthetic */ void a(y6 y6Var, int i9) {
            y6Var.e(this.f12342a, this.b);
            y6Var.a(this.f12342a, this.b, i9);
        }

        public /* synthetic */ void a(y6 y6Var, Exception exc) {
            y6Var.a(this.f12342a, this.b, exc);
        }

        public a a(int i9, wd.a aVar) {
            return new a(this.f12343c, i9, aVar);
        }
    }

    void a(int i9, wd.a aVar);

    void a(int i9, wd.a aVar, int i10);

    void a(int i9, wd.a aVar, Exception exc);

    void b(int i9, wd.a aVar);

    void c(int i9, wd.a aVar);

    void d(int i9, wd.a aVar);

    default void e(int i9, wd.a aVar) {
    }
}
