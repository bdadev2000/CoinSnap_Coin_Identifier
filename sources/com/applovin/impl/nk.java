package com.applovin.impl;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class nk {

    /* renamed from: c, reason: collision with root package name */
    private final p4 f6421c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f6420b = new SparseArray();
    private int a = -1;

    public nk(p4 p4Var) {
        this.f6421c = p4Var;
    }

    public void a(int i10, Object obj) {
        if (this.a == -1) {
            a1.b(this.f6420b.size() == 0);
            this.a = 0;
        }
        if (this.f6420b.size() > 0) {
            SparseArray sparseArray = this.f6420b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            a1.a(i10 >= keyAt);
            if (keyAt == i10) {
                p4 p4Var = this.f6421c;
                SparseArray sparseArray2 = this.f6420b;
                p4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f6420b.append(i10, obj);
    }

    public void b(int i10) {
        int i11 = 0;
        while (i11 < this.f6420b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f6420b.keyAt(i12)) {
                return;
            }
            this.f6421c.accept(this.f6420b.valueAt(i11));
            this.f6420b.removeAt(i11);
            int i13 = this.a;
            if (i13 > 0) {
                this.a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object c(int i10) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i11 = this.a;
            if (i11 <= 0 || i10 >= this.f6420b.keyAt(i11)) {
                break;
            }
            this.a--;
        }
        while (this.a < this.f6420b.size() - 1 && i10 >= this.f6420b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.f6420b.valueAt(this.a);
    }

    public Object b() {
        return this.f6420b.valueAt(r0.size() - 1);
    }

    public boolean c() {
        return this.f6420b.size() == 0;
    }

    public void a() {
        for (int i10 = 0; i10 < this.f6420b.size(); i10++) {
            this.f6421c.accept(this.f6420b.valueAt(i10));
        }
        this.a = -1;
        this.f6420b.clear();
    }

    public void a(int i10) {
        for (int size = this.f6420b.size() - 1; size >= 0 && i10 < this.f6420b.keyAt(size); size--) {
            this.f6421c.accept(this.f6420b.valueAt(size));
            this.f6420b.removeAt(size);
        }
        this.a = this.f6420b.size() > 0 ? Math.min(this.a, this.f6420b.size() - 1) : -1;
    }
}
