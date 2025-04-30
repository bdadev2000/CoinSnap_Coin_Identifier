package e8;

import com.applovin.sdk.AppLovinEventTypes;

/* renamed from: e8.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2233h extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2233h f20166c = new b0(C2234i.f20168a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        G7.j.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        C2232g c2232g = (C2232g) obj;
        G7.j.e(c2232g, "builder");
        byte x9 = aVar.x(this.b, i9);
        c2232g.b(c2232g.d() + 1);
        byte[] bArr = c2232g.f20165a;
        int i10 = c2232g.b;
        c2232g.b = i10 + 1;
        bArr[i10] = x9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e8.g, java.lang.Object] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        G7.j.e(bArr, "<this>");
        ?? obj2 = new Object();
        obj2.f20165a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new byte[0];
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        byte[] bArr = (byte[]) obj;
        G7.j.e(bVar, "encoder");
        G7.j.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.n(this.b, i10, bArr[i10]);
        }
    }
}
