package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.be;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface a7 {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f22699a;

        /* renamed from: b */
        public final be.a f22700b;

        /* renamed from: c */
        private final CopyOnWriteArrayList f22701c;

        /* renamed from: com.applovin.impl.a7$a$a */
        /* loaded from: classes.dex */
        public static final class C0072a {

            /* renamed from: a */
            public Handler f22702a;

            /* renamed from: b */
            public a7 f22703b;

            public C0072a(Handler handler, a7 a7Var) {
                this.f22702a = handler;
                this.f22703b = a7Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i2, be.a aVar) {
            this.f22701c = copyOnWriteArrayList;
            this.f22699a = i2;
            this.f22700b = aVar;
        }

        public void a(Handler handler, a7 a7Var) {
            b1.a(handler);
            b1.a(a7Var);
            this.f22701c.add(new C0072a(handler, a7Var));
        }

        public void b() {
            Iterator it = this.f22701c.iterator();
            while (it.hasNext()) {
                C0072a c0072a = (C0072a) it.next();
                xp.a(c0072a.f22702a, (Runnable) new js(this, c0072a.f22703b, 1));
            }
        }

        public void c() {
            Iterator it = this.f22701c.iterator();
            while (it.hasNext()) {
                C0072a c0072a = (C0072a) it.next();
                xp.a(c0072a.f22702a, (Runnable) new js(this, c0072a.f22703b, 2));
            }
        }

        public void d() {
            Iterator it = this.f22701c.iterator();
            while (it.hasNext()) {
                C0072a c0072a = (C0072a) it.next();
                xp.a(c0072a.f22702a, (Runnable) new js(this, c0072a.f22703b, 3));
            }
        }

        public void e(a7 a7Var) {
            Iterator it = this.f22701c.iterator();
            while (it.hasNext()) {
                C0072a c0072a = (C0072a) it.next();
                if (c0072a.f22703b == a7Var) {
                    this.f22701c.remove(c0072a);
                }
            }
        }

        public /* synthetic */ void b(a7 a7Var) {
            a7Var.a(this.f22699a, this.f22700b);
        }

        public /* synthetic */ void c(a7 a7Var) {
            a7Var.c(this.f22699a, this.f22700b);
        }

        public /* synthetic */ void d(a7 a7Var) {
            a7Var.b(this.f22699a, this.f22700b);
        }

        public void a() {
            Iterator it = this.f22701c.iterator();
            while (it.hasNext()) {
                C0072a c0072a = (C0072a) it.next();
                xp.a(c0072a.f22702a, (Runnable) new js(this, c0072a.f22703b, 0));
            }
        }

        public void a(int i2) {
            Iterator it = this.f22701c.iterator();
            while (it.hasNext()) {
                C0072a c0072a = (C0072a) it.next();
                xp.a(c0072a.f22702a, (Runnable) new gw(i2, this, c0072a.f22703b, 1));
            }
        }

        public void a(Exception exc) {
            Iterator it = this.f22701c.iterator();
            while (it.hasNext()) {
                C0072a c0072a = (C0072a) it.next();
                xp.a(c0072a.f22702a, (Runnable) new ks(this, 1, c0072a.f22703b, exc));
            }
        }

        public /* synthetic */ void a(a7 a7Var) {
            a7Var.d(this.f22699a, this.f22700b);
        }

        public /* synthetic */ void a(a7 a7Var, int i2) {
            a7Var.e(this.f22699a, this.f22700b);
            a7Var.a(this.f22699a, this.f22700b, i2);
        }

        public /* synthetic */ void a(a7 a7Var, Exception exc) {
            a7Var.a(this.f22699a, this.f22700b, exc);
        }

        public a a(int i2, be.a aVar) {
            return new a(this.f22701c, i2, aVar);
        }
    }

    void a(int i2, be.a aVar);

    void a(int i2, be.a aVar, int i3);

    void a(int i2, be.a aVar, Exception exc);

    void b(int i2, be.a aVar);

    void c(int i2, be.a aVar);

    void d(int i2, be.a aVar);

    default void e(int i2, be.a aVar) {
    }
}
