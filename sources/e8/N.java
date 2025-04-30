package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes3.dex */
public final class N extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final N f20130c = new b0(O.f20131a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        G7.j.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        M m = (M) obj;
        G7.j.e(m, "builder");
        long o3 = aVar.o(this.b, i9);
        m.b(m.d() + 1);
        long[] jArr = m.f20129a;
        int i10 = m.b;
        m.b = i10 + 1;
        jArr[i10] = o3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e8.M] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        G7.j.e(jArr, "<this>");
        ?? obj2 = new Object();
        obj2.f20129a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new long[0];
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        long[] jArr = (long[]) obj;
        G7.j.e(bVar, "encoder");
        G7.j.e(jArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.z(this.b, i10, jArr[i10]);
        }
    }
}
