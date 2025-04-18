package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.cd;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f1 implements cd {
    private final MediaCodec a;

    /* renamed from: b */
    private final h1 f4566b;

    /* renamed from: c */
    private final g1 f4567c;

    /* renamed from: d */
    private final boolean f4568d;

    /* renamed from: e */
    private boolean f4569e;

    /* renamed from: f */
    private int f4570f;

    /* renamed from: g */
    private Surface f4571g;

    /* loaded from: classes.dex */
    public static final class b implements cd.b {

        /* renamed from: b */
        private final Supplier f4572b;

        /* renamed from: c */
        private final Supplier f4573c;

        /* renamed from: d */
        private final boolean f4574d;

        /* renamed from: e */
        private final boolean f4575e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(final int r4, boolean r5, boolean r6) {
            /*
                r3 = this;
                com.applovin.impl.pt r0 = new com.applovin.impl.pt
                r1 = 0
                r0.<init>()
                com.applovin.impl.pt r1 = new com.applovin.impl.pt
                r2 = 1
                r1.<init>()
                r3.<init>(r0, r1, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.f1.b.<init>(int, boolean, boolean):void");
        }

        @Override // com.applovin.impl.cd.b
        /* renamed from: b */
        public f1 a(cd.a aVar) {
            MediaCodec mediaCodec;
            String str = aVar.a.a;
            f1 f1Var = null;
            try {
                lo.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    f1 f1Var2 = new f1(mediaCodec, (HandlerThread) this.f4572b.get(), (HandlerThread) this.f4573c.get(), this.f4574d, this.f4575e);
                    try {
                        lo.a();
                        f1Var2.a(aVar.f4095b, aVar.f4097d, aVar.f4098e, aVar.f4099f, aVar.f4100g);
                        return f1Var2;
                    } catch (Exception e2) {
                        e = e2;
                        f1Var = f1Var2;
                        if (f1Var != null) {
                            f1Var.a();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodec = null;
            }
        }

        public b(Supplier supplier, Supplier supplier2, boolean z10, boolean z11) {
            this.f4572b = supplier;
            this.f4573c = supplier2;
            this.f4574d = z10;
            this.f4575e = z11;
        }

        public static /* synthetic */ HandlerThread a(int i10) {
            return new HandlerThread(f1.f(i10));
        }

        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(f1.g(i10));
        }
    }

    private f1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.a = mediaCodec;
        this.f4566b = new h1(handlerThread);
        this.f4567c = new g1(mediaCodec, handlerThread2, z10);
        this.f4568d = z11;
        this.f4570f = 0;
    }

    public static /* synthetic */ void a(f1 f1Var, cd.c cVar, MediaCodec mediaCodec, long j3, long j10) {
        f1Var.a(cVar, mediaCodec, j3, j10);
    }

    public static String f(int i10) {
        return a(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String g(int i10) {
        return a(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // com.applovin.impl.cd
    public void b() {
        this.f4567c.b();
        this.a.flush();
        h1 h1Var = this.f4566b;
        MediaCodec mediaCodec = this.a;
        Objects.requireNonNull(mediaCodec);
        h1Var.a(new nt(mediaCodec, 10));
    }

    @Override // com.applovin.impl.cd
    public boolean c() {
        return false;
    }

    private void f() {
        if (this.f4568d) {
            try {
                this.f4567c.i();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // com.applovin.impl.cd
    public void c(int i10) {
        f();
        this.a.setVideoScalingMode(i10);
    }

    @Override // com.applovin.impl.cd
    public int d() {
        return this.f4566b.a();
    }

    @Override // com.applovin.impl.cd
    public MediaFormat e() {
        return this.f4566b.c();
    }

    private static String a(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer b(int i10) {
        return this.a.getOutputBuffer(i10);
    }

    public /* synthetic */ f1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11, a aVar) {
        this(mediaCodec, handlerThread, handlerThread2, z10, z11);
    }

    @Override // com.applovin.impl.cd
    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f4566b.a(bufferInfo);
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer a(int i10) {
        return this.a.getInputBuffer(i10);
    }

    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
        this.f4566b.a(this.a);
        lo.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, i10);
        lo.a();
        if (z10) {
            this.f4571g = this.a.createInputSurface();
        }
        this.f4567c.h();
        lo.a("startCodec");
        this.a.start();
        lo.a();
        this.f4570f = 1;
    }

    public /* synthetic */ void a(cd.c cVar, MediaCodec mediaCodec, long j3, long j10) {
        cVar.a(this, j3, j10);
    }

    @Override // com.applovin.impl.cd
    public void a(int i10, int i11, int i12, long j3, int i13) {
        this.f4567c.b(i10, i11, i12, j3, i13);
    }

    @Override // com.applovin.impl.cd
    public void a(int i10, int i11, y4 y4Var, long j3, int i12) {
        this.f4567c.a(i10, i11, y4Var, j3, i12);
    }

    @Override // com.applovin.impl.cd
    public void a() {
        try {
            if (this.f4570f == 1) {
                this.f4567c.g();
                this.f4566b.h();
            }
            this.f4570f = 2;
        } finally {
            Surface surface = this.f4571g;
            if (surface != null) {
                surface.release();
            }
            if (!this.f4569e) {
                this.a.release();
                this.f4569e = true;
            }
        }
    }

    @Override // com.applovin.impl.cd
    public void a(int i10, long j3) {
        this.a.releaseOutputBuffer(i10, j3);
    }

    @Override // com.applovin.impl.cd
    public void a(int i10, boolean z10) {
        this.a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.applovin.impl.cd
    public void a(cd.c cVar, Handler handler) {
        f();
        this.a.setOnFrameRenderedListener(new ot(this, cVar, 0), handler);
    }

    @Override // com.applovin.impl.cd
    public void a(Surface surface) {
        f();
        this.a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.cd
    public void a(Bundle bundle) {
        f();
        this.a.setParameters(bundle);
    }
}
