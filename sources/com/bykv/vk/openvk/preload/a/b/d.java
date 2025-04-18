package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements u, Cloneable {
    public static final d a = new d();

    /* renamed from: e, reason: collision with root package name */
    public boolean f9858e;

    /* renamed from: b, reason: collision with root package name */
    public double f9855b = -1.0d;

    /* renamed from: c, reason: collision with root package name */
    public int f9856c = 136;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9857d = true;

    /* renamed from: f, reason: collision with root package name */
    public List<com.bykv.vk.openvk.preload.a.b> f9859f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public List<com.bykv.vk.openvk.preload.a.b> f9860g = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public static boolean b(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls)) {
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private static boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean a(Class<?> cls) {
        if (this.f9855b == -1.0d || a((com.bykv.vk.openvk.preload.a.a.d) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class), (com.bykv.vk.openvk.preload.a.a.e) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.e.class))) {
            return (!this.f9857d && c(cls)) || b(cls);
        }
        return true;
    }

    public final boolean a(boolean z10) {
        Iterator<com.bykv.vk.openvk.preload.a.b> it = (z10 ? this.f9859f : this.f9860g).iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(com.bykv.vk.openvk.preload.a.a.d dVar, com.bykv.vk.openvk.preload.a.a.e eVar) {
        return a(dVar) && a(eVar);
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.d dVar) {
        return dVar == null || dVar.a() <= this.f9855b;
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.e eVar) {
        return eVar == null || eVar.a() > this.f9855b;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(final com.bykv.vk.openvk.preload.a.f fVar, final com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean a10 = a(aVar.f9888b);
        final boolean z10 = a10 || a(true);
        final boolean z11 = a10 || a(false);
        if (z10 || z11) {
            return new t<T>() { // from class: com.bykv.vk.openvk.preload.a.b.d.1

                /* renamed from: f, reason: collision with root package name */
                private t<T> f9865f;

                private t<T> b() {
                    t<T> tVar = this.f9865f;
                    if (tVar != null) {
                        return tVar;
                    }
                    t<T> a11 = fVar.a(d.this, aVar);
                    this.f9865f = a11;
                    return a11;
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final T a(com.bykv.vk.openvk.preload.a.d.a aVar2) throws IOException {
                    if (z11) {
                        aVar2.o();
                        return null;
                    }
                    return b().a(aVar2);
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t5) throws IOException {
                    if (z10) {
                        cVar.e();
                    } else {
                        b().a(cVar, t5);
                    }
                }
            };
        }
        return null;
    }
}
