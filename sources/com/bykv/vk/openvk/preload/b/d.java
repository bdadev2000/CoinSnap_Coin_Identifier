package com.bykv.vk.openvk.preload.b;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* renamed from: g, reason: collision with root package name */
    private static AtomicLong f9968g = new AtomicLong();
    d a;

    /* renamed from: b, reason: collision with root package name */
    IN f9969b;

    /* renamed from: c, reason: collision with root package name */
    public OUT f9970c;

    /* renamed from: d, reason: collision with root package name */
    com.bykv.vk.openvk.preload.b.b.a f9971d;

    /* renamed from: e, reason: collision with root package name */
    b f9972e;

    /* renamed from: f, reason: collision with root package name */
    public long f9973f;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    public void a(Object... objArr) {
    }

    public final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f9971d;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f9972e, this, th2);
    }

    public final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.b.b.a aVar, Object[] objArr) {
        this.f9972e = new m(bVar);
        this.a = dVar;
        this.f9969b = in;
        this.f9971d = aVar;
        if (dVar != null) {
            this.f9973f = dVar.f9973f;
        } else {
            long andIncrement = f9968g.getAndIncrement();
            this.f9973f = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }
}
