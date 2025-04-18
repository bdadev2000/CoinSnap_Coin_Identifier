package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1000Xz implements InterfaceC0455Bx {
    public static String[] A08 = {"TOwSaeopWt9RIXmRrRQZwDuesIPAjimN", "m0YfCnzLjOMwBkPVrsGxjCiWTjg4eRpW", "OSs4RcvEx1fqe6WQBFkQnVWQQo5eEQ5g", "d1b9lbTXuFgKm0nY", "40KeqNYkGIg2lKcWJqrJfIqB2UKZ02Df", "7BwS2S40JWuyc5xmMzDJ", "w0DKA7VvSD5aMvU9byhgHeDf3SsHODBV", "AZ8mKiYMDCexUwniF0cO0Lykq6xa72Qc"};
    public static final C0 A09 = new Y0();
    public long A00;
    public InterfaceC0457Bz A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<DA> A05;
    public final I4 A06;
    public final IG A07;

    public C1000Xz() {
        this(new IG(0L));
    }

    public C1000Xz(IG ig) {
        this.A07 = ig;
        this.A06 = new I4(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void A9D(InterfaceC0457Bz interfaceC0457Bz) {
        this.A01 = interfaceC0457Bz;
        interfaceC0457Bz.AG8(new C1015Yo(-9223372036854775807L));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final int AEk(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        long j2;
        if (!interfaceC0456By.AEP(this.A06.A00, 0, 4, true)) {
            return -1;
        }
        this.A06.A0Y(0);
        int A082 = this.A06.A08();
        if (A082 == 441) {
            return -1;
        }
        if (A082 == 442) {
            interfaceC0456By.AEO(this.A06.A00, 0, 10);
            this.A06.A0Y(9);
            int nextStartCode = this.A06.A0E();
            interfaceC0456By.AGq((nextStartCode & 7) + 14);
            return 0;
        }
        if (A082 == 443) {
            interfaceC0456By.AEO(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode2 = this.A06.A0I();
            interfaceC0456By.AGq(nextStartCode2 + 6);
            return 0;
        }
        int nextStartCode3 = A082 & (-256);
        if ((nextStartCode3 >> 8) != 1) {
            interfaceC0456By.AGq(1);
            return 0;
        }
        int i2 = A082 & 255;
        DA da = this.A05.get(i2);
        if (!this.A02) {
            if (da == null) {
                D3 elementaryStreamReader = null;
                if (i2 == 189) {
                    elementaryStreamReader = new YE();
                    this.A03 = true;
                    this.A00 = interfaceC0456By.A86();
                } else if ((i2 & 224) == 192) {
                    elementaryStreamReader = new Y2();
                    this.A03 = true;
                    this.A00 = interfaceC0456By.A86();
                } else if ((i2 & 240) == 224) {
                    elementaryStreamReader = new Y7();
                    this.A04 = true;
                    this.A00 = interfaceC0456By.A86();
                }
                if (elementaryStreamReader != null) {
                    elementaryStreamReader.A5B(this.A01, new DH(i2, 256));
                    da = new DA(elementaryStreamReader, this.A07);
                    this.A05.put(i2, da);
                }
            }
            if (this.A03 && this.A04) {
                j2 = this.A00 + 8192;
            } else {
                j2 = 1048576;
            }
            if (interfaceC0456By.A86() > j2) {
                this.A02 = true;
                this.A01.A5u();
            }
        }
        interfaceC0456By.AEO(this.A06.A00, 0, 2);
        this.A06.A0Y(0);
        int nextStartCode4 = this.A06.A0I();
        int i3 = nextStartCode4 + 6;
        if (da == null) {
            interfaceC0456By.AGq(i3);
        } else {
            I4 i4 = this.A06;
            if (A08[3].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "j5TposUyMNBjvJQv7fBjXCxPICHPLvzQ";
            strArr[4] = "7epKzrJqV329mASYJ56vhWx8nQlYd13J";
            i4.A0W(i3);
            interfaceC0456By.readFully(this.A06.A00, 0, i3);
            this.A06.A0Y(6);
            da.A03(this.A06);
            I4 i42 = this.A06;
            int nextStartCode5 = this.A06.A05();
            i42.A0X(nextStartCode5);
        }
        return 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AG7(long r6, long r8) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.IG r0 = r5.A07
            r0.A08()
            r4 = 0
        L6:
            android.util.SparseArray<com.facebook.ads.redexgen.X.DA> r0 = r5.A05
            int r0 = r0.size()
            if (r4 >= r0) goto L3b
            android.util.SparseArray<com.facebook.ads.redexgen.X.DA> r0 = r5.A05
            java.lang.Object r3 = r0.valueAt(r4)
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C1000Xz.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2c:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C1000Xz.A08
            java.lang.String r1 = "i2l135vnIgvDI5cE6wxXd3NswI9xNsO1"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.X.DA r3 = (com.instagram.common.viewpoint.core.DA) r3
            r3.A02()
            int r4 = r4 + 1
            goto L6
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1000Xz.AG7(long, long):void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final boolean AGs(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        interfaceC0456By.AEO(bArr, 0, 14);
        if (442 != (((bArr[0] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        int packStuffingLength = bArr[13] & 7;
        interfaceC0456By.A3s(packStuffingLength);
        interfaceC0456By.AEO(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i2 = (packStuffingLength2 & 255) << 16;
        int packStuffingLength3 = bArr[1];
        int i3 = i2 | ((packStuffingLength3 & 255) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & 255) | i3);
    }
}
