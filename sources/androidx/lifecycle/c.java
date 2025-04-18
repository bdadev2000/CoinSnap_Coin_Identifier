package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1785b;

    public c(Method method, int i10) {
        this.a = i10;
        this.f1785b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && this.f1785b.getName().equals(cVar.f1785b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1785b.getName().hashCode() + (this.a * 31);
    }
}
