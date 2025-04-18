package com.applovin.impl;

import android.os.Handler;

/* loaded from: classes.dex */
public interface p1 {

    /* loaded from: classes.dex */
    public static final class a {
        private final Handler a;

        /* renamed from: b */
        private final p1 f6896b;

        public a(Handler handler, p1 p1Var) {
            Handler handler2;
            if (p1Var != null) {
                handler2 = (Handler) a1.a(handler);
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.f6896b = p1Var;
        }

        public /* synthetic */ void c(Exception exc) {
            ((p1) yp.a(this.f6896b)).c(exc);
        }

        public /* synthetic */ void d(Exception exc) {
            ((p1) yp.a(this.f6896b)).a(exc);
        }

        public void a(Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new pu(this, exc, 0));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new pu(this, exc, 1));
            }
        }

        public /* synthetic */ void c(l5 l5Var) {
            l5Var.a();
            ((p1) yp.a(this.f6896b)).c(l5Var);
        }

        public /* synthetic */ void d(l5 l5Var) {
            ((p1) yp.a(this.f6896b)).a(l5Var);
        }

        public void a(String str, long j3, long j10) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new su(this, str, j3, j10, 0));
            }
        }

        public void b(l5 l5Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new ru(this, l5Var, 0));
            }
        }

        public /* synthetic */ void b(String str, long j3, long j10) {
            ((p1) yp.a(this.f6896b)).a(str, j3, j10);
        }

        public void a(String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new rs(25, this, str));
            }
        }

        public /* synthetic */ void b(String str) {
            ((p1) yp.a(this.f6896b)).b(str);
        }

        public void a(l5 l5Var) {
            l5Var.a();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new ru(this, l5Var, 1));
            }
        }

        public /* synthetic */ void b(d9 d9Var, o5 o5Var) {
            ((p1) yp.a(this.f6896b)).b(d9Var);
            ((p1) yp.a(this.f6896b)).b(d9Var, o5Var);
        }

        public void a(d9 d9Var, o5 o5Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new yv(10, this, d9Var, o5Var));
            }
        }

        public void b(long j3) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new qu(this, j3, 0));
            }
        }

        public /* synthetic */ void a(long j3) {
            ((p1) yp.a(this.f6896b)).a(j3);
        }

        public void b(boolean z10) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new nu(1, this, z10));
            }
        }

        public /* synthetic */ void a(boolean z10) {
            ((p1) yp.a(this.f6896b)).a(z10);
        }

        public /* synthetic */ void a(int i10, long j3, long j10) {
            ((p1) yp.a(this.f6896b)).b(i10, j3, j10);
        }

        public void b(int i10, long j3, long j10) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new dw(this, i10, j3, j10, 1));
            }
        }
    }

    void a(long j3);

    void a(l5 l5Var);

    void a(Exception exc);

    void a(String str, long j3, long j10);

    void a(boolean z10);

    void b(int i10, long j3, long j10);

    default void b(d9 d9Var) {
    }

    void b(d9 d9Var, o5 o5Var);

    void b(String str);

    void c(l5 l5Var);

    void c(Exception exc);
}
