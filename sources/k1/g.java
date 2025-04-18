package k1;

import e1.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
public final class g extends r implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final g f30902b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f30903c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30904a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2) {
        super(2);
        this.f30904a = i2;
    }

    public final a b(x0.c cVar, List list) {
        switch (this.f30904a) {
            case 0:
                p0.a.s(cVar, "clazz");
                p0.a.s(list, "types");
                ArrayList y2 = t0.y(o1.b.f31207a, list, true);
                p0.a.p(y2);
                return t0.s(cVar, y2, new f(list, 0));
            default:
                p0.a.s(cVar, "clazz");
                p0.a.s(list, "types");
                ArrayList y3 = t0.y(o1.b.f31207a, list, true);
                p0.a.p(y3);
                a s2 = t0.s(cVar, y3, new f(list, 1));
                if (s2 != null) {
                    return t0.m(s2);
                }
                return null;
        }
    }

    @Override // q0.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30904a) {
            case 0:
                return b((x0.c) obj, (List) obj2);
            default:
                return b((x0.c) obj, (List) obj2);
        }
    }
}
