package r5;

import F7.p;
import Q7.InterfaceC0253v;
import T7.s;
import h0.C2312b;
import java.util.Collections;
import java.util.Map;
import t7.AbstractC2712a;
import t7.y;
import u7.AbstractC2829t;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: r5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2679k extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public n f22875g;

    /* renamed from: h, reason: collision with root package name */
    public int f22876h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f22877i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2679k(n nVar, w7.f fVar) {
        super(2, fVar);
        this.f22877i = nVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new C2679k(this.f22877i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2679k) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        n nVar;
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22876h;
        if (i9 != 0) {
            if (i9 == 1) {
                nVar = this.f22875g;
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            n nVar2 = this.f22877i;
            T7.b data = nVar2.f22890a.getData();
            this.f22875g = nVar2;
            this.f22876h = 1;
            Object d2 = s.d(data, this);
            if (d2 == enumC2928a) {
                return enumC2928a;
            }
            nVar = nVar2;
            obj = d2;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(((C2312b) obj).f20569a);
        G7.j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        n.a(nVar, new C2312b(AbstractC2829t.d0(unmodifiableMap), true));
        return y.f23029a;
    }
}
