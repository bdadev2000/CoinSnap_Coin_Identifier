package e0;

import java.util.List;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2203d extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f19963g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f19964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f19965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203d(List list, w7.f fVar) {
        super(2, fVar);
        this.f19965i = list;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        C2203d c2203d = new C2203d(this.f19965i, fVar);
        c2203d.f19964h = obj;
        return c2203d;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2203d) c((y) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f19963g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            y yVar = (y) this.f19964h;
            this.f19963g = 1;
            if (R3.e.l(this.f19965i, yVar, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return t7.y.f23029a;
    }
}
