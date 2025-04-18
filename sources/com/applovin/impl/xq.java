package com.applovin.impl;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public interface xq {

    /* loaded from: classes.dex */
    public static final class a {
        private final Handler a;

        /* renamed from: b */
        private final xq f9075b;

        public a(Handler handler, xq xqVar) {
            Handler handler2;
            if (xqVar != null) {
                handler2 = (Handler) a1.a(handler);
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.f9075b = xqVar;
        }

        public /* synthetic */ void c(l5 l5Var) {
            l5Var.a();
            ((xq) yp.a(this.f9075b)).b(l5Var);
        }

        public /* synthetic */ void d(l5 l5Var) {
            ((xq) yp.a(this.f9075b)).d(l5Var);
        }

        public void a(String str, long j3, long j10) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new su(this, str, j3, j10, 1));
            }
        }

        public void b(l5 l5Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new iw(this, l5Var, 0));
            }
        }

        public /* synthetic */ void b(String str, long j3, long j10) {
            ((xq) yp.a(this.f9075b)).b(str, j3, j10);
        }

        public void a(String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new zv(3, this, str));
            }
        }

        public /* synthetic */ void b(String str) {
            ((xq) yp.a(this.f9075b)).a(str);
        }

        public void a(l5 l5Var) {
            l5Var.a();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new iw(this, l5Var, 1));
            }
        }

        public /* synthetic */ void b(int i10, long j3) {
            ((xq) yp.a(this.f9075b)).a(i10, j3);
        }

        public /* synthetic */ void b(d9 d9Var, o5 o5Var) {
            ((xq) yp.a(this.f9075b)).a(d9Var);
            ((xq) yp.a(this.f9075b)).a(d9Var, o5Var);
        }

        public void a(int i10, long j3) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new hw(this, i10, j3));
            }
        }

        public void b(long j3, int i10) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new hw(this, j3, i10));
            }
        }

        public void a(d9 d9Var, o5 o5Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new yv(13, this, d9Var, o5Var));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new zv(5, this, exc));
            }
        }

        public /* synthetic */ void a(Object obj, long j3) {
            ((xq) yp.a(this.f9075b)).a(obj, j3);
        }

        public /* synthetic */ void a(long j3, int i10) {
            ((xq) yp.a(this.f9075b)).a(j3, i10);
        }

        public void b(yq yqVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new zv(4, this, yqVar));
            }
        }

        public /* synthetic */ void a(Exception exc) {
            ((xq) yp.a(this.f9075b)).b(exc);
        }

        public /* synthetic */ void a(yq yqVar) {
            ((xq) yp.a(this.f9075b)).a(yqVar);
        }

        public void a(Object obj) {
            if (this.a != null) {
                this.a.post(new iu(this, obj, SystemClock.elapsedRealtime(), 2));
            }
        }
    }

    void a(int i10, long j3);

    void a(long j3, int i10);

    default void a(d9 d9Var) {
    }

    void a(d9 d9Var, o5 o5Var);

    void a(yq yqVar);

    void a(Object obj, long j3);

    void a(String str);

    void b(l5 l5Var);

    void b(Exception exc);

    void b(String str, long j3, long j10);

    void d(l5 l5Var);
}
