package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1031Xa implements CA {
    public static byte[] A07;
    public static String[] A08 = {"S6y5l6jxI9", "6mnEH66ZFffSlH4yeHJS8qNG", "YOAMbMDgHDJdJlquETda64yXe2Dsnigk", "hsyrHKVntalAWTsGKMDD", "vPfGZ", "fU8euoLNwl", "f8hQ6WKdo4yu3", "0USUeFTSnT76dGHmDwgcSkrJJgtZvyOb"};
    public int A00;
    public int A01;
    public long A02;
    public CC A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C9> A05 = new ArrayDeque<>();
    public final CH A04 = new CH();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{124, -95, -87, -108, -97, -100, -105, 83, -104, -97, -104, -96, -104, -95, -89, 83, -89, -84, -93, -104, 83, -100, -63, -55, -76, -65, -68, -73, 115, -71, -65, -62, -76, -57, 115, -58, -68, -51, -72, -115, 115, -27, 10, Ascii.DC2, -3, 8, 5, 0, -68, 5, 10, Ascii.DLE, 1, 3, 1, Ascii.SO, -68, Ascii.SI, 5, Ascii.SYN, 1, -42, -68, -127, -94, -96, -105, -100, -107, 78, -109, -102, -109, -101, -109, -100, -94, 78, -95, -105, -88, -109, 104, 78};
    }

    static {
        A05();
    }

    private double A00(InterfaceC0509Bt interfaceC0509Bt, int i10) throws IOException, InterruptedException {
        long A02 = A02(interfaceC0509Bt, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        interfaceC0509Bt.AFM();
        while (true) {
            interfaceC0509Bt.ADv(this.A06, 0, 4);
            int A00 = CH.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) CH.A01(this.A06, A00, false);
                if (this.A03.A96(A01)) {
                    interfaceC0509Bt.AGP(A00);
                    return A01;
                }
            }
            interfaceC0509Bt.AGP(1);
        }
    }

    private long A02(InterfaceC0509Bt interfaceC0509Bt, int i10) throws IOException, InterruptedException {
        interfaceC0509Bt.readFully(this.A06, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long value = this.A06[i11] & UByte.MAX_VALUE;
            j3 = (j3 << 8) | value;
        }
        return j3;
    }

    private String A04(InterfaceC0509Bt interfaceC0509Bt, int i10) throws IOException, InterruptedException {
        if (i10 == 0) {
            return A03(0, 0, 103);
        }
        byte[] bArr = new byte[i10];
        interfaceC0509Bt.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.CA
    public final void A8p(CC cc2) {
        this.A03 = cc2;
    }

    @Override // com.facebook.ads.redexgen.uinode.CA
    public final boolean AEJ(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        long j3;
        int i10;
        AbstractC0626Ha.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long A7i = interfaceC0509Bt.A7i();
                C9 peek = this.A05.peek();
                if (A08[4].length() == 19) {
                    throw new RuntimeException();
                }
                A08[1] = "iTM85rd";
                j3 = peek.A01;
                if (A7i >= j3) {
                    CC cc2 = this.A03;
                    i10 = this.A05.pop().A00;
                    cc2.A5X(i10);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(interfaceC0509Bt, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(interfaceC0509Bt);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC0509Bt, false, true, 8);
                this.A01 = 2;
            }
            int A6s = this.A03.A6s(this.A00);
            switch (A6s) {
                case 0:
                    int type = (int) this.A02;
                    interfaceC0509Bt.AGP(type);
                    this.A01 = 0;
                case 1:
                    long A7i2 = interfaceC0509Bt.A7i();
                    this.A05.push(new C9(this.A00, A7i2 + this.A02));
                    this.A03.AGU(this.A00, A7i2, this.A02);
                    this.A01 = 0;
                    return true;
                case 2:
                    long j10 = this.A02;
                    if (j10 <= 8) {
                        this.A03.A8t(this.A00, A02(interfaceC0509Bt, (int) j10));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C04599v(A03(41, 22, 116) + this.A02);
                case 3:
                    long j11 = this.A02;
                    if (j11 <= 2147483647L) {
                        this.A03.AGc(this.A00, A04(interfaceC0509Bt, (int) j11));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C04599v(A03(63, 21, 6) + this.A02);
                case 4:
                    this.A03.A42(this.A00, (int) this.A02, interfaceC0509Bt);
                    if (A08[7].charAt(2) != 'S') {
                        A08[2] = "x8X2xTnJq9Kheln0ABdW7PO8kghsREvE";
                        this.A01 = 0;
                        return true;
                    }
                    A08[4] = "mGqeeb15RRoJ11oGs7LhfnjQvY";
                    this.A01 = 0;
                    return true;
                case 5:
                    long j12 = this.A02;
                    if (j12 == 4 || j12 == 8) {
                        this.A03.A5j(this.A00, A00(interfaceC0509Bt, (int) j12));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C04599v(A03(21, 20, 43) + this.A02);
                default:
                    throw new C04599v(A03(0, 21, 11) + A6s);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.CA
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
