package com.applovin.impl;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f22682a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f22683b;

    /* renamed from: c, reason: collision with root package name */
    public int f22684c;
    public int[] d;
    public int[] e;

    /* renamed from: f, reason: collision with root package name */
    public int f22685f;

    /* renamed from: g, reason: collision with root package name */
    public int f22686g;

    /* renamed from: h, reason: collision with root package name */
    public int f22687h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f22688i;

    /* renamed from: j, reason: collision with root package name */
    private final b f22689j;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f22690a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f22691b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f22690a = cryptoInfo;
            this.f22691b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i2, int i3) {
            this.f22691b.set(i2, i3);
            this.f22690a.setPattern(this.f22691b);
        }
    }

    public a5() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f22688i = cryptoInfo;
        this.f22689j = xp.f27962a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f22688i;
    }

    public void a(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.d == null) {
            int[] iArr = new int[1];
            this.d = iArr;
            this.f22688i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.d;
        iArr2[0] = iArr2[0] + i2;
    }

    public void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f22685f = i2;
        this.d = iArr;
        this.e = iArr2;
        this.f22683b = bArr;
        this.f22682a = bArr2;
        this.f22684c = i3;
        this.f22686g = i4;
        this.f22687h = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.f22688i;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (xp.f27962a >= 24) {
            ((b) b1.a(this.f22689j)).a(i4, i5);
        }
    }
}
