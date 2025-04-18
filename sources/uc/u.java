package uc;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class u extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f25797b;

    public u(Method method) {
        this.f25797b = method;
    }

    @Override // uc.w
    public final Object b(Class cls) {
        w.a(cls);
        return this.f25797b.invoke(null, cls, Object.class);
    }
}
