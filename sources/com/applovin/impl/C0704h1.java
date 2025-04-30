package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704h1 extends MediaCodec.Callback {
    private final HandlerThread b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f8022c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f8027h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f8028i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f8029j;

    /* renamed from: k, reason: collision with root package name */
    private long f8030k;
    private boolean l;
    private IllegalStateException m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f8021a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final kb f8023d = new kb();

    /* renamed from: e, reason: collision with root package name */
    private final kb f8024e = new kb();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f8025f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f8026g = new ArrayDeque();

    public C0704h1(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private void b() {
        if (!this.f8026g.isEmpty()) {
            this.f8028i = (MediaFormat) this.f8026g.getLast();
        }
        this.f8023d.a();
        this.f8024e.a();
        this.f8025f.clear();
        this.f8026g.clear();
        this.f8029j = null;
    }

    private boolean d() {
        return this.f8030k > 0 || this.l;
    }

    private void e() {
        f();
        g();
    }

    private void f() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    private void g() {
        MediaCodec.CodecException codecException = this.f8029j;
        if (codecException == null) {
            return;
        }
        this.f8029j = null;
        throw codecException;
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f8021a) {
            try {
                mediaFormat = this.f8027h;
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
        synchronized (this.f8021a) {
            this.l = true;
            this.b.quit();
            b();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f8021a) {
            this.f8029j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i9) {
        synchronized (this.f8021a) {
            this.f8023d.a(i9);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i9, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f8021a) {
            try {
                MediaFormat mediaFormat = this.f8028i;
                if (mediaFormat != null) {
                    a(mediaFormat);
                    this.f8028i = null;
                }
                this.f8024e.a(i9);
                this.f8025f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f8021a) {
            a(mediaFormat);
            this.f8028i = null;
        }
    }

    private void a(MediaFormat mediaFormat) {
        this.f8024e.a(-2);
        this.f8026g.add(mediaFormat);
    }

    private void d(Runnable runnable) {
        if (this.l) {
            return;
        }
        long j7 = this.f8030k - 1;
        this.f8030k = j7;
        if (j7 > 0) {
            return;
        }
        if (j7 < 0) {
            a(new IllegalStateException());
            return;
        }
        b();
        try {
            runnable.run();
        } catch (IllegalStateException e4) {
            a(e4);
        } catch (Exception e9) {
            a(new IllegalStateException(e9));
        }
    }

    public int a() {
        synchronized (this.f8021a) {
            try {
                int i9 = -1;
                if (d()) {
                    return -1;
                }
                e();
                if (!this.f8023d.c()) {
                    i9 = this.f8023d.d();
                }
                return i9;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Runnable runnable) {
        synchronized (this.f8021a) {
            d(runnable);
        }
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f8021a) {
            try {
                if (d()) {
                    return -1;
                }
                e();
                if (this.f8024e.c()) {
                    return -1;
                }
                int d2 = this.f8024e.d();
                if (d2 >= 0) {
                    AbstractC0669a1.b(this.f8027h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f8025f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (d2 == -2) {
                    this.f8027h = (MediaFormat) this.f8026g.remove();
                }
                return d2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable) {
        synchronized (this.f8021a) {
            this.f8030k++;
            ((Handler) yp.a(this.f8022c)).post(new F(3, this, runnable));
        }
    }

    public void a(MediaCodec mediaCodec) {
        AbstractC0669a1.b(this.f8022c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f8022c = handler;
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f8021a) {
            this.m = illegalStateException;
        }
    }
}
