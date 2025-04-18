package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BY extends AbstractC0904Ud {
    public static byte[] A02;
    public static String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final View A00;
    public final boolean A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 71);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{37, 33, 45, 43, 41};
    }

    static {
        A01();
        A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public BY(C0757Om c0757Om, boolean z2) {
        super(c0757Om, true);
        this.A01 = z2;
        this.A00 = c0757Om.A02();
        A14();
        if (this.A01) {
            addView(c0757Om.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c0757Om.A05());
            RelativeLayout.LayoutParams insideContainerParams = new RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC0753Oi.A07, 0, AbstractC0753Oi.A07, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        LK A0A = this.A07.A0A(getAdDataBundle());
        c0757Om.A05().A0G().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A07);
        if (this.A00 != null) {
            if (A0A.A00) {
                this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.On
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BY.this.A16(view);
                    }
                });
            } else if (C0608Im.A1C(getAdContextWrapper())) {
                OB.A00(this.A00, C0608Im.A1D(getAdContextWrapper()), new ViewOnClickListenerC0759Oo(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final boolean A0C() {
        return this.A01 && super.A02();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0904Ud, com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final void A10(C1F c1f, String str, double d, Bundle bundle) {
        super.A10(c1f, str, d, bundle);
        if (!this.A01 && d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            int mediaHeight = (int) ((A04 - (AbstractC0753Oi.A07 * 2)) / d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i2 = AbstractC0753Oi.A07;
            int mediaHeight2 = AbstractC0753Oi.A07;
            layoutParams.setMargins(i2, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0753Oi
    public final boolean A11() {
        return this.A01;
    }

    public final /* synthetic */ void A16(View view) {
        getCtaButton().A09(A00(0, 5, 11));
    }
}
