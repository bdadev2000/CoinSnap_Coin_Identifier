package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public final class WO implements C4 {
    public static String[] A0F = {"J778k2tN1A71aNteuaiayf8W9Cwuw9", "SddvXAFvjaaaNZPS5hBFE72C4u8NAkzU", "DlS6L0Rs4yOHZbnixJzGuxf7gpgZ1", "jQlCDwUBXdtP", "ybgFHcAQFxf90xR6S9k4k72uXmSANsHZ", "TXMpPdQfareL1guTNfB0PsKfFvbJoTHv", "R2X9ywuliv1XsGmKXBlkokivcnsZ5nAf", "17XTwjN4yTPZEt52JUGlNgZMXTvW6CfX"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public F9 A04;
    public F9 A05;
    public F9 A06;
    public FA A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final F7 A0B;
    public final F8 A0C;
    public final InterfaceC1179Gm A0D;
    public final C1217Hz A0E;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A07(C1614Xr c1614Xr, F7 f72) {
        int i9;
        long j7 = f72.A01;
        this.A0E.A0W(1);
        A06(j7, this.A0E.A00, 1);
        long j9 = j7 + 1;
        byte b = this.A0E.A00[0];
        boolean z8 = (b & 128) != 0;
        int i10 = b & Ascii.DEL;
        if (c1614Xr.A02.A04 == null) {
            c1614Xr.A02.A04 = new byte[16];
        }
        A06(j9, c1614Xr.A02.A04, i10);
        long j10 = j9 + i10;
        if (z8) {
            this.A0E.A0W(2);
            A06(j10, this.A0E.A00, 2);
            j10 += 2;
            i9 = this.A0E.A0I();
        } else {
            i9 = 1;
            if (A0F[4].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[7] = "qfwCamou4xH4TsJy70kUYaPJ1paRPrQS";
            strArr[6] = "GMGbKrn5SK4TcHFeKaSIsaM2NwTeIDah";
        }
        int[] iArr = c1614Xr.A02.A06;
        if (iArr == null || iArr.length < i9) {
            iArr = new int[i9];
        }
        int[] iArr2 = c1614Xr.A02.A07;
        if (A0F[1].charAt(27) == 'T') {
            throw new RuntimeException();
        }
        A0F[3] = "l74rmj1cvzMl";
        if (iArr2 == null || iArr2.length < i9) {
            iArr2 = new int[i9];
            if (A0F[3].length() != 12) {
                A0F[5] = "mTjJh6O10GTQKtsNTzpZkGXCEgBidJyY";
            } else {
                String[] strArr2 = A0F;
                strArr2[2] = "gGnYbSzqov18WRGS84osGLTli7oQ4";
                strArr2[0] = "bcZjTvBd8pDqGicoFFRFmeT3NfcxuZ";
            }
        }
        if (z8) {
            int i11 = i9 * 6;
            this.A0E.A0W(i11);
            A06(j10, this.A0E.A00, i11);
            j10 += i11;
            this.A0E.A0Y(0);
            for (int i12 = 0; i12 < i9; i12++) {
                iArr[i12] = this.A0E.A0I();
                iArr2[i12] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = f72.A00 - ((int) (j10 - f72.A01));
        }
        C3 c32 = f72.A02;
        c1614Xr.A02.A03(i9, iArr, iArr2, c32.A03, c1614Xr.A02.A04, c32.A01, c32.A02, c32.A00);
        int i13 = (int) (j10 - f72.A01);
        f72.A01 += i13;
        f72.A00 -= i13;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFS(long j7, int i9, int i10, int i11, C3 c32) {
        if (this.A08) {
            A5n(this.A03);
        }
        if (this.A09) {
            if ((i9 & 1) == 0 || !this.A0C.A0J(j7)) {
                return;
            } else {
                this.A09 = false;
            }
        }
        this.A0C.A0G(j7 + this.A00, i9, (this.A01 - i10) - i11, i10, c32);
    }

    public WO(InterfaceC1179Gm interfaceC1179Gm) {
        this.A0D = interfaceC1179Gm;
        int A7D = interfaceC1179Gm.A7D();
        this.A0A = A7D;
        this.A0C = new F8();
        this.A0B = new F7();
        this.A0E = new C1217Hz(32);
        F9 f9 = new F9(0L, A7D);
        this.A04 = f9;
        this.A05 = f9;
        this.A06 = f9;
    }

    private int A00(int i9) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3X(), new F9(this.A06.A03, this.A0A));
        }
        return Math.min(i9, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j7) {
        if (format == null) {
            return null;
        }
        if (A0F[5].charAt(18) == 'x') {
            throw new RuntimeException();
        }
        A0F[5] = "lOB1PW6jUN1Flr4ublIocLHYYSFUXZqB";
        if (j7 != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j7);
        }
        return format;
    }

    private void A02(int i9) {
        long j7 = this.A01 + i9;
        this.A01 = j7;
        if (j7 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j7) {
        while (j7 >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j7) {
        if (j7 == -1) {
            return;
        }
        while (j7 >= this.A04.A03) {
            this.A0D.AEW(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j7, ByteBuffer byteBuffer, int i9) {
        A03(j7);
        while (i9 > 0) {
            int remaining = (int) (this.A05.A03 - j7);
            int min = Math.min(i9, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j7);
            byteBuffer.put(bArr, remaining2, min);
            i9 -= min;
            j7 += min;
            if (j7 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j7, byte[] bArr, int i9) {
        A03(j7);
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (this.A05.A03 - j7));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j7);
            int remaining = i9 - i10;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i10 -= min;
            j7 += min;
            if (j7 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A08(F9 f9) {
        if (!f9.A02) {
            return;
        }
        boolean z8 = this.A06.A02;
        int i9 = (z8 ? 1 : 0) + (((int) (this.A06.A04 - f9.A04)) / this.A0A);
        if (A0F[5].charAt(18) == 'x') {
            throw new RuntimeException();
        }
        A0F[1] = "iejtrz5gn5ypfg4If5spWIciPKrb2ZMM";
        C1178Gl[] c1178GlArr = new C1178Gl[i9];
        for (int i10 = 0; i10 < c1178GlArr.length; i10++) {
            c1178GlArr[i10] = f9.A01;
            f9 = f9.A01();
        }
        this.A0D.AEX(c1178GlArr);
    }

    private final void A09(boolean z8) {
        this.A0C.A0H(z8);
        A08(this.A04);
        F9 f9 = new F9(0L, this.A0A);
        this.A04 = f9;
        this.A05 = f9;
        this.A06 = f9;
        this.A01 = 0L;
        this.A0D.AGj();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j7, boolean z8, boolean z9) {
        return this.A0C.A08(j7, z8, z9);
    }

    public final int A0E(C10199p c10199p, C1614Xr c1614Xr, boolean z8, boolean z9, long j7) {
        int result = this.A0C.A09(c10199p, c1614Xr, z8, z9, this.A02, this.A0B);
        switch (result) {
            case C.RESULT_FORMAT_READ /* -5 */:
                this.A02 = c10199p.A00;
                return -5;
            case C.RESULT_BUFFER_READ /* -4 */:
                if (!c1614Xr.A04()) {
                    if (c1614Xr.A00 < j7) {
                        String[] strArr = A0F;
                        String str = strArr[2];
                        String str2 = strArr[0];
                        int length = str.length();
                        int result2 = str2.length();
                        if (length == result2) {
                            throw new RuntimeException();
                        }
                        A0F[3] = "3oC8GcXqxYNt";
                        c1614Xr.A00(Integer.MIN_VALUE);
                    }
                    if (c1614Xr.A0A()) {
                        A07(c1614Xr, this.A0B);
                    }
                    int result3 = this.A0B.A00;
                    c1614Xr.A09(result3);
                    long j9 = this.A0B.A01;
                    ByteBuffer byteBuffer = c1614Xr.A01;
                    int result4 = this.A0B.A00;
                    A05(j9, byteBuffer, result4);
                    return -4;
                }
                return -4;
            case C.RESULT_NOTHING_READ /* -3 */:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j7, boolean z8, boolean z9) {
        A04(this.A0C.A0D(j7, z8, z9));
    }

    public final void A0L(FA fa) {
        this.A07 = fa;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void A5n(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        FA fa = this.A07;
        if (fa != null && formatChanged) {
            fa.ADS(A01);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final int AFQ(InterfaceC1075Bt interfaceC1075Bt, int i9, boolean z8) throws IOException, InterruptedException {
        int read = interfaceC1075Bt.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i9));
        if (read == -1) {
            if (z8) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        return read;
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFR(C1217Hz c1217Hz, int i9) {
        while (i9 > 0) {
            int A00 = A00(i9);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            c1217Hz.A0c(bArr, bytesAppended, A00);
            i9 -= A00;
            A02(A00);
        }
    }
}
