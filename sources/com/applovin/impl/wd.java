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

        public a(Object obj, int i9, int i10, long j7) {
            super(obj, i9, i10, j7);
        }

        public a(Object obj, long j7, int i9) {
            super(obj, j7, i9);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(wd wdVar, go goVar);
    }

    od a();

    rd a(a aVar, InterfaceC0727n0 interfaceC0727n0, long j7);

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
