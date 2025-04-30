package com.applovin.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0699g1 {

    /* renamed from: h, reason: collision with root package name */
    private static final ArrayDeque f7764h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f7765i = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f7766a;
    private final HandlerThread b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f7767c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f7768d;

    /* renamed from: e, reason: collision with root package name */
    private final a4 f7769e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7770f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7771g;

    /* renamed from: com.applovin.impl.g1$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C0699g1.this.a(message);
        }
    }

    /* renamed from: com.applovin.impl.g1$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f7773a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f7774c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f7775d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f7776e;

        /* renamed from: f, reason: collision with root package name */
        public int f7777f;

        public void a(int i9, int i10, int i11, long j7, int i12) {
            this.f7773a = i9;
            this.b = i10;
            this.f7774c = i11;
            this.f7776e = j7;
            this.f7777f = i12;
        }
    }

    public C0699g1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z8) {
        this(mediaCodec, handlerThread, z8, new a4());
    }

    private void c() {
        ((Handler) yp.a(this.f7767c)).removeCallbacksAndMessages(null);
        a();
        e();
    }

    private static b d() {
        ArrayDeque arrayDeque = f7764h;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e() {
        RuntimeException runtimeException = (RuntimeException) this.f7768d.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    private static boolean f() {
        String lowerCase = Ascii.toLowerCase(yp.f12452c);
        if (!lowerCase.contains(Constants.REFERRER_API_SAMSUNG) && !lowerCase.contains("motorola")) {
            return false;
        }
        return true;
    }

    public void b() {
        if (this.f7771g) {
            try {
                c();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    public void g() {
        if (this.f7771g) {
            b();
            this.b.quit();
        }
        this.f7771g = false;
    }

    public void h() {
        if (!this.f7771g) {
            this.b.start();
            this.f7767c = new a(this.b.getLooper());
            this.f7771g = true;
        }
    }

    public void i() {
        a();
    }

    public C0699g1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z8, a4 a4Var) {
        this.f7766a = mediaCodec;
        this.b = handlerThread;
        this.f7769e = a4Var;
        this.f7768d = new AtomicReference();
        this.f7770f = z8 || f();
    }

    private void a() {
        this.f7769e.c();
        ((Handler) yp.a(this.f7767c)).obtainMessage(2).sendToTarget();
        this.f7769e.a();
    }

    private static void a(y4 y4Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = y4Var.f12329f;
        cryptoInfo.numBytesOfClearData = a(y4Var.f12327d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(y4Var.f12328e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC0669a1.a(a(y4Var.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC0669a1.a(a(y4Var.f12325a, cryptoInfo.iv));
        cryptoInfo.mode = y4Var.f12326c;
        if (yp.f12451a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(y4Var.f12330g, y4Var.f12331h));
        }
    }

    public void b(int i9, int i10, int i11, long j7, int i12) {
        e();
        b d2 = d();
        d2.a(i9, i10, i11, j7, i12);
        ((Handler) yp.a(this.f7767c)).obtainMessage(0, d2).sendToTarget();
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        b bVar;
        int i9 = message.what;
        if (i9 == 0) {
            bVar = (b) message.obj;
            a(bVar.f7773a, bVar.b, bVar.f7774c, bVar.f7776e, bVar.f7777f);
        } else if (i9 != 1) {
            if (i9 != 2) {
                a(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f7769e.e();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            a(bVar.f7773a, bVar.b, bVar.f7775d, bVar.f7776e, bVar.f7777f);
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(int i9, int i10, int i11, long j7, int i12) {
        try {
            this.f7766a.queueInputBuffer(i9, i10, i11, j7, i12);
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    private void a(int i9, int i10, MediaCodec.CryptoInfo cryptoInfo, long j7, int i11) {
        try {
            if (this.f7770f) {
                synchronized (f7765i) {
                    this.f7766a.queueSecureInputBuffer(i9, i10, cryptoInfo, j7, i11);
                }
                return;
            }
            this.f7766a.queueSecureInputBuffer(i9, i10, cryptoInfo, j7, i11);
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    public void a(int i9, int i10, y4 y4Var, long j7, int i11) {
        e();
        b d2 = d();
        d2.a(i9, i10, 0, j7, i11);
        a(y4Var, d2.f7775d);
        ((Handler) yp.a(this.f7767c)).obtainMessage(1, d2).sendToTarget();
    }

    public void a(RuntimeException runtimeException) {
        this.f7768d.set(runtimeException);
    }

    private static void a(b bVar) {
        ArrayDeque arrayDeque = f7764h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
