package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f12032b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f12033c;

    public t0(u0 u0Var) {
        int i10 = ((e2) u0Var).f11939h;
        Object[] objArr = new Object[i10];
        Object[] objArr2 = new Object[i10];
        q2 it = u0Var.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i11] = entry.getKey();
            objArr2[i11] = entry.getValue();
            i11++;
        }
        this.f12032b = objArr;
        this.f12033c = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f12032b;
        boolean z10 = objArr instanceof b1;
        Object[] objArr2 = this.f12033c;
        if (!z10) {
            m9.s sVar = new m9.s(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                sVar.c(objArr[i10], objArr2[i10]);
            }
            return sVar.a();
        }
        b1 b1Var = (b1) objArr;
        m9.s sVar2 = new m9.s(b1Var.size());
        q2 it = b1Var.iterator();
        q2 it2 = ((k0) objArr2).iterator();
        while (it.hasNext()) {
            sVar2.c(it.next(), it2.next());
        }
        return sVar2.a();
    }
}
