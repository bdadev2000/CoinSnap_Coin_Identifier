package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0891Tq extends FrameLayout implements MS {
    public static String[] A0D = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC1187cD A01;
    public final C03226f A02;
    public final C1045Zs A03;
    public final J7 A04;
    public final JF A05;
    public final C0688Lv A06;
    public final MQ A07;
    public final MR A08;
    public final N9 A09;
    public final C0833Rk A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC0683Lq A0B;
    public final AbstractC0832Rj A0C;

    public abstract void A0W();

    public abstract void A0Y(C5Q c5q);

    public abstract boolean A0Z();

    public AbstractC0891Tq(C1045Zs c1045Zs, N9 n9, J7 j7, AbstractC1187cD abstractC1187cD, C03226f c03226f, MR mr) {
        super(c1045Zs);
        this.A0C = new C0895Tu(this);
        this.A06 = new C0688Lv();
        this.A00 = false;
        this.A03 = c1045Zs;
        this.A09 = n9;
        this.A04 = j7;
        this.A01 = abstractC1187cD;
        this.A02 = c03226f;
        this.A08 = mr;
        this.A05 = new JF(this.A01.A1U(), this.A04);
        this.A0A = new C0833Rk(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0O());
        this.A0A.A0X(this.A01.A0P());
        this.A07 = A0T();
        this.A0B = new ViewOnSystemUiVisibilityChangeListenerC0683Lq(this);
        this.A0B.A05(EnumC0682Lp.A02);
    }

    private FullScreenAdToolbar A0T() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A1J(), this.A01.A1D());
        fullScreenAdToolbar.setFullscreen(true);
        int A03 = this.A01.A1P().A0E().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A1S(), this.A01.A1U(), A03, this.A01.A1T());
        fullScreenAdToolbar.A09(this.A01.A1O().A01(), ViewOnClickListenerC0909Ui.A08(this.A01));
        if (A03 < 0) {
            boolean A0O = this.A01.A1P().A0O();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 14) {
                throw new RuntimeException();
            }
            A0D[6] = "uU4tl2aYQOakqMcDwa3XaYHVuDk2NjaN";
            if (A0O) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new C0892Tr(this));
        return fullScreenAdToolbar;
    }

    private void A0U() {
        if (this.A01.A1P().A0R()) {
            Q7 A0F = new Q5(this.A03, this.A01.A1P().A0F(), this.A01.A1S()).A0A(this.A01.A1O().A01()).A0F();
            JH.A04(A0F, this.A05, JE.A0U);
            addView(A0F, A0E);
            A0F.A04(new C0893Ts(this));
            return;
        }
        A0W();
    }

    public final void A0V() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0X(int i2, KY ky) {
        new LH(i2, new C0894Tt(this, i2, ky)).A07();
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        this.A08.A3q(this, A0E);
        A0Y(c5q);
        A0U();
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public String getCurrentClientToken() {
        return this.A01.A1U();
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A1U())) {
            this.A04.A9x(this.A01.A1U(), new O8().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(MR mr) {
    }

    public void setUpFullscreenMode(boolean z2) {
        EnumC0682Lp enumC0682Lp;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z2) {
            enumC0682Lp = EnumC0682Lp.A03;
        } else {
            enumC0682Lp = EnumC0682Lp.A02;
        }
        this.A0B.A05(enumC0682Lp);
    }
}
