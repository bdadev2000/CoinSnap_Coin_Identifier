package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0562Ek {
    public static byte[] A03;
    public static String[] A04 = {"UShKNNFg87kJKFq9zZ4MXrM1TZqBqByP", "bNbNgwYs44UALuoZhh", "UOZFjFwmfZ6Uk9K0z0C", "pvrkJysKsIVU", "ICsDSmeasSqv6BvMkmxncpzNQ0k3b5KN", "yTEFvUo2j", "amPx4bchTjSSxZ8pJApIWlQt7YwmxhXF", "zL4iYMzloDmr1aHfk19k2KMtR5ocnLoy"};
    public InterfaceC0508Bs A00;
    public final InterfaceC0510Bu A01;
    public final InterfaceC0508Bs[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 47);
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

    public C0562Ek(InterfaceC0508Bs[] interfaceC0508BsArr, InterfaceC0510Bu interfaceC0510Bu) {
        this.A02 = interfaceC0508BsArr;
        this.A01 = interfaceC0510Bu;
    }

    public final InterfaceC0508Bs A02(InterfaceC0509Bt interfaceC0509Bt, Uri uri) throws IOException, InterruptedException {
        InterfaceC0508Bs interfaceC0508Bs = this.A00;
        if (interfaceC0508Bs != null) {
            return interfaceC0508Bs;
        }
        InterfaceC0508Bs[] interfaceC0508BsArr = this.A02;
        int length = interfaceC0508BsArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            InterfaceC0508Bs interfaceC0508Bs2 = interfaceC0508BsArr[i10];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                interfaceC0509Bt.AFM();
                throw th2;
            }
            if (interfaceC0508Bs2.AGR(interfaceC0509Bt)) {
                this.A00 = interfaceC0508Bs2;
                interfaceC0509Bt.AFM();
                break;
            }
            continue;
            interfaceC0509Bt.AFM();
            i10++;
        }
        InterfaceC0508Bs interfaceC0508Bs3 = this.A00;
        if (interfaceC0508Bs3 != null) {
            interfaceC0508Bs3.A8o(this.A01);
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
