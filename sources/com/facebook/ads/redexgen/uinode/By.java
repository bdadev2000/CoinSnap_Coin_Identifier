package com.facebook.ads.redexgen.uinode;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class By {
    public static byte[] A07;
    public static String[] A08 = {"FJwhSbR0Dqb1wEJXVBdpfUEyE2PwmXT5", "QXyUQtNV4ztNvs", "u680PItdmSCtrwUArgQMKOt5dGhFKyFy", "M6QX6bpZXsa0EpVfLqUIYL0ok3oIyD", "4ddrBoC1HSiu89JLzfXMV59B74qIm2xJ", "MUUz2dKYtP7sZF6Tuk5kEGRgHEx452fJ", "i1sqGOju2LE8Q92QQNgFTaNu0rUo1z4f", "5HWyWxmgcaxBLo1LpD3PpaOIjtbRMHJC"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            String[] strArr = A08;
            if (strArr[6].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "mZfo4fIlXHQscYR0BkWPKUfaL8c0bByk";
            strArr2[2] = "AkiufmiMzZJvhyS77AiglOXb5e3YRP2V";
            copyOfRange[i13] = (byte) (i14 - 94);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-64, -44, -61, -56, -50, -114, -52, -49, -60, -58, Ascii.GS, 49, 32, 37, 43, -21, 41, 44, 33, 35, -23, 8, -19, 50, 70, 53, 58, 64, 0, 62, 65, 54, 56, -2, Ascii.GS, 3};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A04(int i10, By by) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i18 = A0E[i14];
        if (i11 == 2) {
            i18 /= 2;
        } else if (i11 == 0) {
            i18 /= 4;
        }
        int i19 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            i15 = i11 == 3 ? A09[i13 - 1] : A0D[i13 - 1];
            i17 = (((i15 * 12000) / i18) + i19) * 4;
            i16 = 384;
        } else {
            if (i11 == 3) {
                i15 = i12 == 2 ? A0A[i13 - 1] : A0B[i13 - 1];
                i16 = 1152;
                i17 = ((144000 * i15) / i18) + i19;
            } else {
                i15 = A0C[i13 - 1];
                i16 = i12 == 1 ? 576 : 1152;
                i17 = (((i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i15) / i18) + i19;
            }
        }
        by.A03(i11, A0F[3 - i12], i17, i18, ((i10 >> 6) & 3) == 3 ? 1 : 2, i15 * 1000, i16);
        return true;
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, 94), A01(23, 13, 115), A01(0, 10, 1)};
        A0E = new int[]{44100, 48000, 32000};
        A09 = new int[]{32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 288, 320, 352, 384, TTAdConstant.PACKAGE_NAME_CODE, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    }

    public static int A00(int i10) {
        int i11;
        int layer;
        int padding;
        int i12;
        int i13;
        int version;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (layer = (i10 >>> 17) & 3) == 0 || (padding = (i10 >>> 12) & 15) == 0 || padding == 15 || (i12 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = A0E[i12];
        if (i11 == 2) {
            i14 /= 2;
        } else if (i11 == 0) {
            i14 /= 4;
        }
        int i15 = (i10 >>> 9) & 1;
        String[] strArr = A08;
        String str = strArr[5];
        String str2 = strArr[4];
        int charAt = str.charAt(20);
        int version2 = str2.charAt(20);
        if (charAt == version2) {
            throw new RuntimeException();
        }
        A08[0] = "wCPzQVRdLc9fuoZbbzdyTQMs65DUcW8k";
        if (layer == 3) {
            if (i11 == 3) {
                int version3 = padding - 1;
                version = A09[version3];
            } else {
                int version4 = padding - 1;
                version = A0D[version4];
            }
            return (((version * 12000) / i14) + i15) * 4;
        }
        if (i11 == 3) {
            if (layer == 2) {
                int version5 = padding - 1;
                i13 = A0A[version5];
            } else {
                int version6 = padding - 1;
                i13 = A0B[version6];
            }
        } else {
            int version7 = padding - 1;
            i13 = A0C[version7];
        }
        if (i11 == 3) {
            int version8 = 144000 * i13;
            return (version8 / i14) + i15;
        }
        int version9 = layer == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000;
        return ((version9 * i13) / i14) + i15;
    }

    private void A03(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.A05 = i10;
        this.A06 = str;
        this.A02 = i11;
        this.A03 = i12;
        this.A01 = i13;
        this.A00 = i14;
        this.A04 = i15;
    }
}
