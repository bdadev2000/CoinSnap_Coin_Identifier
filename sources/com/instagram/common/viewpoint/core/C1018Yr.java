package com.instagram.common.viewpoint.core;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1018Yr implements C0 {
    public static byte[] A06;
    public static final Constructor<? extends InterfaceC0455Bx> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{93, 106, 106, 119, 106, 56, 113, 118, 107, 108, 121, 118, 108, 113, 121, 108, 113, 118, Byte.MAX_VALUE, 56, 94, 84, 89, 91, 56, 125, 96, 108, 125, 118, 107, 113, 119, 118, 74, 113, 122, 103, 111, 122, 124, 107, 122, 123, Utf8.REPLACEMENT_BYTE, 122, 109, 109, 112, 109, Utf8.REPLACEMENT_BYTE, 124, 109, 122, 126, 107, 118, 113, 120, Utf8.REPLACEMENT_BYTE, 89, 83, 94, 92, Utf8.REPLACEMENT_BYTE, 122, 103, 107, 109, 126, 124, 107, 112, 109, 89, 85, 87, 20, 92, 91, 89, 95, 88, 85, 85, 81, 20, 91, 94, 73, 20, 83, 84, 78, 95, 72, 84, 91, 86, 20, 95, 66, 85, 74, 86, 91, 67, 95, 72, 8, 20, 95, 66, 78, 20, 92, 86, 91, 89, 20, 124, 86, 91, 89, Byte.MAX_VALUE, 66, 78, 72, 91, 89, 78, 85, 72};
    }

    static {
        A01();
        Constructor<? extends InterfaceC0455Bx> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, Opcodes.LREM)).asSubclass(InterfaceC0455Bx.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException(A00(0, 34, 83), e);
        }
        A07 = constructor;
    }

    @Override // com.instagram.common.viewpoint.core.C0
    public final synchronized InterfaceC0455Bx[] A4x() {
        InterfaceC0455Bx[] interfaceC0455BxArr;
        interfaceC0455BxArr = new InterfaceC0455Bx[A07 == null ? 12 : 13];
        interfaceC0455BxArr[0] = new C1003Yc(this.A01);
        interfaceC0455BxArr[1] = new YS(this.A00);
        interfaceC0455BxArr[2] = new YQ(this.A03);
        interfaceC0455BxArr[3] = new YZ(this.A02);
        interfaceC0455BxArr[4] = new YC();
        interfaceC0455BxArr[5] = new YF();
        interfaceC0455BxArr[6] = new C0994Xt(this.A05, this.A04);
        interfaceC0455BxArr[7] = new C1010Yj();
        interfaceC0455BxArr[8] = new YK();
        interfaceC0455BxArr[9] = new C1000Xz();
        interfaceC0455BxArr[10] = new C0992Xr();
        interfaceC0455BxArr[11] = new C1013Ym();
        if (A07 != null) {
            try {
                interfaceC0455BxArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException(A00(34, 40, 84), e);
            }
        }
        return interfaceC0455BxArr;
    }
}
