package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1614Xr extends B7 {
    public static byte[] A04;
    public static String[] A05 = {"WgYXI97W146UztDd2a1JJEY", "PsmwC9oqdyflgYHEgRnESYlgTeL5m", "sr0zZC", "IkxlPpvfN8PqekaVjdRKnPQ5qAHRvCRG", "ReX0ZTUtTZFjxgVLIFehD5WGT1dwWLSU", "UaiZSduPNT4pUzkcj0jxvMNPl1Qynet7", "ONHsqZM0nT", "E3MBww8xLldGzmr6Q6FQJNMbPzNXN"};
    public long A00;
    public ByteBuffer A01;
    public final BA A02 = new BA();
    public final int A03;

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{113, 109, 113, 118, 77, 122, 105, 105, 106, 125, 47, 123, 96, 96, 47, 124, 98, 110, 99, 99, 47, 39};
    }

    static {
        A05();
    }

    public C1614Xr(int i9) {
        this.A03 = i9;
    }

    public static C1614Xr A02() {
        return new C1614Xr(0);
    }

    private ByteBuffer A04(int i9) {
        int i10 = this.A03;
        if (i10 == 1) {
            ByteBuffer allocate = ByteBuffer.allocate(i9);
            if (A05[6].length() == 5) {
                throw new RuntimeException();
            }
            A05[4] = "fER9zQpCkdGo4Mwu26bVu9SaUs9Fh1Su";
            return allocate;
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.A01;
        throw new IllegalStateException(A03(4, 18, 20) + (byteBuffer == null ? 0 : byteBuffer.capacity()) + A03(0, 3, 74) + i9 + A03(3, 1, 68));
    }

    @Override // com.meta.analytics.dsp.uinode.B7
    public final void A07() {
        super.A07();
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void A08() {
        this.A01.flip();
    }

    public final void A09(int i9) throws IllegalStateException {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            this.A01 = A04(i9);
            return;
        }
        int position = byteBuffer.capacity();
        int position2 = this.A01.position();
        int capacity = position2 + i9;
        if (position >= capacity) {
            return;
        }
        ByteBuffer A042 = A04(capacity);
        if (position2 > 0) {
            this.A01.position(0);
            this.A01.limit(position2);
            A042.put(this.A01);
        }
        this.A01 = A042;
        int position3 = A05[6].length();
        if (position3 == 5) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[2] = "FWU9S4";
        strArr[0] = "hmujVtIh5DBUtGb3epSbNIE";
    }

    public final boolean A0A() {
        return A06(1073741824);
    }

    public final boolean A0B() {
        if (this.A01 == null) {
            int i9 = this.A03;
            if (A05[4].charAt(30) != 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "8PuFrx";
            strArr[0] = "MogEwKvIx3RF4VQZDhNq5vz";
            if (i9 == 0) {
                return true;
            }
        }
        return false;
    }
}
