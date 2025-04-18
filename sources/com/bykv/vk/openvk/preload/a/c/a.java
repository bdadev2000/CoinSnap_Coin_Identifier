package com.bykv.vk.openvk.preload.a.c;

import com.bykv.vk.openvk.preload.a.b.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Class<? super T> f9888b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f9889c;

    /* renamed from: d, reason: collision with root package name */
    final int f9890d;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a = b.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f9889c = a;
            this.f9888b = (Class<? super T>) b.b(a);
            this.f9890d = a.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && b.a(this.f9889c, ((a) obj).f9889c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9890d;
    }

    public final String toString() {
        return b.c(this.f9889c);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    private a(Type type) {
        Type a = b.a((Type) com.bykv.vk.openvk.preload.a.b.a.a(type));
        this.f9889c = a;
        this.f9888b = (Class<? super T>) b.b(a);
        this.f9890d = a.hashCode();
    }
}
