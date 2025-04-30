package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;

/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f12882a;

    public d(com.bykv.vk.openvk.preload.a.b.c cVar) {
        this.f12882a = cVar;
    }

    public static t<?> a(com.bykv.vk.openvk.preload.a.b.c cVar, com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, com.bykv.vk.openvk.preload.a.a.b bVar) {
        t<?> lVar;
        Object a6 = cVar.a(com.bykv.vk.openvk.preload.a.c.a.a((Class) bVar.a())).a();
        if (a6 instanceof t) {
            lVar = (t) a6;
        } else if (a6 instanceof u) {
            lVar = ((u) a6).a(fVar, aVar);
        } else {
            boolean z8 = a6 instanceof q;
            if (!z8 && !(a6 instanceof com.bykv.vk.openvk.preload.a.j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a6.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z8 ? (q) a6 : null, a6 instanceof com.bykv.vk.openvk.preload.a.j ? (com.bykv.vk.openvk.preload.a.j) a6 : null, fVar, aVar);
        }
        return (lVar == null || !bVar.b()) ? lVar : lVar.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        com.bykv.vk.openvk.preload.a.a.b bVar = (com.bykv.vk.openvk.preload.a.a.b) aVar.b.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) a(this.f12882a, fVar, aVar, bVar);
    }
}
