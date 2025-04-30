package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* renamed from: e8.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2244t extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2244t f20192c = new b0(C2245u.f20194a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        G7.j.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        C2243s c2243s = (C2243s) obj;
        G7.j.e(c2243s, "builder");
        double r9 = aVar.r(this.b, i9);
        c2243s.b(c2243s.d() + 1);
        double[] dArr = c2243s.f20190a;
        int i10 = c2243s.b;
        c2243s.b = i10 + 1;
        dArr[i10] = r9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e8.s, java.lang.Object] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        G7.j.e(dArr, "<this>");
        ?? obj2 = new Object();
        obj2.f20190a = dArr;
        obj2.b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new double[0];
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        double[] dArr = (double[]) obj;
        G7.j.e(bVar, "encoder");
        G7.j.e(dArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.e(this.b, i10, dArr[i10]);
        }
    }
}
