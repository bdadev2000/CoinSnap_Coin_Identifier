package com.facebook.ads.redexgen.uinode;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: assets/audience_network.dex */
public abstract class B1 {
    public static byte[] A00;
    public static String[] A01 = {"LgmYw98W3bgowMYQY6Q3BawqAxXNUuUl", "GpzgTRDYOaIyAt6xSJRYAk3b6rAdzkZ0", "RtCZFOI40BGARGfB2sOg6MLybkAs9Fzf", "Gx3YqKVlWhsXJsTGKtjglmBlxW0pOlYg", "tq174XAFZe", "aVWuh4A2S2MgQagwT", "vwD2gnTxyUihDEDfn", "xhuYGO7iBGvSpDZMcS9LxFC"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        C0650Hy A042 = A04(bArr);
        A042.A08(60);
        int i10 = A02[A042.A04(6)];
        int i11 = A03[A042.A04(4)];
        int A043 = A042.A04(5);
        int[] iArr = A04;
        int i12 = A043 >= iArr.length ? -1 : (iArr[A043] * 1000) / 2;
        A042.A08(10);
        return Format.A07(str, A05(0, 13, 102), null, i12, -1, i10 + (A042.A04(2) > 0 ? 1 : 0), i11, null, drmInitData, 0, str2);
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{65, 85, 68, 73, 79, Ascii.SI, 86, 78, 68, Ascii.SO, 68, 84, 83};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int nblks;
        int position = byteBuffer.position();
        int position2 = byteBuffer.get(position);
        switch (position2) {
            case -2:
                int position3 = position + 5;
                int i10 = (byteBuffer.get(position3) & 1) << 6;
                int position4 = position + 4;
                nblks = i10 | ((byteBuffer.get(position4) & 252) >> 2);
                break;
            case -1:
                int position5 = position + 4;
                int i11 = (byteBuffer.get(position5) & 7) << 4;
                int position6 = position + 7;
                nblks = i11 | ((byteBuffer.get(position6) & 60) >> 2);
                break;
            case TEMPLATE_HTML_SIZE_VALUE:
                int position7 = position + 5;
                int i12 = (byteBuffer.get(position7) & 7) << 4;
                int position8 = position + 6;
                nblks = i12 | ((byteBuffer.get(position8) & 60) >> 2);
                break;
            default:
                int position9 = position + 4;
                int i13 = (byteBuffer.get(position9) & 1) << 6;
                int position10 = position + 5;
                nblks = i13 | ((byteBuffer.get(position10) & 252) >> 2);
                break;
        }
        int position11 = nblks + 1;
        return position11 * 32;
    }

    public static int A01(byte[] bArr) {
        int i10;
        boolean z10 = false;
        switch (bArr[0]) {
            case -2:
                i10 = (((bArr[4] & 3) << 12) | ((bArr[7] & UByte.MAX_VALUE) << 4) | ((bArr[6] & 240) >> 4)) + 1;
                break;
            case -1:
                int i11 = (bArr[7] & 3) << 12;
                int i12 = (bArr[6] & UByte.MAX_VALUE) << 4;
                if (A01[1].charAt(17) != 'C') {
                    A01[2] = "MBjMF3o66WyYJ7fC9eQP49KWn3JCWQGt";
                    i10 = (i11 | i12 | ((bArr[9] & 60) >> 2)) + 1;
                    z10 = true;
                    break;
                } else {
                    i10 = (i11 | i12 | ((bArr[9] & 60) >> 2)) + 1;
                    z10 = true;
                    break;
                }
            case TEMPLATE_HTML_SIZE_VALUE:
                int i13 = (bArr[6] & 3) << 12;
                byte b3 = bArr[7];
                String[] strArr = A01;
                if (strArr[5].length() == strArr[6].length()) {
                    A01[0] = "meKDaeVMRSRS1vVcwwYXxolxpiaSquNW";
                    i10 = (i13 | ((b3 & UByte.MAX_VALUE) << 4) | ((bArr[8] & 60) >> 2)) + 1;
                    z10 = true;
                    break;
                } else {
                    throw new RuntimeException();
                }
            default:
                i10 = (((bArr[5] & 3) << 12) | ((bArr[6] & UByte.MAX_VALUE) << 4) | ((bArr[7] & 240) >> 4)) + 1;
                break;
        }
        return z10 ? (i10 * 16) / 14 : i10;
    }

    public static int A02(byte[] bArr) {
        int i10;
        switch (bArr[0]) {
            case -2:
                i10 = ((bArr[5] & 1) << 6) | ((bArr[4] & 252) >> 2);
                break;
            case -1:
                i10 = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
                break;
            case TEMPLATE_HTML_SIZE_VALUE:
                i10 = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
                break;
            default:
                byte b3 = bArr[4];
                String[] strArr = A01;
                if (strArr[5].length() == strArr[6].length()) {
                    String[] strArr2 = A01;
                    strArr2[5] = "0rS52mmndmktv37b0";
                    strArr2[6] = "cQepkBNQqnKQzzIfS";
                    i10 = ((b3 & 1) << 6) | ((bArr[5] & 252) >> 2);
                    break;
                } else {
                    throw new RuntimeException();
                }
        }
        int nblks = i10 + 1;
        return nblks * 32;
    }

    public static C0650Hy A04(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C0650Hy(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b3 = copyOf[i10];
                copyOf[i10] = copyOf[i10 + 1];
                copyOf[i10 + 1] = b3;
            }
        }
        C0650Hy c0650Hy = new C0650Hy(copyOf);
        if (copyOf[0] == 31) {
            C0650Hy c0650Hy2 = new C0650Hy(copyOf);
            while (c0650Hy2.A01() >= 16) {
                c0650Hy2.A08(2);
                c0650Hy.A0A(c0650Hy2.A04(14), 14);
            }
        }
        c0650Hy.A0B(copyOf);
        return c0650Hy;
    }

    public static boolean A07(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
