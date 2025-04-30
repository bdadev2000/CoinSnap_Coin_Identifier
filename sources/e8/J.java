package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes3.dex */
public final class J extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final J f20126c = new b0(K.f20127a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        G7.j.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        I i10 = (I) obj;
        G7.j.e(i10, "builder");
        int E8 = aVar.E(this.b, i9);
        i10.b(i10.d() + 1);
        int[] iArr = i10.f20125a;
        int i11 = i10.b;
        i10.b = i11 + 1;
        iArr[i11] = E8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e8.I, java.lang.Object] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        G7.j.e(iArr, "<this>");
        ?? obj2 = new Object();
        obj2.f20125a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new int[0];
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        int[] iArr = (int[]) obj;
        G7.j.e(bVar, "encoder");
        G7.j.e(iArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.C(i10, iArr[i10], this.b);
        }
    }
}
