package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public interface o1 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f6447e = new a(-1, -1, -1);
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6448b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6449c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6450d;

        public a(int i10, int i11, int i12) {
            int i13;
            this.a = i10;
            this.f6448b = i11;
            this.f6449c = i12;
            if (yp.g(i12)) {
                i13 = yp.b(i12, i11);
            } else {
                i13 = -1;
            }
            this.f6450d = i13;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
            sb2.append(this.a);
            sb2.append(", channelCount=");
            sb2.append(this.f6448b);
            sb2.append(", encoding=");
            return a4.j.i(sb2, this.f6449c, AbstractJsonLexerKt.END_LIST);
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
