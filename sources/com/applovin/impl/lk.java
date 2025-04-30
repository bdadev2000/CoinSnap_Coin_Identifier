package com.applovin.impl;

import com.applovin.impl.InterfaceC0732o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class lk implements InterfaceC0732o1 {
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private float f8848c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f8849d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0732o1.a f8850e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0732o1.a f8851f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC0732o1.a f8852g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC0732o1.a f8853h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8854i;

    /* renamed from: j, reason: collision with root package name */
    private kk f8855j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f8856k;
    private ShortBuffer l;
    private ByteBuffer m;

    /* renamed from: n, reason: collision with root package name */
    private long f8857n;

    /* renamed from: o, reason: collision with root package name */
    private long f8858o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8859p;

    public lk() {
        InterfaceC0732o1.a aVar = InterfaceC0732o1.a.f9377e;
        this.f8850e = aVar;
        this.f8851f = aVar;
        this.f8852g = aVar;
        this.f8853h = aVar;
        ByteBuffer byteBuffer = InterfaceC0732o1.f9376a;
        this.f8856k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public InterfaceC0732o1.a a(InterfaceC0732o1.a aVar) {
        if (aVar.f9379c == 2) {
            int i9 = this.b;
            if (i9 == -1) {
                i9 = aVar.f9378a;
            }
            this.f8850e = aVar;
            InterfaceC0732o1.a aVar2 = new InterfaceC0732o1.a(i9, aVar.b, 2);
            this.f8851f = aVar2;
            this.f8854i = true;
            return aVar2;
        }
        throw new InterfaceC0732o1.b(aVar);
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public void b() {
        if (f()) {
            InterfaceC0732o1.a aVar = this.f8850e;
            this.f8852g = aVar;
            InterfaceC0732o1.a aVar2 = this.f8851f;
            this.f8853h = aVar2;
            if (this.f8854i) {
                this.f8855j = new kk(aVar.f9378a, aVar.b, this.f8848c, this.f8849d, aVar2.f9378a);
            } else {
                kk kkVar = this.f8855j;
                if (kkVar != null) {
                    kkVar.a();
                }
            }
        }
        this.m = InterfaceC0732o1.f9376a;
        this.f8857n = 0L;
        this.f8858o = 0L;
        this.f8859p = false;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public boolean c() {
        kk kkVar;
        if (this.f8859p && ((kkVar = this.f8855j) == null || kkVar.b() == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public ByteBuffer d() {
        int b;
        kk kkVar = this.f8855j;
        if (kkVar != null && (b = kkVar.b()) > 0) {
            if (this.f8856k.capacity() < b) {
                ByteBuffer order = ByteBuffer.allocateDirect(b).order(ByteOrder.nativeOrder());
                this.f8856k = order;
                this.l = order.asShortBuffer();
            } else {
                this.f8856k.clear();
                this.l.clear();
            }
            kkVar.a(this.l);
            this.f8858o += b;
            this.f8856k.limit(b);
            this.m = this.f8856k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = InterfaceC0732o1.f9376a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public void e() {
        kk kkVar = this.f8855j;
        if (kkVar != null) {
            kkVar.e();
        }
        this.f8859p = true;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public boolean f() {
        if (this.f8851f.f9378a != -1 && (Math.abs(this.f8848c - 1.0f) >= 1.0E-4f || Math.abs(this.f8849d - 1.0f) >= 1.0E-4f || this.f8851f.f9378a != this.f8850e.f9378a)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public void reset() {
        this.f8848c = 1.0f;
        this.f8849d = 1.0f;
        InterfaceC0732o1.a aVar = InterfaceC0732o1.a.f9377e;
        this.f8850e = aVar;
        this.f8851f = aVar;
        this.f8852g = aVar;
        this.f8853h = aVar;
        ByteBuffer byteBuffer = InterfaceC0732o1.f9376a;
        this.f8856k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.f8854i = false;
        this.f8855j = null;
        this.f8857n = 0L;
        this.f8858o = 0L;
        this.f8859p = false;
    }

    public long a(long j7) {
        if (this.f8858o >= 1024) {
            long c9 = this.f8857n - ((kk) AbstractC0669a1.a(this.f8855j)).c();
            int i9 = this.f8853h.f9378a;
            int i10 = this.f8852g.f9378a;
            if (i9 == i10) {
                return yp.c(j7, c9, this.f8858o);
            }
            return yp.c(j7, c9 * i9, this.f8858o * i10);
        }
        return (long) (this.f8848c * j7);
    }

    public void b(float f9) {
        if (this.f8848c != f9) {
            this.f8848c = f9;
            this.f8854i = true;
        }
    }

    @Override // com.applovin.impl.InterfaceC0732o1
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            kk kkVar = (kk) AbstractC0669a1.a(this.f8855j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f8857n += remaining;
            kkVar.b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void a(float f9) {
        if (this.f8849d != f9) {
            this.f8849d = f9;
            this.f8854i = true;
        }
    }
}
