package com.applovin.impl;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class z8 {
    private final SparseBooleanArray a;

    private z8(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.a.get(i10);
    }

    public int b(int i10) {
        a1.a(i10, 0, a());
        return this.a.keyAt(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        if (yp.a < 24) {
            if (a() != z8Var.a()) {
                return false;
            }
            for (int i10 = 0; i10 < a(); i10++) {
                if (b(i10) != z8Var.b(i10)) {
                    return false;
                }
            }
            return true;
        }
        return this.a.equals(z8Var.a);
    }

    public int hashCode() {
        if (yp.a < 24) {
            int a10 = a();
            for (int i10 = 0; i10 < a(); i10++) {
                a10 = (a10 * 31) + b(i10);
            }
            return a10;
        }
        return this.a.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final SparseBooleanArray a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f9360b;

        public b a(int i10) {
            a1.b(!this.f9360b);
            this.a.append(i10, true);
            return this;
        }

        public b a(z8 z8Var) {
            for (int i10 = 0; i10 < z8Var.a(); i10++) {
                a(z8Var.b(i10));
            }
            return this;
        }

        public b a(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b a(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public z8 a() {
            a1.b(!this.f9360b);
            this.f9360b = true;
            return new z8(this.a);
        }
    }

    public boolean a(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.a.size();
    }
}
