package w3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class y implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y f26722b = new y();

    /* renamed from: c, reason: collision with root package name */
    public static final d3.g f26723c = d3.g.z(com.mbridge.msdk.foundation.controller.a.a, "v", com.mbridge.msdk.foundation.same.report.i.a, "o");

    @Override // w3.e0
    public final Object f(x3.b bVar, float f10) {
        if (bVar.u() == 1) {
            bVar.d();
        }
        bVar.g();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (bVar.p()) {
            int w10 = bVar.w(f26723c);
            if (w10 != 0) {
                if (w10 != 1) {
                    if (w10 != 2) {
                        if (w10 != 3) {
                            bVar.x();
                            bVar.T();
                        } else {
                            arrayList3 = o.c(bVar, f10);
                        }
                    } else {
                        arrayList2 = o.c(bVar, f10);
                    }
                } else {
                    arrayList = o.c(bVar, f10);
                }
            } else {
                z10 = bVar.q();
            }
        }
        bVar.k();
        if (bVar.u() == 2) {
            bVar.j();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new t3.k(new PointF(), false, Collections.emptyList());
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = (PointF) arrayList.get(i10);
                int i11 = i10 - 1;
                arrayList4.add(new r3.a(y3.f.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), y3.f.a(pointF2, (PointF) arrayList2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i12 = size - 1;
                arrayList4.add(new r3.a(y3.f.a((PointF) arrayList.get(i12), (PointF) arrayList3.get(i12)), y3.f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new t3.k(pointF, z10, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
