package com.instagram.common.viewpoint.core;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.analytics.AnalyticsCollector;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class Z7 implements A5, InterfaceC0487De, InterfaceC0422Ao, Ii, F9, InterfaceC0564Gt {
    public static byte[] A05;
    public static String[] A06 = {"JhZxgqSPqJZtY", "FLENzqLihQAA2w3tgpVm0", "7ZBv6Xf8m8TMmXRPS", "I4crTxI1giVI7xqmGDODF89LWdqI", "ohE9u8k0zNF07TfyNCZmbDm4sMg961ad", "nKZNDf3J9No1PG0TylmkWCGmRp7BU7FY", "TNTBuTAPIFUG7kmeXsoB", "NmWqFCZR2g5OT4VxewX508"};
    public AA A00;
    public final InterfaceC0579Hi A03;
    public final CopyOnWriteArraySet<AR> A04 = new CopyOnWriteArraySet<>();
    public final AO A02 = new AO();
    public final AL A01 = new AL();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final AQ A04(int i2, Et et) {
        AbstractC0576Hf.A01(this.A00);
        long A5p = this.A03.A5p();
        AM A73 = this.A00.A73();
        return new AQ(A5p, A73, i2, et, i2 == this.A00.A74() ? (et == null || !et.A01()) ? this.A00.A6w() : (this.A00.A6y() == et.A00 && this.A00.A6z() == et.A01) ? this.A00.A71() : 0L : (i2 >= A73.A01() || (et != null && et.A01())) ? 0L : A73.A0B(i2, this.A01).A00(), this.A00.A71(), this.A00.A6a() - this.A00.A6w());
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-56, -57, -102, -50, -67, -62, -56, -84, -66, -52, -52, -62, -56, -57, -94, -67, -106, -107, 104, -100, -117, -112, -106, 124, -107, -117, -116, -103, -103, -100, -107, -105, -106, 108, -115, -117, -105, -116, -115, -102, 108, -111, -101, -119, -118, -108, -115, -116, -90, -91, 123, -100, -102, -90, -101, -100, -87, 124, -91, -104, -103, -93, -100, -101, -105, -106, 108, -115, -117, -105, -116, -115, -102, 113, -106, -111, -100, -111, -119, -108, -111, -94, -115, -116, -91, -92, 122, -101, -103, -91, -102, -101, -88, Byte.MAX_VALUE, -92, -90, -85, -86, 124, -91, -88, -93, -105, -86, 121, -98, -105, -92, -99, -101, -102, -117, -118, 96, -117, -109, -118, -113, -112, -114, -127, 125, -119, 98, -117, -114, -119, 125, -112, 95, -124, 125, -118, -125, -127, UnsignedBytes.MAX_POWER_OF_TWO, -66, -67, -109, -63, -66, -65, -65, -76, -77, -91, -72, -77, -76, -66, -107, -63, -80, -68, -76, -62, -111, -112, 110, -111, -125, -122, 103, -108, -108, -111, -108, -101, -102, 120, -101, -115, -112, -107, -102, -109, 111, -108, -115, -102, -109, -111, -112, -95, -96, Byte.MAX_VALUE, -105, -106, -101, -109, -126, -105, -92, -101, -95, -106, 117, -92, -105, -109, -90, -105, -106, -115, -116, 107, -125, -126, -121, Byte.MAX_VALUE, 110, -125, -112, -121, -115, -126, 112, -125, -118, -125, Byte.MAX_VALUE, -111, -125, -126, -60, -61, -94, -70, -55, -74, -71, -74, -55, -74, -77, -78, -108, -80, -91, -67, -90, -91, -89, -81, -108, -91, -74, -91, -79, -87, -72, -87, -74, -73, -121, -84, -91, -78, -85, -87, -88, -70, -71, -101, -73, -84, -60, -80, -67, -112, -67, -67, -70, -67, -56, -57, -87, -59, -70, -46, -66, -53, -84, -51, -70, -51, -66, -100, -63, -70, -57, -64, -66, -67, -41, -42, -72, -41, -37, -47, -36, -47, -41, -42, -84, -47, -37, -53, -41, -42, -36, -47, -42, -35, -47, -36, -31, -34, -35, -63, -44, -48, -45, -40, -35, -42, -62, -29, -48, -31, -29, -44, -45, -52, -53, -81, -62, -53, -63, -62, -49, -62, -63, -93, -58, -49, -48, -47, -93, -49, -66, -54, -62, -69, -70, -97, -79, -79, -73, -100, -66, -69, -81, -79, -65, -65, -79, -80, -55, -56, -83, -65, -65, -59, -83, -50, -69, -52, -50, -65, -66, -62, -63, -89, -68, -64, -72, -65, -68, -63, -72, -106, -69, -76, -63, -70, -72, -73, -110, -111, 119, -107, -124, -122, -114, -106, 102, -117, -124, -111, -118, -120, -121, -114, -115, 117, -120, -125, -124, -114, 114, -120, -103, -124, 98, -121, UnsignedBytes.MAX_POWER_OF_TWO, -115, -122, -124, -125};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABJ(int i2, long j2, long j3) {
        A03();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(16, 15, 37));
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
    @Override // com.instagram.common.viewpoint.core.InterfaceC0564Gt
    public final void ABM(int i2, long j2, long j3) {
        A01();
        Iterator<AR> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    static {
        A07();
    }

    public Z7(AA aa, InterfaceC0579Hi interfaceC0579Hi) {
        this.A00 = aa;
        this.A03 = (InterfaceC0579Hi) AbstractC0576Hf.A01(interfaceC0579Hi);
    }

    private AQ A00() {
        return A05(this.A02.A03());
    }

    private AQ A01() {
        return A05(this.A02.A04());
    }

    private AQ A02() {
        return A05(this.A02.A05());
    }

    private AQ A03() {
        return A05(this.A02.A06());
    }

    private AQ A05(AP ap) {
        if (ap == null) {
            int A74 = ((AA) AbstractC0576Hf.A01(this.A00)).A74();
            return A04(A74, this.A02.A07(A74));
        }
        return A04(ap.A00, ap.A01);
    }

    public final void A08() {
        if (!this.A02.A0F()) {
            A02();
            this.A02.A09();
            Iterator<AR> it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A06(368, 13, 88));
            }
        }
    }

    public final void A09() {
        ArrayList arrayList;
        arrayList = this.A02.A05;
        List<AnalyticsCollector.WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>(arrayList);
        Iterator<AnalyticsCollector.WindowAndMediaPeriodId> it = activeMediaPeriods.iterator();
        while (it.hasNext()) {
            AP ap = (AP) it.next();
            ACi(ap.A00, ap.A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABE(String str, long j2, long j3) {
        A03();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(64, 20, 38));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABF(BH bh) {
        A00();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(31, 17, 38));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABG(BH bh) {
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(48, 16, 53));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABH(Format format) {
        A03();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(84, 27, 52));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABI(int i2) {
        A03();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(0, 16, 87));
        }
    }

    @Override // com.instagram.common.viewpoint.core.F9
    public final void ABn(int i2, Et et, F8 f8) {
        A04(i2, et);
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(111, 25, 26));
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ABo(int i2, long j2) {
        A00();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(Opcodes.L2I, 20, 77));
        }
    }

    @Override // com.instagram.common.viewpoint.core.F9
    public final void ACP(int i2, Et et, F7 f7, F8 f8) {
        A04(i2, et);
        Iterator<AR> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A06[3].length() != 28) {
                throw new RuntimeException();
            }
            A06[0] = "2uRrQtj8OVF6XfLs";
            if (!hasNext) {
                return;
            } else {
                it.next();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.F9
    public final void ACR(int i2, Et et, F7 f7, F8 f8) {
        A04(i2, et);
        Iterator<AR> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.instagram.common.viewpoint.core.F9
    public final void ACU(int i2, Et et, F7 f7, F8 f8, IOException iOException, boolean z2) {
        A04(i2, et);
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(156, 11, 32));
        }
    }

    @Override // com.instagram.common.viewpoint.core.F9
    public final void ACW(int i2, Et et, F7 f7, F8 f8) {
        A04(i2, et);
        Iterator<AR> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.instagram.common.viewpoint.core.A5
    public final void ACY(boolean z2) {
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(Opcodes.GOTO, 16, 42));
        }
    }

    @Override // com.instagram.common.viewpoint.core.F9
    public final void ACh(int i2, Et et) {
        this.A02.A0B(i2, et);
        A04(i2, et);
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(Opcodes.INVOKESPECIAL, 20, 48));
        }
    }

    @Override // com.instagram.common.viewpoint.core.F9
    public final void ACi(int i2, Et et) {
        this.A02.A0C(i2, et);
        A04(i2, et);
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(203, 21, 28));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0487De
    public final void ACl(Metadata metadata) {
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(224, 10, 83));
        }
    }

    @Override // com.instagram.common.viewpoint.core.A5
    public final void AD4(A2 a2) {
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(234, 27, 66));
        }
    }

    @Override // com.instagram.common.viewpoint.core.A5
    public final void AD6(C03909h c03909h) {
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(261, 13, 73));
        }
    }

    @Override // com.instagram.common.viewpoint.core.A5
    public final void AD8(boolean z2, int i2) {
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(274, 20, 87));
        }
    }

    @Override // com.instagram.common.viewpoint.core.A5
    public final void ADA(int i2) {
        this.A02.A0A(i2);
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(294, 23, 102));
        }
    }

    @Override // com.instagram.common.viewpoint.core.F9
    public final void ADI(int i2, Et et) {
        this.A02.A0D(i2, et);
        A04(i2, et);
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(317, 16, 109));
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ADM(Surface surface) {
        A03();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(333, 20, 91));
        }
    }

    @Override // com.instagram.common.viewpoint.core.A5
    public final void ADX() {
        if (this.A02.A0F()) {
            this.A02.A08();
            if (A06[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[5] = "UDZDYjXxjNHYq9JD6S2eSatmZcvsscy1";
            strArr[4] = "qhkLJVHcnNHUeJmYZMCLkSzlztH9ZvMr";
            A02();
            Iterator<AR> it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A06(353, 15, 74));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.A5
    public final void ADm(AM am, Object obj, int i2) {
        this.A02.A0E(am);
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(381, 17, 81));
        }
    }

    @Override // com.instagram.common.viewpoint.core.A5
    public final void ADp(TrackGroupArray trackGroupArray, C0557Gm c0557Gm) {
        A02();
        Iterator<AR> it = this.A04.iterator();
        boolean hasNext = it.hasNext();
        String[] strArr = A06;
        if (strArr[7].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "qLIqUi61sNDZYWoF8geBhsMEHylVdISs";
        strArr2[4] = "9HduxlPi9N40LYnK0KSe4bGhPs2KM8kN";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A06(398, 15, 33));
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ADx(String str, long j2, long j3) {
        A03();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(64, 20, 38));
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ADy(BH bh) {
        A00();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(31, 17, 38));
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ADz(BH bh) {
        A02();
        Iterator<AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A06(48, 16, 53));
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void AE3(Format format) {
        A03();
        Iterator<AR> it = this.A04.iterator();
        boolean hasNext = it.hasNext();
        if (A06[0].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "p7wHWjPhsPNxUw5g8aIZ5g";
        strArr[6] = "BH3xE3sWNlCwun7pc0Kn";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A06(84, 27, 52));
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void AE8(int i2, int i3, int i4, float f2) {
        A03();
        Iterator<AR> it = this.A04.iterator();
        boolean hasNext = it.hasNext();
        String[] strArr = A06;
        if (strArr[5].charAt(9) != strArr[4].charAt(9)) {
            throw new RuntimeException();
        }
        A06[2] = "jBVMu8t1YfgjmQVV4";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A06(413, 18, 29));
        }
    }
}
