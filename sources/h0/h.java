package h0;

import F7.p;
import java.util.Collections;
import java.util.Map;
import t7.AbstractC2712a;
import t7.y;
import u7.AbstractC2829t;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class h extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f20576g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f20577h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f20578i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, w7.f fVar) {
        super(2, fVar);
        this.f20578i = pVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        h hVar = new h(this.f20578i, fVar);
        hVar.f20577h = obj;
        return hVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((h) c((C2312b) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f20576g;
        if (i9 != 0) {
            if (i9 == 1) {
                C2312b c2312b = (C2312b) this.f20577h;
                AbstractC2712a.f(obj);
                return c2312b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC2712a.f(obj);
        Map unmodifiableMap = Collections.unmodifiableMap(((C2312b) this.f20577h).f20569a);
        G7.j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        C2312b c2312b2 = new C2312b(AbstractC2829t.d0(unmodifiableMap), false);
        this.f20577h = c2312b2;
        this.f20576g = 1;
        if (this.f20578i.g(c2312b2, this) == enumC2928a) {
            return enumC2928a;
        }
        return c2312b2;
    }
}
