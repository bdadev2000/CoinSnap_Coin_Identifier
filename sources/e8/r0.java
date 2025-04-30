package e8;

import com.applovin.sdk.AppLovinEventTypes;
import t7.C2729r;

/* loaded from: classes3.dex */
public final class r0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f20189c = new b0(s0.f20191a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        int[] iArr = ((C2729r) obj).b;
        G7.j.e(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        q0 q0Var = (q0) obj;
        G7.j.e(q0Var, "builder");
        int m = aVar.g(this.b, i9).m();
        q0Var.b(q0Var.d() + 1);
        int[] iArr = q0Var.f20187a;
        int i10 = q0Var.b;
        q0Var.b = i10 + 1;
        iArr[i10] = m;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e8.q0, java.lang.Object] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        int[] iArr = ((C2729r) obj).b;
        G7.j.e(iArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f20187a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new C2729r(new int[0]);
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        int[] iArr = ((C2729r) obj).b;
        G7.j.e(bVar, "encoder");
        G7.j.e(iArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.x(this.b, i10).y(iArr[i10]);
        }
    }
}
