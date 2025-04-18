package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class ok implements p1 {

    /* renamed from: b, reason: collision with root package name */
    private int f25896b;

    /* renamed from: c, reason: collision with root package name */
    private float f25897c = 1.0f;
    private float d = 1.0f;
    private p1.a e;

    /* renamed from: f, reason: collision with root package name */
    private p1.a f25898f;

    /* renamed from: g, reason: collision with root package name */
    private p1.a f25899g;

    /* renamed from: h, reason: collision with root package name */
    private p1.a f25900h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25901i;

    /* renamed from: j, reason: collision with root package name */
    private nk f25902j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f25903k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f25904l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f25905m;

    /* renamed from: n, reason: collision with root package name */
    private long f25906n;

    /* renamed from: o, reason: collision with root package name */
    private long f25907o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25908p;

    public ok() {
        p1.a aVar = p1.a.e;
        this.e = aVar;
        this.f25898f = aVar;
        this.f25899g = aVar;
        this.f25900h = aVar;
        ByteBuffer byteBuffer = p1.f25953a;
        this.f25903k = byteBuffer;
        this.f25904l = byteBuffer.asShortBuffer();
        this.f25905m = byteBuffer;
        this.f25896b = -1;
    }

    public void a(float f2) {
        if (this.d != f2) {
            this.d = f2;
            this.f25901i = true;
        }
    }

    public void b(float f2) {
        if (this.f25897c != f2) {
            this.f25897c = f2;
            this.f25901i = true;
        }
    }

    @Override // com.applovin.impl.p1
    public boolean c() {
        nk nkVar;
        return this.f25908p && ((nkVar = this.f25902j) == null || nkVar.b() == 0);
    }

    @Override // com.applovin.impl.p1
    public ByteBuffer d() {
        int b2;
        nk nkVar = this.f25902j;
        if (nkVar != null && (b2 = nkVar.b()) > 0) {
            if (this.f25903k.capacity() < b2) {
                ByteBuffer order = ByteBuffer.allocateDirect(b2).order(ByteOrder.nativeOrder());
                this.f25903k = order;
                this.f25904l = order.asShortBuffer();
            } else {
                this.f25903k.clear();
                this.f25904l.clear();
            }
            nkVar.a(this.f25904l);
            this.f25907o += b2;
            this.f25903k.limit(b2);
            this.f25905m = this.f25903k;
        }
        ByteBuffer byteBuffer = this.f25905m;
        this.f25905m = p1.f25953a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.p1
    public void e() {
        nk nkVar = this.f25902j;
        if (nkVar != null) {
            nkVar.e();
        }
        this.f25908p = true;
    }

    @Override // com.applovin.impl.p1
    public boolean f() {
        return this.f25898f.f25954a != -1 && (Math.abs(this.f25897c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f25898f.f25954a != this.e.f25954a);
    }

    @Override // com.applovin.impl.p1
    public void reset() {
        this.f25897c = 1.0f;
        this.d = 1.0f;
        p1.a aVar = p1.a.e;
        this.e = aVar;
        this.f25898f = aVar;
        this.f25899g = aVar;
        this.f25900h = aVar;
        ByteBuffer byteBuffer = p1.f25953a;
        this.f25903k = byteBuffer;
        this.f25904l = byteBuffer.asShortBuffer();
        this.f25905m = byteBuffer;
        this.f25896b = -1;
        this.f25901i = false;
        this.f25902j = null;
        this.f25906n = 0L;
        this.f25907o = 0L;
        this.f25908p = false;
    }

    @Override // com.applovin.impl.p1
    public p1.a a(p1.a aVar) {
        if (aVar.f25956c == 2) {
            int i2 = this.f25896b;
            if (i2 == -1) {
                i2 = aVar.f25954a;
            }
            this.e = aVar;
            p1.a aVar2 = new p1.a(i2, aVar.f25955b, 2);
            this.f25898f = aVar2;
            this.f25901i = true;
            return aVar2;
        }
        throw new p1.b(aVar);
    }

    @Override // com.applovin.impl.p1
    public void b() {
        if (f()) {
            p1.a aVar = this.e;
            this.f25899g = aVar;
            p1.a aVar2 = this.f25898f;
            this.f25900h = aVar2;
            if (this.f25901i) {
                this.f25902j = new nk(aVar.f25954a, aVar.f25955b, this.f25897c, this.d, aVar2.f25954a);
            } else {
                nk nkVar = this.f25902j;
                if (nkVar != null) {
                    nkVar.a();
                }
            }
        }
        this.f25905m = p1.f25953a;
        this.f25906n = 0L;
        this.f25907o = 0L;
        this.f25908p = false;
    }

    public long a(long j2) {
        if (this.f25907o < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.f25897c * j2);
        }
        long c2 = this.f25906n - ((nk) b1.a(this.f25902j)).c();
        int i2 = this.f25900h.f25954a;
        int i3 = this.f25899g.f25954a;
        if (i2 == i3) {
            return xp.c(j2, c2, this.f25907o);
        }
        return xp.c(j2, c2 * i2, this.f25907o * i3);
    }

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            nk nkVar = (nk) b1.a(this.f25902j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f25906n += remaining;
            nkVar.b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }
}
