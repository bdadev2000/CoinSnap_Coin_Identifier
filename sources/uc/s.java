package uc;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class s extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f25793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25794c;

    public s(Method method, Object obj) {
        this.f25793b = method;
        this.f25794c = obj;
    }

    @Override // uc.w
    public final Object b(Class cls) {
        w.a(cls);
        return this.f25793b.invoke(this.f25794c, cls);
    }
}
