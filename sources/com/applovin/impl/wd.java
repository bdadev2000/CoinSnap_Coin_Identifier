package com.applovin.impl;

import android.os.Handler;

/* loaded from: classes.dex */
public interface wd {

    /* loaded from: classes.dex */
    public static final class a extends td {
        public a(td tdVar) {
            super(tdVar);
        }

        public a b(Object obj) {
            return new a(super.a(obj));
        }

        public a(Object obj) {
            super(obj);
        }

        public a(Object obj, int i10, int i11, long j3) {
            super(obj, i10, i11, j3);
        }

        public a(Object obj, long j3, int i10) {
            super(obj, j3, i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(wd wdVar, go goVar);
    }

    od a();

    rd a(a aVar, n0 n0Var, long j3);

    void a(Handler handler, xd xdVar);

    void a(Handler handler, y6 y6Var);

    void a(rd rdVar);

    void a(b bVar);

    void a(b bVar, yo yoVar);

    void a(xd xdVar);

    void a(y6 y6Var);

    void b();

    void b(b bVar);

    void c(b bVar);

    default boolean c() {
        return true;
    }

    default go d() {
        return null;
    }
}
