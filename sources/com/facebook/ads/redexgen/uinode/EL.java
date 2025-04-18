package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A05;
    public static String[] A06 = {"ys79rflcZR", "JvXVVVa5NcPDQ", "Q89GAQFZPNwANkfCdiKH1gvUr6", "fZOyMOuChjfI9gOKYd90JCIRk18sz1rD", "OOW8UfRJew081BUdbBG5Pxzf0VO", "xPmLQSFy3SjaACTv6gu", "e8kFvK5VJCM4F", "4YvHW6"};
    public final InterfaceC0618Gr A00;
    public final InterfaceC0620Gt A01;
    public final InterfaceC0620Gt A02;
    public final HK A03;
    public final I3 A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 26;
            String[] strArr = A06;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A06[5] = "z6hEl1VDyGriGJRg";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{126, -115, ByteCompanionObject.MIN_VALUE, 124, -113, ByteCompanionObject.MIN_VALUE, 95, 124, -113, 124, 110, -124, -119, -122};
    }

    static {
        A01();
    }

    public EL(HK hk, InterfaceC0620Gt interfaceC0620Gt) {
        this(hk, interfaceC0620Gt, null, null, null);
    }

    public EL(HK hk, InterfaceC0620Gt interfaceC0620Gt, InterfaceC0620Gt interfaceC0620Gt2, InterfaceC0618Gr interfaceC0618Gr, I3 i32) {
        AbstractC0626Ha.A01(interfaceC0620Gt);
        this.A03 = hk;
        this.A02 = interfaceC0620Gt;
        this.A01 = interfaceC0620Gt2;
        this.A00 = interfaceC0618Gr;
        this.A04 = i32;
    }

    public final HK A02() {
        return this.A03;
    }

    public final C0992Vk A03(boolean z10) {
        InterfaceC0621Gu c1004Vw;
        InterfaceC0620Gt interfaceC0620Gt = this.A01;
        if (interfaceC0620Gt != null) {
            c1004Vw = interfaceC0620Gt.A4X();
        } else {
            c1004Vw = new C1004Vw();
        }
        if (z10) {
            return new C0992Vk(this.A03, C1005Vx.A02, c1004Vw, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 1));
        }
        C0993Vl c0993Vl = new C0993Vl(this.A03, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        InterfaceC0621Gu A4X = this.A02.A4X();
        I3 i32 = this.A04;
        if (i32 != null) {
            A4X = new C0997Vp(A4X, i32, -1000);
        }
        InterfaceC0621Gu upstream = c1004Vw;
        return new C0992Vk(this.A03, A4X, upstream, c0993Vl, 1, null);
    }

    public final I3 A04() {
        I3 i32 = this.A04;
        return i32 != null ? i32 : new I3();
    }
}
