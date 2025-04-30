package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class SubscriberMethod {

    /* renamed from: a, reason: collision with root package name */
    final Method f15261a;
    final ThreadMode b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f15262c;

    /* renamed from: d, reason: collision with root package name */
    String f15263d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f15261a = method;
        this.b = threadMode;
        this.f15262c = cls;
    }

    private synchronized void a() {
        if (this.f15263d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f15261a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f15261a.getName());
            sb.append('(');
            sb.append(this.f15262c.getName());
            this.f15263d = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SubscriberMethod) {
            a();
            return this.f15263d.equals(((SubscriberMethod) obj).f15263d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15261a.hashCode();
    }
}
