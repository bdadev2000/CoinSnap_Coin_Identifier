package com.applovin.impl;

import com.applovin.impl.be;

/* loaded from: classes2.dex */
public interface h8 extends so {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final oo f24241a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f24242b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24243c;

        public a(oo ooVar, int... iArr) {
            this(ooVar, iArr, 0);
        }

        public a(oo ooVar, int[] iArr, int i2) {
            this.f24241a = ooVar;
            this.f24242b = iArr;
            this.f24243c = i2;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        h8[] a(a[] aVarArr, y1 y1Var, be.a aVar, fo foVar);
    }

    void a(float f2);

    default void a(boolean z2) {
    }

    void f();

    f9 g();

    int h();

    void i();

    default void j() {
    }

    default void k() {
    }
}
