package com.applovin.impl;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f12541a;

    private z8(SparseBooleanArray sparseBooleanArray) {
        this.f12541a = sparseBooleanArray;
    }

    public boolean a(int i9) {
        return this.f12541a.get(i9);
    }

    public int b(int i9) {
        AbstractC0669a1.a(i9, 0, a());
        return this.f12541a.keyAt(i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        if (yp.f12451a < 24) {
            if (a() != z8Var.a()) {
                return false;
            }
            for (int i9 = 0; i9 < a(); i9++) {
                if (b(i9) != z8Var.b(i9)) {
                    return false;
                }
            }
            return true;
        }
        return this.f12541a.equals(z8Var.f12541a);
    }

    public int hashCode() {
        if (yp.f12451a < 24) {
            int a6 = a();
            for (int i9 = 0; i9 < a(); i9++) {
                a6 = (a6 * 31) + b(i9);
            }
            return a6;
        }
        return this.f12541a.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f12542a = new SparseBooleanArray();
        private boolean b;

        public b a(int i9) {
            AbstractC0669a1.b(!this.b);
            this.f12542a.append(i9, true);
            return this;
        }

        public b a(z8 z8Var) {
            for (int i9 = 0; i9 < z8Var.a(); i9++) {
                a(z8Var.b(i9));
            }
            return this;
        }

        public b a(int... iArr) {
            for (int i9 : iArr) {
                a(i9);
            }
            return this;
        }

        public b a(int i9, boolean z8) {
            return z8 ? a(i9) : this;
        }

        public z8 a() {
            AbstractC0669a1.b(!this.b);
            this.b = true;
            return new z8(this.f12542a);
        }
    }

    public boolean a(int... iArr) {
        for (int i9 : iArr) {
            if (a(i9)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f12541a.size();
    }
}
