package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes3.dex */
public final class i0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f20169c = new b0(j0.f20171a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        G7.j.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        h0 h0Var = (h0) obj;
        G7.j.e(h0Var, "builder");
        short q9 = aVar.q(this.b, i9);
        h0Var.b(h0Var.d() + 1);
        short[] sArr = h0Var.f20167a;
        int i10 = h0Var.b;
        h0Var.b = i10 + 1;
        sArr[i10] = q9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e8.h0] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        G7.j.e(sArr, "<this>");
        ?? obj2 = new Object();
        obj2.f20167a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new short[0];
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        short[] sArr = (short[]) obj;
        G7.j.e(bVar, "encoder");
        G7.j.e(sArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.w(this.b, i10, sArr[i10]);
        }
    }
}
