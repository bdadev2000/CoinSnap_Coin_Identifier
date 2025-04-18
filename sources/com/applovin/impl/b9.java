package com.applovin.impl;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class b9 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f23029a;

    private b9(SparseBooleanArray sparseBooleanArray) {
        this.f23029a = sparseBooleanArray;
    }

    public boolean a(int i2) {
        return this.f23029a.get(i2);
    }

    public int b(int i2) {
        b1.a(i2, 0, a());
        return this.f23029a.keyAt(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        if (xp.f27962a >= 24) {
            return this.f23029a.equals(b9Var.f23029a);
        }
        if (a() != b9Var.a()) {
            return false;
        }
        for (int i2 = 0; i2 < a(); i2++) {
            if (b(i2) != b9Var.b(i2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (xp.f27962a >= 24) {
            return this.f23029a.hashCode();
        }
        int a2 = a();
        for (int i2 = 0; i2 < a(); i2++) {
            a2 = (a2 * 31) + b(i2);
        }
        return a2;
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f23030a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f23031b;

        public b a(int i2) {
            b1.b(!this.f23031b);
            this.f23030a.append(i2, true);
            return this;
        }

        public b a(b9 b9Var) {
            for (int i2 = 0; i2 < b9Var.a(); i2++) {
                a(b9Var.b(i2));
            }
            return this;
        }

        public b a(int... iArr) {
            for (int i2 : iArr) {
                a(i2);
            }
            return this;
        }

        public b a(int i2, boolean z2) {
            return z2 ? a(i2) : this;
        }

        public b9 a() {
            b1.b(!this.f23031b);
            this.f23031b = true;
            return new b9(this.f23030a);
        }
    }

    public boolean a(int... iArr) {
        for (int i2 : iArr) {
            if (a(i2)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f23029a.size();
    }
}
