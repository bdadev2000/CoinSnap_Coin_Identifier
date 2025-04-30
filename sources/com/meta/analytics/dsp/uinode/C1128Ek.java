package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1128Ek {
    public static byte[] A03;
    public static String[] A04 = {"UShKNNFg87kJKFq9zZ4MXrM1TZqBqByP", "bNbNgwYs44UALuoZhh", "UOZFjFwmfZ6Uk9K0z0C", "pvrkJysKsIVU", "ICsDSmeasSqv6BvMkmxncpzNQ0k3b5KN", "yTEFvUo2j", "amPx4bchTjSSxZ8pJApIWlQt7YwmxhXF", "zL4iYMzloDmr1aHfk19k2KMtR5ocnLoy"};
    public InterfaceC1074Bs A00;
    public final InterfaceC1076Bu A01;
    public final InterfaceC1074Bs[] A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "BFR1v4rNBeEaqGbowcf";
        strArr2[5] = "QYASgTnFJ";
        A03 = new byte[]{-52, -61, 6, Ascii.DC2, Ascii.CAN, Ascii.SI, 7, -61, Ascii.NAK, 8, 4, 7, -61, Ascii.ETB, Ascii.VT, 8, -61, Ascii.SYN, Ascii.ETB, Ascii.NAK, 8, 4, Ascii.DLE, -47, -17, Ascii.DLE, Ascii.SI, 6, -63, Ascii.DLE, 7, -63, Ascii.NAK, 9, 6, -63, 2, Ascii.ETB, 2, 10, Ascii.CR, 2, 3, Ascii.CR, 6, -63, 6, Ascii.EM, Ascii.NAK, 19, 2, 4, Ascii.NAK, Ascii.DLE, 19, Ascii.DC4, -63, -55};
    }

    static {
        A01();
    }

    public C1128Ek(InterfaceC1074Bs[] interfaceC1074BsArr, InterfaceC1076Bu interfaceC1076Bu) {
        this.A02 = interfaceC1074BsArr;
        this.A01 = interfaceC1076Bu;
    }

    public final InterfaceC1074Bs A02(InterfaceC1075Bt interfaceC1075Bt, Uri uri) throws IOException, InterruptedException {
        InterfaceC1074Bs interfaceC1074Bs = this.A00;
        if (interfaceC1074Bs != null) {
            return interfaceC1074Bs;
        }
        InterfaceC1074Bs[] interfaceC1074BsArr = this.A02;
        int length = interfaceC1074BsArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            InterfaceC1074Bs interfaceC1074Bs2 = interfaceC1074BsArr[i9];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC1075Bt.AFM();
                throw th;
            }
            if (interfaceC1074Bs2.AGR(interfaceC1075Bt)) {
                this.A00 = interfaceC1074Bs2;
                interfaceC1075Bt.AFM();
                break;
            }
            continue;
            interfaceC1075Bt.AFM();
            i9++;
        }
        InterfaceC1074Bs interfaceC1074Bs3 = this.A00;
        if (interfaceC1074Bs3 != null) {
            interfaceC1074Bs3.A8o(this.A01);
            return this.A00;
        }
        throw new WM(A00(24, 34, 114) + IF.A0S(this.A02) + A00(0, 24, 116), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
