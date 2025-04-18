package com.applovin.impl;

import android.os.Handler;

/* loaded from: classes.dex */
public interface q1 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f26152a;

        /* renamed from: b */
        private final q1 f26153b;

        public a(Handler handler, q1 q1Var) {
            this.f26152a = q1Var != null ? (Handler) b1.a(handler) : null;
            this.f26153b = q1Var;
        }

        public /* synthetic */ void c(Exception exc) {
            ((q1) xp.a(this.f26153b)).c(exc);
        }

        public /* synthetic */ void d(Exception exc) {
            ((q1) xp.a(this.f26153b)).a(exc);
        }

        public void a(Exception exc) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new tu(this, exc, 0));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new tu(this, exc, 1));
            }
        }

        public /* synthetic */ void c(n5 n5Var) {
            n5Var.a();
            ((q1) xp.a(this.f26153b)).c(n5Var);
        }

        public /* synthetic */ void d(n5 n5Var) {
            ((q1) xp.a(this.f26153b)).a(n5Var);
        }

        public void a(String str, long j2, long j3) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new su(this, str, j2, j3, 0));
            }
        }

        public void b(n5 n5Var) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new vu(this, n5Var, 1));
            }
        }

        public /* synthetic */ void b(String str, long j2, long j3) {
            ((q1) xp.a(this.f26153b)).a(str, j2, j3);
        }

        public void a(String str) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new ms(21, this, str));
            }
        }

        public void a(n5 n5Var) {
            n5Var.a();
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new vu(this, n5Var, 0));
            }
        }

        public /* synthetic */ void b(String str) {
            ((q1) xp.a(this.f26153b)).b(str);
        }

        public /* synthetic */ void b(f9 f9Var, q5 q5Var) {
            ((q1) xp.a(this.f26153b)).b(f9Var);
            ((q1) xp.a(this.f26153b)).b(f9Var, q5Var);
        }

        public void a(f9 f9Var, q5 q5Var) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new ks(this, 12, f9Var, q5Var));
            }
        }

        public /* synthetic */ void a(long j2) {
            ((q1) xp.a(this.f26153b)).a(j2);
        }

        public /* synthetic */ void a(boolean z2) {
            ((q1) xp.a(this.f26153b)).a(z2);
        }

        public void b(long j2) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new uu(this, j2, 0));
            }
        }

        public /* synthetic */ void a(int i2, long j2, long j3) {
            ((q1) xp.a(this.f26153b)).b(i2, j2, j3);
        }

        public void b(boolean z2) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new wu(0, this, z2));
            }
        }

        public void b(int i2, long j2, long j3) {
            Handler handler = this.f26152a;
            if (handler != null) {
                handler.post(new qw(this, i2, j2, j3, 1));
            }
        }
    }

    void a(long j2);

    void a(n5 n5Var);

    void a(Exception exc);

    void a(String str, long j2, long j3);

    void a(boolean z2);

    void b(int i2, long j2, long j3);

    default void b(f9 f9Var) {
    }

    void b(f9 f9Var, q5 q5Var);

    void b(String str);

    void c(n5 n5Var);

    void c(Exception exc);
}
