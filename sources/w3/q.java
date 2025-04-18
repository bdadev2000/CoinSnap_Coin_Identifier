package w3;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class q {
    public static final d3.g a = d3.g.z(CampaignEx.JSON_KEY_AD_K);

    public static ArrayList a(x3.b bVar, m3.j jVar, float f10, e0 e0Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (bVar.u() == 6) {
            jVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        bVar.g();
        while (bVar.p()) {
            if (bVar.w(a) != 0) {
                bVar.T();
            } else if (bVar.u() == 1) {
                bVar.d();
                if (bVar.u() == 7) {
                    arrayList.add(p.b(bVar, jVar, f10, e0Var, false, z10));
                } else {
                    while (bVar.p()) {
                        arrayList.add(p.b(bVar, jVar, f10, e0Var, true, z10));
                    }
                }
                bVar.j();
            } else {
                arrayList.add(p.b(bVar, jVar, f10, e0Var, false, z10));
            }
        }
        bVar.k();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        Object obj;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            z3.a aVar = (z3.a) arrayList.get(i11);
            i11++;
            z3.a aVar2 = (z3.a) arrayList.get(i11);
            aVar.f28478h = Float.valueOf(aVar2.f28477g);
            if (aVar.f28473c == null && (obj = aVar2.f28472b) != null) {
                aVar.f28473c = obj;
                if (aVar instanceof p3.m) {
                    ((p3.m) aVar).d();
                }
            }
        }
        z3.a aVar3 = (z3.a) arrayList.get(i10);
        if ((aVar3.f28472b == null || aVar3.f28473c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
