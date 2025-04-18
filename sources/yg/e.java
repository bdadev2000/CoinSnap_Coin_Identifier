package yg;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class e extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Method f28227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Class f28228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f28229h;

    public e(Method method, Class cls, int i10) {
        this.f28227f = method;
        this.f28228g = cls;
        this.f28229h = i10;
    }

    @Override // p6.a
    public final Object m() {
        return this.f28227f.invoke(null, this.f28228g, Integer.valueOf(this.f28229h));
    }

    public final String toString() {
        return this.f28228g.getName();
    }
}
