package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CH {
    public static byte[] A03;
    public static String[] A04 = {"jNGyeOKibO3rZ", "Gh5JKt6GRlqFQi5f7wncYkOvXKUgvq3H", "CofAGDTz318WCwUORyk9cSrFfeh2Hkrj", "9nnBa0OOqYKGA4mW7JXlquoRY2XdVC9l", "SGv5o9U73t5KHQiabCNHP6atzf1gi70l", "Pw4XIo5raqSVixY1hwfj9nDYbuGZRESR", "ADqcQvt0hpjLC586x1ggUJbhpZ3DSlma", "N1vQLbUqrUUUOY9UOZX86MfJnRzuBUgh"};
    public static final long[] A05;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
                break;
            }
            A04[3] = "ZERhDI0eRTm5worZScrGBygyYS9gFskv";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 77);
            String[] strArr2 = A04;
            if (strArr2[4].charAt(6) != strArr2[7].charAt(6)) {
                break;
            }
            String[] strArr3 = A04;
            strArr3[6] = "5jMkCIwJgzdMCgzRGNs7rdJ4OYAUyBry";
            strArr3[2] = "xyMLmlHhB2f8Cz8kVUOrh9ZTHBCB3Rr0";
            i12++;
        }
        throw new RuntimeException();
    }

    public static void A03() {
        A03 = new byte[]{64, 97, 46, 120, 111, 98, 103, 106, 46, 120, 111, 124, 103, 96, 122, 46, 98, 107, 96, 105, 122, 102, 46, 99, 111, 125, 101, 46, 104, 97, 123, 96, 106};
    }

    static {
        A03();
        A05 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int i9) {
        int i10 = 0;
        while (true) {
            long[] jArr = A05;
            int varIntLength = jArr.length;
            if (i10 >= varIntLength) {
                return -1;
            }
            if ((jArr[i10] & i9) != 0) {
                return i10 + 1;
            }
            i10++;
        }
    }

    public static long A01(byte[] bArr, int i9, boolean z8) {
        long j7 = bArr[0] & 255;
        if (z8) {
            long j9 = A05[i9 - 1];
            String[] strArr = A04;
            if (strArr[5].charAt(17) != strArr[1].charAt(17)) {
                throw new RuntimeException();
            }
            A04[0] = "UDmiDfZ1LL8gM";
            j7 &= j9 ^ (-1);
        }
        for (int i10 = 1; i10 < i9; i10++) {
            long j10 = j7 << 8;
            byte b = bArr[i10];
            if (A04[3].charAt(15) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "cm8OQheSofC6CbyPg1WnuKrHLhcydwvw";
            strArr2[2] = "ayPMvBCy6e1LCFJPDiyGHhHMjUGacyfS";
            long varint = b;
            j7 = j10 | (varint & 255);
        }
        return j7;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(InterfaceC1075Bt interfaceC1075Bt, boolean z8, boolean z9, int i9) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            if (!interfaceC1075Bt.AEM(this.A02, 0, 1, z8)) {
                return -1L;
            }
            int firstByte = this.A02[0] & 255;
            int A00 = A00(firstByte);
            this.A00 = A00;
            if (A00 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException(A02(0, 33, 67));
            }
        }
        int i10 = this.A00;
        if (i10 > i9) {
            this.A01 = 0;
            return -2L;
        }
        if (i10 != 1) {
            interfaceC1075Bt.readFully(this.A02, 1, i10 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z9);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
