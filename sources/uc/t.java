package uc;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class t extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f25795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25796c;

    public t(Method method, int i10) {
        this.f25795b = method;
        this.f25796c = i10;
    }

    @Override // uc.w
    public final Object b(Class cls) {
        w.a(cls);
        return this.f25795b.invoke(null, cls, Integer.valueOf(this.f25796c));
    }
}
