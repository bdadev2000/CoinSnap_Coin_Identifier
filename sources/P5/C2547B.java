package p5;

import h0.C2312b;
import t7.AbstractC2712a;
import y7.AbstractC2960i;

/* renamed from: p5.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2547B extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f22248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f22249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2547B(String str, w7.f fVar) {
        super(2, fVar);
        this.f22249h = str;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        C2547B c2547b = new C2547B(this.f22249h, fVar);
        c2547b.f22248g = obj;
        return c2547b;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        C2547B c2547b = (C2547B) c((C2312b) obj, (w7.f) obj2);
        t7.y yVar = t7.y.f23029a;
        c2547b.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        C2312b c2312b = (C2312b) this.f22248g;
        c2312b.getClass();
        h0.f fVar = y.f22368a;
        G7.j.e(fVar, "key");
        c2312b.c(fVar, this.f22249h);
        return t7.y.f23029a;
    }
}
