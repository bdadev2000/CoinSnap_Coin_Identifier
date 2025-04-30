package com.applovin.impl;

import com.applovin.impl.InterfaceC0732o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.applovin.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0779y1 implements InterfaceC0732o1 {
    protected InterfaceC0732o1.a b;

    /* renamed from: c, reason: collision with root package name */
    protected InterfaceC0732o1.a f12309c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0732o1.a f12310d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0732o1.a f12311e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f12312f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f12313g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12314h;

    public AbstractC0779y1() {
        ByteBuffer byteBuffer = InterfaceC0732o1.f9376a;
        this.f12312f = byteBuffer;
        this.f12313g = byteBuffer;
        InterfaceC0732o1.a aVar = InterfaceC0732o1.a.f9377e;
        this.f12310d = aVar;
        this.f12311e = aVar;
        this.b = aVar;
        this.f12309c = aVar;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public final InterfaceC0732o1.a a(InterfaceC0732o1.a aVar) {
        this.f12310d = aVar;
        this.f12311e = b(aVar);
        return f() ? this.f12311e : InterfaceC0732o1.a.f9377e;
    }

    public abstract InterfaceC0732o1.a b(InterfaceC0732o1.a aVar);

    @Override // com.applovin.impl.InterfaceC0732o1
    public final void b() {
        this.f12313g = InterfaceC0732o1.f9376a;
        this.f12314h = false;
        this.b = this.f12310d;
        this.f12309c = this.f12311e;
        g();
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public boolean c() {
        if (this.f12314h && this.f12313g == InterfaceC0732o1.f9376a) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f12313g;
        this.f12313g = InterfaceC0732o1.f9376a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public final void e() {
        this.f12314h = true;
        h();
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public boolean f() {
        if (this.f12311e != InterfaceC0732o1.a.f9377e) {
            return true;
        }
        return false;
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public final void reset() {
        b();
        this.f12312f = InterfaceC0732o1.f9376a;
        InterfaceC0732o1.a aVar = InterfaceC0732o1.a.f9377e;
        this.f12310d = aVar;
        this.f12311e = aVar;
        this.b = aVar;
        this.f12309c = aVar;
        i();
    }

    public final boolean a() {
        return this.f12313g.hasRemaining();
    }

    public final ByteBuffer a(int i9) {
        if (this.f12312f.capacity() < i9) {
            this.f12312f = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        } else {
            this.f12312f.clear();
        }
        ByteBuffer byteBuffer = this.f12312f;
        this.f12313g = byteBuffer;
        return byteBuffer;
    }
}
