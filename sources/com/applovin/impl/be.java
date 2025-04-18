package com.applovin.impl;

import android.os.Handler;

/* loaded from: classes2.dex */
public interface be {

    /* loaded from: classes2.dex */
    public static final class a extends yd {
        public a(yd ydVar) {
            super(ydVar);
        }

        public a b(Object obj) {
            return new a(super.a(obj));
        }

        public a(Object obj) {
            super(obj);
        }

        public a(Object obj, int i2, int i3, long j2) {
            super(obj, i2, i3, j2);
        }

        public a(Object obj, long j2, int i2) {
            super(obj, j2, i2);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(be beVar, fo foVar);
    }

    td a();

    wd a(a aVar, n0 n0Var, long j2);

    void a(Handler handler, a7 a7Var);

    void a(Handler handler, ce ceVar);

    void a(a7 a7Var);

    void a(b bVar);

    void a(b bVar, xo xoVar);

    void a(ce ceVar);

    void a(wd wdVar);

    void b();

    void b(b bVar);

    void c(b bVar);

    default boolean c() {
        return true;
    }

    default fo d() {
        return null;
    }
}
