package com.meta.analytics.dsp.uinode;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class AQ {
    public static byte[] A00;
    public static String[] A01 = {"sCxx5L5gWudXPe4xp1ThsNryHSmynjHF", "9Nf9uybzHO2S6jQpjiGasa9ZwcLHyUhN", "2aneS77IEDbgq", "fX6HyBPcmxgssJA51nXZ3qA", "", "AlikR2RGcjs8IOnjMv6bsO9qZZebDHqD", "DHEXyDlkH8L0aTNQHdBgfWGXbAOYtdTx", "PJLs5pK7Ccf4tt9LWMwQ38VoV6l96kFD"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A07(C1217Hz c1217Hz, String str, String str2, DrmInitData drmInitData) {
        int i9 = A05[(c1217Hz.A0E() & PsExtractor.AUDIO_STREAM) >> 6];
        int A0E = c1217Hz.A0E();
        int i10 = A04[(A0E & 56) >> 3];
        if ((A0E & 4) != 0) {
            i10++;
        }
        return Format.A07(str, A0A(0, 9, 26), null, -1, -1, i10, i9, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A08(C1217Hz c1217Hz, String str, String str2, DrmInitData drmInitData) {
        c1217Hz.A0Z(2);
        int i9 = A05[(c1217Hz.A0E() & PsExtractor.AUDIO_STREAM) >> 6];
        int A0E = c1217Hz.A0E();
        int i10 = A04[(A0E & 14) >> 1];
        if ((A0E & 1) != 0) {
            i10++;
        }
        if (((c1217Hz.A0E() & 30) >> 1) > 0 && (c1217Hz.A0E() & 2) != 0) {
            i10 += 2;
        }
        String A0A = A0A(9, 10, 48);
        if (c1217Hz.A04() > 0 && (c1217Hz.A0E() & 1) != 0) {
            A0A = A0A(19, 14, 124);
        }
        return Format.A07(str, A0A, null, -1, -1, i10, i9, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0222, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0229, code lost:
    
        if (r18.A0F() == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022b, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
    
        if (r18.A0F() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0238, code lost:
    
        if (r18.A0F() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023a, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0241, code lost:
    
        if (r18.A0F() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0243, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bb, code lost:
    
        if (r6 != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0271, code lost:
    
        if (r18.A0F() != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0273, code lost:
    
        r18.A08(7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x027b, code lost:
    
        if (r18.A0F() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028c, code lost:
    
        if (com.meta.analytics.dsp.uinode.AQ.A01[6].charAt(31) == 'Q') goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x028e, code lost:
    
        r6 = com.meta.analytics.dsp.uinode.AQ.A01;
        r6[3] = "efqTs5tkRdGBLzL99Y2zBy0";
        r6[4] = "";
        r18.A08(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a9, code lost:
    
        r18.A08(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b1, code lost:
    
        if (r18.A0F() != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0205, code lost:
    
        if (r6 != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0207, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020e, code lost:
    
        if (r18.A0F() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0210, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0217, code lost:
    
        if (r18.A0F() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0219, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0220, code lost:
    
        if (r18.A0F() == false) goto L143;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.meta.analytics.dsp.uinode.AP A09(com.meta.analytics.dsp.uinode.C1216Hy r18) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AQ.A09(com.facebook.ads.redexgen.X.Hy):com.facebook.ads.redexgen.X.AP");
    }

    public static String A0A(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-69, -49, -66, -61, -55, -119, -69, -67, -115, -47, -27, -44, -39, -33, -97, -43, -47, -45, -93, Ascii.GS, 49, 32, 37, 43, -21, 33, Ascii.GS, Ascii.US, -17, -23, 38, 43, Ascii.US};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    public static int A01(int i9, int i10) {
        int i11 = i10 / 2;
        if (i9 < 0) {
            return -1;
        }
        int[] iArr = A05;
        int halfFrmsizecod = iArr.length;
        if (i9 >= halfFrmsizecod || i10 < 0) {
            return -1;
        }
        int[] iArr2 = A07;
        int halfFrmsizecod2 = iArr2.length;
        if (i11 >= halfFrmsizecod2) {
            return -1;
        }
        int bitrate = iArr[i9];
        if (bitrate == 44100) {
            int halfFrmsizecod3 = i10 % 2;
            return (iArr2[i11] + halfFrmsizecod3) * 2;
        }
        int sampleRate = A02[i11];
        if (bitrate == 32000) {
            int i12 = sampleRate * 6;
            if (A01[6].charAt(31) == 81) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "qimZQilZsB2lt3Dt1pYE9Xl";
            strArr[4] = "";
            return i12;
        }
        int halfFrmsizecod4 = sampleRate * 4;
        return halfFrmsizecod4;
    }

    public static int A02(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i9 = startIndex - 10;
        for (int i10 = position; i10 <= i9; i10++) {
            int startIndex2 = i10 + 4;
            int endIndex = byteBuffer.getInt(startIndex2);
            if ((endIndex & (-16777217)) == -1167101192) {
                return i10 - position;
            }
        }
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[5];
        int endIndex2 = str.charAt(29);
        int startIndex3 = str2.charAt(29);
        if (endIndex2 == startIndex3) {
            throw new RuntimeException();
        }
        A01[2] = "FkGXqBuH9rf";
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        int i9 = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            int[] iArr = A03;
            int fscod = byteBuffer.position();
            i9 = iArr[(byteBuffer.get(fscod + 4) & 48) >> 4];
        }
        int fscod2 = i9 * NotificationCompat.FLAG_LOCAL_ONLY;
        return fscod2;
    }

    public static int A04(ByteBuffer byteBuffer, int i9) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i9) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i9) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int fscod = (bArr[4] & 192) >> 6;
        int frmsizecod = bArr[4] & 63;
        return A01(fscod, frmsizecod);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        boolean isMlp = (bArr[7] & 255) == 187;
        byte b = bArr[isMlp ? '\t' : '\b'];
        String[] strArr = A01;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "Qkic1459317rghhXW1uTsPZAwlwTKIiV";
        strArr2[0] = "TPYz26W0Cq4ZALktt0QhsmVlkvC9xybr";
        return 40 << ((b >> 4) & 7);
    }
}
