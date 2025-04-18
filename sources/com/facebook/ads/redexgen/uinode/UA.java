package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UA implements MD {
    public static byte[] A0D;
    public int A00;
    public SF A01;
    public C9I A02;
    public String A03;
    public final C1070Yn A04;
    public final J2 A05;
    public final MC A06;
    public final InterfaceC0753Me A07;
    public final SA A08;
    public final AbstractC0847Pu A09;
    public final AbstractC0845Ps A0A;
    public final AbstractC0814On A0B;
    public final O7 A0C;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, Ascii.CAN, Ascii.VT, 6, 7, 17, -11, 7, 7, Ascii.CR, -10, Ascii.VT, Ascii.SI, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public UA(C1070Yn c1070Yn, InterfaceC0753Me interfaceC0753Me, J2 j22, MC mc2) {
        BU bu = new BU(this);
        this.A0C = bu;
        BT bt = new BT(this);
        this.A0B = bt;
        BS bs = new BS(this);
        this.A09 = bs;
        BR br = new BR(this);
        this.A0A = br;
        this.A04 = c1070Yn;
        this.A05 = j22;
        this.A07 = interfaceC0753Me;
        SA sa2 = new SA(c1070Yn);
        this.A08 = sa2;
        sa2.A0c(new AnonymousClass86(c1070Yn));
        sa2.getEventBus().A03(bu, bt, bs, br);
        this.A06 = mc2;
        sa2.setIsFullScreen(true);
        sa2.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        mc2.A3U(sa2, layoutParams);
        MK closeButton = new MK(c1070Yn);
        closeButton.setOnClickListener(new ViewOnClickListenerC0751Mc(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        mc2.A3U(closeButton, params);
    }

    public final void A04(int i10) {
        this.A08.setVideoProgressReportIntervalMs(i10);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        String ctaText = A02(8, 11, 102);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C0840Pn c0840Pn = new C0840Pn(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i10 = (int) (16.0f * LD.A02);
            layoutParams.setMargins(i10, i10, i10, i10);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c0840Pn.setOnClickListener(new ViewOnClickListenerC0752Md(this));
            this.A06.A3U(c0840Pn, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        this.A02 = new C9I(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 1)));
        if (C0659Ih.A1X(this.A04)) {
            this.A01 = new SF(this.A04, this.A05, this.A08, this.A03, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i11 = this.A00;
        if (i11 > 0) {
            this.A08.A0Y(i11);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A08.A0b(QM.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z10) {
        this.A06.A44(A02(37, 21, 27), new C0837Pk());
        this.A08.A0W();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z10) {
        this.A06.A44(A02(37, 21, 27), new P5());
        if (!this.A08.A0j()) {
            this.A08.A0b(QM.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() {
        this.A06.A44(A02(37, 21, 27), new C0766Mr(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0e(this.A08.getCurrentPositionInMillis());
        SF sf2 = this.A01;
        if (sf2 != null) {
            sf2.A0D();
        }
        this.A08.A0Z(1);
        this.A08.A0V();
    }
}
