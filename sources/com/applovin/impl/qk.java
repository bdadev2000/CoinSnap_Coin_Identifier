package com.applovin.impl;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class qk {

    /* renamed from: c, reason: collision with root package name */
    private final r4 f26191c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f26190b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    private int f26189a = -1;

    public qk(r4 r4Var) {
        this.f26191c = r4Var;
    }

    public void a(int i2, Object obj) {
        if (this.f26189a == -1) {
            b1.b(this.f26190b.size() == 0);
            this.f26189a = 0;
        }
        if (this.f26190b.size() > 0) {
            SparseArray sparseArray = this.f26190b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            b1.a(i2 >= keyAt);
            if (keyAt == i2) {
                r4 r4Var = this.f26191c;
                SparseArray sparseArray2 = this.f26190b;
                r4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f26190b.append(i2, obj);
    }

    public void b(int i2) {
        int i3 = 0;
        while (i3 < this.f26190b.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.f26190b.keyAt(i4)) {
                return;
            }
            this.f26191c.accept(this.f26190b.valueAt(i3));
            this.f26190b.removeAt(i3);
            int i5 = this.f26189a;
            if (i5 > 0) {
                this.f26189a = i5 - 1;
            }
            i3 = i4;
        }
    }

    public Object c(int i2) {
        if (this.f26189a == -1) {
            this.f26189a = 0;
        }
        while (true) {
            int i3 = this.f26189a;
            if (i3 <= 0 || i2 >= this.f26190b.keyAt(i3)) {
                break;
            }
            this.f26189a--;
        }
        while (this.f26189a < this.f26190b.size() - 1 && i2 >= this.f26190b.keyAt(this.f26189a + 1)) {
            this.f26189a++;
        }
        return this.f26190b.valueAt(this.f26189a);
    }

    public Object b() {
        return this.f26190b.valueAt(r0.size() - 1);
    }

    public boolean c() {
        return this.f26190b.size() == 0;
    }

    public void a() {
        for (int i2 = 0; i2 < this.f26190b.size(); i2++) {
            this.f26191c.accept(this.f26190b.valueAt(i2));
        }
        this.f26189a = -1;
        this.f26190b.clear();
    }

    public void a(int i2) {
        for (int size = this.f26190b.size() - 1; size >= 0 && i2 < this.f26190b.keyAt(size); size--) {
            this.f26191c.accept(this.f26190b.valueAt(size));
            this.f26190b.removeAt(size);
        }
        this.f26189a = this.f26190b.size() > 0 ? Math.min(this.f26189a, this.f26190b.size() - 1) : -1;
    }
}
