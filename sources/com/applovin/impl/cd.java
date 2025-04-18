package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.rl;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface cd {

    /* loaded from: classes.dex */
    public static final class a {
        public final fd a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f4095b;

        /* renamed from: c, reason: collision with root package name */
        public final d9 f4096c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f4097d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f4098e;

        /* renamed from: f, reason: collision with root package name */
        public final int f4099f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f4100g;

        private a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
            this.a = fdVar;
            this.f4095b = mediaFormat;
            this.f4096c = d9Var;
            this.f4097d = surface;
            this.f4098e = mediaCrypto;
            this.f4099f = i10;
            this.f4100g = z10;
        }

        public static a a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, MediaCrypto mediaCrypto) {
            return new a(fdVar, mediaFormat, d9Var, null, mediaCrypto, 0, false);
        }

        public static a a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(fdVar, mediaFormat, d9Var, surface, mediaCrypto, 0, false);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        public static final b a = new rl.c();

        cd a(a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(cd cdVar, long j3, long j10);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i10);

    void a();

    void a(int i10, int i11, int i12, long j3, int i13);

    void a(int i10, int i11, y4 y4Var, long j3, int i12);

    void a(int i10, long j3);

    void a(int i10, boolean z10);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    ByteBuffer b(int i10);

    void b();

    void c(int i10);

    boolean c();

    int d();

    MediaFormat e();
}
