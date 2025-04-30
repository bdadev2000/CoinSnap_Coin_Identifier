package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes3.dex */
public final class x0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f20205c = new b0(y0.f20206a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        short[] sArr = ((t7.w) obj).b;
        G7.j.e(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        w0 w0Var = (w0) obj;
        G7.j.e(w0Var, "builder");
        short B5 = aVar.g(this.b, i9).B();
        w0Var.b(w0Var.d() + 1);
        short[] sArr = w0Var.f20202a;
        int i10 = w0Var.b;
        w0Var.b = i10 + 1;
        sArr[i10] = B5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e8.w0] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        short[] sArr = ((t7.w) obj).b;
        G7.j.e(sArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f20202a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new t7.w(new short[0]);
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        short[] sArr = ((t7.w) obj).b;
        G7.j.e(bVar, "encoder");
        G7.j.e(sArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.x(this.b, i10).i(sArr[i10]);
        }
    }
}
