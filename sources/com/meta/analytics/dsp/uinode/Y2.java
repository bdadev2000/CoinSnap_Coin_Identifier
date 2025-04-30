package com.meta.analytics.dsp.uinode;

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
public final class Y2 implements A0, DZ, InterfaceC1039Aj, InterfaceC1221Id, F4, InterfaceC1181Go {
    public static byte[] A05;
    public static String[] A06 = {"3ui7943oJKQ0earBMheCpqpPzXrDt0u1", "Y87VavrouiKi9z", "P6cMiRGLac5hfjC0tRGIGRLUUUjxE7XX", "Gp12Iojej9PCs1Iei8EmhswJ2d7MPPra", "iPLJe15l61uvnh9YTjVALhylcUuC36cq", "JkCpp1uc3ZLfv8H0X3nexU5u26UQU15j", "bG94g9DZx4SnKjROolD8g6Osz0P9GRGH", "l5hRkIxgm3MuCDpPoC4K2VrrhVSesDup"};
    public A5 A00;
    public final InterfaceC1195Hd A03;
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
    private final AL A04(int i9, C1132Eo c1132Eo) {
        AbstractC1192Ha.A01(this.A00);
        long A5T = this.A03.A5T();
        AH A6f = this.A00.A6f();
        return new AL(A5T, A6f, i9, c1132Eo, i9 == this.A00.A6g() ? (c1132Eo == null || !c1132Eo.A01()) ? this.A00.A6Y() : (this.A00.A6a() == c1132Eo.A00 && this.A00.A6b() == c1132Eo.A01) ? this.A00.A6d() : 0L : (i9 >= A6f.A01() || (c1132Eo != null && c1132Eo.A01())) ? 0L : A6f.A0B(i9, this.A01).A00(), this.A00.A6d(), this.A00.A6C() - this.A00.A6Y());
    }

    public static String A06(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[1].length() == 6) {
                throw new RuntimeException();
            }
            A06[7] = "xkcvOVIbsJfh1oKhiKwgfFf4IsGYyVdI";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i12] - i11) - 49);
            String[] strArr = A06;
            if (strArr[5].charAt(24) != strArr[3].charAt(24)) {
                copyOfRange[i12] = b;
                i12++;
            } else {
                String[] strArr2 = A06;
                strArr2[4] = "JgGC4AoHPHqaA2mu6Lv3HYh9P7bVUWI6";
                strArr2[2] = "XnIEFTr01SOX1dEJLAecLnyBN6G9spdC";
                copyOfRange[i12] = b;
                i12++;
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
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAt(int i9, long j7, long j9) {
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
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1181Go
    public final void AAw(int i9, long j7, long j9) {
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
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADf(int i9, int i10, int i11, float f9) {
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

    public Y2(A5 a52, InterfaceC1195Hd interfaceC1195Hd) {
        this.A00 = a52;
        this.A03 = (InterfaceC1195Hd) AbstractC1192Ha.A01(interfaceC1195Hd);
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
            Object A01 = AbstractC1192Ha.A01(this.A00);
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

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAo(String str, long j7, long j9) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(64, 20, 123));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAp(BC bc) {
        A00();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(31, 17, 20));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAq(BC bc) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(48, 16, 69));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAr(Format format) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(84, 27, 116));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAs(int i9) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(0, 16, 84));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.F4
    public final void ABM(int i9, C1132Eo c1132Eo, F3 f32) {
        A04(i9, c1132Eo);
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

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ABN(int i9, long j7) {
        A00();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(136, 20, 39));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.F4
    public final void ABy(int i9, C1132Eo c1132Eo, F2 f22, F3 f32) {
        A04(i9, c1132Eo);
        Iterator<AM> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.F4
    public final void AC0(int i9, C1132Eo c1132Eo, F2 f22, F3 f32) {
        A04(i9, c1132Eo);
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

    @Override // com.meta.analytics.dsp.uinode.F4
    public final void AC3(int i9, C1132Eo c1132Eo, F2 f22, F3 f32, IOException iOException, boolean z8) {
        A04(i9, c1132Eo);
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(156, 11, 25));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.F4
    public final void AC5(int i9, C1132Eo c1132Eo, F2 f22, F3 f32) {
        A04(i9, c1132Eo);
        Iterator<AM> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.A0
    public final void AC7(boolean z8) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(167, 16, 77));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.F4
    public final void ACG(int i9, C1132Eo c1132Eo) {
        this.A02.A0B(i9, c1132Eo);
        A04(i9, c1132Eo);
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(183, 20, 93));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.F4
    public final void ACH(int i9, C1132Eo c1132Eo) {
        this.A02.A0C(i9, c1132Eo);
        A04(i9, c1132Eo);
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(203, 21, 97));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.DZ
    public final void ACK(Metadata metadata) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(224, 10, 4));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.A0
    public final void ACb(C10279x c10279x) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(234, 27, 101));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.A0
    public final void ACd(C10079c c10079c) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(261, 13, 66));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.A0
    public final void ACf(boolean z8, int i9) {
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

    @Override // com.meta.analytics.dsp.uinode.A0
    public final void ACh(int i9) {
        this.A02.A0A(i9);
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(294, 23, 126));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.F4
    public final void ACp(int i9, C1132Eo c1132Eo) {
        this.A02.A0D(i9, c1132Eo);
        A04(i9, c1132Eo);
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(317, 16, 120));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ACt(Surface surface) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(333, 20, 119));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.A0
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

    @Override // com.meta.analytics.dsp.uinode.A0
    public final void ADJ(AH ah, Object obj, int i9) {
        this.A02.A0E(ah);
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(381, 17, 92));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.A0
    public final void ADM(TrackGroupArray trackGroupArray, C1174Gh c1174Gh) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(398, 15, 52));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADU(String str, long j7, long j9) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(64, 20, 123));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADV(BC bc) {
        A00();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(31, 17, 20));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADW(BC bc) {
        A02();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(48, 16, 69));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADa(Format format) {
        A03();
        Iterator<AM> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(84, 27, 116));
        }
    }
}
