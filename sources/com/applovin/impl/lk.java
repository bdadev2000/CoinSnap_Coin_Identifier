package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class lk implements o1 {

    /* renamed from: b, reason: collision with root package name */
    private int f5882b;

    /* renamed from: c, reason: collision with root package name */
    private float f5883c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f5884d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private o1.a f5885e;

    /* renamed from: f, reason: collision with root package name */
    private o1.a f5886f;

    /* renamed from: g, reason: collision with root package name */
    private o1.a f5887g;

    /* renamed from: h, reason: collision with root package name */
    private o1.a f5888h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5889i;

    /* renamed from: j, reason: collision with root package name */
    private kk f5890j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f5891k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f5892l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f5893m;

    /* renamed from: n, reason: collision with root package name */
    private long f5894n;

    /* renamed from: o, reason: collision with root package name */
    private long f5895o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5896p;

    public lk() {
        o1.a aVar = o1.a.f6447e;
        this.f5885e = aVar;
        this.f5886f = aVar;
        this.f5887g = aVar;
        this.f5888h = aVar;
        ByteBuffer byteBuffer = o1.a;
        this.f5891k = byteBuffer;
        this.f5892l = byteBuffer.asShortBuffer();
        this.f5893m = byteBuffer;
        this.f5882b = -1;
    }

    @Override // com.applovin.impl.o1
    public o1.a a(o1.a aVar) {
        if (aVar.f6449c == 2) {
            int i10 = this.f5882b;
            if (i10 == -1) {
                i10 = aVar.a;
            }
            this.f5885e = aVar;
            o1.a aVar2 = new o1.a(i10, aVar.f6448b, 2);
            this.f5886f = aVar2;
            this.f5889i = true;
            return aVar2;
        }
        throw new o1.b(aVar);
    }

    @Override // com.applovin.impl.o1
    public void b() {
        if (f()) {
            o1.a aVar = this.f5885e;
            this.f5887g = aVar;
            o1.a aVar2 = this.f5886f;
            this.f5888h = aVar2;
            if (this.f5889i) {
                this.f5890j = new kk(aVar.a, aVar.f6448b, this.f5883c, this.f5884d, aVar2.a);
            } else {
                kk kkVar = this.f5890j;
                if (kkVar != null) {
                    kkVar.a();
                }
            }
        }
        this.f5893m = o1.a;
        this.f5894n = 0L;
        this.f5895o = 0L;
        this.f5896p = false;
    }

    @Override // com.applovin.impl.o1
    public boolean c() {
        kk kkVar;
        return this.f5896p && ((kkVar = this.f5890j) == null || kkVar.b() == 0);
    }

    @Override // com.applovin.impl.o1
    public ByteBuffer d() {
        int b3;
        kk kkVar = this.f5890j;
        if (kkVar != null && (b3 = kkVar.b()) > 0) {
            if (this.f5891k.capacity() < b3) {
                ByteBuffer order = ByteBuffer.allocateDirect(b3).order(ByteOrder.nativeOrder());
                this.f5891k = order;
                this.f5892l = order.asShortBuffer();
            } else {
                this.f5891k.clear();
                this.f5892l.clear();
            }
            kkVar.a(this.f5892l);
            this.f5895o += b3;
            this.f5891k.limit(b3);
            this.f5893m = this.f5891k;
        }
        ByteBuffer byteBuffer = this.f5893m;
        this.f5893m = o1.a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.o1
    public void e() {
        kk kkVar = this.f5890j;
        if (kkVar != null) {
            kkVar.e();
        }
        this.f5896p = true;
    }

    @Override // com.applovin.impl.o1
    public boolean f() {
        if (this.f5886f.a != -1 && (Math.abs(this.f5883c - 1.0f) >= 1.0E-4f || Math.abs(this.f5884d - 1.0f) >= 1.0E-4f || this.f5886f.a != this.f5885e.a)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.o1
    public void reset() {
        this.f5883c = 1.0f;
        this.f5884d = 1.0f;
        o1.a aVar = o1.a.f6447e;
        this.f5885e = aVar;
        this.f5886f = aVar;
        this.f5887g = aVar;
        this.f5888h = aVar;
        ByteBuffer byteBuffer = o1.a;
        this.f5891k = byteBuffer;
        this.f5892l = byteBuffer.asShortBuffer();
        this.f5893m = byteBuffer;
        this.f5882b = -1;
        this.f5889i = false;
        this.f5890j = null;
        this.f5894n = 0L;
        this.f5895o = 0L;
        this.f5896p = false;
    }

    public long a(long j3) {
        if (this.f5895o >= 1024) {
            long c10 = this.f5894n - ((kk) a1.a(this.f5890j)).c();
            int i10 = this.f5888h.a;
            int i11 = this.f5887g.a;
            if (i10 == i11) {
                return yp.c(j3, c10, this.f5895o);
            }
            return yp.c(j3, c10 * i10, this.f5895o * i11);
        }
        return (long) (this.f5883c * j3);
    }

    public void b(float f10) {
        if (this.f5883c != f10) {
            this.f5883c = f10;
            this.f5889i = true;
        }
    }

    @Override // com.applovin.impl.o1
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            kk kkVar = (kk) a1.a(this.f5890j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f5894n += remaining;
            kkVar.b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void a(float f10) {
        if (this.f5884d != f10) {
            this.f5884d = f10;
            this.f5889i = true;
        }
    }
}
