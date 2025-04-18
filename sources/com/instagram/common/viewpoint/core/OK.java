package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class OK extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C1185cB A02;
    public final C1045Zs A03;
    public final J7 A04;
    public final MR A05;

    public OK(C1045Zs c1045Zs, C1185cB c1185cB, J7 j7, MR mr, int i2, int i3) {
        super(c1045Zs);
        this.A03 = c1045Zs;
        this.A02 = c1185cB;
        this.A04 = j7;
        this.A05 = mr;
        this.A00 = i2;
        this.A01 = new LinearLayout(c1045Zs);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i3);
    }

    private void A00() {
        int i2 = 0;
        while (true) {
            int A1K = this.A02.A1K();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int charAt = str.charAt(18);
            int i3 = str2.charAt(18);
            if (charAt == i3) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i2 < A1K) {
                C0913Um c0913Um = new C0913Um(this.A03, this.A02.A1N(i2), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i4 = C0913Um.A0C;
                int i5 = C0913Um.A0C;
                int i6 = C0913Um.A0C;
                int i7 = C0913Um.A0C;
                layoutParams.setMargins(i4, i5, i6, i7);
                c0913Um.setLayoutParams(layoutParams);
                this.A01.addView(c0913Um);
                i2++;
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

    private void setLayoutOrientation(int i2) {
        if (i2 != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (this.A00 * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (this.A00 * 1.5d), 0, this.A00);
        }
    }
}
