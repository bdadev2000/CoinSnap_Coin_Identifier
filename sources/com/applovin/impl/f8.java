package com.applovin.impl;

import com.applovin.impl.wd;

/* loaded from: classes.dex */
public interface f8 extends to {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final po f7575a;
        public final int[] b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7576c;

        public a(po poVar, int... iArr) {
            this(poVar, iArr, 0);
        }

        public a(po poVar, int[] iArr, int i9) {
            this.f7575a = poVar;
            this.b = iArr;
            this.f7576c = i9;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        f8[] a(a[] aVarArr, InterfaceC0775x1 interfaceC0775x1, wd.a aVar, go goVar);
    }

    void a(float f9);

    default void a(boolean z8) {
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
