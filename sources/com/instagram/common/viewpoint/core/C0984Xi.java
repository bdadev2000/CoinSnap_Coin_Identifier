package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0984Xi implements InterfaceC0484Db {
    public static byte[] A01;
    public static String[] A02 = {"oDcarx9FEV95l", "ZTtmoYFQI4gqa1qx5G8sf9d7DJClXSOg", "4BWiiQEHzTJJ", "sM9tLFh19BbK8", "f3pvpmQKnWva5xh3Eex5w2xyNPMIbB03", "EKLMFNQM5OgFXY3Ny", "aUxYV7Tn322", "5RuBVxa5hmFU3oUcV3HVFMdvL2Njpkaf"};
    public static final int A03;
    public static final InterfaceC0496Dn A04;
    public final InterfaceC0496Dn A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static ChapterFrame A06(I4 i4, int i2, int i3, boolean z2, int i5, InterfaceC0496Dn interfaceC0496Dn) throws UnsupportedEncodingException {
        int A06 = i4.A06();
        int A022 = A02(i4.A00, A06);
        String str = new String(i4.A00, A06, A022 - A06, A0I(Opcodes.RET, 10, 107));
        i4.A0Y(A022 + 1);
        int A08 = i4.A08();
        int A082 = i4.A08();
        long A0M = i4.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = i4.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i6 = A06 + i2;
        while (i4.A06() < i6) {
            Id3Frame A0B = A0B(i3, i4, z2, i5, interfaceC0496Dn);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A08, A082, A0M, A0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static GeobFrame A09(I4 i4, int i2) throws UnsupportedEncodingException {
        int A0E = i4.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i2 - 1];
        i4.A0c(bArr, 0, i2 - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(Opcodes.RET, 10, 107));
        int i3 = A022 + 1;
        int A032 = A03(bArr, i3, A0E);
        String A0K = A0K(bArr, i3, A032, A0H);
        int A00 = A00(A0E) + A032;
        int A033 = A03(bArr, A00, A0E);
        return new GeobFrame(str, A0K, A0K(bArr, A00, A033, A0H), A0N(bArr, A00(A0E) + A033, bArr.length));
    }

    public static String A0I(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{28, 90, 28, 90, 28, 90, 66, 4, 66, 4, 66, 4, 66, 4, 70, 74, 12, 24, 11, 7, 15, 57, 3, 16, 15, 87, 4, 33, 52, 33, 96, 52, 47, 47, 96, 51, 40, 47, 50, 52, 96, 52, 47, 96, 34, 37, 96, 33, 46, 96, 9, 4, 115, 96, 52, 33, 39, 37, 2, 10, 15, 6, 7, 67, 23, 12, 67, 7, 6, 0, 12, 7, 6, 67, 5, 17, 2, 14, 6, 89, 67, 10, 7, 94, 64, 103, 111, 106, 99, 98, 38, 114, 105, 38, 112, 103, 106, 111, 98, 103, 114, 99, 38, 79, 66, 53, 38, 114, 103, 97, 38, 113, 111, 114, 110, 38, 107, 103, 108, 105, 116, 80, 99, 116, 117, 111, 105, 104, 59, 91, 111, 124, 112, 120, 61, 110, 116, 103, 120, 61, 120, 101, 126, 120, 120, 121, 110, 61, 111, 120, 112, 124, 116, 115, 116, 115, 122, 61, 105, 124, 122, 61, 121, 124, 105, 124, 25, 20, 99, Utf8.REPLACEMENT_BYTE, 37, 57, 91, 78, 78, 67, 79, 91, 71, 19, 62, 105, 30, Utf8.REPLACEMENT_BYTE, 57, 53, 62, Utf8.REPLACEMENT_BYTE, 40, 106, 82, 80, 73, 73, 92, 93, 25, 112, 125, 10, 25, 77, 88, 94, 25, 78, 80, 77, 81, 25, 84, 88, 83, 86, 75, 111, 92, 75, 74, 80, 86, 87, 4, 11, 25, 88, 87, 93, 25, 76, 87, 93, 92, 95, 80, 87, 92, 93, 25, 90, 86, 84, 73, 75, 92, 74, 74, 80, 86, 87, 25, 74, 90, 81, 92, 84, 92, 105, 81, 83, 74, 74, 95, 94, 26, 115, 126, 9, 26, 78, 91, 93, 26, 77, 83, 78, 82, 26, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 26, 87, 91, 80, 85, 72, 108, 95, 72, 73, 83, 85, 84, 7, 75, 115, 113, 104, 104, 113, 118, Byte.MAX_VALUE, 56, 109, 118, 107, 109, 104, 104, 119, 106, 108, 125, 124, 56, 123, 119, 117, 104, 106, 125, 107, 107, 125, 124, 56, 119, 106, 56, 125, 118, 123, 106, 97, 104, 108, 125, 124, 56, 126, 106, 121, 117, 125, 24, 20, 20, 20, 67, 66, 80, 59, 39, 32, 2, 3, 17, 122, 102, 97, 21, 18, 72, 73, 91, 48, 37, 4, Utf8.REPLACEMENT_BYTE, 52, 41, 33, 52, 50, 37, 52, 53, 113, 55, 56, 35, 34, 37, 113, 37, 57, 35, 52, 52, 113, 51, 40, 37, 52, 34, 113, 62, 55, 113, 24, 21, 98, 113, 37, 48, 54, 113, 57, 52, 48, 53, 52, 35, 107, 113, 31, 36, 57, Utf8.REPLACEMENT_BYTE, 58, 58, 37, 56, 62, 47, 46, 106, 41, 34, 43, 56, 43, 41, 62, 47, 56, 106, 47, 36, 41, 37, 46, 35, 36, 45, 117, 122, 122, 122, 41, 45, 33, 39, 37, 111, 70, 66, 78, 72, 74, 0, 69, 95, 74, 72, 121, 125, 113, 119, 117, Utf8.REPLACEMENT_BYTE, 122, 96, 119};
    }

    static {
        A0L();
        A04 = new C0985Xj();
        A03 = IK.A08(A0I(Opcodes.IF_ACMPNE, 3, 77));
    }

    public C0984Xi() {
        this(null);
    }

    public C0984Xi(InterfaceC0496Dn interfaceC0496Dn) {
        this.A00 = interfaceC0496Dn;
    }

    public static int A00(int i2) {
        if (i2 == 0 || i2 == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(I4 i4, int i2) {
        byte[] bArr = i4.A00;
        for (int A06 = i4.A06(); A06 + 1 < i2; A06++) {
            int i3 = bArr[A06];
            if ((i3 & 255) == 255) {
                int i5 = A06 + 1;
                int i6 = A02[2].length();
                if (i6 != 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[5] = "fMvheGAz69fX12AY3";
                strArr[6] = "xzSVXT6CIC9";
                if (bArr[i5] == 0) {
                    int i7 = A06 + 1;
                    System.arraycopy(bArr, A06 + 2, bArr, i7, (i2 - A06) - 2);
                    i2--;
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0984Xi.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(byte[] r4, int r5, int r6) {
        /*
            int r1 = A02(r4, r5)
            if (r6 == 0) goto L9
            r0 = 3
            if (r6 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r4.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L45
            int r0 = r1 % 2
            if (r0 != 0) goto L1a
            int r0 = r1 + 1
            r0 = r4[r0]
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r3 = r1 + 1
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0984Xi.A02
            r0 = 0
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L34
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0984Xi.A02
            java.lang.String r1 = "c1mKOA0yx6PM3ayoz9Rx2ZFyjjZjHwoF"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "pETkHlW31R8gYQsHDxP1siPj2h04g4up"
            r0 = 7
            r2[r0] = r1
            int r1 = A02(r4, r3)
            goto La
        L45:
            int r0 = r4.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0984Xi.A03(byte[], int, int):int");
    }

    public static ApicFrame A04(I4 i4, int i2, int i3) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int descriptionStartIndex = i4.A0E();
        String A0H = A0H(descriptionStartIndex);
        int encoding = i2 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i2 - 1;
        i4.A0c(bArr, 0, encoding2);
        String A0I = A0I(FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 6, 93);
        String A0I2 = A0I(Opcodes.RET, 10, 107);
        if (i3 == 2) {
            A022 = 2;
            A0M = A0I + IK.A0M(new String(bArr, 0, 3, A0I2));
            if (A0I(474, 9, 13).equals(A0M)) {
                A0M = A0I(464, 10, 50);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = IK.A0M(new String(bArr, 0, A022, A0I2));
            if (A0M.indexOf(47) == -1) {
                A0M = A0I + A0M;
            }
        }
        int encoding3 = A022 + 1;
        int i5 = bArr[encoding3] & 255;
        int i6 = A022 + 2;
        int mimeTypeEndIndex = A03(bArr, i6, descriptionStartIndex);
        int encoding4 = mimeTypeEndIndex - i6;
        String str = new String(bArr, i6, encoding4, A0H);
        int A00 = A00(descriptionStartIndex) + mimeTypeEndIndex;
        int encoding5 = bArr.length;
        return new ApicFrame(A0M, str, i5, A0N(bArr, A00, encoding5));
    }

    public static BinaryFrame A05(I4 i4, int i2, String str) {
        byte[] bArr = new byte[i2];
        i4.A0c(bArr, 0, i2);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(I4 i4, int i2, int i3, boolean z2, int elementIdEndIndex, InterfaceC0496Dn interfaceC0496Dn) throws UnsupportedEncodingException {
        int A06 = i4.A06();
        int A022 = A02(i4.A00, A06);
        String A0I = A0I(Opcodes.RET, 10, 107);
        String str = new String(i4.A00, A06, A022 - A06, A0I);
        i4.A0Y(A022 + 1);
        int framePosition = i4.A0E();
        boolean z3 = (framePosition & 2) != 0;
        boolean z4 = (framePosition & 1) != 0;
        int A0E = i4.A0E();
        String[] strArr = new String[A0E];
        for (int i5 = 0; i5 < A0E; i5++) {
            int startIndex = i4.A06();
            int i6 = A02(i4.A00, startIndex);
            strArr[i5] = new String(i4.A00, startIndex, i6 - startIndex, A0I);
            i4.A0Y(i6 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = A06 + i2;
        while (i4.A06() < i7) {
            Id3Frame A0B = A0B(i3, i4, z2, elementIdEndIndex, interfaceC0496Dn);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z3, z4, strArr, id3FrameArr);
    }

    public static CommentFrame A08(I4 i4, int i2) throws UnsupportedEncodingException {
        if (i2 < 4) {
            return null;
        }
        int textStartIndex = i4.A0E();
        String A0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        i4.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i2 - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i2 - 4;
        i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0H);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        String charset = A0K(data, A00, encoding4, A0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        if (r6 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        if (r6 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        if (r8 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010c, code lost:
    
        if (r8 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r8 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:
    
        if (r8 != 0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.C0497Do A0A(com.instagram.common.viewpoint.core.I4 r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0984Xi.A0A(com.facebook.ads.redexgen.X.I4):com.facebook.ads.redexgen.X.Do");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c8, code lost:
    
        if (r11 != 80) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ca, code lost:
    
        if (r10 != 73) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01cc, code lost:
    
        if (r9 != 67) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d7, code lost:
    
        r4 = A04(r23, r7, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dc, code lost:
    
        if (r11 != 67) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01de, code lost:
    
        if (r10 != 79) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e2, code lost:
    
        if (r9 != 77) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e4, code lost:
    
        if (r8 == 77) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e6, code lost:
    
        if (r22 != 2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e8, code lost:
    
        r4 = A08(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ef, code lost:
    
        if (r11 != 67) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f3, code lost:
    
        if (r10 != 72) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f5, code lost:
    
        if (r9 != 65) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f7, code lost:
    
        if (r8 != 80) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f9, code lost:
    
        r4 = A06(r23, r7, r22, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0206, code lost:
    
        if (r11 != 67) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0208, code lost:
    
        if (r10 != 84) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x020a, code lost:
    
        if (r9 != 79) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x020c, code lost:
    
        if (r8 != 67) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x020e, code lost:
    
        r4 = A07(r23, r7, r22, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x021b, code lost:
    
        r0 = A0J(r22, r11, r10, r9, r8);
        r4 = A05(r23, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cf, code lost:
    
        if (r11 != 65) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d1, code lost:
    
        if (r10 != 80) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d3, code lost:
    
        if (r9 != 73) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d5, code lost:
    
        if (r8 != 67) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0181, code lost:
    
        if (r11 == 87) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0176, code lost:
    
        if (r11 == 87) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0178, code lost:
    
        if (r10 != 88) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017a, code lost:
    
        if (r9 != 88) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017c, code lost:
    
        if (r22 == 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        if (r8 != 88) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0184, code lost:
    
        r4 = A0F(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018a, code lost:
    
        if (r11 != 87) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018c, code lost:
    
        r0 = A0J(r22, r11, r10, r9, r8);
        r4 = A0G(r23, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019a, code lost:
    
        if (r11 != 80) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019e, code lost:
    
        if (r10 != 82) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a0, code lost:
    
        if (r9 != 73) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a4, code lost:
    
        if (r8 != 86) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
    
        r4 = A0C(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (r11 != 71) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b3, code lost:
    
        if (r10 != 69) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        if (r9 != 79) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b9, code lost:
    
        if (r8 == 66) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
    
        if (r22 != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bd, code lost:
    
        r4 = A09(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c6, code lost:
    
        if (r22 != 2) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame A0B(int r22, com.instagram.common.viewpoint.core.I4 r23, boolean r24, int r25, com.instagram.common.viewpoint.core.InterfaceC0496Dn r26) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0984Xi.A0B(int, com.facebook.ads.redexgen.X.I4, boolean, int, com.facebook.ads.redexgen.X.Dn):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(I4 i4, int i2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        i4.A0c(bArr, 0, i2);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(Opcodes.RET, 10, 107)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(I4 i4, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int valueStartIndex = i4.A0E();
        String A0H = A0H(valueStartIndex);
        int encoding = i2 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i2 - 1;
        i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, A0H);
        int A00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, A00, valueStartIndex);
        String A0K = A0K(data, A00, encoding4, A0H);
        String charset = A0I(353, 4, 81);
        return new TextInformationFrame(charset, description, A0K);
    }

    public static TextInformationFrame A0E(I4 i4, int i2, String str) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int A0E = i4.A0E();
        String A0H = A0H(A0E);
        int encoding = i2 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i2 - 1;
        i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, A0E);
        return new TextInformationFrame(str, null, new String(data, 0, encoding3, A0H));
    }

    public static UrlLinkFrame A0F(I4 i4, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int descriptionEndIndex = i4.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i2 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i2 - 1;
        i4.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, A0H);
        int A00 = A00(descriptionEndIndex) + encoding3;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(Opcodes.RET, 10, 107));
        String charset = A0I(454, 4, 63);
        return new UrlLinkFrame(charset, str, A0K);
    }

    public static UrlLinkFrame A0G(I4 i4, int i2, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        i4.A0c(bArr, 0, i2);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(Opcodes.RET, 10, 107)));
    }

    public static String A0H(int i2) {
        String A0I = A0I(Opcodes.RET, 10, 107);
        switch (i2) {
            case 0:
                return A0I;
            case 1:
                return A0I(357, 6, 11);
            case 2:
                return A0I(363, 8, 74);
            case 3:
                return A0I(371, 5, 0);
            default:
                return A0I;
        }
    }

    public static String A0J(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, A0I(0, 6, 36), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, A0I(6, 8, 122), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static String A0K(byte[] bArr, int i2, int i3, String str) throws UnsupportedEncodingException {
        if (i3 > i2) {
            int length = bArr.length;
            String[] strArr = A02;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "2w8qNsEXNbi1RtaKY";
            strArr2[6] = "xIsAvF4aqsL";
            if (i3 <= length) {
                return new String(bArr, i2, i3 - i2, str);
            }
        }
        return A0I(0, 0, 89);
    }

    public static boolean A0M(I4 i4, int i2, int i3, boolean z2) {
        int A08;
        long A0M;
        int A0I;
        int A06 = i4.A06();
        while (true) {
            try {
                if (i4.A04() < i3) {
                    i4.A0Y(A06);
                    return true;
                }
                if (i2 >= 3) {
                    try {
                        A08 = i4.A08();
                        A0M = i4.A0M();
                        A0I = i4.A0I();
                    } catch (Throwable th) {
                        th = th;
                        i4.A0Y(A06);
                        throw th;
                    }
                } else {
                    A08 = i4.A0G();
                    A0M = i4.A0G();
                    A0I = 0;
                }
                if (A08 == 0 && A0M == 0 && A0I == 0) {
                    i4.A0Y(A06);
                    return true;
                }
                if (i2 == 4 && !z2) {
                    if ((8421504 & A0M) != 0) {
                        i4.A0Y(A06);
                        return false;
                    }
                    A0M = (((A0M >> 24) & 255) << 21) | (A0M & 255) | (((A0M >> 8) & 255) << 7) | (((A0M >> 16) & 255) << 14);
                }
                boolean z3 = false;
                boolean z4 = false;
                if (i2 == 4) {
                    z3 = (A0I & 64) != 0;
                    z4 = (A0I & 1) != 0;
                } else if (i2 == 3) {
                    int minimumFrameSize = A0I & 32;
                    z3 = minimumFrameSize != 0;
                    int minimumFrameSize2 = A0I & 128;
                    z4 = minimumFrameSize2 != 0;
                }
                int minimumFrameSize3 = 0;
                if (z3) {
                    minimumFrameSize3 = 0 + 1;
                }
                if (z4) {
                    minimumFrameSize3 += 4;
                }
                if (A0M < minimumFrameSize3) {
                    i4.A0Y(A06);
                    return false;
                }
                int minimumFrameSize4 = i4.A04();
                if (minimumFrameSize4 >= A0M) {
                    int minimumFrameSize5 = (int) A0M;
                    i4.A0Z(minimumFrameSize5);
                } else {
                    i4.A0Y(A06);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] A0N(byte[] bArr, int i2, int i3) {
        if (i3 <= i2) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i2, i3);
    }

    public final Metadata A0O(byte[] bArr, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        I4 i42 = new I4(bArr, i2);
        C0497Do A0A = A0A(i42);
        if (A0A == null) {
            return null;
        }
        int A06 = i42.A06();
        i3 = A0A.A01;
        int frameHeaderSize = i3 == 2 ? 6 : 10;
        i4 = A0A.A00;
        z2 = A0A.A02;
        if (z2) {
            i9 = A0A.A00;
            i4 = A01(i42, i9);
        }
        i42.A0X(A06 + i4);
        boolean z3 = false;
        i5 = A0A.A01;
        if (!A0M(i42, i5, frameHeaderSize, false)) {
            i7 = A0A.A01;
            String[] strArr = A02;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "2HRW23rQNZUN4UoGi";
            strArr2[6] = "wx9wVCYymkj";
            if (i7 == 4 && A0M(i42, 4, frameHeaderSize, true)) {
                z3 = true;
            } else {
                StringBuilder append = new StringBuilder().append(A0I(84, 45, 27));
                i8 = A0A.A01;
                Log.w(A0I(Opcodes.PUTSTATIC, 10, 71), append.append(i8).toString());
                return null;
            }
        }
        while (i42.A04() >= frameHeaderSize) {
            i6 = A0A.A01;
            Id3Frame A0B = A0B(i6, i42, z3, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0484Db
    public final Metadata A5N(EX ex) {
        ByteBuffer buffer = ex.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
