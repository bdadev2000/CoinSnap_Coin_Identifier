package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.a.i;
import com.bykv.vk.openvk.preload.a.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m<T> extends t<T> {
    private final com.bykv.vk.openvk.preload.a.f a;

    /* renamed from: b, reason: collision with root package name */
    private final t<T> f9804b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f9805c;

    public m(com.bykv.vk.openvk.preload.a.f fVar, t<T> tVar, Type type) {
        this.a = fVar;
        this.f9804b = tVar;
        this.f9805c = type;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        return this.f9804b.a(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t5) throws IOException {
        t<T> tVar = this.f9804b;
        Type type = this.f9805c;
        if (t5 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t5.getClass();
        }
        if (type != this.f9805c) {
            tVar = this.a.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
            if (tVar instanceof i.a) {
                t<T> tVar2 = this.f9804b;
                if (!(tVar2 instanceof i.a)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.a(cVar, t5);
    }
}
