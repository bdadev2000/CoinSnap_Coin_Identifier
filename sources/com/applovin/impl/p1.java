package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f25953a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a {
        public static final a e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f25954a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25955b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25956c;
        public final int d;

        public a(int i2, int i3, int i4) {
            this.f25954a = i2;
            this.f25955b = i3;
            this.f25956c = i4;
            this.d = xp.g(i4) ? xp.b(i4, i3) : -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f25954a);
            sb.append(", channelCount=");
            sb.append(this.f25955b);
            sb.append(", encoding=");
            return android.support.v4.media.d.o(sb, this.f25956c, ']');
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a a(a aVar);

    void a(ByteBuffer byteBuffer);

    void b();

    boolean c();

    ByteBuffer d();

    void e();

    boolean f();

    void reset();
}
