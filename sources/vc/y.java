package vc;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class y extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.t()) {
            try {
                arrayList.add(Integer.valueOf(aVar.T()));
            } catch (NumberFormatException e2) {
                throw new com.google.gson.v(e2);
            }
        }
        aVar.p();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        bVar.g();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.U(r6.get(i10));
        }
        bVar.p();
    }
}
