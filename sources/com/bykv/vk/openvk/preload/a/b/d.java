package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements u, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final d f13010a = new d();

    /* renamed from: e, reason: collision with root package name */
    public boolean f13013e;
    public double b = -1.0d;

    /* renamed from: c, reason: collision with root package name */
    public int f13011c = 136;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13012d = true;

    /* renamed from: f, reason: collision with root package name */
    public List<com.bykv.vk.openvk.preload.a.b> f13014f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public List<com.bykv.vk.openvk.preload.a.b> f13015g = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
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
        if (cls.isMemberClass() && !d(cls)) {
            return true;
        }
        return false;
    }

    private static boolean d(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a(Class<?> cls) {
        if (this.b == -1.0d || a((com.bykv.vk.openvk.preload.a.a.d) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class), (com.bykv.vk.openvk.preload.a.a.e) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.e.class))) {
            return (!this.f13012d && c(cls)) || b(cls);
        }
        return true;
    }

    public final boolean a(boolean z8) {
        Iterator<com.bykv.vk.openvk.preload.a.b> it = (z8 ? this.f13014f : this.f13015g).iterator();
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
        return dVar == null || dVar.a() <= this.b;
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.e eVar) {
        return eVar == null || eVar.a() > this.b;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(final com.bykv.vk.openvk.preload.a.f fVar, final com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean a6 = a(aVar.b);
        final boolean z8 = a6 || a(true);
        final boolean z9 = a6 || a(false);
        if (z8 || z9) {
            return new t<T>() { // from class: com.bykv.vk.openvk.preload.a.b.d.1

                /* renamed from: f, reason: collision with root package name */
                private t<T> f13020f;

                private t<T> b() {
                    t<T> tVar = this.f13020f;
                    if (tVar != null) {
                        return tVar;
                    }
                    t<T> a9 = fVar.a(d.this, aVar);
                    this.f13020f = a9;
                    return a9;
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final T a(com.bykv.vk.openvk.preload.a.d.a aVar2) throws IOException {
                    if (z9) {
                        aVar2.o();
                        return null;
                    }
                    return b().a(aVar2);
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t9) throws IOException {
                    if (z8) {
                        cVar.e();
                    } else {
                        b().a(cVar, t9);
                    }
                }
            };
        }
        return null;
    }
}
