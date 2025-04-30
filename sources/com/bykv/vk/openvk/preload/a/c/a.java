package com.bykv.vk.openvk.preload.a.c;

import com.bykv.vk.openvk.preload.a.b.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class a<T> {
    public final Class<? super T> b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f13052c;

    /* renamed from: d, reason: collision with root package name */
    final int f13053d;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a6 = b.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f13052c = a6;
            this.b = (Class<? super T>) b.b(a6);
            this.f13053d = a6.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && b.a(this.f13052c, ((a) obj).f13052c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13053d;
    }

    public final String toString() {
        return b.c(this.f13052c);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    private a(Type type) {
        Type a6 = b.a((Type) com.bykv.vk.openvk.preload.a.b.a.a(type));
        this.f13052c = a6;
        this.b = (Class<? super T>) b.b(a6);
        this.f13053d = a6.hashCode();
    }
}
