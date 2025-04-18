package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i1 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f24390b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f24391c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f24394h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f24395i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f24396j;

    /* renamed from: k, reason: collision with root package name */
    private long f24397k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f24398l;

    /* renamed from: m, reason: collision with root package name */
    private IllegalStateException f24399m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f24389a = new Object();
    private final ob d = new ob();
    private final ob e = new ob();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f24392f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f24393g = new ArrayDeque();

    public i1(HandlerThread handlerThread) {
        this.f24390b = handlerThread;
    }

    private void b() {
        if (!this.f24393g.isEmpty()) {
            this.f24395i = (MediaFormat) this.f24393g.getLast();
        }
        this.d.a();
        this.e.a();
        this.f24392f.clear();
        this.f24393g.clear();
        this.f24396j = null;
    }

    private boolean d() {
        return this.f24397k > 0 || this.f24398l;
    }

    private void e() {
        f();
        g();
    }

    private void f() {
        IllegalStateException illegalStateException = this.f24399m;
        if (illegalStateException == null) {
            return;
        }
        this.f24399m = null;
        throw illegalStateException;
    }

    private void g() {
        MediaCodec.CodecException codecException = this.f24396j;
        if (codecException == null) {
            return;
        }
        this.f24396j = null;
        throw codecException;
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f24389a) {
            try {
                mediaFormat = this.f24394h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h() {
        synchronized (this.f24389a) {
            this.f24398l = true;
            this.f24390b.quit();
            b();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f24389a) {
            this.f24396j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.f24389a) {
            this.d.a(i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f24389a) {
            try {
                MediaFormat mediaFormat = this.f24395i;
                if (mediaFormat != null) {
                    a(mediaFormat);
                    this.f24395i = null;
                }
                this.e.a(i2);
                this.f24392f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f24389a) {
            a(mediaFormat);
            this.f24395i = null;
        }
    }

    private void a(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.f24393g.add(mediaFormat);
    }

    private void d(Runnable runnable) {
        if (this.f24398l) {
            return;
        }
        long j2 = this.f24397k - 1;
        this.f24397k = j2;
        if (j2 > 0) {
            return;
        }
        if (j2 < 0) {
            a(new IllegalStateException());
            return;
        }
        b();
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            a(e);
        } catch (Exception e2) {
            a(new IllegalStateException(e2));
        }
    }

    public int a() {
        synchronized (this.f24389a) {
            try {
                int i2 = -1;
                if (d()) {
                    return -1;
                }
                e();
                if (!this.d.c()) {
                    i2 = this.d.d();
                }
                return i2;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Runnable runnable) {
        synchronized (this.f24389a) {
            d(runnable);
        }
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f24389a) {
            try {
                if (d()) {
                    return -1;
                }
                e();
                if (this.e.c()) {
                    return -1;
                }
                int d = this.e.d();
                if (d >= 0) {
                    b1.b(this.f24394h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f24392f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (d == -2) {
                    this.f24394h = (MediaFormat) this.f24393g.remove();
                }
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable) {
        synchronized (this.f24389a) {
            this.f24397k++;
            ((Handler) xp.a(this.f24391c)).post(new ms(3, this, runnable));
        }
    }

    public void a(MediaCodec mediaCodec) {
        b1.b(this.f24391c == null);
        this.f24390b.start();
        Handler handler = new Handler(this.f24390b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f24391c = handler;
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f24389a) {
            this.f24399m = illegalStateException;
        }
    }
}
