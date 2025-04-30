package U7;

import Q7.C0252u;
import Q7.InterfaceC0241i;
import Q7.U;
import Q7.d0;
import com.facebook.internal.H;
import java.util.List;
import t7.y;

/* loaded from: classes3.dex */
public final class u extends G7.k implements F7.p {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i9) {
        super(2);
        this.b = i9;
        this.f3386c = obj;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        int i9;
        switch (this.b) {
            case 0:
                int intValue = ((Number) obj).intValue();
                w7.i iVar = (w7.i) obj2;
                w7.j key = iVar.getKey();
                w7.i h6 = ((r) this.f3386c).f3380g.h(key);
                if (key != C0252u.f2584c) {
                    if (iVar != h6) {
                        i9 = Integer.MIN_VALUE;
                    } else {
                        i9 = intValue + 1;
                    }
                    return Integer.valueOf(i9);
                }
                U u8 = (U) h6;
                U u9 = (U) iVar;
                while (true) {
                    if (u9 == null) {
                        u9 = null;
                    } else if (u9 != u8 && (u9 instanceof V7.t)) {
                        InterfaceC0241i interfaceC0241i = (InterfaceC0241i) d0.f2560c.get((d0) u9);
                        if (interfaceC0241i != null) {
                            u9 = interfaceC0241i.getParent();
                        } else {
                            u9 = null;
                        }
                    }
                }
                if (u9 == u8) {
                    if (u8 != null) {
                        intValue++;
                    }
                    return Integer.valueOf(intValue);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + u9 + ", expected child of " + u8 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            default:
                H.K(new com.facebook.appevents.k(23, (Integer) obj2, (List) this.f3386c));
                return y.f23029a;
        }
    }
}
