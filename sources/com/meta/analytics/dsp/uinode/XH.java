package com.meta.analytics.dsp.uinode;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class XH extends AbstractC1093Co {
    public static byte[] A02;
    public static String[] A03 = {"8dTWvXK8tch0WiEnFvHb8QUOTjgSOqY9", "GP5XsFGUIcP3F8wb7eo6", "CqCUMDrIKsNfOt03xA9INRdZ8", "ntm6pkiJXJn0b4vYMFRbAtYqalurqDmt", "MKNWZ4ceQqyXKZHhShlPBWdiS", "qmQfSGtBK4Bh2Swsb", "DS4", "jEA"};
    public XI A00;
    public C1204Hm A01;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-97, -77, -94, -89, -83, 109, -92, -86, -97, -95};
    }

    static {
        A03();
    }

    private int A00(C1217Hz c1217Hz) {
        int i9 = (c1217Hz.A00[2] & 255) >> 4;
        switch (i9) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                int i10 = i9 - 2;
                String[] strArr = A03;
                String str = strArr[3];
                String str2 = strArr[0];
                int charAt = str.charAt(11);
                int blockSizeCode = str2.charAt(11);
                if (charAt == blockSizeCode) {
                    A03[1] = "m7WV3F64xJdvTLT";
                    return 576 << i10;
                }
                String[] strArr2 = A03;
                strArr2[6] = "ZGd";
                strArr2[7] = "V9k";
                return 576 << i10;
            case 6:
            case 7:
                c1217Hz.A0Z(4);
                c1217Hz.A0O();
                String[] strArr3 = A03;
                String str3 = strArr3[3];
                String str4 = strArr3[0];
                int charAt2 = str3.charAt(11);
                int blockSizeCode2 = str4.charAt(11);
                if (charAt2 != blockSizeCode2) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[6] = "ycs";
                strArr4[7] = "AJV";
                int value = i9 == 6 ? c1217Hz.A0E() : c1217Hz.A0I();
                c1217Hz.A0Y(0);
                int blockSizeCode3 = value + 1;
                return blockSizeCode3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode4 = NotificationCompat.FLAG_LOCAL_ONLY << (i9 - 8);
                return blockSizeCode4;
            default:
                return -1;
        }
    }

    public static boolean A04(C1217Hz c1217Hz) {
        return c1217Hz.A04() >= 5 && c1217Hz.A0E() == 127 && c1217Hz.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final long A07(C1217Hz c1217Hz) {
        if (!A05(c1217Hz.A00)) {
            return -1L;
        }
        return A00(c1217Hz);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final void A09(boolean z8) {
        super.A09(z8);
        if (z8) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final boolean A0A(C1217Hz c1217Hz, long j7, C1092Cn c1092Cn) throws IOException, InterruptedException {
        byte[] bArr = c1217Hz.A00;
        if (this.A01 == null) {
            this.A01 = new C1204Hm(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, c1217Hz.A07());
            copyOfRange[4] = Byte.MIN_VALUE;
            c1092Cn.A00 = Format.A07(null, A02(0, 10, 50), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, Collections.singletonList(copyOfRange), null, 0, null);
            return true;
        }
        if ((bArr[0] & Ascii.DEL) == 3) {
            XI xi = new XI(this);
            this.A00 = xi;
            xi.A01(c1217Hz);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        XI xi2 = this.A00;
        if (A03[5].length() != 17) {
            throw new RuntimeException();
        }
        A03[1] = "qWJSCS9yuHod5mMI2FbA5J9U";
        if (xi2 != null) {
            xi2.A00(j7);
            c1092Cn.A01 = this.A00;
        }
        return false;
    }
}
