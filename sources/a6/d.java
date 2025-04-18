package a6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class d implements InvocationHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method m10, Object[] objArr) {
        boolean endsWith$default;
        switch (this.a) {
            case 0:
                if (!m6.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(m10, "m");
                        if (Intrinsics.areEqual(m10.getName(), "onBillingSetupFinished")) {
                            com.facebook.c cVar = f.f255s;
                            com.facebook.c.v().set(true);
                        } else {
                            String name = m10.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "m.name");
                            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(name, "onBillingServiceDisconnected", false, 2, null);
                            if (endsWith$default) {
                                com.facebook.c cVar2 = f.f255s;
                                com.facebook.c.v().set(false);
                            }
                        }
                    } catch (Throwable th2) {
                        m6.a.a(this, th2);
                    }
                }
                return null;
            default:
                if (!m6.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(m10, "m");
                    } catch (Throwable th3) {
                        m6.a.a(this, th3);
                    }
                }
                return null;
        }
    }
}
