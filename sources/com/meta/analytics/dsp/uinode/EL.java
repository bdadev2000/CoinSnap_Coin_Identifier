package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A05;
    public static String[] A06 = {"ys79rflcZR", "JvXVVVa5NcPDQ", "Q89GAQFZPNwANkfCdiKH1gvUr6", "fZOyMOuChjfI9gOKYd90JCIRk18sz1rD", "OOW8UfRJew081BUdbBG5Pxzf0VO", "xPmLQSFy3SjaACTv6gu", "e8kFvK5VJCM4F", "4YvHW6"};
    public final InterfaceC1184Gr A00;
    public final InterfaceC1186Gt A01;
    public final InterfaceC1186Gt A02;
    public final HK A03;
    public final I3 A04;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = (copyOfRange[i12] - i11) - 26;
            String[] strArr = A06;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A06[5] = "z6hEl1VDyGriGJRg";
            copyOfRange[i12] = (byte) i13;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{126, -115, Byte.MIN_VALUE, 124, -113, Byte.MIN_VALUE, 95, 124, -113, 124, 110, -124, -119, -122};
    }

    static {
        A01();
    }

    public EL(HK hk, InterfaceC1186Gt interfaceC1186Gt) {
        this(hk, interfaceC1186Gt, null, null, null);
    }

    public EL(HK hk, InterfaceC1186Gt interfaceC1186Gt, InterfaceC1186Gt interfaceC1186Gt2, InterfaceC1184Gr interfaceC1184Gr, I3 i32) {
        AbstractC1192Ha.A01(interfaceC1186Gt);
        this.A03 = hk;
        this.A02 = interfaceC1186Gt;
        this.A01 = interfaceC1186Gt2;
        this.A00 = interfaceC1184Gr;
        this.A04 = i32;
    }

    public final HK A02() {
        return this.A03;
    }

    public final C1558Vk A03(boolean z8) {
        InterfaceC1187Gu c1570Vw;
        InterfaceC1186Gt interfaceC1186Gt = this.A01;
        if (interfaceC1186Gt != null) {
            c1570Vw = interfaceC1186Gt.A4X();
        } else {
            c1570Vw = new C1570Vw();
        }
        if (z8) {
            return new C1558Vk(this.A03, C1571Vx.A02, c1570Vw, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 1));
        }
        C1559Vl c1559Vl = new C1559Vl(this.A03, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        InterfaceC1187Gu A4X = this.A02.A4X();
        I3 i32 = this.A04;
        if (i32 != null) {
            A4X = new C1563Vp(A4X, i32, -1000);
        }
        InterfaceC1187Gu upstream = c1570Vw;
        return new C1558Vk(this.A03, A4X, upstream, c1559Vl, 1, null);
    }

    public final I3 A04() {
        I3 i32 = this.A04;
        return i32 != null ? i32 : new I3();
    }
}
