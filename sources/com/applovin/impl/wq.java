package com.applovin.impl;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public interface wq {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f27782a;

        /* renamed from: b */
        private final wq f27783b;

        public a(Handler handler, wq wqVar) {
            this.f27782a = wqVar != null ? (Handler) b1.a(handler) : null;
            this.f27783b = wqVar;
        }

        public /* synthetic */ void c(n5 n5Var) {
            n5Var.a();
            ((wq) xp.a(this.f27783b)).b(n5Var);
        }

        public /* synthetic */ void d(n5 n5Var) {
            ((wq) xp.a(this.f27783b)).d(n5Var);
        }

        public void a(String str, long j2, long j3) {
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new su(this, str, j2, j3, 1));
            }
        }

        public void b(n5 n5Var) {
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new lw(this, n5Var, 0));
            }
        }

        public /* synthetic */ void b(String str, long j2, long j3) {
            ((wq) xp.a(this.f27783b)).b(str, j2, j3);
        }

        public void a(String str) {
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new kw(1, this, str));
            }
        }

        public void a(n5 n5Var) {
            n5Var.a();
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new lw(this, n5Var, 1));
            }
        }

        public /* synthetic */ void b(String str) {
            ((wq) xp.a(this.f27783b)).a(str);
        }

        public /* synthetic */ void b(int i2, long j2) {
            ((wq) xp.a(this.f27783b)).a(i2, j2);
        }

        public void a(int i2, long j2) {
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new mw(this, i2, j2));
            }
        }

        public /* synthetic */ void b(f9 f9Var, q5 q5Var) {
            ((wq) xp.a(this.f27783b)).a(f9Var);
            ((wq) xp.a(this.f27783b)).a(f9Var, q5Var);
        }

        public void a(f9 f9Var, q5 q5Var) {
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new ks(this, 14, f9Var, q5Var));
            }
        }

        public /* synthetic */ void a(Object obj, long j2) {
            ((wq) xp.a(this.f27783b)).a(obj, j2);
        }

        public /* synthetic */ void a(long j2, int i2) {
            ((wq) xp.a(this.f27783b)).a(j2, i2);
        }

        public void b(long j2, int i2) {
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new mw(this, j2, i2));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new kw(3, this, exc));
            }
        }

        public /* synthetic */ void a(Exception exc) {
            ((wq) xp.a(this.f27783b)).b(exc);
        }

        public void b(xq xqVar) {
            Handler handler = this.f27782a;
            if (handler != null) {
                handler.post(new kw(2, this, xqVar));
            }
        }

        public /* synthetic */ void a(xq xqVar) {
            ((wq) xp.a(this.f27783b)).a(xqVar);
        }

        public void a(Object obj) {
            if (this.f27782a != null) {
                this.f27782a.post(new aw(this, obj, SystemClock.elapsedRealtime(), 1));
            }
        }
    }

    void a(int i2, long j2);

    void a(long j2, int i2);

    default void a(f9 f9Var) {
    }

    void a(f9 f9Var, q5 q5Var);

    void a(xq xqVar);

    void a(Object obj, long j2);

    void a(String str);

    void b(n5 n5Var);

    void b(Exception exc);

    void b(String str, long j2, long j3);

    void d(n5 n5Var);
}
