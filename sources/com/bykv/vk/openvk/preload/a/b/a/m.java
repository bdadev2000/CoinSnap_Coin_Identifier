package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.a.i;
import com.bykv.vk.openvk.preload.a.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m<T> extends t<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.f f12922a;
    private final t<T> b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f12923c;

    public m(com.bykv.vk.openvk.preload.a.f fVar, t<T> tVar, Type type) {
        this.f12922a = fVar;
        this.b = tVar;
        this.f12923c = type;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        return this.b.a(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t9) throws IOException {
        t<T> tVar = this.b;
        Type type = this.f12923c;
        if (t9 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t9.getClass();
        }
        if (type != this.f12923c) {
            tVar = this.f12922a.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
            if (tVar instanceof i.a) {
                t<T> tVar2 = this.b;
                if (!(tVar2 instanceof i.a)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.a(cVar, t9);
    }
}
