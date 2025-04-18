package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YC implements InterfaceC0455Bx {
    public static byte[] A04;
    public static String[] A05 = {"N3GpeYjJMdKFRv0SshHJKYsMOuO8p0tA", "wiC15XfKNpxiBv337rdfaN7iMk56huNL", "A3rsL6GYIxDIsUnc56leVSLnuuwWJE", "ZqwBdGbE4SmgDsULJVLTHbFOP2ezpJEQ", "xoPpoqfJCAQQdXeq5BVdnLmzIY6pHKhI", "B8ZA", "v1zw", "7spihzsXhr8LXNxcY6XClUbYBtHjjuHe"};
    public static final C0 A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final YB A02;
    public final I4 A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            byte b2 = copyOfRange[i5];
            if (A05[2].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "3ZPkzOiGV9NVnE4h3utFZ5OzDgmotOaN";
            strArr[1] = "eEVTlcljeWNjgsJMtw5K8hnVppEY0YPV";
            copyOfRange[i5] = (byte) ((b2 ^ i4) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{79, 66, 53};
    }

    static {
        A01();
        A06 = new YD();
        A07 = IK.A08(A00(0, 3, 93));
    }

    public YC() {
        this(0L);
    }

    public YC(long j2) {
        this.A01 = j2;
        this.A02 = new YB(true);
        this.A03 = new I4(200);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void A9D(InterfaceC0457Bz interfaceC0457Bz) {
        this.A02.A5B(interfaceC0457Bz, new DH(0, 1));
        interfaceC0457Bz.A5u();
        interfaceC0457Bz.AG8(new C1015Yo(-9223372036854775807L));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final int AEk(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        int read = interfaceC0456By.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            YB yb = this.A02;
            long j2 = this.A01;
            String[] strArr = A05;
            String str = strArr[3];
            String str2 = strArr[1];
            int charAt = str.charAt(14);
            int bytesRead = str2.charAt(14);
            if (charAt == bytesRead) {
                throw new RuntimeException();
            }
            A05[6] = "35by";
            yb.AEM(j2, true);
            this.A00 = true;
        }
        this.A02.A4n(this.A03);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void AG7(long j2, long j3) {
        this.A00 = false;
        this.A02.AG6();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final boolean AGs(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        I4 i4 = new I4(10);
        I3 i3 = new I3(i4.A00);
        int startPosition = 0;
        while (true) {
            interfaceC0456By.AEO(i4.A00, 0, 10);
            i4.A0Y(0);
            if (i4.A0G() != A07) {
                break;
            }
            i4.A0Z(3);
            int A0D = i4.A0D();
            startPosition += A0D + 10;
            interfaceC0456By.A3s(A0D);
        }
        interfaceC0456By.AFq();
        interfaceC0456By.A3s(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i2 = 0;
        while (true) {
            interfaceC0456By.AEO(i4.A00, 0, 2);
            i4.A0Y(0);
            int headerPosition = 65526 & i4.A0I();
            if (headerPosition != 65520) {
                i2 = 0;
                validFramesCount = 0;
                interfaceC0456By.AFq();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC0456By.A3s(syncBytes);
            } else {
                i2++;
                if (i2 >= 4 && validFramesCount > 188) {
                    return true;
                }
                interfaceC0456By.AEO(i4.A00, 0, 4);
                i3.A07(14);
                int headerPosition3 = i3.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                interfaceC0456By.A3s(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
