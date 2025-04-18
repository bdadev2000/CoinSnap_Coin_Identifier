package com.facebook.ads.redexgen.uinode;

import android.graphics.Point;
import android.text.TextUtils;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0504Bo extends W6 {
    public static byte[] A02;
    public static String[] A03 = {"x6AsNgj7kZHrnoNYywGy3amTsD0l", "S34B6ywREx44pNmlWPMRcx17PIA7Fyf2", "1XorlyLpztZAXiZGzmiFCBwFfMWU", "T5Z409y2ECpb8uf8T6KWShvwgb", "8Qiq8HU85lCoFhvN1dBY3zigvCratExc", "EyxqnSMNDXwhS4zpORn6ov", "S8xh7faol6xkg145s9aDIWkyvYFJ4njt", "Q6jD8cwEOZ"};
    public static final int[] A04;
    public final InterfaceC0606Gf A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static int A03(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int intValue = list.get(i15).intValue();
            if (A0L(trackGroup.A01(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                i14++;
            }
        }
        return i14;
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A02 = new byte[]{96, 123, 113};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public C0504Bo() {
        this(null);
    }

    public C0504Bo(InterfaceC0606Gf interfaceC0606Gf) {
        this.A00 = interfaceC0606Gf;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    public static int A01(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r4, int[] r5, com.facebook.ads.redexgen.uinode.GW r6) {
        /*
            r3 = 0
            r2 = 0
        L2:
            int r0 = r4.A01
            if (r2 >= r0) goto L17
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r1 = r4.A01(r2)
            r0 = r5[r2]
            boolean r0 = A0J(r1, r0, r6)
            if (r0 == 0) goto L14
            int r3 = r3 + 1
        L14:
            int r2 = r2 + 1
            goto L2
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0504Bo.A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], com.facebook.ads.redexgen.X.GW):int");
    }

    public static Point A05(boolean z10, int tempViewportWidth, int i10, int i11, int i12) {
        if (z10) {
            if ((i11 > i12) != (tempViewportWidth > i10)) {
                tempViewportWidth = i10;
                i10 = tempViewportWidth;
            }
        }
        if (i11 * i10 >= i12 * tempViewportWidth) {
            return new Point(tempViewportWidth, IF.A04(tempViewportWidth * i12, i11));
        }
        return new Point(IF.A04(i10 * i11, i12), i10);
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0032 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.uinode.C0503Bn A06(int r11, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r12, int[][] r13, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r14) throws com.facebook.ads.redexgen.uinode.C04419c {
        /*
            r10 = this;
            r6 = 0
            r5 = 0
            r7 = 0
            r4 = 0
        L4:
            int r0 = r12.A01
            if (r4 >= r0) goto L64
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r3 = r12.A01(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0504Bo.A03
            r0 = 1
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 70
            if (r1 == r0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L21:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0504Bo.A03
            java.lang.String r1 = "1NYDqnXuXqFwXvhmhx1oqfe5tY82"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "WKIyqdfHfHQHhajlNNxex4"
            r0 = 5
            r2[r0] = r1
            r0 = r13[r4]
            r1 = 0
        L30:
            int r2 = r3.A01
            if (r1 >= r2) goto L61
            r8 = r0[r1]
            boolean r2 = r14.A0B
            boolean r2 = A0H(r8, r2)
            if (r2 == 0) goto L5c
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r2 = r3.A01(r1)
            int r2 = r2.A0D
            r9 = 1
            r2 = r2 & r9
            r8 = 0
            if (r2 == 0) goto L5f
            r2 = 1
        L4a:
            if (r2 == 0) goto L4d
            r9 = 2
        L4d:
            r2 = r0[r1]
            boolean r2 = A0H(r2, r8)
            if (r2 == 0) goto L57
            int r9 = r9 + 1000
        L57:
            if (r9 <= r7) goto L5c
            r6 = r3
            r5 = r1
            r7 = r9
        L5c:
            int r1 = r1 + 1
            goto L30
        L5f:
            r2 = 0
            goto L4a
        L61:
            int r4 = r4 + 1
            goto L4
        L64:
            if (r6 != 0) goto L68
            r0 = 0
        L67:
            return r0
        L68:
            com.facebook.ads.redexgen.X.Bn r0 = new com.facebook.ads.redexgen.X.Bn
            r0.<init>(r6, r5)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0504Bo.A06(int, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.Bn");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r14 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        r2 = r3.A0F;
        r14 = com.facebook.ads.redexgen.uinode.C0504Bo.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r14[3].length() == r14[7].length()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        com.facebook.ads.redexgen.uinode.C0504Bo.A03[1] = "4KlbdBkqrnIgKSOErHym9NPyt3h5FUou";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r2 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r3.A0F > r18.A03) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r3.A08 == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r3.A08 > r18.A02) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r3.A04 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r3.A04 > r18.A01) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r14 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r18.A0C != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        if (r14 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r2 = A0H(r15[r4], false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r2 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r1 = r1 + 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r1 <= r10) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r1 != r10) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r18.A0D == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        if (A00(r3.A04, r9) >= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dc, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        r0 = r3.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        if (r0 == r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        r0 = A00(r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
    
        if (r2 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        if (r14 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        if (r0 <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        if (r0 >= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        r0 = r3.A04;
        r0 = A00(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        if (r0 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
    
        r12 = r6;
        r11 = r4;
        r10 = r1;
        r9 = r3.A04;
        r8 = r3.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ff, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0113, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010f, code lost:
    
        if (r14 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.uinode.C0503Bn A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r16, int[][] r17, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r18) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0504Bo.A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.Bn");
    }

    private final C0503Bn A08(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C04419c {
        int i10;
        int i11;
        TrackGroup trackGroup = null;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < trackGroupArray.A01; i14++) {
            TrackGroup A01 = trackGroupArray.A01(i14);
            int[] iArr2 = iArr[i14];
            for (int i15 = 0; i15 < A01.A01; i15++) {
                if (A0H(iArr2[i15], defaultTrackSelector$Parameters.A0B)) {
                    Format A012 = A01.A01(i15);
                    int i16 = A012.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean z10 = (i16 & 1) != 0;
                    boolean z11 = (i16 & 2) != 0;
                    boolean A0K = A0K(A012, defaultTrackSelector$Parameters.A08);
                    if (A0K || (defaultTrackSelector$Parameters.A0E && A0I(A012))) {
                        if (z10) {
                            i10 = 8;
                        } else if (!z11) {
                            i10 = 6;
                        } else {
                            i10 = 4;
                        }
                        i11 = i10 + (A0K ? 1 : 0);
                    } else if (z10) {
                        i11 = 3;
                    } else if (z11) {
                        if (A0K(A012, defaultTrackSelector$Parameters.A07)) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                    }
                    if (A0H(iArr2[i15], false)) {
                        i11 += 1000;
                    }
                    if (i11 > i13) {
                        trackGroup = A01;
                        i12 = i15;
                        i13 = i11;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0503Bn(trackGroup, i12);
    }

    public static InterfaceC0607Gg A09(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, InterfaceC0606Gf interfaceC0606Gf) throws C04419c {
        int i11;
        if (defaultTrackSelector$Parameters.A0A) {
            i11 = 24;
        } else {
            i11 = 16;
        }
        boolean z10 = defaultTrackSelector$Parameters.A09 && (i10 & i11) != 0;
        for (int i12 = 0; i12 < trackGroupArray.A01; i12++) {
            TrackGroup A01 = trackGroupArray.A01(i12);
            int[] A0O = A0O(A01, iArr[i12], z10, i11, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (A0O.length > 0) {
                return ((InterfaceC0606Gf) AbstractC0626Ha.A01(interfaceC0606Gf)).A4o(A01, A0O);
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.uinode.InterfaceC0607Gg A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r11, int[][] r12, int r13, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r14, com.facebook.ads.redexgen.uinode.InterfaceC0606Gf r15) throws com.facebook.ads.redexgen.uinode.C04419c {
        /*
            r10 = this;
            r3 = -1
            r5 = -1
            r8 = 0
            r7 = 0
        L4:
            int r0 = r11.A01
            if (r7 >= r0) goto L39
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r6 = r11.A01(r7)
            r9 = r12[r7]
            r4 = 0
        Lf:
            int r0 = r6.A01
            if (r4 >= r0) goto L36
            r1 = r9[r4]
            boolean r0 = r14.A0B
            boolean r0 = A0H(r1, r0)
            if (r0 == 0) goto L33
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r2 = r6.A01(r4)
            com.facebook.ads.redexgen.X.GX r1 = new com.facebook.ads.redexgen.X.GX
            r0 = r9[r4]
            r1.<init>(r2, r14, r0)
            if (r8 == 0) goto L30
            int r0 = r1.A00(r8)
            if (r0 <= 0) goto L33
        L30:
            r5 = r7
            r3 = r4
            r8 = r1
        L33:
            int r4 = r4 + 1
            goto Lf
        L36:
            int r7 = r7 + 1
            goto L4
        L39:
            r0 = -1
            if (r5 != r0) goto L3e
            r0 = 0
            return r0
        L3e:
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r2 = r11.A01(r5)
            boolean r0 = r14.A0D
            if (r0 != 0) goto L58
            if (r15 == 0) goto L58
            r1 = r12[r5]
            boolean r0 = r14.A09
            int[] r1 = A0N(r2, r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto L58
            com.facebook.ads.redexgen.X.Gg r0 = r15.A4o(r2, r1)
            return r0
        L58:
            com.facebook.ads.redexgen.X.Bn r0 = new com.facebook.ads.redexgen.X.Bn
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0504Bo.A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], int, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters, com.facebook.ads.redexgen.X.Gf):com.facebook.ads.redexgen.X.Gg");
    }

    private final InterfaceC0607Gg A0B(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, InterfaceC0606Gf interfaceC0606Gf) throws C04419c {
        InterfaceC0607Gg interfaceC0607Gg = null;
        if (!defaultTrackSelector$Parameters.A0D && interfaceC0606Gf != null) {
            interfaceC0607Gg = A09(trackGroupArray, iArr, i10, defaultTrackSelector$Parameters, interfaceC0606Gf);
        }
        if (interfaceC0607Gg == null) {
            return A07(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return interfaceC0607Gg;
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i12 = 0; i12 < trackGroup.A01; i12++) {
            arrayList.add(Integer.valueOf(i12));
        }
        if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i13 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < trackGroup.A01; videoPixels++) {
            Format A01 = trackGroup.A01(videoPixels);
            if (A01.A0F > 0 && A01.A08 > 0) {
                Point A05 = A05(z10, i10, i11, A01.A0F, A01.A08);
                int i14 = A01.A0F * A01.A08;
                if (A01.A0F >= ((int) (A05.x * 0.98f)) && A01.A08 >= ((int) (A05.y * 0.98f)) && i14 < i13) {
                    i13 = i14;
                }
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            for (int maxVideoPixelsToRetain = arrayList.size() - 1; maxVideoPixelsToRetain >= 0; maxVideoPixelsToRetain--) {
                int i15 = trackGroup.A01(((Integer) arrayList.get(maxVideoPixelsToRetain)).intValue()).A0E();
                if (i15 == -1 || i15 > i13) {
                    arrayList.remove(maxVideoPixelsToRetain);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(C0605Ge c0605Ge, int[][][] iArr, AB[] abArr, InterfaceC0607Gg[] interfaceC0607GgArr, int i10) {
        if (i10 == 0) {
            return;
        }
        int i11 = -1;
        int i12 = -1;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = c0605Ge.A00();
            if (i13 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i14 = c0605Ge.A01(i13);
            InterfaceC0607Gg interfaceC0607Gg = interfaceC0607GgArr[i13];
            if ((i14 == 1 || i14 == 2) && interfaceC0607Gg != null && A0M(iArr[i13], c0605Ge.A02(i13), interfaceC0607Gg)) {
                if (i14 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i13;
                } else {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i13;
                }
            }
            i13++;
        }
        if (z10 & ((i11 == -1 || i12 == -1) ? false : true)) {
            AB ab2 = new AB(i10);
            abArr[i11] = ab2;
            abArr[i12] = ab2;
        }
    }

    public static boolean A0H(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 97));
    }

    public static boolean A0J(Format format, int i10, GW gw) {
        if (!A0H(i10, false) || format.A05 != gw.A00 || format.A0C != gw.A01) {
            return false;
        }
        String str = gw.A02;
        String[] strArr = A03;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A03[4] = "Z4TnxuroRrU42RhZWOmYjmwLcPTU1MVO";
        return str == null || TextUtils.equals(gw.A02, format.A0O);
    }

    public static boolean A0K(Format format, String str) {
        if (str != null) {
            boolean equals = TextUtils.equals(str, IF.A0L(format.A0N));
            if (A03[1].charAt(28) != 'F') {
                throw new RuntimeException();
            }
            A03[6] = "X09dGmvImKzkjml92Go2OBGPrO7s8ElS";
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0L(Format format, String str, int i10, int i11, int i12, int i13, int i14) {
        if (!A0H(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !IF.A0g(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i12) {
            return false;
        }
        int i15 = format.A08;
        String[] strArr = A03;
        if (strArr[2].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A03[4] = "SWfcLm8XXzRqeXuobK6MjvAJ3gvDaDv7";
        if (i15 == -1 || format.A08 <= i13) {
            return format.A04 == -1 || format.A04 <= i14;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, InterfaceC0607Gg interfaceC0607Gg) {
        if (interfaceC0607Gg == null) {
            return false;
        }
        int A00 = trackGroupArray.A00(interfaceC0607Gg.A8A());
        for (int i10 = 0; i10 < interfaceC0607Gg.length(); i10++) {
            int trackGroupIndex = iArr[A00][interfaceC0607Gg.A7C(i10)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:31:0x0088 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r10, int[] r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0504Bo.A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], boolean):int[]");
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int selectedMimeTypeTrackCount, int i12, int i13, int i14, boolean z11) {
        int countForMimeType;
        if (trackGroup.A01 >= 2) {
            List<Integer> A0D = A0D(trackGroup, i13, i14, z11);
            if (A0D.size() < 2) {
                return A04;
            }
            String selectedMimeType = null;
            if (!z10) {
                HashSet hashSet = new HashSet();
                int i15 = 0;
                for (int selectedMimeTypeTrackCount2 = 0; selectedMimeTypeTrackCount2 < A0D.size(); selectedMimeTypeTrackCount2++) {
                    String str = trackGroup.A01(A0D.get(selectedMimeTypeTrackCount2).intValue()).A0O;
                    if (hashSet.add(str) && (countForMimeType = A03(trackGroup, iArr, i10, str, i11, selectedMimeTypeTrackCount, i12, A0D)) > i15) {
                        selectedMimeType = str;
                        i15 = countForMimeType;
                    }
                }
            }
            A0F(trackGroup, iArr, i10, selectedMimeType, i11, selectedMimeTypeTrackCount, i12, A0D);
            return A0D.size() < 2 ? A04 : IF.A0j(A0D);
        }
        return A04;
    }

    private final InterfaceC0607Gg[] A0P(C0605Ge c0605Ge, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C04419c {
        int A00 = c0605Ge.A00();
        InterfaceC0607Gg[] interfaceC0607GgArr = new InterfaceC0607Gg[A00];
        boolean seenVideoRendererWithMappedTracks = false;
        boolean z10 = false;
        for (int i10 = 0; i10 < A00; i10++) {
            if (2 == c0605Ge.A01(i10)) {
                if (!z10) {
                    interfaceC0607GgArr[i10] = A0B(c0605Ge.A02(i10), iArr[i10], iArr2[i10], defaultTrackSelector$Parameters, this.A00);
                    z10 = interfaceC0607GgArr[i10] != null;
                }
                seenVideoRendererWithMappedTracks |= c0605Ge.A02(i10).A01 > 0;
            }
        }
        boolean z11 = false;
        int rendererCount = 0;
        for (int i11 = 0; i11 < A00; i11++) {
            int A01 = c0605Ge.A01(i11);
            switch (A01) {
                case 1:
                    if (z11) {
                        break;
                    } else {
                        TrackGroupArray A022 = c0605Ge.A02(i11);
                        int[][] iArr3 = iArr[i11];
                        int i12 = iArr2[i11];
                        interfaceC0607GgArr[i11] = A0A(A022, iArr3, i12, defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                        if (interfaceC0607GgArr[i11] != null) {
                            z11 = true;
                            break;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                case 2:
                    break;
                case 3:
                    if (rendererCount == 0) {
                        interfaceC0607GgArr[i11] = A08(c0605Ge.A02(i11), iArr[i11], defaultTrackSelector$Parameters);
                        rendererCount = interfaceC0607GgArr[i11] != null ? 1 : 0;
                        if (A03[1].charAt(28) != 'F') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[2] = "QJl7DztNVPNycYqDWlGKy9194VAG";
                        strArr[5] = "9kW2zRUIc2UhcVCPTVcu4Y";
                        break;
                    } else {
                        continue;
                    }
                default:
                    interfaceC0607GgArr[i11] = A06(A01, c0605Ge.A02(i11), iArr[i11], defaultTrackSelector$Parameters);
                    break;
            }
        }
        return interfaceC0607GgArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    @Override // com.facebook.ads.redexgen.uinode.W6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.facebook.ads.redexgen.uinode.AB[], com.facebook.ads.redexgen.uinode.InterfaceC0607Gg[]> A0V(com.facebook.ads.redexgen.uinode.C0605Ge r11, int[][][] r12, int[] r13) throws com.facebook.ads.redexgen.uinode.C04419c {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters> r0 = r10.A01
            java.lang.Object r6 = r0.get()
            com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r6 = (com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters) r6
            int r5 = r11.A00()
            com.facebook.ads.redexgen.X.Gg[] r4 = r10.A0P(r11, r12, r13, r6)
            r3 = 0
        L11:
            r9 = 0
            r8 = 0
            r2 = 1
            if (r3 >= r5) goto L61
            boolean r0 = r6.A06(r3)
            if (r0 == 0) goto L21
            r4[r3] = r8
        L1e:
            int r3 = r3 + 1
            goto L11
        L21:
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r1 = r11.A02(r3)
            boolean r0 = r6.A07(r3, r1)
            if (r0 == 0) goto L1e
            com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride r7 = r6.A05(r3, r1)
            if (r7 != 0) goto L34
            r4[r3] = r8
            goto L1e
        L34:
            int r0 = r7.A01
            if (r0 != r2) goto L4a
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r2 = r1.A01(r0)
            int[] r0 = r7.A02
            r1 = r0[r9]
            com.facebook.ads.redexgen.X.Bn r0 = new com.facebook.ads.redexgen.X.Bn
            r0.<init>(r2, r1)
            r4[r3] = r0
            goto L1e
        L4a:
            com.facebook.ads.redexgen.X.Gf r0 = r10.A00
            java.lang.Object r2 = com.facebook.ads.redexgen.uinode.AbstractC0626Ha.A01(r0)
            com.facebook.ads.redexgen.X.Gf r2 = (com.facebook.ads.redexgen.uinode.InterfaceC0606Gf) r2
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r1 = r1.A01(r0)
            int[] r0 = r7.A02
            com.facebook.ads.redexgen.X.Gg r0 = r2.A4o(r1, r0)
            r4[r3] = r0
            goto L1e
        L61:
            com.facebook.ads.redexgen.X.AB[] r3 = new com.facebook.ads.redexgen.uinode.AB[r5]
            r2 = 0
        L64:
            if (r2 >= r5) goto L85
            boolean r0 = r6.A06(r2)
            if (r0 != 0) goto L83
            int r1 = r11.A01(r2)
            r0 = 5
            if (r1 == r0) goto L77
            r0 = r4[r2]
            if (r0 == 0) goto L83
        L77:
            r0 = 1
        L78:
            if (r0 == 0) goto L81
            com.facebook.ads.redexgen.X.AB r0 = com.facebook.ads.redexgen.uinode.AB.A01
        L7c:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L64
        L81:
            r0 = r8
            goto L7c
        L83:
            r0 = 0
            goto L78
        L85:
            int r0 = r6.A04
            A0G(r11, r12, r3, r4, r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0504Bo.A0V(com.facebook.ads.redexgen.X.Ge, int[][][], int[]):android.util.Pair");
    }
}
