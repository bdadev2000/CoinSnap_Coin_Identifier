package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class j0 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public Object[] f11978i;

    /* renamed from: j, reason: collision with root package name */
    public int f11979j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11980k;

    public j0() {
        a6.k.j(4, "initialCapacity");
        this.f11978i = new Object[4];
        this.f11979j = 0;
    }

    public final void u(Object obj) {
        obj.getClass();
        x(this.f11979j + 1);
        Object[] objArr = this.f11978i;
        int i10 = this.f11979j;
        this.f11979j = i10 + 1;
        objArr[i10] = obj;
    }

    public final void v(Object... objArr) {
        int length = objArr.length;
        v8.u0.h(length, objArr);
        x(this.f11979j + length);
        System.arraycopy(objArr, 0, this.f11978i, this.f11979j, length);
        this.f11979j += length;
    }

    public final j0 w(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            x(list2.size() + this.f11979j);
            if (list2 instanceof k0) {
                this.f11979j = ((k0) list2).b(this.f11978i, this.f11979j);
                return this;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        return this;
    }

    public final void x(int i10) {
        Object[] objArr = this.f11978i;
        if (objArr.length < i10) {
            this.f11978i = Arrays.copyOf(objArr, va.b.k(objArr.length, i10));
            this.f11980k = false;
        } else if (this.f11980k) {
            this.f11978i = (Object[]) objArr.clone();
            this.f11980k = false;
        }
    }
}
