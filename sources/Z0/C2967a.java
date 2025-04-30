package z0;

import F7.p;
import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import t7.y;
import w7.f;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2967a extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f24492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2968b f24493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.a f24494i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2967a(C2968b c2968b, B0.a aVar, f fVar) {
        super(2, fVar);
        this.f24493h = c2968b;
        this.f24494i = aVar;
    }

    @Override // y7.AbstractC2952a
    public final f c(Object obj, f fVar) {
        return new C2967a(this.f24493h, this.f24494i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2967a) c((InterfaceC0253v) obj, (f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f24492g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            B0.f fVar = this.f24493h.f24495a;
            this.f24492g = 1;
            obj = fVar.b(this.f24494i, this);
            if (obj == enumC2928a) {
                return enumC2928a;
            }
        }
        return obj;
    }
}
