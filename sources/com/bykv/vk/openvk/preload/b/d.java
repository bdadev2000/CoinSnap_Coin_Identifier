package com.bykv.vk.openvk.preload.b;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* renamed from: g, reason: collision with root package name */
    private static AtomicLong f13138g = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    d f13139a;
    IN b;

    /* renamed from: c, reason: collision with root package name */
    public OUT f13140c;

    /* renamed from: d, reason: collision with root package name */
    com.bykv.vk.openvk.preload.b.b.a f13141d;

    /* renamed from: e, reason: collision with root package name */
    b f13142e;

    /* renamed from: f, reason: collision with root package name */
    public long f13143f;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    public void a(Object... objArr) {
    }

    public final void b(Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f13141d;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f13142e, this, th);
    }

    public final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.b.b.a aVar, Object[] objArr) {
        this.f13142e = new m(bVar);
        this.f13139a = dVar;
        this.b = in;
        this.f13141d = aVar;
        if (dVar != null) {
            this.f13143f = dVar.f13143f;
        } else {
            long andIncrement = f13138g.getAndIncrement();
            this.f13143f = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }
}
