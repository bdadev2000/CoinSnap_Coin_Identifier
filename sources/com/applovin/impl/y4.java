package com.applovin.impl;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12325a;
    public byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public int f12326c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f12327d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f12328e;

    /* renamed from: f, reason: collision with root package name */
    public int f12329f;

    /* renamed from: g, reason: collision with root package name */
    public int f12330g;

    /* renamed from: h, reason: collision with root package name */
    public int f12331h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f12332i;

    /* renamed from: j, reason: collision with root package name */
    private final b f12333j;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f12334a;
        private final MediaCodec.CryptoInfo.Pattern b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f12334a = cryptoInfo;
            this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i9, int i10) {
            this.b.set(i9, i10);
            this.f12334a.setPattern(this.b);
        }
    }

    public y4() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f12332i = cryptoInfo;
        this.f12333j = yp.f12451a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f12332i;
    }

    public void a(int i9) {
        if (i9 == 0) {
            return;
        }
        if (this.f12327d == null) {
            int[] iArr = new int[1];
            this.f12327d = iArr;
            this.f12332i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f12327d;
        iArr2[0] = iArr2[0] + i9;
    }

    public void a(int i9, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this.f12329f = i9;
        this.f12327d = iArr;
        this.f12328e = iArr2;
        this.b = bArr;
        this.f12325a = bArr2;
        this.f12326c = i10;
        this.f12330g = i11;
        this.f12331h = i12;
        MediaCodec.CryptoInfo cryptoInfo = this.f12332i;
        cryptoInfo.numSubSamples = i9;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i10;
        if (yp.f12451a >= 24) {
            ((b) AbstractC0669a1.a(this.f12333j)).a(i11, i12);
        }
    }
}
