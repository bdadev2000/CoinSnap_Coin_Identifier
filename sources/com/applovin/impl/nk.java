package com.applovin.impl;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class nk {

    /* renamed from: c, reason: collision with root package name */
    private final p4 f9357c;
    private final SparseArray b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    private int f9356a = -1;

    public nk(p4 p4Var) {
        this.f9357c = p4Var;
    }

    public void a(int i9, Object obj) {
        if (this.f9356a == -1) {
            AbstractC0669a1.b(this.b.size() == 0);
            this.f9356a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray sparseArray = this.b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC0669a1.a(i9 >= keyAt);
            if (keyAt == i9) {
                p4 p4Var = this.f9357c;
                SparseArray sparseArray2 = this.b;
                p4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i9, obj);
    }

    public void b(int i9) {
        int i10 = 0;
        while (i10 < this.b.size() - 1) {
            int i11 = i10 + 1;
            if (i9 < this.b.keyAt(i11)) {
                return;
            }
            this.f9357c.accept(this.b.valueAt(i10));
            this.b.removeAt(i10);
            int i12 = this.f9356a;
            if (i12 > 0) {
                this.f9356a = i12 - 1;
            }
            i10 = i11;
        }
    }

    public Object c(int i9) {
        if (this.f9356a == -1) {
            this.f9356a = 0;
        }
        while (true) {
            int i10 = this.f9356a;
            if (i10 <= 0 || i9 >= this.b.keyAt(i10)) {
                break;
            }
            this.f9356a--;
        }
        while (this.f9356a < this.b.size() - 1 && i9 >= this.b.keyAt(this.f9356a + 1)) {
            this.f9356a++;
        }
        return this.b.valueAt(this.f9356a);
    }

    public Object b() {
        return this.b.valueAt(r0.size() - 1);
    }

    public boolean c() {
        return this.b.size() == 0;
    }

    public void a() {
        for (int i9 = 0; i9 < this.b.size(); i9++) {
            this.f9357c.accept(this.b.valueAt(i9));
        }
        this.f9356a = -1;
        this.b.clear();
    }

    public void a(int i9) {
        for (int size = this.b.size() - 1; size >= 0 && i9 < this.b.keyAt(size); size--) {
            this.f9357c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.f9356a = this.b.size() > 0 ? Math.min(this.f9356a, this.b.size() - 1) : -1;
    }
}
