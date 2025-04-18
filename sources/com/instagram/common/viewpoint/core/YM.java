package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class YM extends AbstractC0477Ct {
    public static byte[] A02;
    public static String[] A03 = {"P4OcMr", "yzGUgjKhy2TcBuT81YWAaiS5", "V9Tib6IfMi4NOqM1D0u830Y2yBdPdBt7", "OFAtjnGVyOXYsjxgv2tUilfsOLsGPVA2", "mLmiaTwnnACP94", "cQZMgeBNGwnvvvB3OnriOOb2AFb6ME4P", "wxDgqbrpyTXZpGk4hb9UcFKfmJ4Jr8rC", "ZIsPCe9SsRFytxGe4XrO3tcn"};
    public YN A00;
    public C0588Hr A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {34, 54, 39, 42, 44, 108, 37, 47, 34, 32};
        String[] strArr = A03;
        if (strArr[2].charAt(3) == strArr[3].charAt(3)) {
            throw new RuntimeException();
        }
        A03[0] = "xoHdp6";
        A02 = bArr;
    }

    static {
        A03();
    }

    private int A00(I4 i4) {
        int value = (i4.A00[2] & UnsignedBytes.MAX_VALUE) >> 4;
        switch (value) {
            case 1:
                return Opcodes.CHECKCAST;
            case 2:
            case 3:
            case 4:
            case 5:
                int blockSizeCode = 576 << (value - 2);
                return blockSizeCode;
            case 6:
            case 7:
                i4.A0Z(4);
                i4.A0O();
                int value2 = value == 6 ? i4.A0E() : i4.A0I();
                i4.A0Y(0);
                int blockSizeCode2 = value2 + 1;
                return blockSizeCode2;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode3 = 256 << (value - 8);
                return blockSizeCode3;
            default:
                return -1;
        }
    }

    public static boolean A04(I4 i4) {
        if (i4.A04() >= 5 && i4.A0E() == 127) {
            long A0M = i4.A0M();
            String[] strArr = A03;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[4] = "cSF3Iph02w2lMO";
            if (A0M == 1179402563) {
                return true;
            }
        }
        return false;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final long A07(I4 i4) {
        if (!A05(i4.A00)) {
            return -1L;
        }
        return A00(i4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final void A09(boolean z2) {
        super.A09(z2);
        if (z2) {
            if (A03[5].charAt(28) != 'M') {
                throw new RuntimeException();
            }
            A03[5] = "Lwh1jCIc51N2CryTcfCaB8rWVU2cMDKL";
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final boolean A0A(I4 i4, long j2, C0476Cs c0476Cs) throws IOException, InterruptedException {
        byte[] bArr = i4.A00;
        if (this.A01 == null) {
            this.A01 = new C0588Hr(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, i4.A07());
            data[4] = UnsignedBytes.MAX_POWER_OF_TWO;
            List singletonList = Collections.singletonList(data);
            c0476Cs.A00 = Format.A07(null, A02(0, 10, 37), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, singletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.A00 = new YN(this);
            this.A00.A01(i4);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        if (this.A00 != null) {
            this.A00.A00(j2);
            c0476Cs.A01 = this.A00;
        }
        return false;
    }
}
