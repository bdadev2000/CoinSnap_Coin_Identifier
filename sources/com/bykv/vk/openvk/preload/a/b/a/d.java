package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;

/* loaded from: classes.dex */
public final class d implements u {
    private final com.bykv.vk.openvk.preload.a.b.c a;

    public d(com.bykv.vk.openvk.preload.a.b.c cVar) {
        this.a = cVar;
    }

    public static t<?> a(com.bykv.vk.openvk.preload.a.b.c cVar, com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, com.bykv.vk.openvk.preload.a.a.b bVar) {
        t<?> lVar;
        Object a = cVar.a(com.bykv.vk.openvk.preload.a.c.a.a((Class) bVar.a())).a();
        if (a instanceof t) {
            lVar = (t) a;
        } else if (a instanceof u) {
            lVar = ((u) a).a(fVar, aVar);
        } else {
            boolean z10 = a instanceof q;
            if (!z10 && !(a instanceof com.bykv.vk.openvk.preload.a.j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z10 ? (q) a : null, a instanceof com.bykv.vk.openvk.preload.a.j ? (com.bykv.vk.openvk.preload.a.j) a : null, fVar, aVar);
        }
        return (lVar == null || !bVar.b()) ? lVar : lVar.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        com.bykv.vk.openvk.preload.a.a.b bVar = (com.bykv.vk.openvk.preload.a.a.b) aVar.f9888b.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) a(this.a, fVar, aVar, bVar);
    }
}
