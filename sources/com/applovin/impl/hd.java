package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.ul;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface hd {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final kd f24304a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f24305b;

        /* renamed from: c, reason: collision with root package name */
        public final f9 f24306c;
        public final Surface d;
        public final MediaCrypto e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24307f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f24308g;

        private a(kd kdVar, MediaFormat mediaFormat, f9 f9Var, Surface surface, MediaCrypto mediaCrypto, int i2, boolean z2) {
            this.f24304a = kdVar;
            this.f24305b = mediaFormat;
            this.f24306c = f9Var;
            this.d = surface;
            this.e = mediaCrypto;
            this.f24307f = i2;
            this.f24308g = z2;
        }

        public static a a(kd kdVar, MediaFormat mediaFormat, f9 f9Var, MediaCrypto mediaCrypto) {
            return new a(kdVar, mediaFormat, f9Var, null, mediaCrypto, 0, false);
        }

        public static a a(kd kdVar, MediaFormat mediaFormat, f9 f9Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(kdVar, mediaFormat, f9Var, surface, mediaCrypto, 0, false);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f24309a = new ul.c();

        hd a(a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(hd hdVar, long j2, long j3);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i2);

    void a();

    void a(int i2, int i3, int i4, long j2, int i5);

    void a(int i2, int i3, a5 a5Var, long j2, int i4);

    void a(int i2, long j2);

    void a(int i2, boolean z2);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    ByteBuffer b(int i2);

    void b();

    void c(int i2);

    boolean c();

    int d();

    MediaFormat e();
}
