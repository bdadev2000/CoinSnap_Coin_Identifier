package F1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class y implements E {
    public static final y b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final a7.b f1114c = a7.b.u(com.mbridge.msdk.foundation.controller.a.f15376a, "v", com.mbridge.msdk.foundation.same.report.i.f15948a, "o");

    @Override // F1.E
    public final Object a(G1.c cVar, float f9) {
        if (cVar.o() == 1) {
            cVar.a();
        }
        cVar.b();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z8 = false;
        while (cVar.j()) {
            int q9 = cVar.q(f1114c);
            if (q9 != 0) {
                if (q9 != 1) {
                    if (q9 != 2) {
                        if (q9 != 3) {
                            cVar.r();
                            cVar.s();
                        } else {
                            arrayList3 = o.c(cVar, f9);
                        }
                    } else {
                        arrayList2 = o.c(cVar, f9);
                    }
                } else {
                    arrayList = o.c(cVar, f9);
                }
            } else {
                z8 = cVar.k();
            }
        }
        cVar.h();
        if (cVar.o() == 2) {
            cVar.c();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new C1.k(new PointF(), false, Collections.emptyList());
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i9 = 1; i9 < size; i9++) {
                PointF pointF2 = (PointF) arrayList.get(i9);
                int i10 = i9 - 1;
                arrayList4.add(new A1.a(H1.g.a((PointF) arrayList.get(i10), (PointF) arrayList3.get(i10)), H1.g.a(pointF2, (PointF) arrayList2.get(i9)), pointF2));
            }
            if (z8) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i11 = size - 1;
                arrayList4.add(new A1.a(H1.g.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), H1.g.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new C1.k(pointF, z8, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
