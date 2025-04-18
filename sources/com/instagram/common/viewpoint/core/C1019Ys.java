package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1019Ys implements InterfaceC0456By {
    public static String[] A07 = {"UVRdrrF5AQHdn5VM3Ax7WcOvit3GJvfg", "IurwM7uI09sQtW0HXBAe", "aEKj", "lR", "u6F3mb", "doA9UZ62L24DYsON", "v0Wrh1Y4KqLJK8wLp", "upnoaaNR"};
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC0570Gz A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C1019Ys(InterfaceC0570Gz interfaceC0570Gz, long j2, long j3) {
        this.A05 = interfaceC0570Gz;
        this.A02 = j2;
        this.A04 = j3;
    }

    private int A00(int i2) {
        int bytesSkipped = Math.min(this.A00, i2);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i2, int i3) {
        if (this.A00 == 0) {
            return 0;
        }
        int min = Math.min(this.A00, i3);
        System.arraycopy(this.A03, 0, bArr, i2, min);
        A05(min);
        return min;
    }

    private int A02(byte[] bArr, int i2, int i3, int i4, boolean z2) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i2 + i4, i3 - i4);
            String[] strArr = A07;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[4] = "iBALdr";
            if (read == -1) {
                if (i4 == 0 && z2) {
                    return -1;
                }
                throw new EOFException();
            }
            return i4 + read;
        }
        throw new InterruptedException();
    }

    private void A03(int i2) {
        if (i2 != -1) {
            this.A02 += i2;
        }
    }

    private void A04(int i2) {
        int i3 = this.A01 + i2;
        int requiredLength = this.A03.length;
        if (i3 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = Opcodes.ASM8 + i3;
            int newPeekCapacity = IK.A06(requiredLength2 * 2, 65536 + i3, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i2) {
        this.A00 -= i2;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (this.A00 < this.A03.length - Opcodes.ASM8) {
            bArr = new byte[this.A00 + 65536];
        }
        byte[] newPeekBuffer = this.A03;
        System.arraycopy(newPeekBuffer, i2, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i2, boolean z2) throws IOException, InterruptedException {
        A04(i2);
        int min = Math.min(this.A00 - this.A01, i2);
        while (min < i2) {
            min = A02(this.A03, this.A01, i2, min, z2);
            if (min == -1) {
                return false;
            }
        }
        int bytesPeeked = this.A01;
        this.A01 = bytesPeeked + i2;
        int i3 = this.A00;
        int bytesPeeked2 = this.A01;
        this.A00 = Math.max(i3, bytesPeeked2);
        if (A07[6].length() == 13) {
            throw new RuntimeException();
        }
        A07[6] = "PCV";
        return true;
    }

    public final boolean A07(int i2, boolean z2) throws IOException, InterruptedException {
        int A00 = A00(i2);
        while (A00 < i2 && A00 != -1) {
            int bytesSkipped = this.A06.length;
            A00 = A02(this.A06, -A00, Math.min(i2, bytesSkipped + A00), A00, z2);
        }
        A03(A00);
        return A00 != -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final void A3s(int i2) throws IOException, InterruptedException {
        A06(i2, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final long A7g() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final long A81() {
        return this.A02 + this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final long A86() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final void AEO(byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        AEP(bArr, i2, i3, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final boolean AEP(byte[] bArr, int i2, int i3, boolean z2) throws IOException, InterruptedException {
        if (!A06(i3, z2)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final boolean AEp(byte[] bArr, int i2, int i3, boolean z2) throws IOException, InterruptedException {
        int A01 = A01(bArr, i2, i3);
        while (A01 < i3 && A01 != -1) {
            A01 = A02(bArr, i2, i3, A01, z2);
        }
        A03(A01);
        return A01 != -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final void AFq() {
        this.A01 = 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final int AGn(int i2) throws IOException, InterruptedException {
        int bytesSkipped = A00(i2);
        if (bytesSkipped == 0) {
            bytesSkipped = A02(this.A06, 0, Math.min(i2, this.A06.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final void AGq(int i2) throws IOException, InterruptedException {
        A07(i2, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final int read(byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        int bytesRead = A01(bArr, i2, i3);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i2, i3, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0456By
    public final void readFully(byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        AEp(bArr, i2, i3, false);
    }
}
