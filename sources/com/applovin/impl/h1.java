package com.applovin.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h1 {

    /* renamed from: h, reason: collision with root package name */
    private static final ArrayDeque f24184h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f24185i = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f24186a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f24187b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f24188c;
    private final AtomicReference d;
    private final c4 e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24189f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24190g;

    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            h1.this.a(message);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f24192a;

        /* renamed from: b, reason: collision with root package name */
        public int f24193b;

        /* renamed from: c, reason: collision with root package name */
        public int f24194c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;

        /* renamed from: f, reason: collision with root package name */
        public int f24195f;

        public void a(int i2, int i3, int i4, long j2, int i5) {
            this.f24192a = i2;
            this.f24193b = i3;
            this.f24194c = i4;
            this.e = j2;
            this.f24195f = i5;
        }
    }

    public h1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z2) {
        this(mediaCodec, handlerThread, z2, new c4());
    }

    private void c() {
        ((Handler) xp.a(this.f24188c)).removeCallbacksAndMessages(null);
        a();
        e();
    }

    private static b d() {
        ArrayDeque arrayDeque = f24184h;
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
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private static boolean f() {
        String lowerCase = Ascii.toLowerCase(xp.f27964c);
        return lowerCase.contains("samsung") || lowerCase.contains("motorola");
    }

    public void b() {
        if (this.f24190g) {
            try {
                c();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public void g() {
        if (this.f24190g) {
            b();
            this.f24187b.quit();
        }
        this.f24190g = false;
    }

    public void h() {
        if (this.f24190g) {
            return;
        }
        this.f24187b.start();
        this.f24188c = new a(this.f24187b.getLooper());
        this.f24190g = true;
    }

    public void i() {
        a();
    }

    public h1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z2, c4 c4Var) {
        this.f24186a = mediaCodec;
        this.f24187b = handlerThread;
        this.e = c4Var;
        this.d = new AtomicReference();
        this.f24189f = z2 || f();
    }

    private void a() {
        this.e.c();
        ((Handler) xp.a(this.f24188c)).obtainMessage(2).sendToTarget();
        this.e.a();
    }

    public void b(int i2, int i3, int i4, long j2, int i5) {
        e();
        b d = d();
        d.a(i2, i3, i4, j2, i5);
        ((Handler) xp.a(this.f24188c)).obtainMessage(0, d).sendToTarget();
    }

    private static void a(a5 a5Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = a5Var.f22685f;
        cryptoInfo.numBytesOfClearData = a(a5Var.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(a5Var.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) b1.a(a(a5Var.f22683b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) b1.a(a(a5Var.f22682a, cryptoInfo.iv));
        cryptoInfo.mode = a5Var.f22684c;
        if (xp.f27962a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(a5Var.f22686g, a5Var.f22687h));
        }
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
        int i2 = message.what;
        if (i2 == 0) {
            bVar = (b) message.obj;
            a(bVar.f24192a, bVar.f24193b, bVar.f24194c, bVar.e, bVar.f24195f);
        } else if (i2 != 1) {
            if (i2 != 2) {
                a(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.e.e();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            a(bVar.f24192a, bVar.f24193b, bVar.d, bVar.e, bVar.f24195f);
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(int i2, int i3, int i4, long j2, int i5) {
        try {
            this.f24186a.queueInputBuffer(i2, i3, i4, j2, i5);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    private void a(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j2, int i4) {
        try {
            if (this.f24189f) {
                synchronized (f24185i) {
                    this.f24186a.queueSecureInputBuffer(i2, i3, cryptoInfo, j2, i4);
                }
                return;
            }
            this.f24186a.queueSecureInputBuffer(i2, i3, cryptoInfo, j2, i4);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    public void a(int i2, int i3, a5 a5Var, long j2, int i4) {
        e();
        b d = d();
        d.a(i2, i3, 0, j2, i4);
        a(a5Var, d.d);
        ((Handler) xp.a(this.f24188c)).obtainMessage(1, d).sendToTarget();
    }

    public void a(RuntimeException runtimeException) {
        this.d.set(runtimeException);
    }

    private static void a(b bVar) {
        ArrayDeque arrayDeque = f24184h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
