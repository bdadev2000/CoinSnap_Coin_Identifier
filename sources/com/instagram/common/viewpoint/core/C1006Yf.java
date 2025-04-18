package com.instagram.common.viewpoint.core;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Yf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1006Yf implements CF {
    public static byte[] A07;
    public static String[] A08 = {"B", "", "BrvSCWdfcuCaq5cVU07ZhXt", "qubJP7lsNWbo", "NFdit9VNslJwWcMc3jsN0gE8Kfr4ZGkz", "XUMceIPS5Pe", "7dzq6MzNvuPcuITQcDTRqTS6G3kR4", "NdQzj"};
    public int A00;
    public int A01;
    public long A02;
    public CH A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<CE> A05 = new ArrayDeque<>();
    public final CM A04 = new CM();

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{26, 61, 37, 50, Utf8.REPLACEMENT_BYTE, 58, 55, 115, 54, Utf8.REPLACEMENT_BYTE, 54, 62, 54, 61, 39, 115, 39, 42, 35, 54, 115, 87, 112, 104, Byte.MAX_VALUE, 114, 119, 122, 62, 120, 114, 113, Byte.MAX_VALUE, 106, 62, 109, 119, 100, 123, 36, 62, 79, 104, 112, 103, 106, 111, 98, 38, 111, 104, 114, 99, 97, 99, 116, 38, 117, 111, 124, 99, 60, 38, 74, 109, 107, 112, 119, 126, 57, 124, 117, 124, 116, 124, 119, 109, 57, 106, 112, 99, 124, 35, 57};
    }

    static {
        A05();
    }

    private double A00(InterfaceC0456By interfaceC0456By, int i2) throws IOException, InterruptedException {
        long A02 = A02(interfaceC0456By, i2);
        if (i2 == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        interfaceC0456By.AFq();
        while (true) {
            interfaceC0456By.AEO(this.A06, 0, 4);
            int A00 = CM.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) CM.A01(this.A06, A00, false);
                if (this.A03.A9V(A01)) {
                    interfaceC0456By.AGq(A00);
                    return A01;
                }
            }
            interfaceC0456By.AGq(1);
        }
    }

    private long A02(InterfaceC0456By interfaceC0456By, int i2) throws IOException, InterruptedException {
        interfaceC0456By.readFully(this.A06, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long value = this.A06[i3] & UnsignedBytes.MAX_VALUE;
            j2 = (j2 << 8) | value;
        }
        return j2;
    }

    private String A04(InterfaceC0456By interfaceC0456By, int i2) throws IOException, InterruptedException {
        if (i2 == 0) {
            return A03(0, 0, 30);
        }
        byte[] bArr = new byte[i2];
        interfaceC0456By.readFully(bArr, 0, i2);
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        return new String(bArr, 0, i2);
    }

    @Override // com.instagram.common.viewpoint.core.CF
    public final void A9E(CH ch) {
        this.A03 = ch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x016c, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0074. Please report as an issue. */
    @Override // com.instagram.common.viewpoint.core.CF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AEm(com.instagram.common.viewpoint.core.InterfaceC0456By r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1006Yf.AEm(com.facebook.ads.redexgen.X.By):boolean");
    }

    @Override // com.instagram.common.viewpoint.core.CF
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
