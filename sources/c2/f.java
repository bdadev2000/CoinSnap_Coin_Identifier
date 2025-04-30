package C2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f495a;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f495a) {
            case 0:
                if (!O2.a.b(this)) {
                    try {
                        G7.j.e(obj, "proxy");
                        G7.j.e(method, "m");
                        if (G7.j.a(method.getName(), "onBillingSetupFinished")) {
                            e eVar = h.f498s;
                            e.c().set(true);
                        } else {
                            String name = method.getName();
                            G7.j.d(name, "m.name");
                            if (name.endsWith("onBillingServiceDisconnected")) {
                                e eVar2 = h.f498s;
                                e.c().set(false);
                            }
                        }
                    } catch (Throwable th) {
                        O2.a.a(this, th);
                    }
                }
                return null;
            default:
                if (!O2.a.b(this)) {
                    try {
                        G7.j.e(obj, "proxy");
                        G7.j.e(method, "m");
                    } catch (Throwable th2) {
                        O2.a.a(this, th2);
                    }
                }
                return null;
        }
    }
}
