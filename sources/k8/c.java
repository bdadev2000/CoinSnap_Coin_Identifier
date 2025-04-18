package k8;

import a4.g0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class c implements l {
    public final MediaCodec a;

    /* renamed from: b, reason: collision with root package name */
    public final g f20288b;

    /* renamed from: c, reason: collision with root package name */
    public final e f20289c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20290d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20291e;

    /* renamed from: f, reason: collision with root package name */
    public int f20292f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.a = mediaCodec;
        this.f20288b = new g(handlerThread);
        this.f20289c = new e(mediaCodec, handlerThread2);
        this.f20290d = z10;
    }

    public static void n(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z10;
        g gVar = cVar.f20288b;
        if (gVar.f20308c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        HandlerThread handlerThread = gVar.f20307b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = cVar.a;
        mediaCodec.setCallback(gVar, handler);
        gVar.f20308c = handler;
        c6.k.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        c6.k.k();
        e eVar = cVar.f20289c;
        if (!eVar.f20304f) {
            HandlerThread handlerThread2 = eVar.f20300b;
            handlerThread2.start();
            eVar.f20301c = new h.f(eVar, handlerThread2.getLooper(), 3);
            eVar.f20304f = true;
        }
        c6.k.c("startCodec");
        mediaCodec.start();
        c6.k.k();
        cVar.f20292f = 1;
    }

    public static String o(int i10, String str) {
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

    @Override // k8.l
    public final void a(o9.g gVar, Handler handler) {
        p();
        this.a.setOnFrameRenderedListener(new a(this, gVar, 0), handler);
    }

    @Override // k8.l
    public final MediaFormat b() {
        MediaFormat mediaFormat;
        g gVar = this.f20288b;
        synchronized (gVar.a) {
            mediaFormat = gVar.f20313h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // k8.l
    public final ByteBuffer c(int i10) {
        return this.a.getInputBuffer(i10);
    }

    @Override // k8.l
    public final void d(Surface surface) {
        p();
        this.a.setOutputSurface(surface);
    }

    @Override // k8.l
    public final void e(int i10, w7.d dVar, long j3) {
        d dVar2;
        e eVar = this.f20289c;
        eVar.b();
        ArrayDeque arrayDeque = e.f20298g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                dVar2 = new d();
            } else {
                dVar2 = (d) arrayDeque.removeFirst();
            }
        }
        dVar2.a = i10;
        dVar2.f20293b = 0;
        dVar2.f20294c = 0;
        dVar2.f20296e = j3;
        dVar2.f20297f = 0;
        int i11 = dVar.f26873f;
        MediaCodec.CryptoInfo cryptoInfo = dVar2.f20295d;
        cryptoInfo.numSubSamples = i11;
        int[] iArr = dVar.f26871d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = dVar.f26872e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.f26869b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = dVar.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = dVar.f26870c;
        if (h0.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f26874g, dVar.f26875h));
        }
        eVar.f20301c.obtainMessage(1, dVar2).sendToTarget();
    }

    @Override // k8.l
    public final void f() {
    }

    @Override // k8.l
    public final void flush() {
        this.f20289c.a();
        this.a.flush();
        g gVar = this.f20288b;
        synchronized (gVar.a) {
            gVar.f20316k++;
            Handler handler = gVar.f20308c;
            int i10 = h0.a;
            handler.post(new f(gVar, 0));
        }
        this.a.start();
    }

    @Override // k8.l
    public final void g(Bundle bundle) {
        p();
        this.a.setParameters(bundle);
    }

    @Override // k8.l
    public final void h(int i10, long j3) {
        this.a.releaseOutputBuffer(i10, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: all -> 0x0042, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:12:0x001f, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:25:0x0038, B:26:0x0034, B:27:0x003a, B:28:0x003c, B:29:0x003d, B:30:0x003f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:12:0x001f, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:25:0x0038, B:26:0x0034, B:27:0x003a, B:28:0x003c, B:29:0x003d, B:30:0x003f), top: B:3:0x000a }] */
    @Override // k8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i() {
        /*
            r7 = this;
            k8.e r0 = r7.f20289c
            r0.b()
            k8.g r0 = r7.f20288b
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            long r2 = r0.f20316k     // Catch: java.lang.Throwable -> L42
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L1b
            boolean r2 = r0.f20317l     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            r5 = -1
            if (r2 == 0) goto L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            goto L39
        L21:
            java.lang.IllegalStateException r2 = r0.f20318m     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r2 != 0) goto L3d
            android.media.MediaCodec$CodecException r2 = r0.f20315j     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L3a
            g8.f r0 = r0.f20309d     // Catch: java.lang.Throwable -> L42
            int r2 = r0.f18259c     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L31
            r3 = r4
        L31:
            if (r3 == 0) goto L34
            goto L38
        L34:
            int r5 = r0.d()     // Catch: java.lang.Throwable -> L42
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
        L39:
            return r5
        L3a:
            r0.f20315j = r6     // Catch: java.lang.Throwable -> L42
            throw r2     // Catch: java.lang.Throwable -> L42
        L3d:
            r0.f20318m = r6     // Catch: java.lang.Throwable -> L42
            throw r2     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r0
        L42:
            r0 = move-exception
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c.i():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[Catch: all -> 0x006d, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:11:0x001e, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:24:0x0032, B:25:0x0035, B:27:0x003b, B:28:0x0062, B:33:0x0058, B:34:0x0065, B:35:0x0067, B:36:0x0068, B:37:0x006a), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:11:0x001e, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:24:0x0032, B:25:0x0035, B:27:0x003b, B:28:0x0062, B:33:0x0058, B:34:0x0065, B:35:0x0067, B:36:0x0068, B:37:0x006a), top: B:3:0x000a }] */
    @Override // k8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            k8.e r0 = r9.f20289c
            r0.b()
            k8.g r0 = r9.f20288b
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            long r2 = r0.f20316k     // Catch: java.lang.Throwable -> L6d
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L1b
            boolean r2 = r0.f20317l     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L20
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            goto L33
        L20:
            java.lang.IllegalStateException r2 = r0.f20318m     // Catch: java.lang.Throwable -> L6d
            r5 = 0
            if (r2 != 0) goto L68
            android.media.MediaCodec$CodecException r2 = r0.f20315j     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L65
            g8.f r2 = r0.f20310e     // Catch: java.lang.Throwable -> L6d
            int r5 = r2.f18259c     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L30
            r3 = r4
        L30:
            if (r3 == 0) goto L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
        L33:
            r10 = -1
            goto L64
        L35:
            int r2 = r2.d()     // Catch: java.lang.Throwable -> L6d
            if (r2 < 0) goto L55
            android.media.MediaFormat r3 = r0.f20313h     // Catch: java.lang.Throwable -> L6d
            v8.u0.p(r3)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r0 = r0.f20311f     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L6d
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L6d
            int r4 = r0.offset     // Catch: java.lang.Throwable -> L6d
            int r5 = r0.size     // Catch: java.lang.Throwable -> L6d
            long r6 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L6d
            int r8 = r0.flags     // Catch: java.lang.Throwable -> L6d
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L6d
            goto L62
        L55:
            r10 = -2
            if (r2 != r10) goto L62
            java.util.ArrayDeque r10 = r0.f20312g     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L6d
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L6d
            r0.f20313h = r10     // Catch: java.lang.Throwable -> L6d
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            r10 = r2
        L64:
            return r10
        L65:
            r0.f20315j = r5     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L68:
            r0.f20318m = r5     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L6b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            throw r10
        L6d:
            r10 = move-exception
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c.j(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // k8.l
    public final void k(int i10, boolean z10) {
        this.a.releaseOutputBuffer(i10, z10);
    }

    @Override // k8.l
    public final ByteBuffer l(int i10) {
        return this.a.getOutputBuffer(i10);
    }

    @Override // k8.l
    public final void m(int i10, int i11, long j3, int i12) {
        d dVar;
        e eVar = this.f20289c;
        eVar.b();
        ArrayDeque arrayDeque = e.f20298g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                dVar = new d();
            } else {
                dVar = (d) arrayDeque.removeFirst();
            }
        }
        dVar.a = i10;
        dVar.f20293b = 0;
        dVar.f20294c = i11;
        dVar.f20296e = j3;
        dVar.f20297f = i12;
        h.f fVar = eVar.f20301c;
        int i13 = h0.a;
        fVar.obtainMessage(0, dVar).sendToTarget();
    }

    public final void p() {
        if (this.f20290d) {
            try {
                e eVar = this.f20289c;
                g0 g0Var = eVar.f20303e;
                synchronized (g0Var) {
                    g0Var.a = false;
                }
                h.f fVar = eVar.f20301c;
                fVar.getClass();
                fVar.obtainMessage(2).sendToTarget();
                synchronized (g0Var) {
                    while (!g0Var.a) {
                        g0Var.wait();
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // k8.l
    public final void release() {
        try {
            if (this.f20292f == 1) {
                e eVar = this.f20289c;
                if (eVar.f20304f) {
                    eVar.a();
                    eVar.f20300b.quit();
                }
                eVar.f20304f = false;
                g gVar = this.f20288b;
                synchronized (gVar.a) {
                    gVar.f20317l = true;
                    gVar.f20307b.quit();
                    gVar.a();
                }
            }
            this.f20292f = 2;
        } finally {
            if (!this.f20291e) {
                this.a.release();
                this.f20291e = true;
            }
        }
    }

    @Override // k8.l
    public final void setVideoScalingMode(int i10) {
        p();
        this.a.setVideoScalingMode(i10);
    }
}
