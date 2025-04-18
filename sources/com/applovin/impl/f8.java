package com.applovin.impl;

import com.applovin.impl.wd;

/* loaded from: classes.dex */
public interface f8 extends to {

    /* loaded from: classes.dex */
    public static final class a {
        public final po a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f4622b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4623c;

        public a(po poVar, int... iArr) {
            this(poVar, iArr, 0);
        }

        public a(po poVar, int[] iArr, int i10) {
            this.a = poVar;
            this.f4622b = iArr;
            this.f4623c = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        f8[] a(a[] aVarArr, x1 x1Var, wd.a aVar, go goVar);
    }

    void a(float f10);

    default void a(boolean z10) {
    }

    void f();

    d9 g();

    int h();

    void i();

    default void j() {
    }

    default void k() {
    }
}
