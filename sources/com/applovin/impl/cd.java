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

        /* renamed from: a, reason: collision with root package name */
        public final fd f7078a;
        public final MediaFormat b;

        /* renamed from: c, reason: collision with root package name */
        public final d9 f7079c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f7080d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f7081e;

        /* renamed from: f, reason: collision with root package name */
        public final int f7082f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f7083g;

        private a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, Surface surface, MediaCrypto mediaCrypto, int i9, boolean z8) {
            this.f7078a = fdVar;
            this.b = mediaFormat;
            this.f7079c = d9Var;
            this.f7080d = surface;
            this.f7081e = mediaCrypto;
            this.f7082f = i9;
            this.f7083g = z8;
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

        /* renamed from: a, reason: collision with root package name */
        public static final b f7084a = new rl.c();

        cd a(a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(cd cdVar, long j7, long j9);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i9);

    void a();

    void a(int i9, int i10, int i11, long j7, int i12);

    void a(int i9, int i10, y4 y4Var, long j7, int i11);

    void a(int i9, long j7);

    void a(int i9, boolean z8);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    ByteBuffer b(int i9);

    void b();

    void c(int i9);

    boolean c();

    int d();

    MediaFormat e();
}
