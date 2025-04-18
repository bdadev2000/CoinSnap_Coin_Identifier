package yg;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class d extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Method f28221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28222g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f28223h;

    public d(Method method, Object obj, Class cls) {
        this.f28221f = method;
        this.f28222g = obj;
        this.f28223h = cls;
    }

    @Override // p6.a
    public final Object m() {
        return this.f28221f.invoke(this.f28222g, this.f28223h);
    }

    public final String toString() {
        return this.f28223h.getName();
    }
}
