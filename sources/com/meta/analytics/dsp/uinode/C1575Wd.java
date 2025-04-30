package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
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
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Wd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1575Wd implements DW {
    public static byte[] A01;
    public static String[] A02 = {"mDpfQ0Mg1qMGU0sRUyB4w0yHI9AflFxL", "HrWFAZbBmLlJHBGWXoy88PVYdiXTIEfW", "ZQEIpFlmPj9dChjEJf3cuXBCToBvQGIn", "RQPpjxLwn1F2LqLyPS6YhTLdMSPVP9VK", "XPMzSAYF2Koz19PEH34p5", "swwfqTWHhic8XQtgs9vSQ", "6JbQXNgGm6Rlu9UTMBxnLLi5Rd7F6qFb", "jePmV9Iz"};
    public static final int A03;
    public static final InterfaceC1107Di A04;
    public final InterfaceC1107Di A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static ChapterFrame A06(C1217Hz c1217Hz, int i9, int i10, boolean z8, int i11, InterfaceC1107Di interfaceC1107Di) throws UnsupportedEncodingException {
        int A06 = c1217Hz.A06();
        int A022 = A02(c1217Hz.A00, A06);
        String str = new String(c1217Hz.A00, A06, A022 - A06, A0I(169, 10, 32));
        c1217Hz.A0Y(A022 + 1);
        int A08 = c1217Hz.A08();
        int A082 = c1217Hz.A08();
        long A0M = c1217Hz.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = c1217Hz.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = A06 + i9;
        while (c1217Hz.A06() < i12) {
            Id3Frame A0B = A0B(i10, c1217Hz, z8, i11, interfaceC1107Di);
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
    public static GeobFrame A09(C1217Hz c1217Hz, int i9) throws UnsupportedEncodingException {
        int A0E = c1217Hz.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i9 - 1];
        c1217Hz.A0c(bArr, 0, i9 - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(169, 10, 32));
        int i10 = A022 + 1;
        int A032 = A03(bArr, i10, A0E);
        String A0K = A0K(bArr, i10, A032, A0H);
        int A00 = A00(A0E) + A032;
        int A033 = A03(bArr, A00, A0E);
        return new GeobFrame(str, A0K, A0K(bArr, A00, A033, A0H), A0N(bArr, A00(A0E) + A033, bArr.length));
    }

    public static String A0I(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{78, 8, 78, 8, 78, 8, 44, 106, 44, 106, 44, 106, 44, 106, 89, 85, 19, 7, Ascii.DC4, Ascii.CAN, Ascii.DLE, 38, Ascii.FS, Ascii.SI, Ascii.DLE, 72, 91, 126, 107, 126, 63, 107, 112, 112, 63, 108, 119, 112, 109, 107, 63, 107, 112, 63, 125, 122, 63, 126, 113, 63, 86, 91, 44, 63, 107, 126, 120, Ascii.SYN, 49, 57, 60, 53, 52, 112, 36, 63, 112, 52, 53, 51, 63, 52, 53, 112, 54, 34, 49, 61, 53, 106, 112, 57, 52, 109, 119, 80, 88, 93, 84, 85, 17, 69, 94, 17, 71, 80, 93, 88, 85, 80, 69, 84, 17, 120, 117, 2, 17, 69, 80, 86, 17, 70, 88, 69, 89, 17, 92, 80, 91, 94, 67, 103, 84, 67, 66, 88, 94, 95, Ascii.FF, 4, 48, 35, 47, 39, 98, 49, 43, 56, 39, 98, 39, 58, 33, 39, 39, 38, 49, 98, 48, 39, 47, 35, 43, 44, 43, 44, 37, 98, 54, 35, 37, 98, 38, 35, 54, 35, 71, 74, 61, 107, 113, 109, Ascii.SI, Ascii.SUB, Ascii.SUB, Ascii.ETB, Ascii.ESC, Ascii.SI, 19, 88, 117, 34, 85, 116, 114, 126, 117, 116, 99, 97, 89, 91, 66, 66, 87, 86, Ascii.DC2, 123, 118, 1, Ascii.DC2, 70, 83, 85, Ascii.DC2, 69, 91, 70, 90, Ascii.DC2, 95, 83, 88, 93, 64, 100, 87, 64, 65, 91, 93, 92, Ascii.SI, 0, Ascii.DC2, 83, 92, 86, Ascii.DC2, 71, 92, 86, 87, 84, 91, 92, 87, 86, Ascii.DC2, 81, 93, 95, 66, 64, 87, 65, 65, 91, 93, 92, Ascii.DC2, 65, 81, 90, 87, 95, 87, 116, 76, 78, 87, 87, 66, 67, 7, 110, 99, Ascii.DC4, 7, 83, 70, 64, 7, 80, 78, 83, 79, 7, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 7, 74, 70, 77, 72, 85, 113, 66, 85, 84, 78, 72, 73, Ascii.SUB, Ascii.FS, 36, 38, 63, 63, 38, 33, 40, 111, 58, 33, 60, 58, 63, 63, 32, 61, 59, 42, 43, 111, 44, 32, 34, 63, 61, 42, 60, 60, 42, 43, 111, 32, 61, 111, 42, 33, 44, 61, 54, 63, 59, 42, 43, 111, 41, 61, 46, 34, 42, 62, 50, 50, 50, Ascii.US, Ascii.RS, Ascii.FF, 103, 123, 124, 62, 63, 45, 70, 90, 93, 41, 46, 54, 55, 37, 78, 91, 68, Ascii.DEL, 116, 105, 97, 116, 114, 101, 116, 117, 49, 119, 120, 99, 98, 101, 49, 101, 121, 99, 116, 116, 49, 115, 104, 101, 116, 98, 49, 126, 119, 49, 88, 85, 34, 49, 101, 112, 118, 49, 121, 116, 112, 117, 116, 99, 43, 49, 19, 40, 53, 51, 54, 54, 41, 52, 50, 35, 34, 102, 37, 46, 39, 52, 39, 37, 50, 35, 52, 102, 35, 40, 37, 41, 34, 47, 40, 33, 97, 110, 110, 110, 70, 66, 78, 72, 74, 0, Ascii.NAK, 17, Ascii.GS, Ascii.ESC, Ascii.EM, 83, Ascii.SYN, Ascii.FF, Ascii.EM, Ascii.ESC, 81, 85, 89, 95, 93, Ascii.ETB, 82, 72, 95};
    }

    static {
        A0L();
        A04 = new C1576We();
        A03 = IF.A08(A0I(166, 3, 12));
    }

    public C1575Wd() {
        this(null);
    }

    public C1575Wd(InterfaceC1107Di interfaceC1107Di) {
        this.A00 = interfaceC1107Di;
    }

    public static int A00(int i9) {
        if (i9 == 0 || i9 == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C1217Hz c1217Hz, int i9) {
        byte[] bArr = c1217Hz.A00;
        for (int A06 = c1217Hz.A06(); A06 + 1 < i9; A06++) {
            int i10 = bArr[A06];
            if ((i10 & 255) == 255 && bArr[A06 + 1] == 0) {
                int i11 = A06 + 2;
                int i12 = A06 + 1;
                int i13 = (i9 - A06) - 2;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[6];
                int i14 = str.charAt(4);
                if (i14 == str2.charAt(4)) {
                    throw new RuntimeException();
                }
                A02[1] = "GmDFLtMXmPbGQOJzrAUGcq8JFdShu0kr";
                System.arraycopy(bArr, i11, bArr, i12, i13);
                i9--;
            }
        }
        return i9;
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
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1575Wd.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
            int r1 = A02(r2, r3)
            if (r4 == 0) goto L9
            r0 = 3
            if (r4 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r2.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L21
            int r0 = r1 % 2
            if (r0 != 0) goto L1a
            int r0 = r1 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r0 = r1 + 1
            int r1 = A02(r2, r0)
            goto La
        L21:
            int r0 = r2.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1575Wd.A03(byte[], int, int):int");
    }

    public static ApicFrame A04(C1217Hz c1217Hz, int i9, int i10) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int descriptionStartIndex = c1217Hz.A0E();
        String A0H = A0H(descriptionStartIndex);
        int encoding = i9 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i9 - 1;
        c1217Hz.A0c(bArr, 0, encoding2);
        String A0I = A0I(458, 6, 45);
        String A0I2 = A0I(169, 10, 32);
        if (i10 == 2) {
            A022 = 2;
            A0M = A0I + IF.A0M(new String(bArr, 0, 3, A0I2));
            if (A0I(474, 9, 58).equals(A0M)) {
                A0M = A0I(464, 10, 126);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = IF.A0M(new String(bArr, 0, A022, A0I2));
            if (A0M.indexOf(47) == -1) {
                A0M = A0I + A0M;
            }
        }
        int encoding3 = A022 + 1;
        int i11 = bArr[encoding3] & 255;
        int i12 = A022 + 2;
        int mimeTypeEndIndex = A03(bArr, i12, descriptionStartIndex);
        int encoding4 = mimeTypeEndIndex - i12;
        String str = new String(bArr, i12, encoding4, A0H);
        int A00 = A00(descriptionStartIndex) + mimeTypeEndIndex;
        int encoding5 = bArr.length;
        return new ApicFrame(A0M, str, i11, A0N(bArr, A00, encoding5));
    }

    public static BinaryFrame A05(C1217Hz c1217Hz, int i9, String str) {
        byte[] bArr = new byte[i9];
        c1217Hz.A0c(bArr, 0, i9);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C1217Hz c1217Hz, int i9, int i10, boolean z8, int framePosition, InterfaceC1107Di interfaceC1107Di) throws UnsupportedEncodingException {
        int A06 = c1217Hz.A06();
        int A022 = A02(c1217Hz.A00, A06);
        String A0I = A0I(169, 10, 32);
        String str = new String(c1217Hz.A00, A06, A022 - A06, A0I);
        c1217Hz.A0Y(A022 + 1);
        int framePosition2 = c1217Hz.A0E();
        boolean z9 = (framePosition2 & 2) != 0;
        boolean z10 = (framePosition2 & 1) != 0;
        int A0E = c1217Hz.A0E();
        String[] strArr = new String[A0E];
        for (int i11 = 0; i11 < A0E; i11++) {
            int startIndex = c1217Hz.A06();
            int i12 = A02(c1217Hz.A00, startIndex);
            int framePosition3 = i12 - startIndex;
            strArr[i11] = new String(c1217Hz.A00, startIndex, framePosition3, A0I);
            c1217Hz.A0Y(i12 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = A06 + i9;
        while (c1217Hz.A06() < i13) {
            String[] strArr2 = A02;
            String str2 = strArr2[4];
            String str3 = strArr2[5];
            int framePosition4 = str2.length();
            if (framePosition4 != str3.length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[4] = "YQsr0udxa6AlS4ZOrNFlw";
            strArr3[5] = "dBU8ocTiI6WLc8wZTOIXb";
            Id3Frame A0B = A0B(i10, c1217Hz, z8, framePosition, interfaceC1107Di);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z9, z10, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C1217Hz c1217Hz, int i9) throws UnsupportedEncodingException {
        if (i9 < 4) {
            return null;
        }
        int textStartIndex = c1217Hz.A0E();
        String A0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        c1217Hz.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i9 - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i9 - 4;
        c1217Hz.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0H);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        String charset = A0K(data, A00, encoding4, A0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r0 != 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.meta.analytics.dsp.uinode.Dj A0A(com.meta.analytics.dsp.uinode.C1217Hz r9) {
        /*
            int r4 = r9.A04()
            r3 = 10
            r8 = 0
            r2 = 179(0xb3, float:2.51E-43)
            r1 = 10
            r0 = 19
            java.lang.String r7 = A0I(r2, r1, r0)
            if (r4 >= r3) goto L21
            r2 = 26
            r1 = 31
            r0 = 29
            java.lang.String r0 = A0I(r2, r1, r0)
            android.util.Log.w(r7, r0)
            return r8
        L21:
            int r4 = r9.A0G()
            int r0 = com.meta.analytics.dsp.uinode.C1575Wd.A03
            if (r4 == r0) goto L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 376(0x178, float:5.27E-43)
            r1 = 48
            r0 = 19
            java.lang.String r0 = A0I(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r7, r0)
            return r8
        L48:
            int r4 = r9.A0E()
            r3 = 1
            r9.A0Z(r3)
            int r6 = r9.A0E()
            int r2 = r9.A0D()
            r0 = 2
            r5 = 4
            if (r4 != r0) goto L73
            r0 = r6 & 64
            if (r0 == 0) goto L71
            r0 = 1
        L61:
            if (r0 == 0) goto L87
            r2 = 189(0xbd, float:2.65E-43)
            r1 = 68
            r0 = 48
            java.lang.String r0 = A0I(r2, r1, r0)
            android.util.Log.w(r7, r0)
            return r8
        L71:
            r0 = 0
            goto L61
        L73:
            r0 = 3
            if (r4 != r0) goto L97
            r0 = r6 & 64
            if (r0 == 0) goto L95
            r0 = 1
        L7b:
            if (r0 == 0) goto L87
            int r0 = r9.A08()
            r9.A0Z(r0)
            int r0 = r0 + 4
            int r2 = r2 - r0
        L87:
            if (r4 >= r5) goto L93
            r0 = r6 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L93
        L8d:
            com.facebook.ads.redexgen.X.Dj r0 = new com.facebook.ads.redexgen.X.Dj
            r0.<init>(r4, r3, r2)
            return r0
        L93:
            r3 = 0
            goto L8d
        L95:
            r0 = 0
            goto L7b
        L97:
            if (r4 != r5) goto Lb8
            r0 = r6 & 64
            if (r0 == 0) goto Lb6
            r0 = 1
        L9e:
            if (r0 == 0) goto Laa
            int r1 = r9.A0D()
            int r0 = r1 + (-4)
            r9.A0Z(r0)
            int r2 = r2 - r1
        Laa:
            r0 = r6 & 16
            if (r0 == 0) goto Lb4
            r0 = 1
        Laf:
            if (r0 == 0) goto L87
            int r2 = r2 + (-10)
            goto L87
        Lb4:
            r0 = 0
            goto Laf
        Lb6:
            r0 = 0
            goto L9e
        Lb8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 257(0x101, float:3.6E-43)
            r1 = 46
            r0 = 37
            java.lang.String r0 = A0I(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1575Wd.A0A(com.facebook.ads.redexgen.X.Hz):com.facebook.ads.redexgen.X.Dj");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bc, code lost:
    
        if (r7 == 86) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
    
        r13 = A0C(r26, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if (r7 == 86) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame A0B(int r25, com.meta.analytics.dsp.uinode.C1217Hz r26, boolean r27, int r28, com.meta.analytics.dsp.uinode.InterfaceC1107Di r29) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1575Wd.A0B(int, com.facebook.ads.redexgen.X.Hz, boolean, int, com.facebook.ads.redexgen.X.Di):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(C1217Hz c1217Hz, int i9) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i9];
        c1217Hz.A0c(bArr, 0, i9);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(169, 10, 32)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C1217Hz c1217Hz, int i9) throws UnsupportedEncodingException {
        if (i9 < 1) {
            return null;
        }
        int valueStartIndex = c1217Hz.A0E();
        String A0H = A0H(valueStartIndex);
        int encoding = i9 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i9 - 1;
        c1217Hz.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, A0H);
        int A00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, A00, valueStartIndex);
        String A0K = A0K(data, A00, encoding4, A0H);
        String charset = A0I(353, 4, 104);
        return new TextInformationFrame(charset, description, A0K);
    }

    public static TextInformationFrame A0E(C1217Hz c1217Hz, int i9, String str) throws UnsupportedEncodingException {
        if (i9 < 1) {
            return null;
        }
        int A0E = c1217Hz.A0E();
        String A0H = A0H(A0E);
        int encoding = i9 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i9 - 1;
        c1217Hz.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, A0E);
        return new TextInformationFrame(str, null, new String(data, 0, encoding3, A0H));
    }

    public static UrlLinkFrame A0F(C1217Hz c1217Hz, int i9) throws UnsupportedEncodingException {
        if (i9 < 1) {
            return null;
        }
        int descriptionEndIndex = c1217Hz.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i9 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i9 - 1;
        c1217Hz.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, A0H);
        int A00 = A00(descriptionEndIndex) + encoding3;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(169, 10, 32));
        String charset = A0I(454, 4, 52);
        return new UrlLinkFrame(charset, str, A0K);
    }

    public static UrlLinkFrame A0G(C1217Hz c1217Hz, int i9, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i9];
        c1217Hz.A0c(bArr, 0, i9);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 32)));
    }

    public static String A0H(int i9) {
        String A0I = A0I(169, 10, 32);
        switch (i9) {
            case 0:
                return A0I;
            case 1:
                return A0I(357, 6, 72);
            case 2:
                return A0I(363, 8, 105);
            case 3:
                String A0I2 = A0I(371, 5, 97);
                String[] strArr = A02;
                if (strArr[0].charAt(4) == strArr[6].charAt(4)) {
                    throw new RuntimeException();
                }
                A02[7] = "WB3CnC";
                return A0I2;
            default:
                return A0I;
        }
    }

    public static String A0J(int i9, int i10, int i11, int i12, int i13) {
        return i9 == 2 ? String.format(Locale.US, A0I(0, 6, 105), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, A0I(6, 8, 11), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String A0K(byte[] bArr, int i9, int i10, String str) throws UnsupportedEncodingException {
        if (i10 > i9 && i10 <= bArr.length) {
            return new String(bArr, i9, i10 - i9, str);
        }
        String[] strArr = A02;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "r4Qi0WBzOYfLLA4UC9s9DAK76ksjAQPp";
        strArr2[6] = "c5jPrSHyFK7RFs6Pjjym9ojkSMFCl1O5";
        return A0I(0, 0, 121);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r11 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        r5 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r12 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        r5 = r5 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r2 >= r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        r0 = r16.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        if (r0 >= r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        r16.A0Y(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        r16.A0Y(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        if (r11 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0M(com.meta.analytics.dsp.uinode.C1217Hz r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1575Wd.A0M(com.facebook.ads.redexgen.X.Hz, int, int, boolean):boolean");
    }

    public static byte[] A0N(byte[] bArr, int i9, int i10) {
        if (i10 <= i9) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i9, i10);
    }

    public final Metadata A0O(byte[] bArr, int i9) {
        int i10;
        int i11;
        boolean z8;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList = new ArrayList();
        C1217Hz c1217Hz = new C1217Hz(bArr, i9);
        Dj A0A = A0A(c1217Hz);
        if (A0A == null) {
            return null;
        }
        int startPosition = c1217Hz.A06();
        i10 = A0A.A01;
        int frameHeaderSize = i10 == 2 ? 6 : 10;
        i11 = A0A.A00;
        z8 = A0A.A02;
        if (z8) {
            i16 = A0A.A00;
            i11 = A01(c1217Hz, i16);
        }
        c1217Hz.A0X(startPosition + i11);
        boolean z9 = false;
        i12 = A0A.A01;
        if (!A0M(c1217Hz, i12, frameHeaderSize, false)) {
            i14 = A0A.A01;
            if (i14 == 4 && A0M(c1217Hz, 4, frameHeaderSize, true)) {
                z9 = true;
            } else {
                StringBuilder append = new StringBuilder().append(A0I(84, 45, 51));
                i15 = A0A.A01;
                Log.w(A0I(179, 10, 19), append.append(i15).toString());
                return null;
            }
        }
        while (c1217Hz.A04() >= frameHeaderSize) {
            i13 = A0A.A01;
            Id3Frame A0B = A0B(i13, c1217Hz, z9, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.meta.analytics.dsp.uinode.DW
    public final Metadata A51(E3 e32) {
        ByteBuffer buffer = e32.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
