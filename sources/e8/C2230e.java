package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* renamed from: e8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2230e extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2230e f20160c = new b0(C2231f.f20162a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        G7.j.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        C2229d c2229d = (C2229d) obj;
        G7.j.e(c2229d, "builder");
        boolean j7 = aVar.j(this.b, i9);
        c2229d.b(c2229d.d() + 1);
        boolean[] zArr = c2229d.f20158a;
        int i10 = c2229d.b;
        c2229d.b = i10 + 1;
        zArr[i10] = j7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e8.d, java.lang.Object] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        G7.j.e(zArr, "<this>");
        ?? obj2 = new Object();
        obj2.f20158a = zArr;
        obj2.b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new boolean[0];
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        boolean[] zArr = (boolean[]) obj;
        G7.j.e(bVar, "encoder");
        G7.j.e(zArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.v(this.b, i10, zArr[i10]);
        }
    }
}
