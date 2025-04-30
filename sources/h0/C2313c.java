package h0;

import F7.p;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313c extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f20570g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f20571h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f20572i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2313c(p pVar, w7.f fVar) {
        super(2, fVar);
        this.f20572i = pVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        C2313c c2313c = new C2313c(this.f20572i, fVar);
        c2313c.f20571h = obj;
        return c2313c;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2313c) c((C2312b) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f20570g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            C2312b c2312b = (C2312b) this.f20571h;
            this.f20570g = 1;
            obj = this.f20572i.g(c2312b, this);
            if (obj == enumC2928a) {
                return enumC2928a;
            }
        }
        C2312b c2312b2 = (C2312b) obj;
        c2312b2.b.set(true);
        return c2312b2;
    }
}
