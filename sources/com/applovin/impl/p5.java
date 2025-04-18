package com.applovin.impl;

import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class p5 extends l2 {

    /* renamed from: b, reason: collision with root package name */
    public final a5 f25962b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f25963c;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public long f25964f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f25965g;

    /* renamed from: h, reason: collision with root package name */
    private final int f25966h;

    /* renamed from: i, reason: collision with root package name */
    private final int f25967i;

    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f25968a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25969b;

        public a(int i2, int i3) {
            super(android.support.v4.media.d.l("Buffer too small (", i2, " < ", i3, ")"));
            this.f25968a = i2;
            this.f25969b = i3;
        }
    }

    public p5(int i2) {
        this(i2, 0);
    }

    private ByteBuffer f(int i2) {
        int i3 = this.f25966h;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f25963c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i2);
    }

    public static p5 i() {
        return new p5(0);
    }

    @Override // com.applovin.impl.l2
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f25963c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f25965g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public void g(int i2) {
        int i3 = i2 + this.f25967i;
        ByteBuffer byteBuffer = this.f25963c;
        if (byteBuffer == null) {
            this.f25963c = f(i3);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i4 = i3 + position;
        if (capacity >= i4) {
            this.f25963c = byteBuffer;
            return;
        }
        ByteBuffer f2 = f(i4);
        f2.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f2.put(byteBuffer);
        }
        this.f25963c = f2;
    }

    public final boolean h() {
        return d(Ints.MAX_POWER_OF_TWO);
    }

    public p5(int i2, int i3) {
        this.f25962b = new a5();
        this.f25966h = i2;
        this.f25967i = i3;
    }

    public void h(int i2) {
        ByteBuffer byteBuffer = this.f25965g;
        if (byteBuffer != null && byteBuffer.capacity() >= i2) {
            this.f25965g.clear();
        } else {
            this.f25965g = ByteBuffer.allocate(i2);
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = this.f25963c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f25965g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
