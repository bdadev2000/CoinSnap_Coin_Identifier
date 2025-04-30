package B;

import C.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f250q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f251r0 = 0;

    public final void R(int i9, o oVar, ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f251r0; i10++) {
            d dVar = this.f250q0[i10];
            ArrayList arrayList2 = oVar.f373a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f251r0; i11++) {
            C.i.b(this.f250q0[i11], i9, arrayList, oVar);
        }
    }

    public void S() {
    }
}
