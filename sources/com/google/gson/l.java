package com.google.gson;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class l extends c0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f12106b;

    public /* synthetic */ l(c0 c0Var, int i10) {
        this.a = i10;
        this.f12106b = c0Var;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        int i10 = this.a;
        c0 c0Var = this.f12106b;
        switch (i10) {
            case 0:
                return new AtomicLong(((Number) c0Var.b(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.t()) {
                    arrayList.add(Long.valueOf(((Number) c0Var.b(aVar)).longValue()));
                }
                aVar.p();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicLongArray.set(i11, ((Long) arrayList.get(i11)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.b0() == 9) {
                    aVar.X();
                    return null;
                }
                return c0Var.b(aVar);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        int i10 = this.a;
        c0 c0Var = this.f12106b;
        switch (i10) {
            case 0:
                c0Var.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.g();
                int length = atomicLongArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    c0Var.c(bVar, Long.valueOf(atomicLongArray.get(i11)));
                }
                bVar.p();
                return;
            default:
                if (obj == null) {
                    bVar.t();
                    return;
                } else {
                    c0Var.c(bVar, obj);
                    return;
                }
        }
    }
}
