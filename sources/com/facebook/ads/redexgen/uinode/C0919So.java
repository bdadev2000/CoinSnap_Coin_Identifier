package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0919So extends FrameLayout implements MD {
    public static byte[] A0L;
    public static String[] A0M = {"n8b1XAz0kHAkpiWEmzC3t1pF5U", "eWK394xXCAUBfgpESuKIG56NqbrNFWJq", "5CdOn8t3diym6HDjOq5Y6uNvOx4lt5g3", "HN0pIlpAYl374dQUYji0gU", "nPJn2NzIeBIJ0ob92wkGV5", "7vv965TmOe", "OL6PAd", "N5PSCRASy1"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public C0795Nu A03;
    public PQ A04;
    public Q7 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1171b3 A0A;
    public final C5T A0B;
    public final C03756c A0C;
    public final C1070Yn A0D;
    public final J2 A0E;
    public final JA A0F;
    public final ViewOnSystemUiVisibilityChangeListenerC0724Lb A0G;
    public final MC A0H;
    public final FullScreenAdToolbar A0I;
    public final InterfaceC0758Mj A0J;
    public final ArrayList<C0829Pc> A0K;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 28
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.uinode.PQ A08(boolean r26, int r27) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0919So.A08(boolean, int):com.facebook.ads.redexgen.X.PQ");
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0L = new byte[]{113, -64, -73, 113, -62, -27, -95};
        String[] strArr = A0M;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[2] = "BvaU1dA3vF4hXYIjQV5InfWnSlZ4OmYy";
    }

    static {
        A0D();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C0919So(C1070Yn c1070Yn, InterfaceC0758Mj interfaceC0758Mj, J2 j22, C1171b3 c1171b3, C03756c c03756c, MC mc2) {
        super(c1070Yn);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new C0922Sr(this);
        this.A0D = c1070Yn;
        this.A0J = interfaceC0758Mj;
        this.A0E = j22;
        this.A0A = c1171b3;
        this.A0C = c03756c;
        this.A0H = mc2;
        this.A0F = new JA(c1171b3.A0v(0).A12(), j22);
        ViewOnSystemUiVisibilityChangeListenerC0724Lb viewOnSystemUiVisibilityChangeListenerC0724Lb = new ViewOnSystemUiVisibilityChangeListenerC0724Lb(this);
        this.A0G = viewOnSystemUiVisibilityChangeListenerC0724Lb;
        viewOnSystemUiVisibilityChangeListenerC0724Lb.A05(EnumC0723La.A03);
        this.A05 = new Q7(c1070Yn, interfaceC0758Mj, c1171b3.A0T(), mc2);
        FullScreenAdToolbar A05 = A05();
        this.A0I = A05;
        addView(A05, new FrameLayout.LayoutParams(-1, A05.getToolbarHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r5 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r5.A15() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r6.A0A.A0r() == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r6.A04.A14() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r6.A0A.A14() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r6.A08 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        A0R(false, r6.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r5 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A00() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0919So.A00():int");
    }

    private int A01(int i10) {
        if (this.A0A.A14() && i10 < this.A0A.A0z().size() && i10 >= 0) {
            return this.A0A.A0z().get(i10).intValue();
        }
        return this.A0A.A0G();
    }

    public static /* synthetic */ int A02(C0919So c0919So, int i10) {
        int i11 = c0919So.A01 + i10;
        c0919So.A01 = i11;
        return i11;
    }

    private FullScreenAdToolbar A05() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new C0920Sp(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        int A00 = A00();
        if (A00 != 0) {
            this.A0D.A0E().A4G(A00);
        }
    }

    private void A0B() {
        int i10 = this.A00;
        if (i10 > 0 && !TextUtils.isEmpty(this.A0A.A0v(i10 - 1).A12())) {
            J2 j22 = this.A0E;
            String A12 = this.A0A.A0v(this.A00 - 1).A12();
            C0783Ni c0783Ni = new C0783Ni();
            PQ pq = this.A04;
            C0783Ni A03 = c0783Ni.A03(pq != null ? pq.getAdViewabilityChecker() : null);
            PQ pq2 = this.A04;
            j22.A9X(A12, A03.A02(pq2 != null ? pq2.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0C() {
        this.A0D.A0E().A4E();
        this.A07 = true;
        this.A03 = new C0795Nu(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        C0829Pc c0829Pc = null;
        Iterator<C0829Pc> it = this.A0K.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0M[1].charAt(22) == '6') {
                String[] strArr = A0M;
                strArr[7] = "ZPnrdglx3i";
                strArr[5] = "Z92DtyKnO3";
                if (!hasNext) {
                    break;
                }
                C0829Pc next = it.next();
                if (next.A00 == C0829Pc.A06) {
                    c0829Pc = next;
                    break;
                }
            } else {
                throw new RuntimeException();
            }
        }
        if (c0829Pc != null) {
            A0I(this.A03, c0829Pc);
        } else if (!this.A0K.isEmpty()) {
            A0I(this.A03, this.A0K.get(0));
        }
        A0Q(true);
        this.A0I.setOnlyPageDetails(null);
        PQ pq = this.A04;
        if (pq != null) {
            AbstractC0737Lo.A0J(pq);
            this.A04.A0z();
            this.A04 = null;
        }
        AbstractC0737Lo.A0J(this.A03);
        AbstractC0737Lo.A0G(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0E() {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0G.A05(EnumC0723La.A04);
    }

    private synchronized void A0F() {
        this.A0H.A43(this.A0J.A5s());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(float f10) {
        float seenCurrentPosMS;
        float A01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A14() ? 0 : this.A01) + f10;
        if (A01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / A01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A14()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            this.A09 = true;
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(int i10) {
        this.A0D.A0E().A4B(i10);
        this.A09 = true;
        A0F();
        A0B();
        this.A0H.A43(this.A0J.A6u());
    }

    private void A0I(ViewGroup viewGroup, C0829Pc c0829Pc) {
        if (c0829Pc.A00 == C0829Pc.A06 && c0829Pc.A03 != null) {
            OA.A00(this.A0D, viewGroup, c0829Pc.A03);
        } else {
            AbstractC0737Lo.A0M(viewGroup, c0829Pc.A01);
        }
        this.A0I.setFullscreen(c0829Pc.A05);
        this.A0I.A06(c0829Pc.A02, c0829Pc.A04);
    }

    private void A0J(AbstractC1173b5 abstractC1173b5) {
        if (A0V(abstractC1173b5)) {
            int i10 = this.A02;
            if (A0M[2].charAt(7) != '3') {
                throw new RuntimeException();
            }
            A0M[2] = "vyv5r133RkdgG8M1gH7WIgZDBjsgq9Je";
            if (i10 == 2) {
                this.A0I.setOnlyPageDetails(abstractC1173b5.A10());
                return;
            }
        }
        this.A0I.setOnlyPageDetails(null);
    }

    private final void A0K(C5V c5v) {
        c5v.A0N(this.A0B);
        int i10 = c5v.A0J().getResources().getConfiguration().orientation;
        this.A02 = i10;
        A0R(this.A0A.A11(), i10);
        A0E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(boolean z10) {
        boolean z11 = (!A0T() || A0S() || A0U()) ? false : true;
        boolean A0S = A0S();
        if (A0M[1].charAt(22) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[7] = "fhNsXNJVUA";
        strArr[5] = "wXa0tVX5fv";
        if (!A0S && !z11) {
            this.A09 = true;
            if (z10) {
                this.A0I.setToolbarActionMessage(A09(0, 0, 66));
            }
            this.A0I.setToolbarActionMode(0);
            return;
        }
        this.A0I.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(boolean z10, int i10) {
        PQ pq = this.A04;
        if (pq != null) {
            pq.A0z();
            PQ pq2 = this.A04;
            if (A0M[1].charAt(22) != '6') {
                throw new RuntimeException();
            }
            A0M[2] = "W3TlfOl3oEXDpQnuuCTH10eCcUmU4b3A";
            pq2.removeAllViews();
            AbstractC0737Lo.A0J(this.A04);
        }
        if (!A0S()) {
            this.A09 = true;
            if (A0T()) {
                A0C();
                return;
            } else {
                A0H(1);
                return;
            }
        }
        if (this.A0A.A14()) {
            this.A09 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        boolean isLoaded = this.A0D.A00().A8x(this.A0A.A0v(this.A00).A12(), this.A0A.A0w());
        if (!isLoaded) {
            this.A0D.A0E().A4C();
            A0H(2);
            return;
        }
        PQ A08 = A08(z10, i10);
        this.A04 = A08;
        setupToolbarForAd(A08);
        addView(this.A04, 0, A0N);
        this.A00++;
        this.A04.A11();
    }

    private boolean A0S() {
        return this.A00 < this.A0A.A0s();
    }

    private boolean A0T() {
        return this.A0A.A0r() == 2;
    }

    private final boolean A0U() {
        return this.A07;
    }

    public static boolean A0V(AbstractC1173b5 abstractC1173b5) {
        return TextUtils.isEmpty(abstractC1173b5.A0x().A0D().A08());
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        this.A0H.A3U(this, A0N);
        A0K(c5v);
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z10) {
        PQ pq = this.A04;
        if (pq != null) {
            pq.A12(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z10) {
        PQ pq = this.A04;
        if (pq != null) {
            pq.A13(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    public PQ getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        PQ pq = this.A04;
        if (pq != null) {
            pq.onConfigurationChanged(configuration);
        }
        PQ pq2 = this.A04;
        if (pq2 instanceof T8) {
            A0I(pq2, pq2.getFullScreenAdStyle());
            A0J(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() {
        PQ pq = this.A04;
        if (pq != null) {
            pq.A0z();
            this.A04 = null;
        }
        this.A0D.A00().A4H(this.A0A.A0w());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(MC mc2) {
    }

    public void setServerSideRewardHandler(Q7 q72) {
        this.A05 = q72;
    }

    private void setupToolbarForAd(PQ pq) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        AbstractC1173b5 A0v = this.A0A.A0v(this.A00);
        this.A0I.A09(this.A0D, A0v.A0r());
        this.A0I.A08(A0v.A10(), A0v.A12(), A01(this.A00));
        C0829Pc fullScreenAdStyle = pq.getFullScreenAdStyle();
        A0I(pq, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A09(4, 3, 90) + (this.A00 + 1) + A09(0, 4, 42) + this.A0A.A0s());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
        A0J(A0v);
    }
}
