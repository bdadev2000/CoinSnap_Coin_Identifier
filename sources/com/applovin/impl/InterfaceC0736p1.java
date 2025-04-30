package com.applovin.impl;

import android.os.Handler;

/* renamed from: com.applovin.impl.p1 */
/* loaded from: classes.dex */
public interface InterfaceC0736p1 {

    /* renamed from: com.applovin.impl.p1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f9966a;
        private final InterfaceC0736p1 b;

        public a(Handler handler, InterfaceC0736p1 interfaceC0736p1) {
            Handler handler2;
            if (interfaceC0736p1 != null) {
                handler2 = (Handler) AbstractC0669a1.a(handler);
            } else {
                handler2 = null;
            }
            this.f9966a = handler2;
            this.b = interfaceC0736p1;
        }

        public /* synthetic */ void c(Exception exc) {
            ((InterfaceC0736p1) yp.a(this.b)).c(exc);
        }

        public /* synthetic */ void d(Exception exc) {
            ((InterfaceC0736p1) yp.a(this.b)).a(exc);
        }

        public void a(Exception exc) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new H1(this, exc, 0));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new H1(this, exc, 1));
            }
        }

        public /* synthetic */ void c(l5 l5Var) {
            l5Var.a();
            ((InterfaceC0736p1) yp.a(this.b)).c(l5Var);
        }

        public /* synthetic */ void d(l5 l5Var) {
            ((InterfaceC0736p1) yp.a(this.b)).a(l5Var);
        }

        public void a(String str, long j7, long j9) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new I1(this, str, j7, j9, 0));
            }
        }

        public void b(l5 l5Var) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new F1(this, l5Var, 1));
            }
        }

        public /* synthetic */ void b(String str, long j7, long j9) {
            ((InterfaceC0736p1) yp.a(this.b)).a(str, j7, j9);
        }

        public void a(String str) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new F(25, this, str));
            }
        }

        public /* synthetic */ void b(String str) {
            ((InterfaceC0736p1) yp.a(this.b)).b(str);
        }

        public void a(l5 l5Var) {
            l5Var.a();
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new F1(this, l5Var, 0));
            }
        }

        public /* synthetic */ void b(d9 d9Var, o5 o5Var) {
            ((InterfaceC0736p1) yp.a(this.b)).b(d9Var);
            ((InterfaceC0736p1) yp.a(this.b)).b(d9Var, o5Var);
        }

        public void a(d9 d9Var, o5 o5Var) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new O2(this, d9Var, o5Var, 10));
            }
        }

        public void b(long j7) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new G1(this, j7, 0));
            }
        }

        public /* synthetic */ void a(long j7) {
            ((InterfaceC0736p1) yp.a(this.b)).a(j7);
        }

        public void b(boolean z8) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new L3.l(3, this, z8));
            }
        }

        public /* synthetic */ void a(boolean z8) {
            ((InterfaceC0736p1) yp.a(this.b)).a(z8);
        }

        public /* synthetic */ void a(int i9, long j7, long j9) {
            ((InterfaceC0736p1) yp.a(this.b)).b(i9, j7, j9);
        }

        public void b(int i9, long j7, long j9) {
            Handler handler = this.f9966a;
            if (handler != null) {
                handler.post(new U2(this, i9, j7, j9, 1));
            }
        }
    }

    void a(long j7);

    void a(l5 l5Var);

    void a(Exception exc);

    void a(String str, long j7, long j9);

    void a(boolean z8);

    void b(int i9, long j7, long j9);

    default void b(d9 d9Var) {
    }

    void b(d9 d9Var, o5 o5Var);

    void b(String str);

    void c(l5 l5Var);

    void c(Exception exc);
}
