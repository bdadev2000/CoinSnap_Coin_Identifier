package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class h1 extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f5052b;

    /* renamed from: c */
    private Handler f5053c;

    /* renamed from: h */
    private MediaFormat f5058h;

    /* renamed from: i */
    private MediaFormat f5059i;

    /* renamed from: j */
    private MediaCodec.CodecException f5060j;

    /* renamed from: k */
    private long f5061k;

    /* renamed from: l */
    private boolean f5062l;

    /* renamed from: m */
    private IllegalStateException f5063m;
    private final Object a = new Object();

    /* renamed from: d */
    private final kb f5054d = new kb();

    /* renamed from: e */
    private final kb f5055e = new kb();

    /* renamed from: f */
    private final ArrayDeque f5056f = new ArrayDeque();

    /* renamed from: g */
    private final ArrayDeque f5057g = new ArrayDeque();

    public h1(HandlerThread handlerThread) {
        this.f5052b = handlerThread;
    }

    public static /* synthetic */ void a(h1 h1Var, Runnable runnable) {
        h1Var.b(runnable);
    }

    private void b() {
        if (!this.f5057g.isEmpty()) {
            this.f5059i = (MediaFormat) this.f5057g.getLast();
        }
        this.f5054d.a();
        this.f5055e.a();
        this.f5056f.clear();
        this.f5057g.clear();
        this.f5060j = null;
    }

    private boolean d() {
        return this.f5061k > 0 || this.f5062l;
    }

    private void e() {
        f();
        g();
    }

    private void f() {
        IllegalStateException illegalStateException = this.f5063m;
        if (illegalStateException == null) {
            return;
        }
        this.f5063m = null;
        throw illegalStateException;
    }

    private void g() {
        MediaCodec.CodecException codecException = this.f5060j;
        if (codecException == null) {
            return;
        }
        this.f5060j = null;
        throw codecException;
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            mediaFormat = this.f5058h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h() {
        synchronized (this.a) {
            this.f5062l = true;
            this.f5052b.quit();
            b();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.f5060j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.a) {
            this.f5054d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.f5059i;
            if (mediaFormat != null) {
                a(mediaFormat);
                this.f5059i = null;
            }
            this.f5055e.a(i10);
            this.f5056f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            a(mediaFormat);
            this.f5059i = null;
        }
    }

    private void a(MediaFormat mediaFormat) {
        this.f5055e.a(-2);
        this.f5057g.add(mediaFormat);
    }

    private void d(Runnable runnable) {
        if (this.f5062l) {
            return;
        }
        long j3 = this.f5061k - 1;
        this.f5061k = j3;
        if (j3 > 0) {
            return;
        }
        if (j3 < 0) {
            a(new IllegalStateException());
            return;
        }
        b();
        try {
            runnable.run();
        } catch (IllegalStateException e2) {
            a(e2);
        } catch (Exception e10) {
            a(new IllegalStateException(e10));
        }
    }

    public int a() {
        synchronized (this.a) {
            int i10 = -1;
            if (d()) {
                return -1;
            }
            e();
            if (!this.f5054d.c()) {
                i10 = this.f5054d.d();
            }
            return i10;
        }
    }

    /* renamed from: c */
    public void b(Runnable runnable) {
        synchronized (this.a) {
            d(runnable);
        }
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            if (d()) {
                return -1;
            }
            e();
            if (this.f5055e.c()) {
                return -1;
            }
            int d10 = this.f5055e.d();
            if (d10 >= 0) {
                a1.b(this.f5058h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f5056f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (d10 == -2) {
                this.f5058h = (MediaFormat) this.f5057g.remove();
            }
            return d10;
        }
    }

    public void a(Runnable runnable) {
        synchronized (this.a) {
            this.f5061k++;
            ((Handler) yp.a(this.f5053c)).post(new rs(3, this, runnable));
        }
    }

    public void a(MediaCodec mediaCodec) {
        a1.b(this.f5053c == null);
        this.f5052b.start();
        Handler handler = new Handler(this.f5052b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f5053c = handler;
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.f5063m = illegalStateException;
        }
    }
}
