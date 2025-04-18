package i1;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class b extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f30816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f30817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i2) {
        super(1);
        this.f30815a = i2;
        this.f30816b = dVar;
        this.f30817c = cVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        b0 b0Var = b0.f30125a;
        c cVar = this.f30817c;
        d dVar = this.f30816b;
        int i2 = this.f30815a;
        switch (i2) {
            case 0:
                switch (i2) {
                    case 0:
                        dVar.f(cVar.f30819b);
                        return b0Var;
                    default:
                        d.f30821h.set(dVar, cVar.f30819b);
                        dVar.f(cVar.f30819b);
                        return b0Var;
                }
            default:
                switch (i2) {
                    case 0:
                        dVar.f(cVar.f30819b);
                        return b0Var;
                    default:
                        d.f30821h.set(dVar, cVar.f30819b);
                        dVar.f(cVar.f30819b);
                        return b0Var;
                }
        }
    }
}
