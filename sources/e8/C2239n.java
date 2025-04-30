package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* renamed from: e8.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2239n extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2239n f20181c = new b0(C2240o.f20183a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        G7.j.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        C2238m c2238m = (C2238m) obj;
        G7.j.e(c2238m, "builder");
        char k6 = aVar.k(this.b, i9);
        c2238m.b(c2238m.d() + 1);
        char[] cArr = c2238m.f20177a;
        int i10 = c2238m.b;
        c2238m.b = i10 + 1;
        cArr[i10] = k6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e8.m] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        G7.j.e(cArr, "<this>");
        ?? obj2 = new Object();
        obj2.f20177a = cArr;
        obj2.b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new char[0];
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        char[] cArr = (char[]) obj;
        G7.j.e(bVar, "encoder");
        G7.j.e(cArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.A(this.b, i10, cArr[i10]);
        }
    }
}
