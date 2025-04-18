package com.applovin.impl;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class y4 {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f9121b;

    /* renamed from: c, reason: collision with root package name */
    public int f9122c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f9123d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f9124e;

    /* renamed from: f, reason: collision with root package name */
    public int f9125f;

    /* renamed from: g, reason: collision with root package name */
    public int f9126g;

    /* renamed from: h, reason: collision with root package name */
    public int f9127h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f9128i;

    /* renamed from: j, reason: collision with root package name */
    private final b f9129j;

    /* loaded from: classes.dex */
    public static final class b {
        private final MediaCodec.CryptoInfo a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f9130b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.f9130b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10, int i11) {
            this.f9130b.set(i10, i11);
            this.a.setPattern(this.f9130b);
        }
    }

    public y4() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f9128i = cryptoInfo;
        this.f9129j = yp.a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f9128i;
    }

    public void a(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f9123d == null) {
            int[] iArr = new int[1];
            this.f9123d = iArr;
            this.f9128i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f9123d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f9125f = i10;
        this.f9123d = iArr;
        this.f9124e = iArr2;
        this.f9121b = bArr;
        this.a = bArr2;
        this.f9122c = i11;
        this.f9126g = i12;
        this.f9127h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f9128i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (yp.a >= 24) {
            ((b) a1.a(this.f9129j)).a(i12, i13);
        }
    }
}
