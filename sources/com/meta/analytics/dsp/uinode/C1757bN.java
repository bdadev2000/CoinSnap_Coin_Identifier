package com.meta.analytics.dsp.uinode;

import android.content.res.Resources;
import android.widget.LinearLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1757bN<NativeViewabilityLogger> implements InterfaceC08000p {
    public static byte[] A0I;
    public static String[] A0J = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0K;
    public InterfaceC08080x A00;
    public C08090y A01;
    public C1745bB A02;
    public FV A03;
    public EQ A04;
    public J2 A05;
    public InterfaceC1342Nb A07;
    public C1515Ts A08;
    public B0 A09;
    public RD A0A;
    public RE A0B;
    public String A0D;
    public final String A0H = UUID.randomUUID().toString();
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public C1295Lg A06 = new C1295Lg();
    public Boolean A0C = false;

    public static String A08(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 19);
            if (A0J[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0I = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, 116, Ascii.DEL};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0F(C8T c8t, JSONObject jSONObject) {
        this.A0F = false;
        C1747bD A00 = C1747bD.A00(this.A04, jSONObject);
        this.A0D = A00.A6T();
        if (AbstractC07970l.A06(this.A04, A00, this.A05)) {
            this.A04.A0E().A4K();
            if (A0J[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[5] = "gZR2JDZ5mWWs6r6NI6wXuGixksRp1MVw";
            strArr[4] = "FWucwUozmNtfNObopNjSpGj6qBSknBll";
            this.A00.ABw(this, C1242Jb.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A07 = new C1146Fc(this, A00);
        C1515Ts c1515Ts = new C1515Ts(this.A04, (WeakReference<InterfaceC1342Nb>) new WeakReference(this.A07), c8t.A04(), A6T());
        this.A08 = c1515Ts;
        c1515Ts.A0G(c8t.A07(), c8t.A08());
        C1758bO c1758bO = new C1758bO(this);
        EQ eq = this.A04;
        J2 j22 = this.A05;
        C1515Ts c1515Ts2 = this.A08;
        C1745bB c1745bB = new C1745bB(eq, j22, c1515Ts2, c1515Ts2.getViewabilityChecker(), c1758bO);
        this.A02 = c1745bB;
        c1745bB.A08(A00);
        this.A08.loadDataWithBaseURL(AbstractC1345Ne.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0E = true;
        A0A();
    }

    static {
        A0B();
        A0K = C1757bN.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        FV fv;
        if (this.A00 != null && this.A09 != null && (fv = this.A03) != null && fv.A0m()) {
            this.A00.AAy(this, this.A09);
        }
        InterfaceC08080x interfaceC08080x = this.A00;
        if (interfaceC08080x != null && this.A0E) {
            boolean z8 = this.A0F;
            if (A0J[2].length() == 29) {
                throw new RuntimeException();
            }
            A0J[2] = "DQYu3GBVfiN4Ml";
            if (z8 || !this.A0G) {
                interfaceC08080x.AAy(this, this.A08);
            }
        }
        this.A04.A0E().A3i(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i9, C8T c8t) {
        this.A09 = new B0(this.A04, this.A05, new C1760bQ(this), this.A03, A08(0, 31, 110), 2, this.A06);
        this.A0A = new C1759bP(this);
        RE re = new RE(this.A09, c8t.A04(), c8t.A09(), true, new WeakReference(this.A0A), this.A04);
        this.A0B = re;
        re.A0W(this.A03.A0C());
        this.A0B.A0X(this.A03.A0D());
        this.A09.setVisibility(0);
        this.A04.getResources();
        this.A09.setLayoutParams(new LinearLayout.LayoutParams(-1, i9));
        this.A09.AGY();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(EnumC1244Je enumC1244Je, C8T c8t) {
        if (this.A03 == null || this.A05 == null) {
            return;
        }
        int A02 = (int) (enumC1244Je.A02() * Resources.getSystem().getDisplayMetrics().density);
        int bannerHeight = (C1225Ih.A1n(this.A04) && AnonymousClass62.A0A(this.A03.A0V())) ? 1 : 0;
        if (bannerHeight == 0) {
            A0C(A02, c8t);
        } else {
            new AnonymousClass62(new C09416c(this.A04), this.A03.A0V(), this.A03.A0P(), this.A03.A0S(), true, new C1762bS(this, A02, c8t, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0J(EQ eq, J2 j22, EnumC1244Je enumC1244Je, InterfaceC08080x interfaceC08080x, JSONObject jSONObject, C8T c8t) {
        eq.A0E().A3h();
        this.A04 = eq;
        this.A05 = j22;
        this.A00 = interfaceC08080x;
        this.A0G = C1225Ih.A1M(eq.getApplicationContext());
        FV A02 = FV.A02(jSONObject, this.A04);
        this.A03 = A02;
        if (A02.A0m()) {
            A0G(enumC1244Je, c8t);
        } else {
            A0F(c8t, jSONObject);
        }
        C08090y c08090y = new C08090y(this.A04, this.A0H, this, interfaceC08080x);
        this.A01 = c08090y;
        c08090y.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC08000p
    public final String A6T() {
        return this.A0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC08000p
    public final AdPlacementType A7e() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC08000p
    public final boolean AGd() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bN != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC08000p
    public final void onDestroy() {
        this.A04.A0E().A3f(this.A08 != null);
        C1515Ts c1515Ts = this.A08;
        if (c1515Ts != null) {
            c1515Ts.destroy();
            this.A08 = null;
            this.A07 = null;
        }
        C08090y c08090y = this.A01;
        if (c08090y != null) {
            c08090y.A03();
        }
    }
}
