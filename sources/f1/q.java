package F1;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final a7.b f1103a = a7.b.u(CampaignEx.JSON_KEY_AD_K);

    public static ArrayList a(G1.c cVar, v1.i iVar, float f9, E e4, boolean z8) {
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == 6) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.b();
        while (cVar.j()) {
            if (cVar.q(f1103a) != 0) {
                cVar.s();
            } else if (cVar.o() == 1) {
                cVar.a();
                if (cVar.o() == 7) {
                    arrayList.add(p.b(cVar, iVar, f9, e4, false, z8));
                } else {
                    while (cVar.j()) {
                        arrayList.add(p.b(cVar, iVar, f9, e4, true, z8));
                    }
                }
                cVar.c();
            } else {
                arrayList.add(p.b(cVar, iVar, f9, e4, false, z8));
            }
        }
        cVar.h();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i9;
        Object obj;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i9 = size - 1;
            if (i10 >= i9) {
                break;
            }
            I1.a aVar = (I1.a) arrayList.get(i10);
            i10++;
            I1.a aVar2 = (I1.a) arrayList.get(i10);
            aVar.f1414h = Float.valueOf(aVar2.f1413g);
            if (aVar.f1409c == null && (obj = aVar2.b) != null) {
                aVar.f1409c = obj;
                if (aVar instanceof y1.l) {
                    ((y1.l) aVar).d();
                }
            }
        }
        I1.a aVar3 = (I1.a) arrayList.get(i9);
        if ((aVar3.b == null || aVar3.f1409c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
