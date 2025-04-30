package com.bykv.vk.openvk.preload.b;

import java.util.List;

/* loaded from: classes.dex */
final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    protected e f13153a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private List<h> f13154c;

    /* renamed from: d, reason: collision with root package name */
    private d f13155d;

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public i(List<h> list, int i9, e eVar, d dVar) {
        this.f13154c = list;
        this.b = i9;
        this.f13153a = eVar;
        this.f13155d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f13155d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f13139a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f13155d;
        if (dVar != null) {
            dVar.f13140c = obj;
            com.bykv.vk.openvk.preload.b.b.a aVar = dVar.f13141d;
            if (aVar != null) {
                aVar.b(dVar.f13142e, dVar);
            }
        }
        if (this.b >= this.f13154c.size()) {
            return obj;
        }
        h hVar = this.f13154c.get(this.b);
        Class<? extends d> cls = hVar.f13149a;
        d dVar2 = (d) this.f13153a.a(cls);
        if (dVar2 != null) {
            com.bykv.vk.openvk.preload.b.b.a aVar2 = hVar.b;
            i iVar = new i(this.f13154c, this.b + 1, this.f13153a, dVar2);
            dVar2.a(iVar, this.f13155d, obj, aVar2, hVar.f13150c);
            com.bykv.vk.openvk.preload.b.b.a aVar3 = dVar2.f13141d;
            if (aVar3 != null) {
                aVar3.a(dVar2.f13142e, dVar2);
            }
            try {
                Object a6 = dVar2.a(iVar, obj);
                com.bykv.vk.openvk.preload.b.b.a aVar4 = dVar2.f13141d;
                if (aVar4 != null) {
                    aVar4.c(dVar2.f13142e, dVar2);
                }
                return a6;
            } catch (a e4) {
                Throwable cause = e4.getCause();
                if (dVar2.f13141d != null) {
                    dVar2.f13141d.b(dVar2.f13142e, dVar2, cause);
                }
                throw e4;
            } catch (Throwable th) {
                if (dVar2.f13141d != null) {
                    dVar2.f13141d.a(dVar2.f13142e, dVar2, th);
                }
                throw new a(th);
            }
        }
        throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object b(Class cls) {
        d c9 = c(cls);
        if (c9 != null) {
            return c9.f13140c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Class cls) {
        d c9 = c(cls);
        if (c9 != null) {
            return c9.b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
