package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.applovin.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0732o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f9376a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.applovin.impl.o1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f9377e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f9378a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9379c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9380d;

        public a(int i9, int i10, int i11) {
            int i12;
            this.f9378a = i9;
            this.b = i10;
            this.f9379c = i11;
            if (yp.g(i11)) {
                i12 = yp.b(i11, i10);
            } else {
                i12 = -1;
            }
            this.f9380d = i12;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f9378a);
            sb.append(", channelCount=");
            sb.append(this.b);
            sb.append(", encoding=");
            return com.mbridge.msdk.foundation.entity.o.l(sb, this.f9379c, ']');
        }
    }

    /* renamed from: com.applovin.impl.o1$b */
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
