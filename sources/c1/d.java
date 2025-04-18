package c1;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
public final class d extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, Object obj, Object obj2) {
        super(1);
        this.f22406a = i2;
        this.f22407b = obj;
        this.f22408c = obj2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        b0 b0Var = b0.f30125a;
        Object obj2 = this.f22407b;
        Object obj3 = this.f22408c;
        int i2 = this.f22406a;
        switch (i2) {
            case 0:
                switch (i2) {
                    case 0:
                        ((e) obj2).f22409c.removeCallbacks((Runnable) obj3);
                        return b0Var;
                    default:
                        ((i1.d) obj2).f(obj3);
                        return b0Var;
                }
            default:
                switch (i2) {
                    case 0:
                        ((e) obj2).f22409c.removeCallbacks((Runnable) obj3);
                        return b0Var;
                    default:
                        ((i1.d) obj2).f(obj3);
                        return b0Var;
                }
        }
    }
}
