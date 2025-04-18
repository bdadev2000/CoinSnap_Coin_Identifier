package k1;

import e1.t0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class h extends r implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final h f30905b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f30906c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30907a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i2) {
        super(1);
        this.f30907a = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2 = this.f30907a;
        switch (i2) {
            case 0:
                x0.c cVar = (x0.c) obj;
                switch (i2) {
                    case 0:
                        p0.a.s(cVar, "it");
                        return t0.x(cVar);
                    default:
                        p0.a.s(cVar, "it");
                        a x = t0.x(cVar);
                        if (x != null) {
                            return t0.m(x);
                        }
                        return null;
                }
            default:
                x0.c cVar2 = (x0.c) obj;
                switch (i2) {
                    case 0:
                        p0.a.s(cVar2, "it");
                        return t0.x(cVar2);
                    default:
                        p0.a.s(cVar2, "it");
                        a x2 = t0.x(cVar2);
                        if (x2 != null) {
                            return t0.m(x2);
                        }
                        return null;
                }
        }
    }
}
