package com.applovin.impl;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public interface xq {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f12293a;
        private final xq b;

        public a(Handler handler, xq xqVar) {
            Handler handler2;
            if (xqVar != null) {
                handler2 = (Handler) AbstractC0669a1.a(handler);
            } else {
                handler2 = null;
            }
            this.f12293a = handler2;
            this.b = xqVar;
        }

        public /* synthetic */ void c(l5 l5Var) {
            l5Var.a();
            ((xq) yp.a(this.b)).b(l5Var);
        }

        public /* synthetic */ void d(l5 l5Var) {
            ((xq) yp.a(this.b)).d(l5Var);
        }

        public void a(String str, long j7, long j9) {
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new I1(this, str, j7, j9, 1));
            }
        }

        public void b(l5 l5Var) {
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new Z2(this, l5Var, 1));
            }
        }

        public /* synthetic */ void b(String str, long j7, long j9) {
            ((xq) yp.a(this.b)).b(str, j7, j9);
        }

        public void a(String str) {
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new P2(4, this, str));
            }
        }

        public /* synthetic */ void b(String str) {
            ((xq) yp.a(this.b)).a(str);
        }

        public void a(l5 l5Var) {
            l5Var.a();
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new Z2(this, l5Var, 0));
            }
        }

        public /* synthetic */ void b(int i9, long j7) {
            ((xq) yp.a(this.b)).a(i9, j7);
        }

        public /* synthetic */ void b(d9 d9Var, o5 o5Var) {
            ((xq) yp.a(this.b)).a(d9Var);
            ((xq) yp.a(this.b)).a(d9Var, o5Var);
        }

        public void a(int i9, long j7) {
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new Y2(this, i9, j7));
            }
        }

        public void b(long j7, int i9) {
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new Y2(this, j7, i9));
            }
        }

        public void a(d9 d9Var, o5 o5Var) {
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new O2(this, d9Var, o5Var, 13));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new P2(3, this, exc));
            }
        }

        public /* synthetic */ void a(Object obj, long j7) {
            ((xq) yp.a(this.b)).a(obj, j7);
        }

        public /* synthetic */ void a(long j7, int i9) {
            ((xq) yp.a(this.b)).a(j7, i9);
        }

        public void b(yq yqVar) {
            Handler handler = this.f12293a;
            if (handler != null) {
                handler.post(new P2(5, this, yqVar));
            }
        }

        public /* synthetic */ void a(Exception exc) {
            ((xq) yp.a(this.b)).b(exc);
        }

        public /* synthetic */ void a(yq yqVar) {
            ((xq) yp.a(this.b)).a(yqVar);
        }

        public void a(Object obj) {
            if (this.f12293a != null) {
                this.f12293a.post(new E2.a(this, obj, SystemClock.elapsedRealtime(), 3));
            }
        }
    }

    void a(int i9, long j7);

    void a(long j7, int i9);

    default void a(d9 d9Var) {
    }

    void a(d9 d9Var, o5 o5Var);

    void a(yq yqVar);

    void a(Object obj, long j7);

    void a(String str);

    void b(l5 l5Var);

    void b(Exception exc);

    void b(String str, long j7, long j9);

    void d(l5 l5Var);
}
