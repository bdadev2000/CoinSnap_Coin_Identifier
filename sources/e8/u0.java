package e8;

import com.applovin.sdk.AppLovinEventTypes;
import t7.C2731t;

/* loaded from: classes3.dex */
public final class u0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f20195c = new b0(v0.f20197a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        long[] jArr = ((C2731t) obj).b;
        G7.j.e(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        t0 t0Var = (t0) obj;
        G7.j.e(t0Var, "builder");
        long s5 = aVar.g(this.b, i9).s();
        t0Var.b(t0Var.d() + 1);
        long[] jArr = t0Var.f20193a;
        int i10 = t0Var.b;
        t0Var.b = i10 + 1;
        jArr[i10] = s5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e8.t0] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        long[] jArr = ((C2731t) obj).b;
        G7.j.e(jArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f20193a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new C2731t(new long[0]);
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        long[] jArr = ((C2731t) obj).b;
        G7.j.e(bVar, "encoder");
        G7.j.e(jArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.x(this.b, i10).B(jArr[i10]);
        }
    }
}
