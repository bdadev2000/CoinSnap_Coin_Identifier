package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class UL extends RelativeLayout implements MD {
    public static byte[] A0F;
    public static String[] A0G = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;
    public L9 A01;
    public C1399Pg A02;
    public boolean A03;
    public boolean A04;
    public C1C A05;
    public Q7 A06;
    public boolean A07;
    public final ViewOnSystemUiVisibilityChangeListenerC1290Lb A08;
    public final MC A09;
    public final AbstractC1739b5 A0A;
    public final C1636Yn A0B;
    public final J2 A0C;
    public final JA A0D;
    public final MB A0E;

    public static String A0L(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0F = new byte[]{88, 84, 86, Ascii.NAK, 93, 90, 88, 94, 89, 84, 84, 80, Ascii.NAK, 90, 95, 72, Ascii.NAK, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, Ascii.NAK, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, Ascii.NAK, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0a();

    public abstract int getCloseButtonStyle();

    static {
        A0O();
    }

    public UL(C1636Yn c1636Yn, J2 j22, MC mc, AbstractC1739b5 abstractC1739b5) {
        super(c1636Yn);
        this.A07 = false;
        this.A04 = false;
        this.A03 = false;
        this.A0B = c1636Yn;
        this.A0C = j22;
        this.A09 = mc;
        this.A08 = new ViewOnSystemUiVisibilityChangeListenerC1290Lb(this);
        this.A0A = abstractC1739b5;
        JA ja = new JA(abstractC1739b5.A12(), j22);
        this.A0D = ja;
        this.A0E = new FullScreenAdToolbar(c1636Yn, getAudienceNetworkListener(), ja, 0, abstractC1739b5.A0r());
    }

    private C1P A0J(int i9) {
        if (i9 == 1) {
            return this.A05.A01();
        }
        C1C c1c = this.A05;
        if (A0G[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0G[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return c1c.A00();
    }

    private void A0M() {
        removeAllViews();
        AbstractC1303Lo.A0J(this);
    }

    private void A0N() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0X() && this.A02 == null) {
            this.A04 = true;
            C1399Pg A0B = new C1397Pe(this.A0B, this.A0A.A0x().A0E(), this.A0A.A10()).A08(this.A0A.A0w().A01()).A0B();
            this.A02 = A0B;
            JC.A04(A0B, this.A0D, J9.A0U);
            this.A09.A3T(this, 0, layoutParams);
            this.A09.A3T(this.A02, 1, layoutParams);
            this.A02.A04(new UN(this));
            return;
        }
        this.A09.A3T(this, 0, layoutParams);
    }

    private void A0P(C1P c1p, boolean z8) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0E.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0E.A06(c1p, ViewOnClickListenerC1508Tl.A08(this.A0A));
        addView(this.A0E, layoutParams);
    }

    public final void A0S() {
        View view = this.A00;
        if (view == null || !(view instanceof OL)) {
            return;
        }
        if (A0Y()) {
            ((OL) this.A00).A0z();
        } else {
            ((OL) this.A00).A0y();
        }
    }

    public final void A0T(int i9) {
        this.A01 = new L9(i9, new UM(this, i9));
        this.A03 = true;
        A0S();
        this.A01.A07();
    }

    public final void A0U(View view, boolean z8, int i9) {
        this.A0E.setFullscreen(z8);
        this.A00 = view;
        this.A08.A05(EnumC1289La.A03);
        A0M();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z8 ? 0 : this.A0E.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1P A0J = A0J(i9);
        A0P(A0J, z8);
        AbstractC1303Lo.A0M(this, A0J.A07(false));
        if (this.A09 != null) {
            A0N();
            String[] strArr = A0G;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z8 && Build.VERSION.SDK_INT >= 19) {
                ViewOnSystemUiVisibilityChangeListenerC1290Lb viewOnSystemUiVisibilityChangeListenerC1290Lb = this.A08;
                if (A0G[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0G[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                viewOnSystemUiVisibilityChangeListenerC1290Lb.A05(EnumC1289La.A04);
            }
        }
    }

    public final void A0V(C5V c5v) {
        this.A08.A04(c5v.A0J().getWindow());
        this.A05 = this.A0A.A0w();
        C1G c1g = null;
        C1G adInfo = this.A0A.A0x();
        if (adInfo != null) {
            C1G adInfo2 = this.A0A.A0x();
            if (adInfo2 != null) {
                c1g = this.A0A.A0x();
            }
        }
        this.A0E.setPageDetails(this.A0A.A10(), this.A0A.A12(), c1g != null ? c1g.A0D().A03() : 0, this.A0A.A11());
        this.A0E.setToolbarListener(new UP(this, c5v));
    }

    public final void A0W(C5V c5v) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new MO(this, this, c5v));
        startAnimation(alphaAnimation);
    }

    public final boolean A0X() {
        if (!this.A0A.A14().isEmpty()) {
            boolean A0P = this.A0A.A0x().A0P();
            if (A0G[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0G[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (A0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A03;
    }

    public final boolean A0Z() {
        return this.A04;
    }

    public void ACW(boolean z8) {
        L9 l9 = this.A01;
        if (l9 != null && l9.A05()) {
            this.A01.A06();
        }
    }

    public void ACu(boolean z8) {
        L9 l9 = this.A01;
        if (l9 != null && !l9.A04()) {
            this.A01.A07();
        }
    }

    public J2 getAdEventManager() {
        return this.A0C;
    }

    public MC getAudienceNetworkListener() {
        return this.A09;
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public String getCurrentClientToken() {
        return this.A0A.A12();
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final boolean onActivityResult(int i9, int i10, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A03();
        this.A0E.setToolbarListener(null);
        A0M();
    }

    public void setImpressionRecordingFlag(C1295Lg c1295Lg) {
        c1295Lg.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A07) {
                getAudienceNetworkListener().A43(new U8().A7B());
            } else {
                getAudienceNetworkListener().A43(A0L(0, 47, 106));
            }
        }
    }

    public void setListener(MC mc) {
    }

    public void setServerSideRewardHandler(Q7 q72) {
        this.A06 = q72;
    }
}
