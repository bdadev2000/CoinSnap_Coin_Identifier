package com.bykv.vk.openvk.preload.b;

import java.util.List;

/* loaded from: classes.dex */
final class i implements b {
    protected e a;

    /* renamed from: b, reason: collision with root package name */
    private int f9983b;

    /* renamed from: c, reason: collision with root package name */
    private List<h> f9984c;

    /* renamed from: d, reason: collision with root package name */
    private d f9985d;

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public i(List<h> list, int i10, e eVar, d dVar) {
        this.f9984c = list;
        this.f9983b = i10;
        this.a = eVar;
        this.f9985d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f9985d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f9985d;
        if (dVar != null) {
            dVar.f9970c = obj;
            com.bykv.vk.openvk.preload.b.b.a aVar = dVar.f9971d;
            if (aVar != null) {
                aVar.b(dVar.f9972e, dVar);
            }
        }
        if (this.f9983b >= this.f9984c.size()) {
            return obj;
        }
        h hVar = this.f9984c.get(this.f9983b);
        Class<? extends d> cls = hVar.a;
        d dVar2 = (d) this.a.a(cls);
        if (dVar2 != null) {
            com.bykv.vk.openvk.preload.b.b.a aVar2 = hVar.f9979b;
            i iVar = new i(this.f9984c, this.f9983b + 1, this.a, dVar2);
            dVar2.a(iVar, this.f9985d, obj, aVar2, hVar.f9980c);
            com.bykv.vk.openvk.preload.b.b.a aVar3 = dVar2.f9971d;
            if (aVar3 != null) {
                aVar3.a(dVar2.f9972e, dVar2);
            }
            try {
                Object a10 = dVar2.a(iVar, obj);
                com.bykv.vk.openvk.preload.b.b.a aVar4 = dVar2.f9971d;
                if (aVar4 != null) {
                    aVar4.c(dVar2.f9972e, dVar2);
                }
                return a10;
            } catch (a e2) {
                Throwable cause = e2.getCause();
                if (dVar2.f9971d != null) {
                    dVar2.f9971d.b(dVar2.f9972e, dVar2, cause);
                }
                throw e2;
            } catch (Throwable th2) {
                if (dVar2.f9971d != null) {
                    dVar2.f9971d.a(dVar2.f9972e, dVar2, th2);
                }
                throw new a(th2);
            }
        }
        throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object b(Class cls) {
        d c10 = c(cls);
        if (c10 != null) {
            return c10.f9970c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Class cls) {
        d c10 = c(cls);
        if (c10 != null) {
            return c10.f9969b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
