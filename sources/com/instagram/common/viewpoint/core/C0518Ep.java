package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0518Ep {
    public static byte[] A03;
    public InterfaceC0455Bx A00;
    public final InterfaceC0457Bz A01;
    public final InterfaceC0455Bx[] A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{67, 74, 9, 5, 31, 6, 14, 74, 24, 15, 11, 14, 74, 30, 2, 15, 74, 25, 30, 24, 15, 11, 7, 68, 12, 45, 44, 39, 98, 45, 36, 98, 54, 42, 39, 98, 35, 52, 35, 43, 46, 35, 32, 46, 39, 98, 39, 58, 54, 48, 35, 33, 54, 45, 48, 49, 98, 106};
    }

    public C0518Ep(InterfaceC0455Bx[] interfaceC0455BxArr, InterfaceC0457Bz interfaceC0457Bz) {
        this.A02 = interfaceC0455BxArr;
        this.A01 = interfaceC0457Bz;
    }

    public final InterfaceC0455Bx A02(InterfaceC0456By interfaceC0456By, Uri uri) throws IOException, InterruptedException {
        if (this.A00 != null) {
            return this.A00;
        }
        InterfaceC0455Bx[] interfaceC0455BxArr = this.A02;
        int length = interfaceC0455BxArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            InterfaceC0455Bx interfaceC0455Bx = interfaceC0455BxArr[i2];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC0456By.AFq();
                throw th;
            }
            if (interfaceC0455Bx.AGs(interfaceC0456By)) {
                this.A00 = interfaceC0455Bx;
                interfaceC0456By.AFq();
                break;
            }
            continue;
            interfaceC0456By.AFq();
            i2++;
        }
        if (this.A00 != null) {
            this.A00.A9D(this.A01);
            return this.A00;
        }
        throw new XR(A00(24, 34, 107) + IK.A0S(this.A02) + A00(0, 24, 67), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
