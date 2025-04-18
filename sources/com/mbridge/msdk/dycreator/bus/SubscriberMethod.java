package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class SubscriberMethod {
    final Method a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f12910b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f12911c;

    /* renamed from: d, reason: collision with root package name */
    String f12912d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.a = method;
        this.f12910b = threadMode;
        this.f12911c = cls;
    }

    private synchronized void a() {
        if (this.f12912d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.a.getName());
            sb2.append('(');
            sb2.append(this.f12911c.getName());
            this.f12912d = sb2.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SubscriberMethod) {
            a();
            return this.f12912d.equals(((SubscriberMethod) obj).f12912d);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
