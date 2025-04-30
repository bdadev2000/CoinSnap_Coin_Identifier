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

/* renamed from: com.applovin.impl.f1 */
/* loaded from: classes.dex */
public final class C0694f1 implements cd {

    /* renamed from: a */
    private final MediaCodec f7521a;
    private final C0704h1 b;

    /* renamed from: c */
    private final C0699g1 f7522c;

    /* renamed from: d */
    private final boolean f7523d;

    /* renamed from: e */
    private boolean f7524e;

    /* renamed from: f */
    private int f7525f;

    /* renamed from: g */
    private Surface f7526g;

    /* renamed from: com.applovin.impl.f1$b */
    /* loaded from: classes.dex */
    public static final class b implements cd.b {
        private final Supplier b;

        /* renamed from: c */
        private final Supplier f7527c;

        /* renamed from: d */
        private final boolean f7528d;

        /* renamed from: e */
        private final boolean f7529e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(final int r4, boolean r5, boolean r6) {
            /*
                r3 = this;
                com.applovin.impl.H0 r0 = new com.applovin.impl.H0
                r1 = 0
                r0.<init>()
                com.applovin.impl.H0 r1 = new com.applovin.impl.H0
                r2 = 1
                r1.<init>()
                r3.<init>(r0, r1, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C0694f1.b.<init>(int, boolean, boolean):void");
        }

        @Override // com.applovin.impl.cd.b
        /* renamed from: b */
        public C0694f1 a(cd.a aVar) {
            MediaCodec mediaCodec;
            String str = aVar.f7078a.f7633a;
            C0694f1 c0694f1 = null;
            try {
                lo.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C0694f1 c0694f12 = new C0694f1(mediaCodec, (HandlerThread) this.b.get(), (HandlerThread) this.f7527c.get(), this.f7528d, this.f7529e);
                    try {
                        lo.a();
                        c0694f12.a(aVar.b, aVar.f7080d, aVar.f7081e, aVar.f7082f, aVar.f7083g);
                        return c0694f12;
                    } catch (Exception e4) {
                        e = e4;
                        c0694f1 = c0694f12;
                        if (c0694f1 != null) {
                            c0694f1.a();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Exception e10) {
                e = e10;
                mediaCodec = null;
            }
        }

        public b(Supplier supplier, Supplier supplier2, boolean z8, boolean z9) {
            this.b = supplier;
            this.f7527c = supplier2;
            this.f7528d = z8;
            this.f7529e = z9;
        }

        public static /* synthetic */ HandlerThread a(int i9) {
            return new HandlerThread(C0694f1.f(i9));
        }

        public static /* synthetic */ HandlerThread b(int i9) {
            return new HandlerThread(C0694f1.g(i9));
        }
    }

    private C0694f1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z8, boolean z9) {
        this.f7521a = mediaCodec;
        this.b = new C0704h1(handlerThread);
        this.f7522c = new C0699g1(mediaCodec, handlerThread2, z8);
        this.f7523d = z9;
        this.f7525f = 0;
    }

    public static String f(int i9) {
        return a(i9, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String g(int i9) {
        return a(i9, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // com.applovin.impl.cd
    public void b() {
        this.f7522c.b();
        this.f7521a.flush();
        C0704h1 c0704h1 = this.b;
        MediaCodec mediaCodec = this.f7521a;
        Objects.requireNonNull(mediaCodec);
        c0704h1.a(new F0(mediaCodec, 10));
    }

    @Override // com.applovin.impl.cd
    public boolean c() {
        return false;
    }

    private void f() {
        if (this.f7523d) {
            try {
                this.f7522c.i();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    @Override // com.applovin.impl.cd
    public void c(int i9) {
        f();
        this.f7521a.setVideoScalingMode(i9);
    }

    @Override // com.applovin.impl.cd
    public int d() {
        return this.b.a();
    }

    @Override // com.applovin.impl.cd
    public MediaFormat e() {
        return this.b.c();
    }

    private static String a(int i9, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i9 == 1) {
            sb.append("Audio");
        } else if (i9 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i9);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer b(int i9) {
        return this.f7521a.getOutputBuffer(i9);
    }

    public /* synthetic */ C0694f1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z8, boolean z9, a aVar) {
        this(mediaCodec, handlerThread, handlerThread2, z8, z9);
    }

    @Override // com.applovin.impl.cd
    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.b.a(bufferInfo);
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer a(int i9) {
        return this.f7521a.getInputBuffer(i9);
    }

    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i9, boolean z8) {
        this.b.a(this.f7521a);
        lo.a("configureCodec");
        this.f7521a.configure(mediaFormat, surface, mediaCrypto, i9);
        lo.a();
        if (z8) {
            this.f7526g = this.f7521a.createInputSurface();
        }
        this.f7522c.h();
        lo.a("startCodec");
        this.f7521a.start();
        lo.a();
        this.f7525f = 1;
    }

    public /* synthetic */ void a(cd.c cVar, MediaCodec mediaCodec, long j7, long j9) {
        cVar.a(this, j7, j9);
    }

    @Override // com.applovin.impl.cd
    public void a(int i9, int i10, int i11, long j7, int i12) {
        this.f7522c.b(i9, i10, i11, j7, i12);
    }

    @Override // com.applovin.impl.cd
    public void a(int i9, int i10, y4 y4Var, long j7, int i11) {
        this.f7522c.a(i9, i10, y4Var, j7, i11);
    }

    @Override // com.applovin.impl.cd
    public void a() {
        try {
            if (this.f7525f == 1) {
                this.f7522c.g();
                this.b.h();
            }
            this.f7525f = 2;
            Surface surface = this.f7526g;
            if (surface != null) {
                surface.release();
            }
            if (this.f7524e) {
                return;
            }
            this.f7521a.release();
            this.f7524e = true;
        } catch (Throwable th) {
            Surface surface2 = this.f7526g;
            if (surface2 != null) {
                surface2.release();
            }
            if (!this.f7524e) {
                this.f7521a.release();
                this.f7524e = true;
            }
            throw th;
        }
    }

    @Override // com.applovin.impl.cd
    public void a(int i9, long j7) {
        this.f7521a.releaseOutputBuffer(i9, j7);
    }

    @Override // com.applovin.impl.cd
    public void a(int i9, boolean z8) {
        this.f7521a.releaseOutputBuffer(i9, z8);
    }

    @Override // com.applovin.impl.cd
    public void a(cd.c cVar, Handler handler) {
        f();
        this.f7521a.setOnFrameRenderedListener(new G0(this, cVar, 0), handler);
    }

    @Override // com.applovin.impl.cd
    public void a(Surface surface) {
        f();
        this.f7521a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.cd
    public void a(Bundle bundle) {
        f();
        this.f7521a.setParameters(bundle);
    }
}
