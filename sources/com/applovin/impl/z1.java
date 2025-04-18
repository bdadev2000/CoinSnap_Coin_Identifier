package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public abstract class z1 implements p1 {

    /* renamed from: b, reason: collision with root package name */
    protected p1.a f28253b;

    /* renamed from: c, reason: collision with root package name */
    protected p1.a f28254c;
    private p1.a d;
    private p1.a e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f28255f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f28256g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28257h;

    public z1() {
        ByteBuffer byteBuffer = p1.f25953a;
        this.f28255f = byteBuffer;
        this.f28256g = byteBuffer;
        p1.a aVar = p1.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f28253b = aVar;
        this.f28254c = aVar;
    }

    @Override // com.applovin.impl.p1
    public final p1.a a(p1.a aVar) {
        this.d = aVar;
        this.e = b(aVar);
        return f() ? this.e : p1.a.e;
    }

    public abstract p1.a b(p1.a aVar);

    @Override // com.applovin.impl.p1
    public final void b() {
        this.f28256g = p1.f25953a;
        this.f28257h = false;
        this.f28253b = this.d;
        this.f28254c = this.e;
        g();
    }

    @Override // com.applovin.impl.p1
    public boolean c() {
        return this.f28257h && this.f28256g == p1.f25953a;
    }

    @Override // com.applovin.impl.p1
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f28256g;
        this.f28256g = p1.f25953a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.p1
    public final void e() {
        this.f28257h = true;
        h();
    }

    @Override // com.applovin.impl.p1
    public boolean f() {
        return this.e != p1.a.e;
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // com.applovin.impl.p1
    public final void reset() {
        b();
        this.f28255f = p1.f25953a;
        p1.a aVar = p1.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f28253b = aVar;
        this.f28254c = aVar;
        i();
    }

    public final boolean a() {
        return this.f28256g.hasRemaining();
    }

    public final ByteBuffer a(int i2) {
        if (this.f28255f.capacity() < i2) {
            this.f28255f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f28255f.clear();
        }
        ByteBuffer byteBuffer = this.f28255f;
        this.f28256g = byteBuffer;
        return byteBuffer;
    }
}
