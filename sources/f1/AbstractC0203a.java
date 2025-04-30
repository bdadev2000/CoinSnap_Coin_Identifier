package F1;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: F1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0203a {

    /* renamed from: a, reason: collision with root package name */
    public static final a7.b f1071a = a7.b.u(CampaignEx.JSON_KEY_AD_K, "x", "y");

    public static E1.c a(G1.d dVar, v1.i iVar) {
        boolean z8;
        ArrayList arrayList = new ArrayList();
        if (dVar.o() == 1) {
            dVar.a();
            while (dVar.j()) {
                if (dVar.o() == 3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                arrayList.add(new y1.l(iVar, p.b(dVar, iVar, H1.i.c(), f.f1079g, z8, false)));
            }
            dVar.c();
            q.b(arrayList);
        } else {
            arrayList.add(new I1.a(o.b(dVar, H1.i.c())));
        }
        return new E1.c(arrayList, 1);
    }

    public static B1.e b(G1.d dVar, v1.i iVar) {
        dVar.b();
        E1.c cVar = null;
        B1.b bVar = null;
        boolean z8 = false;
        B1.b bVar2 = null;
        while (dVar.o() != 4) {
            int q9 = dVar.q(f1071a);
            if (q9 != 0) {
                if (q9 != 1) {
                    if (q9 != 2) {
                        dVar.r();
                        dVar.s();
                    } else if (dVar.o() == 6) {
                        dVar.s();
                        z8 = true;
                    } else {
                        bVar = com.facebook.appevents.n.o(dVar, iVar, true);
                    }
                } else if (dVar.o() == 6) {
                    dVar.s();
                    z8 = true;
                } else {
                    bVar2 = com.facebook.appevents.n.o(dVar, iVar, true);
                }
            } else {
                cVar = a(dVar, iVar);
            }
        }
        dVar.h();
        if (z8) {
            iVar.a("Lottie doesn't support expressions.");
        }
        if (cVar != null) {
            return cVar;
        }
        return new B1.c(bVar2, bVar);
    }
}
