package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l<T> extends t<T> {

    /* renamed from: a, reason: collision with root package name */
    final com.bykv.vk.openvk.preload.a.f f12915a;
    private final q<T> b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.j<T> f12916c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.c.a<T> f12917d;

    /* renamed from: g, reason: collision with root package name */
    private t<T> f12920g;

    /* renamed from: f, reason: collision with root package name */
    private final l<T>.a f12919f = new a(this, 0);

    /* renamed from: e, reason: collision with root package name */
    private final u f12918e = null;

    /* loaded from: classes.dex */
    public final class a {
        private a() {
        }

        public /* synthetic */ a(l lVar, byte b) {
            this();
        }
    }

    public l(q<T> qVar, com.bykv.vk.openvk.preload.a.j<T> jVar, com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        this.b = qVar;
        this.f12916c = jVar;
        this.f12915a = fVar;
        this.f12917d = aVar;
    }

    private t<T> b() {
        t<T> tVar = this.f12920g;
        if (tVar != null) {
            return tVar;
        }
        t<T> a6 = this.f12915a.a(this.f12918e, this.f12917d);
        this.f12920g = a6;
        return a6;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (this.f12916c == null) {
            return b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.a.b.k.a(aVar) instanceof com.bykv.vk.openvk.preload.a.m) {
            return null;
        }
        return this.f12916c.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t9) throws IOException {
        q<T> qVar = this.b;
        if (qVar == null) {
            b().a(cVar, t9);
        } else if (t9 == null) {
            cVar.e();
        } else {
            com.bykv.vk.openvk.preload.a.b.k.a(qVar.a(), cVar);
        }
    }
}
