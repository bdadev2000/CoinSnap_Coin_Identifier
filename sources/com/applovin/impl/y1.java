package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class y1 implements o1 {

    /* renamed from: b, reason: collision with root package name */
    protected o1.a f9104b;

    /* renamed from: c, reason: collision with root package name */
    protected o1.a f9105c;

    /* renamed from: d, reason: collision with root package name */
    private o1.a f9106d;

    /* renamed from: e, reason: collision with root package name */
    private o1.a f9107e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f9108f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f9109g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9110h;

    public y1() {
        ByteBuffer byteBuffer = o1.a;
        this.f9108f = byteBuffer;
        this.f9109g = byteBuffer;
        o1.a aVar = o1.a.f6447e;
        this.f9106d = aVar;
        this.f9107e = aVar;
        this.f9104b = aVar;
        this.f9105c = aVar;
    }

    @Override // com.applovin.impl.o1
    public final o1.a a(o1.a aVar) {
        this.f9106d = aVar;
        this.f9107e = b(aVar);
        return f() ? this.f9107e : o1.a.f6447e;
    }

    public abstract o1.a b(o1.a aVar);

    @Override // com.applovin.impl.o1
    public final void b() {
        this.f9109g = o1.a;
        this.f9110h = false;
        this.f9104b = this.f9106d;
        this.f9105c = this.f9107e;
        g();
    }

    @Override // com.applovin.impl.o1
    public boolean c() {
        return this.f9110h && this.f9109g == o1.a;
    }

    @Override // com.applovin.impl.o1
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f9109g;
        this.f9109g = o1.a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.o1
    public final void e() {
        this.f9110h = true;
        h();
    }

    @Override // com.applovin.impl.o1
    public boolean f() {
        return this.f9107e != o1.a.f6447e;
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // com.applovin.impl.o1
    public final void reset() {
        b();
        this.f9108f = o1.a;
        o1.a aVar = o1.a.f6447e;
        this.f9106d = aVar;
        this.f9107e = aVar;
        this.f9104b = aVar;
        this.f9105c = aVar;
        i();
    }

    public final boolean a() {
        return this.f9109g.hasRemaining();
    }

    public final ByteBuffer a(int i10) {
        if (this.f9108f.capacity() < i10) {
            this.f9108f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f9108f.clear();
        }
        ByteBuffer byteBuffer = this.f9108f;
        this.f9109g = byteBuffer;
        return byteBuffer;
    }
}
