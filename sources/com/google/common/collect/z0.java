package com.google.common.collect;

import java.util.Objects;

/* loaded from: classes3.dex */
public class z0 extends j0 {
    public b1 A() {
        int i10 = this.f11979j;
        if (i10 != 0) {
            if (i10 != 1) {
                b1 i11 = b1.i(i10, this.f11978i);
                this.f11979j = i11.size();
                this.f11980k = true;
                return i11;
            }
            Object obj = this.f11978i[0];
            Objects.requireNonNull(obj);
            int i12 = b1.f11907d;
            return new d1(obj);
        }
        int i13 = b1.f11907d;
        return f2.f11947l;
    }

    @Override // va.b
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public z0 d(Object obj) {
        obj.getClass();
        u(obj);
        return this;
    }

    public z0 z(Object... objArr) {
        v(objArr);
        return this;
    }
}
