package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class n5 extends j2 {

    /* renamed from: b, reason: collision with root package name */
    public final y4 f6350b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f6351c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6352d;

    /* renamed from: f, reason: collision with root package name */
    public long f6353f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f6354g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6355h;

    /* renamed from: i, reason: collision with root package name */
    private final int f6356i;

    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6357b;

        public a(int i10, int i11) {
            super(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Buffer too small (", i10, " < ", i11, ")"));
            this.a = i10;
            this.f6357b = i11;
        }
    }

    public n5(int i10) {
        this(i10, 0);
    }

    private ByteBuffer f(int i10) {
        int capacity;
        int i11 = this.f6355h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f6351c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new a(capacity, i10);
    }

    public static n5 i() {
        return new n5(0);
    }

    @Override // com.applovin.impl.j2
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f6351c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f6354g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f6352d = false;
    }

    public void g(int i10) {
        int i11 = i10 + this.f6356i;
        ByteBuffer byteBuffer = this.f6351c;
        if (byteBuffer == null) {
            this.f6351c = f(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f6351c = byteBuffer;
            return;
        }
        ByteBuffer f10 = f(i12);
        f10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f10.put(byteBuffer);
        }
        this.f6351c = f10;
    }

    public final boolean h() {
        return d(1073741824);
    }

    public n5(int i10, int i11) {
        this.f6350b = new y4();
        this.f6355h = i10;
        this.f6356i = i11;
    }

    public void h(int i10) {
        ByteBuffer byteBuffer = this.f6354g;
        if (byteBuffer != null && byteBuffer.capacity() >= i10) {
            this.f6354g.clear();
        } else {
            this.f6354g = ByteBuffer.allocate(i10);
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = this.f6351c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f6354g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
