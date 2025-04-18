package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0753Oi extends RelativeLayout {
    public static final int A07 = (int) (LP.A02 * 16.0f);
    public static final int A08 = (int) (LP.A02 * 28.0f);
    public C1O A00;
    public boolean A01;
    public final C1045Zs A02;
    public final J7 A03;
    public final ViewOnClickListenerC0909Ui A04;
    public final C0745Oa A05;
    public final C0757Om A06;

    public abstract boolean A11();

    public AbstractC0753Oi(C0757Om c0757Om, boolean z2) {
        super(c0757Om.A05());
        C1O A00;
        this.A06 = c0757Om;
        this.A02 = c0757Om.A05();
        this.A03 = c0757Om.A06();
        if (c0757Om.A00() == 1) {
            A00 = c0757Om.A04().A1O().A01();
        } else {
            A00 = c0757Om.A04().A1O().A00();
        }
        this.A00 = A00;
        this.A01 = z2;
        this.A04 = new ViewOnClickListenerC0909Ui(c0757Om.A05(), c0757Om.A04(), this.A00, c0757Om.A06(), c0757Om.A0A(), c0757Om.A0C(), c0757Om.A08(), c0757Om.A07());
        this.A04.setRoundedCornersEnabled(A00());
        this.A04.setViewShowsOverMedia(A0C());
        M3.A0G(1001, this.A04);
        this.A05 = new C0745Oa(this.A02, this.A00, this.A01, A01(), A02());
        M3.A0K(this.A05);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public boolean A0C() {
        return true;
    }

    public void A0D(C9R c9r) {
    }

    public void A0E(C9O c9o) {
    }

    public void A0v() {
    }

    public void A0w() {
    }

    public void A0x() {
    }

    public void A0y() {
    }

    public void A0z() {
    }

    public void A10(C1F c1f, String str, double d, Bundle bundle) {
        this.A05.A03(c1f.A0F().A07(), c1f.A0F().A02(), null, false, !A11() && d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < 1.0d);
        this.A04.setCta(c1f.A0G(), str, new HashMap());
    }

    public boolean A12(boolean z2) {
        return false;
    }

    public C1045Zs getAdContextWrapper() {
        return this.A02;
    }

    public J7 getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C1O getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC0909Ui getCtaButton() {
        return this.A04;
    }

    public C0745Oa getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1O A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A06.A04().A1O().A01();
        } else {
            A00 = this.A06.A04().A1O().A00();
        }
        this.A00 = A00;
        this.A04.setViewShowsOverMedia(A0C());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A02(this.A00, this.A01);
    }
}
