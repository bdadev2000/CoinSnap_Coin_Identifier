package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UZ extends AbstractC0753Oi implements LJ {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC1187cD A00;
    public final LL A01;
    public final MR A02;
    public final P9 A03;
    public final QJ A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 42, 30, 36, 34};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public UZ(C0757Om c0757Om, boolean z2) {
        super(c0757Om, z2);
        int id;
        int A01;
        this.A02 = c0757Om.A0A();
        this.A00 = c0757Om.A04();
        this.A03 = new P9(c0757Om.A05(), c0757Om.A02());
        this.A03.A01(getTitleDescContainer(), z2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC0753Oi.A07, AbstractC0753Oi.A07, AbstractC0753Oi.A07, AbstractC0753Oi.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c0757Om.A0D()) {
            this.A04 = new QJ(c0757Om.A05());
            this.A04.setPageDetails(c0757Om.A04().A1S());
            M3.A0G(1007, this.A04);
            RelativeLayout.LayoutParams pageDetailsParams = new RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(AbstractC0753Oi.A07, AbstractC0753Oi.A07 - (AbstractC0753Oi.A07 / 2), AbstractC0753Oi.A07, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id = this.A04.getId();
            A01 = c0757Om.A01() - (AbstractC0753Oi.A07 / 2);
        } else {
            id = getCtaButton().getId();
            A01 = c0757Om.A01();
            this.A04 = null;
        }
        FrameLayout insideContainerLayout = new FrameLayout(c0757Om.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id);
        layoutParams2.setMargins(0, A01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC0753Oi.A07, 0, AbstractC0753Oi.A07, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0A(c0757Om.A04(), c0757Om.A09());
        View A02 = c0757Om.A02();
        this.A01 = LL.A01(c0757Om.A05(), this.A00, this);
        LK A0A = this.A01.A0A(this.A00);
        c0757Om.A05().A0G().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (A02 != null && A0A.A00) {
            A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Os
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UZ.this.A13(view);
                }
            });
        } else if (A02 != null && C0608Im.A1C(getAdContextWrapper())) {
            OB.A00(A02, C0608Im.A1D(getAdContextWrapper()), new ViewOnClickListenerC0764Ot(this));
        }
        if (C0608Im.A12(c0757Om.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0757Om.A09() != null) {
                c0757Om.A09().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C0608Im.A13(c0757Om.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final boolean A02() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final boolean A0C() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final void A0v() {
        super.A0v();
        this.A01.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final void A10(C1F c1f, String str, double d, Bundle bundle) {
        super.A10(c1f, str, d, bundle);
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            int mediaHeight = (int) ((A06 - (AbstractC0753Oi.A07 * 2)) / d);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 103));
    }

    @Override // com.instagram.common.viewpoint.core.LJ
    public final void ACa() {
        this.A02.A4P(this.A00.A0Y());
    }
}
