package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes3.dex */
public final class B extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final B f20116c = new b0(C.f20117a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        G7.j.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        A a6 = (A) obj;
        G7.j.e(a6, "builder");
        float n2 = aVar.n(this.b, i9);
        a6.b(a6.d() + 1);
        float[] fArr = a6.f20115a;
        int i10 = a6.b;
        a6.b = i10 + 1;
        fArr[i10] = n2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e8.A, java.lang.Object] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        G7.j.e(fArr, "<this>");
        ?? obj2 = new Object();
        obj2.f20115a = fArr;
        obj2.b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new float[0];
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        float[] fArr = (float[]) obj;
        G7.j.e(bVar, "encoder");
        G7.j.e(fArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.t(this.b, i10, fArr[i10]);
        }
    }
}
