package w;

import java.util.ArrayList;
import x.n;

/* loaded from: classes.dex */
public abstract class k extends e implements j {

    /* renamed from: q0, reason: collision with root package name */
    public e[] f26662q0 = new e[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f26663r0 = 0;

    public final void R(int i10, n nVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f26663r0; i11++) {
            e eVar = this.f26662q0[i11];
            ArrayList arrayList2 = nVar.a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i12 = 0; i12 < this.f26663r0; i12++) {
            com.bumptech.glide.d.l(this.f26662q0[i12], i10, arrayList, nVar);
        }
    }

    public void a() {
    }
}
