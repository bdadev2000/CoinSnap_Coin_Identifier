package G6;

import F7.p;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tools.arruler.models.ImageType;
import com.tools.arruler.models.InternalImageModel;
import java.util.ArrayList;
import p1.C2538b;
import t7.AbstractC2712a;
import t7.y;
import u6.t0;
import u7.AbstractC2816g;
import u7.AbstractC2817h;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class j extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f1310h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, w7.f fVar) {
        super(2, fVar);
        this.f1310h = nVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        j jVar = new j(this.f1310h, fVar);
        jVar.f1309g = obj;
        return jVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        j jVar = (j) c((N6.h) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        jVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        F6.e eVar;
        AbstractC2712a.f(obj);
        N6.h hVar = (N6.h) this.f1309g;
        n nVar = this.f1310h;
        nVar.h().f();
        if (nVar.h().f2119d.isEmpty()) {
            ConstraintLayout constraintLayout = ((t0) nVar.c()).f23415r;
            G7.j.d(constraintLayout, "layoutData");
            com.bumptech.glide.d.M(constraintLayout);
            ConstraintLayout constraintLayout2 = ((t0) nVar.c()).f23416s;
            G7.j.d(constraintLayout2, "layoutNoData");
            com.bumptech.glide.d.a0(constraintLayout2);
        } else if (!hVar.f2116a.isEmpty()) {
            ConstraintLayout constraintLayout3 = ((t0) nVar.c()).f23415r;
            G7.j.d(constraintLayout3, "layoutData");
            com.bumptech.glide.d.a0(constraintLayout3);
            ConstraintLayout constraintLayout4 = ((t0) nVar.c()).f23416s;
            G7.j.d(constraintLayout4, "layoutNoData");
            com.bumptech.glide.d.M(constraintLayout4);
            ArrayList arrayList = nVar.f1318f;
            arrayList.clear();
            int i9 = 0;
            for (Object obj2 : AbstractC2816g.R(new i(new C5.c(2), 0), hVar.f2116a)) {
                int i10 = i9 + 1;
                if (i9 >= 0) {
                    InternalImageModel internalImageModel = (InternalImageModel) obj2;
                    if (i9 > 0 && i9 % 3 == 0 && com.facebook.appevents.n.f13501e != null && !C2538b.a().m) {
                        arrayList.add(ImageType.ADS);
                    }
                    arrayList.add(internalImageModel);
                    i9 = i10;
                } else {
                    AbstractC2817h.D();
                    throw null;
                }
            }
            F6.e eVar2 = nVar.f1319g;
            if (eVar2 != null) {
                G7.j.e(arrayList, "images");
                ArrayList arrayList2 = eVar2.f1223j;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                eVar2.notifyDataSetChanged();
            }
            if (com.facebook.appevents.n.f13501e != null && !C2538b.a().m && (eVar = nVar.f1319g) != null) {
                eVar.m = com.facebook.appevents.n.f13501e;
                eVar.notifyDataSetChanged();
            }
        } else {
            ConstraintLayout constraintLayout5 = ((t0) nVar.c()).f23415r;
            G7.j.d(constraintLayout5, "layoutData");
            com.bumptech.glide.d.M(constraintLayout5);
            ConstraintLayout constraintLayout6 = ((t0) nVar.c()).f23416s;
            G7.j.d(constraintLayout6, "layoutNoData");
            com.bumptech.glide.d.a0(constraintLayout6);
        }
        return y.f23029a;
    }
}
