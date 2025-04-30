package androidx.lifecycle;

import Q7.AbstractC0255x;
import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class K extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public Y7.a f4839g;

    /* renamed from: h, reason: collision with root package name */
    public F7.p f4840h;

    /* renamed from: i, reason: collision with root package name */
    public int f4841i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y7.a f4842j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F7.p f4843k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Y7.a aVar, F7.p pVar, w7.f fVar) {
        super(2, fVar);
        this.f4842j = aVar;
        this.f4843k = pVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new K(this.f4842j, this.f4843k, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((K) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [Y7.a] */
    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        F7.p pVar;
        Y7.d dVar;
        Y7.a aVar;
        Throwable th;
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f4841i;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        aVar = this.f4839g;
                        try {
                            AbstractC2712a.f(obj);
                            ((Y7.d) aVar).e(null);
                            return t7.y.f23029a;
                        } catch (Throwable th2) {
                            th = th2;
                            ((Y7.d) aVar).e(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = this.f4840h;
                ?? r32 = this.f4839g;
                AbstractC2712a.f(obj);
                dVar = r32;
            } else {
                AbstractC2712a.f(obj);
                Y7.a aVar2 = this.f4842j;
                this.f4839g = aVar2;
                pVar = this.f4843k;
                this.f4840h = pVar;
                this.f4841i = 1;
                dVar = (Y7.d) aVar2;
                if (dVar.d(this) == enumC2928a) {
                    return enumC2928a;
                }
            }
            J j7 = new J(pVar, null);
            this.f4839g = dVar;
            this.f4840h = null;
            this.f4841i = 2;
            if (AbstractC0255x.d(j7, this) == enumC2928a) {
                return enumC2928a;
            }
            aVar = dVar;
            ((Y7.d) aVar).e(null);
            return t7.y.f23029a;
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((Y7.d) aVar).e(null);
            throw th;
        }
    }
}
