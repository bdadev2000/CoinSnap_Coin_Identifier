package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1361Nu extends RelativeLayout {
    public static String[] A06 = {"GfXFZtEZk1NZfob7Kzf1xTq0EESlD7si", "ewzI1iE8tF5Z2B86REyPWWZDw7DKLBH9", "kOyZSgqEibXIKTIW7tLvn8rBuxcmsyDd", "XpDxTY", "v6DhXkGtrQWw75h", "XA27k4WXBENWs2k6KViFhCSGxV0pMN8g", "cLUj8uWE8C4NOcjwK2waVMiWyPuWQVsm", ""};
    public final int A00;
    public final LinearLayout A01;
    public final C1737b3 A02;
    public final C1636Yn A03;
    public final J2 A04;
    public final MC A05;

    public C1361Nu(C1636Yn c1636Yn, C1737b3 c1737b3, J2 j22, MC mc, int i9, int i10) {
        super(c1636Yn);
        this.A03 = c1636Yn;
        this.A02 = c1737b3;
        this.A04 = j22;
        this.A05 = mc;
        this.A00 = i9;
        LinearLayout linearLayout = new LinearLayout(c1636Yn);
        this.A01 = linearLayout;
        A00();
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i10);
    }

    private void A00() {
        int i9 = 0;
        while (true) {
            C1737b3 c1737b3 = this.A02;
            if (A06[4].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "6kBjYVyQvbEVjVKJKeawSG2VEKMXDcJL";
            strArr[5] = "aQimcOJmMOk7TFcbK4Cqi1kaRliNN4Qj";
            int i10 = c1737b3.A0s();
            if (i9 < i10) {
                C1512Tp c1512Tp = new C1512Tp(this.A03, this.A02.A0v(i9), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i11 = C1512Tp.A0B;
                int i12 = C1512Tp.A0B;
                int i13 = C1512Tp.A0B;
                int i14 = C1512Tp.A0B;
                layoutParams.setMargins(i11, i12, i13, i14);
                c1512Tp.setLayoutParams(layoutParams);
                this.A01.addView(c1512Tp);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i9) {
        if (i9 != 1) {
            this.A01.setOrientation(0);
            LinearLayout linearLayout = this.A01;
            int i10 = this.A00;
            linearLayout.setPadding(0, i10, 0, (int) (i10 * 0.25d));
            return;
        }
        this.A01.setOrientation(1);
        LinearLayout linearLayout2 = this.A01;
        int i11 = this.A00;
        linearLayout2.setPadding(0, (int) (i11 * 1.5d), 0, i11);
    }
}
