package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f12879a;

    public b(com.bykv.vk.openvk.preload.a.b.c cVar) {
        this.f12879a = cVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Type type = aVar.f13052c;
        Class<? super T> cls = aVar.b;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a6 = com.bykv.vk.openvk.preload.a.b.b.a(type, (Class<?>) cls);
        return new a(fVar, a6, fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(a6)), this.f12879a.a(aVar));
    }

    /* loaded from: classes.dex */
    public static final class a<E> extends t<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final t<E> f12880a;
        private final com.bykv.vk.openvk.preload.a.b.i<? extends Collection<E>> b;

        public a(com.bykv.vk.openvk.preload.a.f fVar, Type type, t<E> tVar, com.bykv.vk.openvk.preload.a.b.i<? extends Collection<E>> iVar) {
            this.f12880a = new m(fVar, tVar, type);
            this.b = iVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                cVar.e();
                return;
            }
            cVar.a();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f12880a.a(cVar, it.next());
            }
            cVar.b();
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            Collection<E> a6 = this.b.a();
            aVar.a();
            while (aVar.e()) {
                a6.add(this.f12880a.a(aVar));
            }
            aVar.b();
            return a6;
        }
    }
}
