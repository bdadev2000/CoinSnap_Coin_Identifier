package e0;

import t7.AbstractC2712a;
import y7.AbstractC2960i;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2205f extends AbstractC2960i implements F7.l {

    /* renamed from: g, reason: collision with root package name */
    public int f19970g;

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        int i9 = this.f19970g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
                return t7.y.f23029a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC2712a.f(obj);
        this.f19970g = 1;
        throw null;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        AbstractC2960i abstractC2960i = new AbstractC2960i(1, (w7.f) obj);
        t7.y yVar = t7.y.f23029a;
        abstractC2960i.i(yVar);
        return yVar;
    }
}
