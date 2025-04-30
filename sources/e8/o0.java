package e8;

import com.applovin.sdk.AppLovinEventTypes;
import t7.C2727p;

/* loaded from: classes3.dex */
public final class o0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f20184c = new b0(p0.f20186a);

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        byte[] bArr = ((C2727p) obj).b;
        G7.j.e(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // e8.r, e8.AbstractC2226a
    public final void f(d8.a aVar, int i9, Object obj, boolean z8) {
        n0 n0Var = (n0) obj;
        G7.j.e(n0Var, "builder");
        byte y4 = aVar.g(this.b, i9).y();
        n0Var.b(n0Var.d() + 1);
        byte[] bArr = n0Var.f20182a;
        int i10 = n0Var.b;
        n0Var.b = i10 + 1;
        bArr[i10] = y4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e8.n0, java.lang.Object] */
    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        byte[] bArr = ((C2727p) obj).b;
        G7.j.e(bArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f20182a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // e8.b0
    public final Object j() {
        return new C2727p(new byte[0]);
    }

    @Override // e8.b0
    public final void k(d8.b bVar, Object obj, int i9) {
        byte[] bArr = ((C2727p) obj).b;
        G7.j.e(bVar, "encoder");
        G7.j.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        for (int i10 = 0; i10 < i9; i10++) {
            bVar.x(this.b, i10).j(bArr[i10]);
        }
    }
}
