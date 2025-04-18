package com.facebook.ads.redexgen.uinode;

import android.view.Surface;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.analytics.AnalyticsCollector;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class Y2 implements A0, DZ, InterfaceC0473Aj, InterfaceC0655Id, F4, InterfaceC0615Go {
    public static byte[] A05;
    public static String[] A06 = {"3ui7943oJKQ0earBMheCpqpPzXrDt0u1", "Y87VavrouiKi9z", "P6cMiRGLac5hfjC0tRGIGRLUUUjxE7XX", "Gp12Iojej9PCs1Iei8EmhswJ2d7MPPra", "iPLJe15l61uvnh9YTjVALhylcUuC36cq", "JkCpp1uc3ZLfv8H0X3nexU5u26UQU15j", "bG94g9DZx4SnKjROolD8g6Osz0P9GRGH", "l5hRkIxgm3MuCDpPoC4K2VrrhVSesDup"};
    public A5 A00;
    public final InterfaceC0629Hd A03;
    public final CopyOnWriteArraySet<AM> A04 = new CopyOnWriteArraySet<>();
    public final AJ A02 = new AJ();
    public final AG A01 = new AG();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final AL A04(int i10, C0566Eo c0566Eo) {
        AbstractC0626Ha.A01(this.A00);
        long A5T = this.A03.A5T();
        AH A6f = this.A00.A6f();
        return new AL(A5T, A6f, i10, c0566Eo, i10 == this.A00.A6g() ? (c0566Eo == null || !c0566Eo.A01()) ? this.A00.A6Y() : (this.A00.A6a() == c0566Eo.A00 && this.A00.A6b() == c0566Eo.A01) ? this.A00.A6d() : 0L : (i10 >= A6f.A01() || (c0566Eo != null && c0566Eo.A01())) ? 0L : A6f.A0B(i10, this.A01).A00(), this.A00.A6d(), this.A00.A6C() - this.A00.A6Y());
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[1].length() == 6) {
                throw new RuntimeException();
            }
            A06[7] = "xkcvOVIbsJfh1oKhiKwgfFf4IsGYyVdI";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            byte b3 = (byte) ((copyOfRange[i13] - i12) - 49);
            String[] strArr = A06;
            if (strArr[5].charAt(24) != strArr[3].charAt(24)) {
                copyOfRange[i13] = b3;
                i13++;
            } else {
                String[] strArr2 = A06;
                strArr2[4] = "JgGC4AoHPHqaA2mu6Lv3HYh9P7bVUWI6";
                strArr2[2] = "XnIEFTr01SOX1dEJLAecLnyBN6G9spdC";
                copyOfRange[i13] = b3;
                i13++;
            }
        }
    }

    public static void A07() {
        A05 = new byte[]{-12, -13, -58, -6, -23, -18, -12, -40, -22, -8, -8, -18, -12, -13, -50, -23, -77, -78, -123, -71, -88, -83, -77, -103, -78, -88, -87, -74, -74, -71, -78, -76, -77, -119, -86, -88, -76, -87, -86, -73, -119, -82, -72, -90, -89, -79, -86, -87, -27, -28, -70, -37, -39, -27, -38, -37, -24, -69, -28, -41, -40, -30, -37, -38, Ascii.ESC, Ascii.SUB, -16, 17, Ascii.SI, Ascii.ESC, Ascii.DLE, 17, Ascii.RS, -11, Ascii.SUB, Ascii.NAK, 32, Ascii.NAK, Ascii.CR, Ascii.CAN, Ascii.NAK, 38, 17, Ascii.DLE, Ascii.DC4, 19, -23, 10, 8, Ascii.DC4, 9, 10, Ascii.ETB, -18, 19, Ascii.NAK, Ascii.SUB, Ascii.EM, -21, Ascii.DC4, Ascii.ETB, Ascii.DC2, 6, Ascii.EM, -24, Ascii.CR, 6, 19, Ascii.FF, 10, 9, -76, -77, -119, -76, -68, -77, -72, -71, -73, -86, -90, -78, -117, -76, -73, -78, -90, -71, -120, -83, -90, -77, -84, -86, -87, -57, -58, -100, -54, -57, -56, -56, -67, -68, -82, -63, -68, -67, -57, -98, -54, -71, -59, -67, -53, -71, -72, -106, -71, -85, -82, -113, -68, -68, -71, -68, -19, -20, -54, -19, -33, -30, -25, -20, -27, -63, -26, -33, -20, -27, -29, -30, -3, -4, -37, -13, -14, -9, -17, -34, -13, 0, -9, -3, -14, -47, 0, -13, -17, 2, -13, -14, 1, 0, -33, -9, -10, -5, -13, -30, -9, 4, -5, 1, -10, -28, -9, -2, -9, -13, 5, -9, -10, -92, -93, -126, -102, -87, -106, -103, -106, -87, -106, 5, 4, -26, 2, -9, Ascii.SI, -8, -9, -7, 1, -26, -9, 8, -9, 3, -5, 10, -5, 8, 9, -39, -2, -9, 4, -3, -5, -6, -30, -31, -61, -33, -44, -20, -40, -27, -72, -27, -27, -30, -27, 1, 0, -30, -2, -13, Ascii.VT, -9, 4, -27, 6, -13, 6, -9, -43, -6, -13, 0, -7, -9, -10, Ascii.RS, Ascii.GS, -1, Ascii.RS, 34, Ascii.CAN, 35, Ascii.CAN, Ascii.RS, Ascii.GS, -13, Ascii.CAN, 34, Ascii.DC2, Ascii.RS, Ascii.GS, 35, Ascii.CAN, Ascii.GS, 36, Ascii.CAN, 35, 40, Ascii.CAN, Ascii.ETB, -5, Ascii.SO, 10, Ascii.CR, Ascii.DC2, Ascii.ETB, Ascii.DLE, -4, Ascii.GS, 10, Ascii.ESC, Ascii.GS, Ascii.SO, Ascii.CR, Ascii.ETB, Ascii.SYN, -6, Ascii.CR, Ascii.SYN, Ascii.FF, Ascii.CR, Ascii.SUB, Ascii.CR, Ascii.FF, -18, 17, Ascii.SUB, Ascii.ESC, Ascii.FS, -18, Ascii.SUB, 9, Ascii.NAK, Ascii.CR, -36, -37, -64, -46, -46, -40, -67, -33, -36, -48, -46, -32, -32, -46, -47, Ascii.CAN, Ascii.ETB, -4, Ascii.SO, Ascii.SO, Ascii.DC4, -4, Ascii.GS, 10, Ascii.ESC, Ascii.GS, Ascii.SO, Ascii.CR, -4, -5, -31, -10, -6, -14, -7, -10, -5, -14, -48, -11, -18, -5, -12, -14, -15, -44, -45, -71, -41, -58, -56, -48, -40, -88, -51, -58, -45, -52, -54, -55, -52, -53, -77, -58, -63, -62, -52, -80, -58, -41, -62, -96, -59, -66, -53, -60, -62, -63};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0473Aj
    public final void AAt(int i10, long j3, long j10) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(16, 15, 19));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0615Go
    public final void AAw(int i10, long j3, long j10) {
        A01();
        Iterator<AM> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0655Id
    public final void ADf(int i10, int i11, int i12, float f10) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(TTAdConstant.VIDEO_INFO_CODE, 18, 44));
        }
    }

    static {
        A07();
    }

    public Y2(A5 a52, InterfaceC0629Hd interfaceC0629Hd) {
        this.A00 = a52;
        this.A03 = (InterfaceC0629Hd) AbstractC0626Ha.A01(interfaceC0629Hd);
    }

    private AL A00() {
        return A05(this.A02.A03());
    }

    private AL A01() {
        return A05(this.A02.A04());
    }

    private AL A02() {
        return A05(this.A02.A05());
    }

    private AL A03() {
        return A05(this.A02.A06());
    }

    private AL A05(AK ak) {
        if (ak == null) {
            Object A01 = AbstractC0626Ha.A01(this.A00);
            String[] strArr = A06;
            if (strArr[5].charAt(24) != strArr[3].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[4] = "It2FvVQ6GuD0QkNXfVFrE8OCooaDSMpJ";
            strArr2[2] = "a2HOGJm5UwCLA4g7R7QNf278R1ClTDAB";
            int A6g = ((A5) A01).A6g();
            return A04(A6g, this.A02.A07(A6g));
        }
        return A04(ak.A00, ak.A01);
    }

    public final void A08() {
        if (!this.A02.A0F()) {
            A02();
            AJ aj = this.A02;
            if (A06[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = "qsPEDs7YPcMFbl4XVvGjNAFSUVJ30e5d";
            strArr[2] = "wNEtz3pAWSMGqURdz3XYnwNQJEjBbTAW";
            aj.A09();
            Iterator<AM> it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A06(368, 13, 120));
            }
        }
    }

    public final void A09() {
        ArrayList arrayList;
        arrayList = this.A02.A05;
        List<AnalyticsCollector.WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>(arrayList);
        Iterator<AnalyticsCollector.WindowAndMediaPeriodId> it = activeMediaPeriods.iterator();
        while (it.hasNext()) {
            AK ak = (AK) it.next();
            ACH(ak.A00, ak.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0473Aj
    public final void AAo(String str, long j3, long j10) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(64, 20, 123));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0473Aj
    public final void AAp(BC bc2) {
        A00();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(31, 17, 20));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0473Aj
    public final void AAq(BC bc2) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(48, 16, 69));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0473Aj
    public final void AAr(Format format) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(84, 27, 116));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0473Aj
    public final void AAs(int i10) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(0, 16, 84));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.F4
    public final void ABM(int i10, C0566Eo c0566Eo, F3 f32) {
        A04(i10, c0566Eo);
        Iterator<AM> it = this.A04.iterator();
        boolean hasNext = it.hasNext();
        if (A06[7].charAt(15) == 'w') {
            throw new RuntimeException();
        }
        A06[7] = "A4QXCUmAUOBVX64TvaZ46B5z8oAUnNZh";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A06(111, 25, 20));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0655Id
    public final void ABN(int i10, long j3) {
        A00();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(136, 20, 39));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.F4
    public final void ABy(int i10, C0566Eo c0566Eo, F2 f22, F3 f32) {
        A04(i10, c0566Eo);
        Iterator<AM> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.F4
    public final void AC0(int i10, C0566Eo c0566Eo, F2 f22, F3 f32) {
        A04(i10, c0566Eo);
        Iterator<AM> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A06[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "U0y5Da5mII5YR5LLA1Yw3vUoz2XQzjRa";
            strArr[6] = "AsACfu1w80VTJMOzwO3g8Y2nz7gc0iIE";
            if (!hasNext) {
                return;
            } else {
                it.next();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.F4
    public final void AC3(int i10, C0566Eo c0566Eo, F2 f22, F3 f32, IOException iOException, boolean z10) {
        A04(i10, c0566Eo);
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(156, 11, 25));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.F4
    public final void AC5(int i10, C0566Eo c0566Eo, F2 f22, F3 f32) {
        A04(i10, c0566Eo);
        Iterator<AM> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A0
    public final void AC7(boolean z10) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(167, 16, 77));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.F4
    public final void ACG(int i10, C0566Eo c0566Eo) {
        this.A02.A0B(i10, c0566Eo);
        A04(i10, c0566Eo);
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(183, 20, 93));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.F4
    public final void ACH(int i10, C0566Eo c0566Eo) {
        this.A02.A0C(i10, c0566Eo);
        A04(i10, c0566Eo);
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(203, 21, 97));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.DZ
    public final void ACK(Metadata metadata) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(224, 10, 4));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A0
    public final void ACb(C04619x c04619x) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(234, 27, 101));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A0
    public final void ACd(C04419c c04419c) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(261, 13, 66));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A0
    public final void ACf(boolean z10, int i10) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        boolean hasNext = it.hasNext();
        String[] strArr = A06;
        if (strArr[0].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        A06[1] = "LXJ0q";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A06(274, 20, 97));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A0
    public final void ACh(int i10) {
        this.A02.A0A(i10);
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(294, 23, 126));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.F4
    public final void ACp(int i10, C0566Eo c0566Eo) {
        this.A02.A0D(i10, c0566Eo);
        A04(i10, c0566Eo);
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(317, 16, 120));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0655Id
    public final void ACt(Surface surface) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(333, 20, 119));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A0
    public final void AD4() {
        if (this.A02.A0F()) {
            this.A02.A08();
            A02();
            Iterator<AM> it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A06(353, 15, 60));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A0
    public final void ADJ(AH ah2, Object obj, int i10) {
        this.A02.A0E(ah2);
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(381, 17, 92));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.A0
    public final void ADM(TrackGroupArray trackGroupArray, C0608Gh c0608Gh) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(398, 15, 52));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0655Id
    public final void ADU(String str, long j3, long j10) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(64, 20, 123));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0655Id
    public final void ADV(BC bc2) {
        A00();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(31, 17, 20));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0655Id
    public final void ADW(BC bc2) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(48, 16, 69));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0655Id
    public final void ADa(Format format) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(84, 27, 116));
        }
    }
}
