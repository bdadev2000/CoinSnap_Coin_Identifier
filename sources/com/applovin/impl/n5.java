package com.applovin.impl;

import java.nio.ByteBuffer;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class n5 extends AbstractC0713j2 {
    public final y4 b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f9273c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9274d;

    /* renamed from: f, reason: collision with root package name */
    public long f9275f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f9276g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9277h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9278i;

    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f9279a;
        public final int b;

        public a(int i9, int i10) {
            super(AbstractC2914a.c(i9, i10, "Buffer too small (", " < ", ")"));
            this.f9279a = i9;
            this.b = i10;
        }
    }

    public n5(int i9) {
        this(i9, 0);
    }

    private ByteBuffer f(int i9) {
        int capacity;
        int i10 = this.f9277h;
        if (i10 == 1) {
            return ByteBuffer.allocate(i9);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.f9273c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new a(capacity, i9);
    }

    public static n5 i() {
        return new n5(0);
    }

    @Override // com.applovin.impl.AbstractC0713j2
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f9273c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f9276g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f9274d = false;
    }

    public void g(int i9) {
        int i10 = i9 + this.f9278i;
        ByteBuffer byteBuffer = this.f9273c;
        if (byteBuffer == null) {
            this.f9273c = f(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f9273c = byteBuffer;
            return;
        }
        ByteBuffer f9 = f(i11);
        f9.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f9.put(byteBuffer);
        }
        this.f9273c = f9;
    }

    public final boolean h() {
        return d(1073741824);
    }

    public n5(int i9, int i10) {
        this.b = new y4();
        this.f9277h = i9;
        this.f9278i = i10;
    }

    public void h(int i9) {
        ByteBuffer byteBuffer = this.f9276g;
        if (byteBuffer != null && byteBuffer.capacity() >= i9) {
            this.f9276g.clear();
        } else {
            this.f9276g = ByteBuffer.allocate(i9);
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = this.f9273c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f9276g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
