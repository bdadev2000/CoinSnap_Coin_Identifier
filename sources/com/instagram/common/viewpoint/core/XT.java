package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public final class XT implements C9 {
    public static String[] A0F = {"3qzXOmg4s2331UA7hG", "9bk", "VVdoXs4tz6DPKYHGOZRt6RiMCyELY1A5", "g7JlN9bgbBs41PAJ4JuNA0qeFJ1c1UUN", "LKvHqs3IZORZ6jeOQe1pAUwl2aVi1yge", "34f97P4Qb7PfWYgeR24LPv7AajWY1fA6", "GiS2v9udXUeFFnoeEASPbMACNgmzJ", "g0nN8wixzNmLcgKoJI"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public FE A04;
    public FE A05;
    public FE A06;
    public FF A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final InterfaceC0562Gr A0D;
    public final FD A0C = new FD();
    public final FC A0B = new FC();
    public final I4 A0E = new I4(32);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A07(C1023Yw c1023Yw, FC fc) {
        int i2;
        long j2 = fc.A01;
        this.A0E.A0W(1);
        A06(j2, this.A0E.A00, 1);
        long j3 = j2 + 1;
        byte b2 = this.A0E.A00[0];
        boolean z2 = (b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        int i3 = b2 & Byte.MAX_VALUE;
        BF bf = c1023Yw.A02;
        String[] strArr = A0F;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[7] = "6HdF621ULlaMIov5Sn";
        strArr2[0] = "aYQM3gHOLvWB46aIdh";
        if (bf.A04 == null) {
            c1023Yw.A02.A04 = new byte[16];
        }
        A06(j3, c1023Yw.A02.A04, i3);
        long j4 = j3 + i3;
        if (z2) {
            this.A0E.A0W(2);
            A06(j4, this.A0E.A00, 2);
            j4 += 2;
            i2 = this.A0E.A0I();
        } else {
            i2 = 1;
        }
        int[] iArr = c1023Yw.A02.A06;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = c1023Yw.A02.A07;
        if (iArr2 == null || iArr2.length < i2) {
            iArr2 = new int[i2];
        }
        if (z2) {
            int i4 = i2 * 6;
            this.A0E.A0W(i4);
            A06(j4, this.A0E.A00, i4);
            j4 += i4;
            this.A0E.A0Y(0);
            for (int i5 = 0; i5 < i2; i5++) {
                iArr[i5] = this.A0E.A0I();
                iArr2[i5] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = fc.A00 - ((int) (j4 - fc.A01));
        }
        C8 c8 = fc.A02;
        c1023Yw.A02.A03(i2, iArr, iArr2, c8.A03, c1023Yw.A02.A04, c8.A01, c8.A02, c8.A00);
        int i6 = (int) (j4 - fc.A01);
        fc.A01 += i6;
        fc.A00 -= i6;
    }

    public XT(InterfaceC0562Gr interfaceC0562Gr) {
        this.A0D = interfaceC0562Gr;
        this.A0A = interfaceC0562Gr.A7b();
        this.A04 = new FE(0L, this.A0A);
        this.A05 = this.A04;
        this.A06 = this.A04;
    }

    private int A00(int i2) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3t(), new FE(this.A06.A03, this.A0A));
        }
        return Math.min(i2, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j2) {
        if (format == null) {
            return null;
        }
        if (j2 == 0) {
            return format;
        }
        long j3 = format.A0G;
        String[] strArr = A0F;
        if (strArr[5].charAt(28) != strArr[4].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "iKt3Y1BQ3CJXTdnfarGB4lWbdbXT1axy";
        strArr2[4] = "iefBNEa9mmKDxjNV7WvFRyBB3S0z1vzT";
        if (j3 != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j2);
        }
        return format;
    }

    private void A02(int i2) {
        this.A01 += i2;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j2) {
        while (j2 >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j2) {
        if (j2 == -1) {
            return;
        }
        while (j2 >= this.A04.A03) {
            this.A0D.AEz(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j2, ByteBuffer byteBuffer, int i2) {
        A03(j2);
        while (i2 > 0) {
            int remaining = (int) (this.A05.A03 - j2);
            int min = Math.min(i2, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j2);
            byteBuffer.put(bArr, remaining2, min);
            i2 -= min;
            j2 += min;
            if (j2 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j2, byte[] bArr, int i2) {
        A03(j2);
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (this.A05.A03 - j2));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j2);
            int remaining = i2 - i3;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i3 -= min;
            j2 += min;
            if (j2 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A08(FE fe) {
        if (!fe.A02) {
            return;
        }
        boolean z2 = this.A06.A02;
        C0561Gq[] c0561GqArr = new C0561Gq[(z2 ? 1 : 0) + (((int) (this.A06.A04 - fe.A04)) / this.A0A)];
        for (int i2 = 0; i2 < c0561GqArr.length; i2++) {
            c0561GqArr[i2] = fe.A01;
            fe = fe.A01();
        }
        this.A0D.AF0(c0561GqArr);
    }

    private final void A09(boolean z2) {
        this.A0C.A0H(z2);
        A08(this.A04);
        this.A04 = new FE(0L, this.A0A);
        this.A05 = this.A04;
        this.A06 = this.A04;
        this.A01 = 0L;
        this.A0D.AHB();
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

    public final int A0D(long j2, boolean z2, boolean z3) {
        return this.A0C.A08(j2, z2, z3);
    }

    public final int A0E(C04029u c04029u, C1023Yw c1023Yw, boolean z2, boolean z3, long j2) {
        int result = this.A0C.A09(c04029u, c1023Yw, z2, z3, this.A02, this.A0B);
        switch (result) {
            case InstallErrorCode.ERROR_INSTALL_UNAVAILABLE /* -5 */:
                this.A02 = c04029u.A00;
                return -5;
            case -4:
                if (!c1023Yw.A04()) {
                    if (c1023Yw.A00 < j2) {
                        c1023Yw.A00(Integer.MIN_VALUE);
                    }
                    boolean A0A = c1023Yw.A0A();
                    String[] strArr = A0F;
                    String str = strArr[3];
                    String str2 = strArr[2];
                    int charAt = str.charAt(7);
                    int result2 = str2.charAt(7);
                    if (charAt == result2) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0F;
                    strArr2[7] = "nHnyKFMdmGIlRqyLio";
                    strArr2[0] = "5Se0YnkMdMNTcGBGkq";
                    if (A0A) {
                        A07(c1023Yw, this.A0B);
                    }
                    int result3 = this.A0B.A00;
                    c1023Yw.A09(result3);
                    long j3 = this.A0B.A01;
                    ByteBuffer byteBuffer = c1023Yw.A01;
                    int result4 = this.A0B.A00;
                    A05(j3, byteBuffer, result4);
                    return -4;
                }
                return -4;
            case -3:
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

    public final void A0K(long j2, boolean z2, boolean z3) {
        A04(this.A0C.A0D(j2, z2, z3));
    }

    public final void A0L(FF ff) {
        this.A07 = ff;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.instagram.common.viewpoint.core.C9
    public final void A69(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        if (this.A07 != null && formatChanged) {
            this.A07.ADv(A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C9
    public final int AFu(InterfaceC0456By interfaceC0456By, int i2, boolean z2) throws IOException, InterruptedException {
        int read = interfaceC0456By.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i2));
        if (read == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        return read;
    }

    @Override // com.instagram.common.viewpoint.core.C9
    public final void AFv(I4 i4, int i2) {
        while (i2 > 0) {
            int A00 = A00(i2);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            i4.A0c(bArr, bytesAppended, A00);
            i2 -= A00;
            A02(A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C9
    public final void AFw(long j2, int i2, int i3, int i4, C8 c8) {
        if (this.A08) {
            A69(this.A03);
        }
        if (this.A09) {
            if ((i2 & 1) == 0 || !this.A0C.A0J(j2)) {
                return;
            }
            String[] strArr = A0F;
            if (strArr[3].charAt(7) == strArr[2].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "0U0U2SqxFsdc1RAk3H";
            strArr2[0] = "sNqMg87rvgY5P5a5aa";
            this.A09 = false;
        }
        this.A0C.A0G(j2 + this.A00, i2, (this.A01 - i3) - i4, i3, c8);
    }
}
