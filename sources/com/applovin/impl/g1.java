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
/* loaded from: classes.dex */
public class g1 {

    /* renamed from: h, reason: collision with root package name */
    private static final ArrayDeque f4822h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f4823i = new Object();
    private final MediaCodec a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f4824b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f4825c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f4826d;

    /* renamed from: e, reason: collision with root package name */
    private final a4 f4827e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4828f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4829g;

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g1.this.a(message);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public int f4830b;

        /* renamed from: c, reason: collision with root package name */
        public int f4831c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f4832d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f4833e;

        /* renamed from: f, reason: collision with root package name */
        public int f4834f;

        public void a(int i10, int i11, int i12, long j3, int i13) {
            this.a = i10;
            this.f4830b = i11;
            this.f4831c = i12;
            this.f4833e = j3;
            this.f4834f = i13;
        }
    }

    public g1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10) {
        this(mediaCodec, handlerThread, z10, new a4());
    }

    private void c() {
        ((Handler) yp.a(this.f4825c)).removeCallbacksAndMessages(null);
        a();
        e();
    }

    private static b d() {
        ArrayDeque arrayDeque = f4822h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return (b) arrayDeque.removeFirst();
        }
    }

    private void e() {
        RuntimeException runtimeException = (RuntimeException) this.f4826d.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    private static boolean f() {
        String lowerCase = Ascii.toLowerCase(yp.f9254c);
        if (!lowerCase.contains(Constants.REFERRER_API_SAMSUNG) && !lowerCase.contains("motorola")) {
            return false;
        }
        return true;
    }

    public void b() {
        if (this.f4829g) {
            try {
                c();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public void g() {
        if (this.f4829g) {
            b();
            this.f4824b.quit();
        }
        this.f4829g = false;
    }

    public void h() {
        if (!this.f4829g) {
            this.f4824b.start();
            this.f4825c = new a(this.f4824b.getLooper());
            this.f4829g = true;
        }
    }

    public void i() {
        a();
    }

    public g1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10, a4 a4Var) {
        this.a = mediaCodec;
        this.f4824b = handlerThread;
        this.f4827e = a4Var;
        this.f4826d = new AtomicReference();
        this.f4828f = z10 || f();
    }

    private void a() {
        this.f4827e.c();
        ((Handler) yp.a(this.f4825c)).obtainMessage(2).sendToTarget();
        this.f4827e.a();
    }

    private static void a(y4 y4Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = y4Var.f9125f;
        cryptoInfo.numBytesOfClearData = a(y4Var.f9123d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(y4Var.f9124e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) a1.a(a(y4Var.f9121b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) a1.a(a(y4Var.a, cryptoInfo.iv));
        cryptoInfo.mode = y4Var.f9122c;
        if (yp.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(y4Var.f9126g, y4Var.f9127h));
        }
    }

    public void b(int i10, int i11, int i12, long j3, int i13) {
        e();
        b d10 = d();
        d10.a(i10, i11, i12, j3, i13);
        ((Handler) yp.a(this.f4825c)).obtainMessage(0, d10).sendToTarget();
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
        int i10 = message.what;
        if (i10 == 0) {
            bVar = (b) message.obj;
            a(bVar.a, bVar.f4830b, bVar.f4831c, bVar.f4833e, bVar.f4834f);
        } else if (i10 != 1) {
            if (i10 != 2) {
                a(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f4827e.e();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            a(bVar.a, bVar.f4830b, bVar.f4832d, bVar.f4833e, bVar.f4834f);
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(int i10, int i11, int i12, long j3, int i13) {
        try {
            this.a.queueInputBuffer(i10, i11, i12, j3, i13);
        } catch (RuntimeException e2) {
            a(e2);
        }
    }

    private void a(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j3, int i12) {
        try {
            if (this.f4828f) {
                synchronized (f4823i) {
                    this.a.queueSecureInputBuffer(i10, i11, cryptoInfo, j3, i12);
                }
                return;
            }
            this.a.queueSecureInputBuffer(i10, i11, cryptoInfo, j3, i12);
        } catch (RuntimeException e2) {
            a(e2);
        }
    }

    public void a(int i10, int i11, y4 y4Var, long j3, int i12) {
        e();
        b d10 = d();
        d10.a(i10, i11, 0, j3, i12);
        a(y4Var, d10.f4832d);
        ((Handler) yp.a(this.f4825c)).obtainMessage(1, d10).sendToTarget();
    }

    public void a(RuntimeException runtimeException) {
        this.f4826d.set(runtimeException);
    }

    private static void a(b bVar) {
        ArrayDeque arrayDeque = f4822h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
