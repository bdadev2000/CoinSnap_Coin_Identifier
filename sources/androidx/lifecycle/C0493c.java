package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4883a;
    public final Method b;

    public C0493c(Method method, int i9) {
        this.f4883a = i9;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0493c)) {
            return false;
        }
        C0493c c0493c = (C0493c) obj;
        if (this.f4883a == c0493c.f4883a && this.b.getName().equals(c0493c.b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.f4883a * 31);
    }
}
