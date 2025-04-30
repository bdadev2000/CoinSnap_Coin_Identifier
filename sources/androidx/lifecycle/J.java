package androidx.lifecycle;

import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class J extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f4836g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4837h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F7.p f4838i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(F7.p pVar, w7.f fVar) {
        super(2, fVar);
        this.f4838i = pVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        J j7 = new J(this.f4838i, fVar);
        j7.f4837h = obj;
        return j7;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((J) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f4836g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            InterfaceC0253v interfaceC0253v = (InterfaceC0253v) this.f4837h;
            this.f4836g = 1;
            if (this.f4838i.g(interfaceC0253v, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return t7.y.f23029a;
    }
}
