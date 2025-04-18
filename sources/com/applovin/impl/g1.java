package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.hd;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g1 implements hd {

    /* renamed from: a */
    private final MediaCodec f24041a;

    /* renamed from: b */
    private final i1 f24042b;

    /* renamed from: c */
    private final h1 f24043c;
    private final boolean d;
    private boolean e;

    /* renamed from: f */
    private int f24044f;

    /* renamed from: g */
    private Surface f24045g;

    /* loaded from: classes.dex */
    public static final class b implements hd.b {

        /* renamed from: b */
        private final Supplier f24046b;

        /* renamed from: c */
        private final Supplier f24047c;
        private final boolean d;
        private final boolean e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(final int r4, boolean r5, boolean r6) {
            /*
                r3 = this;
                com.applovin.impl.ot r0 = new com.applovin.impl.ot
                r1 = 0
                r0.<init>()
                com.applovin.impl.ot r1 = new com.applovin.impl.ot
                r2 = 1
                r1.<init>()
                r3.<init>(r0, r1, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.g1.b.<init>(int, boolean, boolean):void");
        }

        @Override // com.applovin.impl.hd.b
        /* renamed from: b */
        public g1 a(hd.a aVar) {
            MediaCodec mediaCodec;
            String str = aVar.f24304a.f24873a;
            g1 g1Var = null;
            try {
                ko.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    g1 g1Var2 = new g1(mediaCodec, (HandlerThread) this.f24046b.get(), (HandlerThread) this.f24047c.get(), this.d, this.e);
                    try {
                        ko.a();
                        g1Var2.a(aVar.f24305b, aVar.d, aVar.e, aVar.f24307f, aVar.f24308g);
                        return g1Var2;
                    } catch (Exception e) {
                        e = e;
                        g1Var = g1Var2;
                        if (g1Var != null) {
                            g1Var.a();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
        }

        public b(Supplier supplier, Supplier supplier2, boolean z2, boolean z3) {
            this.f24046b = supplier;
            this.f24047c = supplier2;
            this.d = z2;
            this.e = z3;
        }

        public static /* synthetic */ HandlerThread a(int i2) {
            return new HandlerThread(g1.f(i2));
        }

        public static /* synthetic */ HandlerThread b(int i2) {
            return new HandlerThread(g1.g(i2));
        }
    }

    private g1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z2, boolean z3) {
        this.f24041a = mediaCodec;
        this.f24042b = new i1(handlerThread);
        this.f24043c = new h1(mediaCodec, handlerThread2, z2);
        this.d = z3;
        this.f24044f = 0;
    }

    public static String f(int i2) {
        return a(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String g(int i2) {
        return a(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // com.applovin.impl.hd
    public void b() {
        this.f24043c.b();
        this.f24041a.flush();
        i1 i1Var = this.f24042b;
        MediaCodec mediaCodec = this.f24041a;
        Objects.requireNonNull(mediaCodec);
        i1Var.a(new mt(mediaCodec, 10));
    }

    @Override // com.applovin.impl.hd
    public boolean c() {
        return false;
    }

    private void f() {
        if (this.d) {
            try {
                this.f24043c.i();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.applovin.impl.hd
    public void c(int i2) {
        f();
        this.f24041a.setVideoScalingMode(i2);
    }

    @Override // com.applovin.impl.hd
    public int d() {
        return this.f24042b.a();
    }

    @Override // com.applovin.impl.hd
    public MediaFormat e() {
        return this.f24042b.c();
    }

    private static String a(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    public /* synthetic */ g1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z2, boolean z3, a aVar) {
        this(mediaCodec, handlerThread, handlerThread2, z2, z3);
    }

    @Override // com.applovin.impl.hd
    public ByteBuffer b(int i2) {
        return this.f24041a.getOutputBuffer(i2);
    }

    @Override // com.applovin.impl.hd
    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f24042b.a(bufferInfo);
    }

    @Override // com.applovin.impl.hd
    public ByteBuffer a(int i2) {
        return this.f24041a.getInputBuffer(i2);
    }

    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2, boolean z2) {
        this.f24042b.a(this.f24041a);
        ko.a("configureCodec");
        this.f24041a.configure(mediaFormat, surface, mediaCrypto, i2);
        ko.a();
        if (z2) {
            this.f24045g = this.f24041a.createInputSurface();
        }
        this.f24043c.h();
        ko.a("startCodec");
        this.f24041a.start();
        ko.a();
        this.f24044f = 1;
    }

    public /* synthetic */ void a(hd.c cVar, MediaCodec mediaCodec, long j2, long j3) {
        cVar.a(this, j2, j3);
    }

    @Override // com.applovin.impl.hd
    public void a(int i2, int i3, int i4, long j2, int i5) {
        this.f24043c.b(i2, i3, i4, j2, i5);
    }

    @Override // com.applovin.impl.hd
    public void a(int i2, int i3, a5 a5Var, long j2, int i4) {
        this.f24043c.a(i2, i3, a5Var, j2, i4);
    }

    @Override // com.applovin.impl.hd
    public void a() {
        try {
            if (this.f24044f == 1) {
                this.f24043c.g();
                this.f24042b.h();
            }
            this.f24044f = 2;
            Surface surface = this.f24045g;
            if (surface != null) {
                surface.release();
            }
            if (this.e) {
                return;
            }
            this.f24041a.release();
            this.e = true;
        } catch (Throwable th) {
            Surface surface2 = this.f24045g;
            if (surface2 != null) {
                surface2.release();
            }
            if (!this.e) {
                this.f24041a.release();
                this.e = true;
            }
            throw th;
        }
    }

    @Override // com.applovin.impl.hd
    public void a(int i2, long j2) {
        this.f24041a.releaseOutputBuffer(i2, j2);
    }

    @Override // com.applovin.impl.hd
    public void a(int i2, boolean z2) {
        this.f24041a.releaseOutputBuffer(i2, z2);
    }

    @Override // com.applovin.impl.hd
    public void a(hd.c cVar, Handler handler) {
        f();
        this.f24041a.setOnFrameRenderedListener(new nt(this, cVar, 0), handler);
    }

    @Override // com.applovin.impl.hd
    public void a(Surface surface) {
        f();
        this.f24041a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.hd
    public void a(Bundle bundle) {
        f();
        this.f24041a.setParameters(bundle);
    }
}
