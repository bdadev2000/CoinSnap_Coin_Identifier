package w3;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a {
    public static final d3.g a = d3.g.z(CampaignEx.JSON_KEY_AD_K, "x", "y");

    public static androidx.viewpager2.adapter.c a(x3.c cVar, m3.j jVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (cVar.u() == 1) {
            cVar.d();
            while (cVar.p()) {
                if (cVar.u() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new p3.m(jVar, p.b(cVar, jVar, y3.h.c(), e6.c.f17119f, z10, false)));
            }
            cVar.j();
            q.b(arrayList);
        } else {
            arrayList.add(new z3.a(o.b(cVar, y3.h.c())));
        }
        return new androidx.viewpager2.adapter.c(arrayList);
    }

    public static s3.d b(x3.c cVar, m3.j jVar) {
        cVar.g();
        androidx.viewpager2.adapter.c cVar2 = null;
        s3.a aVar = null;
        boolean z10 = false;
        s3.a aVar2 = null;
        while (cVar.u() != 4) {
            int w10 = cVar.w(a);
            if (w10 != 0) {
                if (w10 != 1) {
                    if (w10 != 2) {
                        cVar.x();
                        cVar.T();
                    } else if (cVar.u() == 6) {
                        cVar.T();
                        z10 = true;
                    } else {
                        aVar = com.facebook.internal.i.D(cVar, jVar, true);
                    }
                } else if (cVar.u() == 6) {
                    cVar.T();
                    z10 = true;
                } else {
                    aVar2 = com.facebook.internal.i.D(cVar, jVar, true);
                }
            } else {
                cVar2 = a(cVar, jVar);
            }
        }
        cVar.k();
        if (z10) {
            jVar.a("Lottie doesn't support expressions.");
        }
        if (cVar2 != null) {
            return cVar2;
        }
        return new s3.b(aVar2, aVar);
    }
}
