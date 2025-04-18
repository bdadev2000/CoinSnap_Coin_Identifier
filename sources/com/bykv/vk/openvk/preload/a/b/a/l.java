package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l<T> extends t<T> {
    final com.bykv.vk.openvk.preload.a.f a;

    /* renamed from: b, reason: collision with root package name */
    private final q<T> f9798b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.j<T> f9799c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.c.a<T> f9800d;

    /* renamed from: g, reason: collision with root package name */
    private t<T> f9803g;

    /* renamed from: f, reason: collision with root package name */
    private final l<T>.a f9802f = new a(this, 0);

    /* renamed from: e, reason: collision with root package name */
    private final u f9801e = null;

    /* loaded from: classes.dex */
    public final class a {
        private a() {
        }

        public /* synthetic */ a(l lVar, byte b3) {
            this();
        }
    }

    public l(q<T> qVar, com.bykv.vk.openvk.preload.a.j<T> jVar, com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        this.f9798b = qVar;
        this.f9799c = jVar;
        this.a = fVar;
        this.f9800d = aVar;
    }

    private t<T> b() {
        t<T> tVar = this.f9803g;
        if (tVar != null) {
            return tVar;
        }
        t<T> a10 = this.a.a(this.f9801e, this.f9800d);
        this.f9803g = a10;
        return a10;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (this.f9799c == null) {
            return b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.a.b.k.a(aVar) instanceof com.bykv.vk.openvk.preload.a.m) {
            return null;
        }
        return this.f9799c.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t5) throws IOException {
        q<T> qVar = this.f9798b;
        if (qVar == null) {
            b().a(cVar, t5);
        } else if (t5 == null) {
            cVar.e();
        } else {
            com.bykv.vk.openvk.preload.a.b.k.a(qVar.a(), cVar);
        }
    }
}
